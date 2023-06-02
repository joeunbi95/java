package reNew03;

import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

public class New08 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// Network
		// IP주소 : 실직적인 사이트의 주소
		InetAddress ip = null;
		ip = InetAddress.getByName("www.naver.com");
		System.out.println("getHostAddress : "+ ip.getHostAddress());
		System.out.println("getHostName : " + ip.getHostName());
		System.out.println("toString : "+ ip.toString());
		
		URL url = new URL("https://n.news.naver.com/mnews/article/057/0001740539?sid=100");
		System.out.println(url.getAuthority());
		System.out.println(url.getContent());
		System.out.println(url.getPort());
		System.out.println(url.getProtocol());
		System.out.println(url.getQuery());
		System.out.println(url.getHost());
		System.out.println(url.getPath());
		
		
	}

}
