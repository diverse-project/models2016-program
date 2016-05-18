package fr.inria.diverse.models2016.dsl.converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;

public class ProgramValueConverter extends DefaultTerminalConverters {
	@ValueConverter(rule = "EDate")
	public IValueConverter<Date> EDate() {
		return new IValueConverter<Date>() {
			private final DateFormat dayDateFormat = new SimpleDateFormat("yy.MM.dd");
			private final DateFormat hourDateFormat = new SimpleDateFormat("HH:mm");
			@Override
			public Date toValue(String string, INode node) throws ValueConverterException {
				if (Strings.isEmpty(string)) {
					throw new ValueConverterException("Couldn't convert empty string to date or hour", node, null);
				} else if (string.indexOf(".") != -1) {
					try {
						List<String> strings = Strings.split(string, ".");
						if (strings.size() != 3) {
							throw new ValueConverterException("Couldn't convert '"+string+"' to date", node, null);
						} else {
							try {
								int y = Integer.parseInt(strings.get(0));
								int m = Integer.parseInt(strings.get(1));
								int d = Integer.parseInt(strings.get(2));
								if (y > -1 && y < 100 && m > 0 && m < 13 && d > 0 && d < 32) {
									Date date = dayDateFormat.parse(string);
									return date;
								} else {
									throw new ValueConverterException("Couldn't convert '"+string+"' to date", node, null);
								}
							} catch (NumberFormatException e) {
								throw new ValueConverterException("Couldn't convert '"+string+"' to date", node, e);
							}
						}
					} catch (ParseException e) {
						throw new ValueConverterException("Couldn't convert '"+string+"' to date", node, e);
					}
				} else if (string.indexOf(":") != -1) {
					try {
						List<String> strings = Strings.split(string, ":");
						if (strings.size() != 2) {
							throw new ValueConverterException("Couldn't convert '"+string+"' to hour", node, null);
						} else {
							try {
								int h = Integer.parseInt(strings.get(0));
								int m = Integer.parseInt(strings.get(1));
								if (h > -1 && h < 24 && m > -1 && m < 60) {
									if (m == 0 || m == 15 || m == 30 || m == 45) {
										Date date = hourDateFormat.parse(string);
										return date;
									} else {
										throw new ValueConverterException("Hours must be filled in 15 minutes increments", node, null);
									}
								} else {
									throw new ValueConverterException("Couldn't convert '"+string+"' to hour", node, null);
								}
							} catch (NumberFormatException e) {
								throw new ValueConverterException("Couldn't convert '"+string+"' to hour", node, e);
							}
						}
					} catch (ParseException e) {
						throw new ValueConverterException("Couldn't convert '"+string+"' to hour", node, e);
					}
				} else {
					throw new ValueConverterException("Couldn't convert '"+string+"' to date or hour", node, null);
				}
			}
			
			@Override
			public String toString(Date value) throws ValueConverterException {
				if (value.getYear() == 70) {
					return hourDateFormat.format(value);
				}
				return dayDateFormat.format(value);
			}
		};
	}
}
