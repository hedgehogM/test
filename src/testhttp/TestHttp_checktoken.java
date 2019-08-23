package testhttp;

public class TestHttp_checktoken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String httpUrl1 = "http://127.0.0.1:8088/ssologin/checkToken";
		String param1 = "token="+"D01DBDA0EEF40D599596BD60C000D36F94D103A85DB24219A473262A4FB8DA4F";
		String result1 = HttpClient.doPost(httpUrl1, param1);
		System.out.println(result1);
	}
}
