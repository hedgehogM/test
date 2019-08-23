package dongtaidaili;

import java.lang.reflect.Proxy;

public class MyLoggerTest {

	public static void main(String[] args) throws SecurityException, NoSuchMethodException {
		
		BusinessClassService businessClassService = new BusinessClassServiceImpl();
		
		BusinessClassServiceImpl businessClassServiceImpl = new BusinessClassServiceImpl();
		
		MyLoggerHandler myLoggerHandler = new MyLoggerHandler(businessClassService);
		
		BusinessClassService businessClassServiceProxy = (BusinessClassService)Proxy.newProxyInstance(businessClassService.getClass().getClassLoader(), 
				businessClassService.getClass().getInterfaces(), myLoggerHandler);
		
		//businessClassService.doSomeThing1();
		
		//错误
		//businessClassService.doSomeThing2();
		//错误
		//businessClassServiceProxy.doSomeThing2();
		
		//businessClassServiceImpl.doSomeThing2();

		
		//2个人猜测：测试拦截方法；失败，因为这种情况，他所执行的所有方法都变成执行doSomeThing1()方法
		MyLoggerHandler myLoggerHandlermehode = new MyLoggerHandler(businessClassService, businessClassService.getClass().getMethod("doSomeThing1", null));
		BusinessClassService businessClassServiceProxymethode = (BusinessClassService)Proxy.newProxyInstance(businessClassService.getClass().getClassLoader(), 
				businessClassService.getClass().getInterfaces(), myLoggerHandlermehode);
		
		//businessClassServiceProxymethode.doSomeThing();
		
		
		//3个人猜测：在方法中添加业务判断，则肯定可以只拦截部分方法
		businessClassServiceProxy.doSomeThing();
		businessClassServiceProxy.doSomeThing1();
		
		
	}

}
