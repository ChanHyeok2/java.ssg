package com.sbs.java.ssg;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

	public static String getNowDateSrt() { //static���� ����  new ���ص���.
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date time = new Date();
		String time1 = format.format(time);
		return format.format(time);
	}
}
