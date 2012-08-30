package eu.eriktech.patterns.proxy;
// ? proxy pattern allows to use an object without having an instance of all the parts of it.
// ? so if you have huge object, they can have a light behavior when you use just the light parts.
// ? you can also cache data and in general control its behavior 

public class Proxy implements Subject {
	private RealSubject realSubject; 
	private String realSubjectRequestValue;
	
	public String request(){
		// ? this is the kind of behavior of the proxy,
		// ? you can pilot when and how to use RealObject
		if (realSubject == null)
			realSubject = new RealSubject();
		
		if (realSubjectRequestValue == null)
			realSubjectRequestValue = realSubject.request();
		
		return realSubjectRequestValue;
	}


}
