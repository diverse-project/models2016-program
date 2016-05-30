package fr.inria.diverse.models2016.dsl.utils

import java.text.SimpleDateFormat
import models2016.Date

class ProgramUtils {
	def public static convertDate(Date date) {
		val dateFormat = new SimpleDateFormat("yyMMddHHmm")
		var str = if (date.year < 10) {"0"+date.year} else {""+date.year}
		str += if (date.month < 10) {"0"+date.month} else {""+date.month}
		str += if (date.day < 10) {"0"+date.day} else {""+date.day}
		str += if (date.hours < 10) {"0"+date.hours} else {""+date.hours}
		str += if (date.minutes < 10) {"0"+date.minutes} else {""+date.minutes}
		return dateFormat.parse(str)
	}
}