package dongtaidaili;

import java.lang.reflect.Method;
import java.util.Date;

public class MyLoggerImpl implements MyLogger {

	@Override
	public void saveIntoTime(Method method) {
		System.out.println("进入" + method.getName() + "方法时间为：" + new Date());
		
	}

	@Override
	public void saveOutTime(Method method) {
		System.out.println("退出" + method.getName() + "方法时间为：" + new Date());
		
	}

}
