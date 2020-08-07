package com.sbs.java.ssg;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

	public static String getNowDateSrt() { //static으로 만들어서  new 안해도됨.
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date time = new Date();
		String time1 = format.format(time);
		return format.format(time);
	}
}
