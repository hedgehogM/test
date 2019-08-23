package paixu;

import weaver.general.Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test {

	public static void main(String[] args) {

//		int[] a = {5,5,2,6,7,1,2,9};
//
//		int a_length = a.length;
//
//		for(int i = 0; i < a_length; i++) {
//			System.out.println(i +":"+ a[i]);
//		}
//
//		for(int i = 0; i < a_length; i++) {
//			for(int j = i; j > 0; j--) {
//				if(a[j-1] > a[j]) {
//					int temp = a[j-1];
//					a[j-1] = a[j];
//					a[j] = temp;
//				} else {
//					break;
//				}
//			}
//		}
//
//		System.out.println("=============================排序后=================================");
//
//		for(int i = 0; i < a_length; i++) {
//			System.out.println(i +":"+ a[i]);
//		}

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date start_date = null;
		try {
			start_date = sdf.parse("2019-07-09");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Calendar start_cal = Calendar.getInstance();
		start_cal.setTime(start_date);

		start_cal.add(Calendar.DAY_OF_YEAR, -1);

		System.out.println(sdf.format(start_cal.getTime()));

	}
	
}
