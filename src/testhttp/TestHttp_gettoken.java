package testhttp;

public class TestHttp_gettoken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String httpUrl1 = "http://172.50.1.125/ssologin/getToken";
		String param1 = "appid=ssss&loginid=test";
		String result1 = HttpClient.doPost(httpUrl1, param1);
		System.out.println(result1);
	}
}
