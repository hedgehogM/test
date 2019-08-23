package dongtaidaili;

import java.lang.reflect.Method;

public interface MyLogger {
	void saveIntoTime(Method method);
	void saveOutTime(Method method);
}
