package test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class test {

	public static void main(String[] args) {
		
		
//		// TODO Auto-generated method stub
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
//        Date date = new Date();
////        sdf.parse
//        String startTime = sdf.format(date); 

        
//        Calendar calendar =Calendar.getInstance();
//        calendar.setTime(date);
//		//根据日历把时间推迟一年，计算后一年时间
//		calendar.add(Calendar.MONTH, 1);
//		date = calendar.getTime();
//		String endTime = sdf.format(date);
//		
//		System.out.println(startTime);
//		System.out.println(endTime);
//		
//		String dateFormat = "yyyy-MM-dd";
//		Calendar cal = Calendar.getInstance();
//        cal.setTime(date);
//        int d = 0;
//        if (cal.get(Calendar.DAY_OF_WEEK) == 1) {
//            d = -6;
//        } else {
//            d = 2 - cal.get(Calendar.DAY_OF_WEEK);
//        }
//        cal.add(Calendar.DAY_OF_WEEK, d);
//        // 所在周开始日期
//        String data1 = new SimpleDateFormat(dateFormat).format(cal.getTime());
//        cal.add(Calendar.DAY_OF_WEEK, 6);
//        // 所在周结束日期
//        String data2 = new SimpleDateFormat(dateFormat).format(cal.getTime());
//        data2.equals(anObject)
//        System.out.println(data1);
//		System.out.println(data2);
		
		
//		String a = "2018-01-01";
//		a = a.substring(0,7);
//		System.out.println(a);
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
//		String nf = "2018-01";
//		nf.equals
//		Date aa = new Date();
//		Calendar cal = Calendar.getInstance();
//		try {
//			aa = sdf.parse(nf);
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		cal.setTime(aa);
//		
//		cal.add(Calendar.MONTH, 3);
//		System.out.println(sdf.format(cal.getTime()));
//		cal.add(Calendar.MONTH, 3);
//		System.out.println(sdf.format(cal.getTime()));
//		cal.add(Calendar.MONTH, 3);
//		System.out.println(sdf.format(cal.getTime()));
//		cal.add(Calendar.MONTH, 3);
//		System.out.println(sdf.format(cal.getTime()));
//		cal.add(Calendar.MONTH, -1);
//		System.out.println(sdf.format(cal.getTime()));
		
//		String a = "aabbcca";
//		
//		System.out.println(a.replaceAll("a", "c"));
		
//		String a = "";
//		a = null;
//		System.out.print(a);
		
		
		/*测试indexof方法，从数组中对比数据*/
		
//		String a = "a,a,a,a";
//		
//		String[] a = {"a","b","c","d"};
//		System.out.println(a.length);
//		
//		
//		//左磊
//		CopyOftest copyOftest = new CopyOftest();
		
		
		
//		String a = "1,2,3,4,";
//		a = a.substring(1, a.length()-1);
//		System.out.println(a);
		
		/**
		 * 测试数组如何转化为arraylist
		 * */
//		String a1 = "1,2,3,4,5";
//		String[] a2 = a1.split(",");
//		ArrayList<String> a3 = new ArrayList<String>();
//		Collections.addAll(a3,a2);
//		System.out.println(a3.toString());
		
		
//		
//		String a = "abcefgabcdefg";
//		System.out.println(a);
//		System.out.println(a.replace("a", "1"));
//		System.out.println(a.replaceAll("b", "1"));
//		System.out.println(a.indexOf("b"));
		
		
		
		
//		SimpleDateFormat sdf1 = new SimpleDateFormat("yy");
//		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
//		Date date_now = new Date();
//		System.out.println(date_now);
//		String date = sdf1.format(date_now);
//		String time = sdf2.format(date_now);
//		System.out.println(date);
//		System.out.println(time);
		
//		String a = "2019-01-01";
//		String b = a.substring(0, 4);
//		System.out.println(b);
//		
//		String c = a.substring(5, 7);
//		System.out.println(c);
//		
//		int d = Integer.valueOf(c);
//		d = 0;
//		d = d <= 0 ? 1 : d;
//		System.out.println(d);
		
//		System.out.println("111".substring(0,4));
		
		
//		System.out.println(" E ".contains("E"));
		
		
		/**比较 俩个实例是否是同一个类*/
		duotaiAnimal aa = new duotaiCat();
		duotaiAnimal bb = new duotaiDog();
		duotaiAnimal aa1 = new duotaiCat();
		
		duotaiAnimal aa2 = new duotaiAnimal();
		
		Class dd_class = bb.getClass();
		System.out.println(dd_class.toString());
		
		Class aa_class = aa.getClass();
		System.out.println(aa_class.toString());
		
		Class aa1_class = aa1.getClass();
		System.out.println(aa1_class.toString());
		
		Class aa2_class = aa2.getClass();
		System.out.println(aa2_class.toString());
		
		boolean cc = aa_class == aa2_class;
		System.out.println(cc);
		
	}
	
	public void syn() {
		System.out.println("=========");
	}

}
