package org.jsp.annotationpractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ride {
	@Autowired
	@Qualifier(value = "scooty")
private Vehicle v ;

public Vehicle getV() {
	return v;
}

public void setV(Vehicle v) {
	this.v = v;
}
}
