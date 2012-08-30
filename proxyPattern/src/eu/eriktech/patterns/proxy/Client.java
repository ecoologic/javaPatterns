package eu.eriktech.patterns.proxy;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Subject fatObj = new RealSubject();
		System.out.println("without proxy:\n[" + fatObj.request() + "]" 
				+ "\n[" + fatObj.request() + "]"
				+ "\n[" + fatObj.request() + "]");
		
		
		fatObj = new Proxy();
		System.out.println("while with proxy:\n[" + fatObj.request() + "]" 
				+ "\n[" + fatObj.request() + "]"
				+ "\n[" + fatObj.request() + "]");
		
		

	}

}
