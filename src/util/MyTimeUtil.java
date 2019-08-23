package util;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyTimeUtil {
	
	/**
	 * 获取当前日期，前后N天的日期；
	 * 获取当前日期，给0；之前的日期，给复数；之后的日期，给正数
	 * @param day
	 * @return
	 */
	public static String getDate(int day){
		  Calendar calendar1 = Calendar.getInstance();
		  SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		  calendar1.add(Calendar.DAY_OF_YEAR, day);
		  String change_day = sdf1.format(calendar1.getTime());
		  return change_day;
    }
	
	/**
	 * 获取指定日期的，前后N天的日期
	 * @param date
	 * @return
	 */
	public static String getDate(String date, int day){
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		// 将字符串的日期转为Date类型，ParsePosition(0)表示从第一个字符开始解析
		Date date1 = sdf1.parse(date, new ParsePosition(0));

		Calendar calendar1 = Calendar.getInstance();
		calendar1.setTime(date1);
		calendar1.add(Calendar.DAY_OF_YEAR, day);
		String change_day = sdf1.format(calendar1.getTime());
		return change_day;
	}

}
