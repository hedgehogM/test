package test;

import java.lang.reflect.Method;

public class test_fanshe{

	Object obj;
	
	public static void main(String[] args) {
		
		try{
//			String javazl = "test.test";
			String javazl = "test.testz";
			Class<?> clazz = Class.forName(javazl);
			
			Method[] method = clazz.getMethods();

//	        System.out.println(method[0]);
			System.out.println(method[0]);

	        String[] strs = new String[]{"hello", "world", "!"};
	        
	        //当有参数的时候，注意这里：方法0是main方法，所以通过object也可以调用到（多态）
			method[0].invoke(new Object(), new Object[]{strs});
			//当没有参数的时候
//	        method[0].invoke(new Object(), null);
			
			Method method1 = clazz.getMethod("syn", null);
			System.out.println(method1);
			/*
			 * 这个方法不可行的原因：因为invoke的参数中，第一个参数表示代理类，相当于他会用这个实体去触发对应的方法
			 * 那么就要求，这个代理类是其自身。（或者其代理类，具体可以看动态代理的写法）
			 */
//			method1.invoke(new Object(), null);
//			method1.invoke(new test(), null);
//			method[1].invoke(new test(), null);
			
			/*clazz.getConstructor().newInstance()获取其实例*/
			method1.invoke(clazz.getConstructor().newInstance(), null);
			method[1].invoke(clazz.getConstructor().newInstance(), null);
			/*还有一种方法：先实例后强制转化成对应的类的父类或者其本身。
			 * 然后调用父类和其本身共有的方法，会自动执行子类的方法的。（原因：java的多态特性）*/
			testz a = (testz)clazz.getConstructor().newInstance();
			a.syn();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
