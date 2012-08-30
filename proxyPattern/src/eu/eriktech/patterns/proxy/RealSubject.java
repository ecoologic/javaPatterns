package eu.eriktech.patterns.proxy;
//let's pretend this object is a heavy one..
public class RealSubject implements Subject {
	public RealSubject(){
			System.out.println("request for a heavy operation (create a realSubject)");
	}
	
	public String request(){
		System.out.println("request for a heavy operation (satisfy the request)");
		return "your data!";
	}

}
