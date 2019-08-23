package formethod;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test {

	public void syn() {

		for(int i = 0; i < 10; i++) {
			ceshi1(i);
		}

	}

	public void ceshi1(int i) {
		System.out.println("=i="+ i);
		ceshi2(i);
	}

	public void ceshi2(int j) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("=j="+ j);
	}

}
