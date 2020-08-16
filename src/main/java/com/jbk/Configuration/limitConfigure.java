package com.jbk.Configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties("limits-service")
public class limitConfigure {

	private int min;
	private int max;
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	@Override
	public String toString() {
		return "limitConfigure [min=" + min + ", max=" + max + "]";
	}
	public limitConfigure() {
		
	}
	public limitConfigure(int min, int max) {
		
		this.min = min;
		this.max = max;
	}
	
	
	
	
	
}
