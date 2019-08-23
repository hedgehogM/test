package test2;

import java.text.NumberFormat;
import java.util.*;


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
		
//		String[] test = {"左磊1","左磊2","左磊3","左磊1","左磊2","左磊1"};
//		String[] newtest = toSingle(test);
//		String testString = arrayToString(newtest, ",");
//		System.out.println(testString);
		
		
//		//左磊
//		int a = 1;
//		CopyOftest a = new CopyOftest();
//		a.zuol(fdfdassa);
		
		
//		String cc = "123";
//		if(!"".equals(cc) && cc.length() > 0) {
//			cc = cc.substring(0, (cc.length()-1));
//		}
//		System.out.println(cc);
//		
//		double cc = 1000000000000.01d;
//		System.out.println(formatDouble(cc));
		
//		String a = "2,11,22,5";
//		System.out.println(a.contains("111"));
		
//		String[] a = new String[1];
//		a[0] = "11";
//		a[1] = "22";
//		System.out.println(a[0]);
		
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("zl", "11");
//		String aa = map.get("zl");
//		String a1 = map.get("zuolei");
//		System.out.println(aa);
//		System.out.println(a1);
		
//		System.out.println(MyTimeUtil.getDate(-1));
		
//		String a = MyTimeUtil.getDate("2018-01-01", -1);
//		System.out.println(a);
		
		
		//测试速度：快：StringBuilder > StringBuffer > String
//		StringBuilder sql1 = new StringBuilder();
//		Date start_time1 = new Date();
//		for(int i = 0; i < 100; i++) {
//			sql1.setLength(0);
//			sql1.append("============aaaaaaaaaaaaa===========").append(i).append("============bbbbbbbbbb============");
//			//System.out.println(sql1);
//		}
//		Date end_time1 = new Date();
//		System.out.println(start_time1);
//		System.out.println(end_time1);
//		long cha1 = (end_time1.getTime() - start_time1.getTime());
//		System.out.println("cha = " + cha1);
//		
//		
//		StringBuffer sql2 = new StringBuffer();
//		Date start_time2 = new Date();
//		for(int i = 0; i < 100; i++) {
//			sql2.setLength(0);
//			sql2.append("============aaaaaaaaaaaaa===========").append(i).append("============bbbbbbbbbb============");
//			//System.out.println(sql2);
//		}
//		Date end_time2 = new Date();
//		System.out.println(start_time2);
//		System.out.println(end_time2);
//		long cha2 = (end_time2.getTime() - start_time2.getTime());
//		System.out.println("cha2 = " + cha2);
//		
//		
//		String sql3 = new String();
//		Date start_time3 = new Date();
//		for(int i = 0; i < 100; i++) {
//			sql3 = "";
//			sql3 += "============aaaaaaaaaaaaa==========="+i+"============bbbbbbbbbb============";
//			//System.out.println(sql3);
//		}
//		Date end_time3 = new Date();
//		System.out.println(start_time3);
//		System.out.println(end_time3);
//		
//		long cha3 = (end_time3.getTime() - start_time3.getTime());
//		System.out.println("cha3 = " + cha3);
		
		
//		List a = new ArrayList();
//		a.add("1");
//		a.add("");
//		a.add("2");
//		
//		a.set(0, "3");
//		System.out.println(a.get(0));
//		System.out.println(a.get(1));
//		System.out.println(a.get(2));
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyMM");
//		Date date = new Date();
//		System.out.println(sdf.format(date));
		
		
		
//		List<String> sql1 = new ArrayList<String>();
//		Date start_time1 = new Date();
//		for(int i = 0; i < 10000; i++) {
//			sql1.add("zuolei"+i);
//		}
//		Date end_time1 = new Date();
//		System.out.println(start_time1);
//		System.out.println(end_time1);
//		long cha1 = (end_time1.getTime() - start_time1.getTime());
//		System.out.println("cha1 = " + cha1);
//		
//		
//		Map<String, String> sql2 = new HashMap<String, String>();
//		Date start_time2 = new Date();
//		for(int i = 0; i < 10000; i++) {
//			sql2.put("zuolei"+i, "zuolei"+i);
//		}
//		Date end_time2 = new Date();
//		System.out.println(start_time2);
//		System.out.println(end_time2);
//		long cha2 = (end_time2.getTime() - start_time2.getTime());
//		System.out.println("cha2 = " + cha2);
		
//		String a = "11113";
//		a = a.substring(0, 4);
//		System.out.println(a);
		
//		List<String> a = new ArrayList<String>();
//		a.add("1");
//		System.out.println(a.get(0));
//		a.set(0, "2");
//		System.out.println(a.get(0));
//		String a = "a";
//
//		Object[] aa = {null,null};

//		long ct = System.currentTimeMillis();
//		Random rd = new Random(ct);
//		System.out.println(ct);
//		for(int i = 0; i < 10; i++) {
//			System.out.println(rd.nextInt(2));
//		}


		String a = "bigdata";
		String b = "big" + new String("data");

		System.out.println(a != b);
		
	}
	
	/**
	 * v1：数组去重，使用集合
	 * 优点：有序
	 * 缺点：代码复杂
	 * @param oldArray
	 * @return
	 */
	private static String[] toSingle(String[] oldArray) {
	
		List<String> newArray = new ArrayList<String>();
		
		int length = oldArray.length;
		
		if(oldArray != null && length > 0) {
			for(String temp : oldArray) {
				try {
					for(String temp2 : newArray) {
						if(temp.equals(temp2)) {
							throw new ArithmeticException();
						}
					}
				} catch(ArithmeticException ex) {
					continue;
				}
				newArray.add(temp);
			}
		}
		String[] newArrayString = new String[newArray.size()];
		newArray.toArray(newArrayString);
		
		return newArrayString;
	}
	
	/**
	 * v2：数组去重：使用set集合
	 * 优点：代码简单
	 * 缺点：无序
	 * @param oldArray
	 * @return
	 */
	private static String[] toSingleSet(String[] oldArray) {
	
		Set<String> newArray = new HashSet<String>();
		
		int length = oldArray.length;
		
		if(oldArray != null && length > 0) {
			for(String temp : oldArray) {
				newArray.add(temp);
			}
		}
		String[] newArrayString = new String[newArray.size()];
		newArray.toArray(newArrayString);
		
		return newArrayString;
	}
	
	/**
	 * 
	 * 根据字符拼接数组
	 * @param oldArray
	 * @param character
	 * @return
	 */
	private static String arrayToString(String[] oldArray, String character) {
		StringBuilder newString = new StringBuilder();
		int length = oldArray.length;
		if(oldArray != null && length > 0) {
			for(int i = 0; i < length; i++) {
				if(i == 0) {
					newString.append(oldArray[i]);
				} else {
					newString.append(character);
					newString.append(oldArray[i]);
				}
			}
		}
		return newString.toString();
	}
	
	/**
	 * 取消科学计数法
	 * 例如： 100.00=> 100; 100.01=>100.01
	 * @param d
	 * @return
	 */
	private static String formatDouble(double d) {
        NumberFormat nf = NumberFormat.getInstance();
        //设置保留多少位小数
        nf.setMaximumFractionDigits(20);
         // 取消科学计数法
        nf.setGroupingUsed(false);
        //返回结果
        return nf.format(d);
    }

}
