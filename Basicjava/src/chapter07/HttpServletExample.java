package chapter07;

public class HttpServletExample {
	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FileDownLoadServlet());
		}
	
	public static void method(HttpServlet servlet) {
		servlet.service();
	}
}
