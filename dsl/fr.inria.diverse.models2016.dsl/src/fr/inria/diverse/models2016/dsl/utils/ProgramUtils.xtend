package fr.inria.diverse.models2016.dsl.utils

import java.util.Calendar
import models2016.Date

class ProgramUtils {
	def public static convertDate(Date date) {
		val cal = Calendar.instance
		cal.set(date.year, date.month, date.day, date.hours, date.minutes)
		return cal.time
	}
}