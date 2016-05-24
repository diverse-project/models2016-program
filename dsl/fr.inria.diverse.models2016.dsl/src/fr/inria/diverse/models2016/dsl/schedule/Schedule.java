package fr.inria.diverse.models2016.dsl.schedule;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Schedule<K> {

	private final List<Col> columns = new ArrayList<>();
	private final Map<K,Col> keyToCol = new HashMap<>();
	
	public void addColumn(K column) {
		final Col newCol = new Col();
		columns.add(newCol);
		keyToCol.put(column, newCol);
	}
	
	public void addEventToColumn(K column, ScheduleEvent event) {
		final Col col = keyToCol.get(column);
		if (col != null) {
			col.addScheduleEvent(event);
		}
	}
	
	public void removeColumn(K column) {
		columns.remove(keyToCol.get(column));
		keyToCol.remove(column);
	}
	
	public Date getFirstDate() {
		final List<Date> dates = new ArrayList<>();
		columns.forEach(c->dates.add(c.getColStartingDate()));
		if (!dates.isEmpty()) {
			dates.sort((d1,d2)->{return d1.compareTo(d2);});
			return dates.get(0);
		} else {
			return null;
		}
	}
	
	public Date getLastDate() {
		final List<Date> dates = new ArrayList<>();
		columns.forEach(c->dates.add(c.getColEndingDate()));
		if (!dates.isEmpty()) {
			dates.sort((d1,d2)->{return d2.compareTo(d1);});
			return dates.get(0);
		} else {
			return null;
		}
	}
	
	public List<Date> getAllStartingDates() {
		final List<Date> dates = new ArrayList<>();
		columns.forEach(c->dates.addAll(c.getEvents().stream().map(e->e.startDate).collect(Collectors.toList())));
		final List<Date> result = new ArrayList<>();
		dates.forEach(d->{
			if (!result.stream().filter(a->a.getTime() == d.getTime()).findFirst().isPresent()) {
				result.add(d);
			}
		});
		result.sort((d1,d2)->d1.compareTo(d2));
		return result;
	}
	
	public List<List<ScheduleEvent>> getRows(Comparator<K> keyOrdering) {
		final List<List<ScheduleEvent>> rows = new ArrayList<>();
		final Schedule<K> filledSchedule = fillSchedule();
		final List<Date> startingDates = filledSchedule.getAllStartingDates();
		for (Date d : startingDates) {
			final List<ScheduleEvent> row = new ArrayList<>();
			final List<K> keys = filledSchedule.keyToCol.keySet().stream().sorted(keyOrdering).collect(Collectors.toList());
			for (K key : keys) {
				final Col c = filledSchedule.keyToCol.get(key);
				final List<ScheduleEvent> events = c.getEvents();
				Optional<ScheduleEvent> optEvent = events.stream().filter(e->{
					return e.startDate.compareTo(d) == 0;
				}).findFirst();
				if (optEvent.isPresent()) {
					row.add(optEvent.get());
				}
			}
			rows.add(row);
		}
		return rows;
	}
	
	private Schedule<K> fillSchedule() {
		final Schedule<K> result = new Schedule<>();
		keyToCol.forEach((k,v)->{
			result.addColumn(k);
			v.events.forEach(e->result.addEventToColumn(k, e));
		});
		final Date start = result.getFirstDate();
		final Date end = result.getLastDate();
		result.columns.forEach(c-> {
			c.fillColumn(start, end);
		});
		return result;
	}
	
	public static class ScheduleEvent {
		public final Date startDate;
		public final Date endDate;
		public Object data;
		
		public ScheduleEvent(Date startDate, Date endDate, Object data) {
			if (!startDate.before(endDate)) {
				throw new IllegalArgumentException("Starting date cannot be after ending date");
			}
			this.startDate = startDate;
			this.endDate = endDate;
			this.data = data;
		}
		
		public ScheduleEvent(Date startDate, Date endDate) {
			if (!startDate.before(endDate)) {
				throw new IllegalArgumentException("Starting date cannot be after ending date");
			}
			this.startDate = startDate;
			this.endDate = endDate;
			this.data = null;
		}
	}
	
	private static class Col {
		private final List<ScheduleEvent> events = new ArrayList<>();
		
		public boolean removeScheduleEvent(ScheduleEvent e) {
			return events.remove(e);
		}
		
		public boolean addScheduleEvent(ScheduleEvent e) {
			if (events.isEmpty()) {
				events.add(e);
				return true;
			} else {
				final ScheduleEvent lastEvent = events.get(events.size() - 1);
				if (lastEvent.endDate.compareTo(e.startDate) <= 0) {
					events.add(e);
					return true;
				}
				boolean inserted = false;
				int i = 0;
				while (!inserted && i < events.size()) {
					final ScheduleEvent followingEvent = events.get(i);
					if (followingEvent.startDate.compareTo(e.endDate) >= 0) {
						if (i == 0) {
							events.add(0, e);
							inserted = true;
						} else {
							final ScheduleEvent precedingEvent = events.get(i - 1);
							if (precedingEvent.endDate.compareTo(e.startDate) <= 0) {
								events.add(i, e);
								inserted = true;
							} else {
								break;
							}
						}
					}
					i++;
				}
				return inserted;
			}
		}
		
		public Date getColStartingDate() {
			if (events.isEmpty()) {
				return null;
			} else {
				return events.get(0).startDate;
			}
		}
		
		public Date getColEndingDate() {
			if (events.isEmpty()) {
				return null;
			} else {
				return events.get(events.size() - 1).endDate;
			}
		}
		
		public List<ScheduleEvent> getEvents() {
			return new ArrayList<>(events);
		}
		
		public void fillColumn(Date start, Date end) {
			if (events.isEmpty()) {
				addScheduleEvent(new ScheduleEvent(start, end));
			} else {
				if (events.size() > 1) {
					final List<ScheduleEvent> toAdd = new ArrayList<>();
					for (int i = 0; i < events.size() - 1; i++) {
						final ScheduleEvent event1 = events.get(i);
						final ScheduleEvent event2 = events.get(i+1);
						if (event1.endDate.compareTo(event2.startDate) != 0) {
							toAdd.add(new ScheduleEvent(event1.endDate, event2.startDate));
						}
					}
					for (ScheduleEvent eventToAdd : toAdd) {
						addScheduleEvent(eventToAdd);
					}
				}
				Date startDate = events.get(0).startDate;
				if (startDate.compareTo(start) > 0) {
					addScheduleEvent(new ScheduleEvent(start, startDate));
				}
				Date endDate = events.get(events.size() - 1).endDate;
				if (endDate.compareTo(end) < 0) {
					addScheduleEvent(new ScheduleEvent(endDate, end));
				}
			}
		}
	}
}
