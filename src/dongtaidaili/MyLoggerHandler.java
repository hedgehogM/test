package dongtaidaili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyLoggerHandler implements InvocationHandler {

	/**
	 * AOP目标对象：用来存储要被切入的类
	 */
	private Object objOriginal;
	
	/**
	 * AOP目标对象：用来存储要被切入的方法
	 */
	private Method methodproxy;
	
	/**
	 * AOP通知：切入后需要执行的方法
	 */
	private MyLogger myLogger = new MyLoggerImpl();
	
	public MyLoggerHandler(Object obj) {
		super();
		this.objOriginal = obj;
	}
	
	public MyLoggerHandler(Object obj, Method method) {
		super();
		this.objOriginal = obj;
		this.methodproxy = method;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		Object result = null;
		if("doSomeThing".equals(method.getName())) {
		
			myLogger.saveIntoTime(method);
			
			result = method.invoke(objOriginal, args);
			//result = methodproxy.invoke(objOriginal, args);
			
			myLogger.saveOutTime(method);
		
		} else {
			result = method.invoke(objOriginal, args);
		}
		
		return result;
	}

}
