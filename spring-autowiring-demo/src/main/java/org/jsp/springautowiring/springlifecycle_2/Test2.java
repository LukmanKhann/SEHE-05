package org.jsp.springautowiring.springlifecycle_2;

public class Test2 {
	 static {
	    	System.out.println("test class loaded into JVM memeory");
	    }
	    Test2(){
	    	System.out.println("Test object is getting created");
	    }
	    public void hii() {
	    	System.out.println("Hii test class");
	    }
	    public void byee() {
	    	System.out.println("Byee test class");
	    }

}
