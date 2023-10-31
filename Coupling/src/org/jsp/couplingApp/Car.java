package org.jsp.couplingApp;

public class Car {
	private Engine e = new Engine();
	public void startengine() {
		e.ready();
	}

}
