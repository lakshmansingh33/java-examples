/**
 * 
 */
package com.annotation;

/**
 * @author lmuriyal
 *
 */
@SmartPhone(osName="Andriod",version=10)
public class SamSung {
	
	private String model;
	private int screenSize;
	
	public SamSung(String model, int screenSize) {
		this.model = model;
		this.screenSize = screenSize;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}
	
	
	

}
