/**
 * 
 */
package com.annotation;

/**
 * @author lmuriyal
 *
 */
@SmartPhone(osName="Symbain_new",version=6)
public class NokiaPhone {
	
	private String model;
	private int screenSize;
	
	
	
	public NokiaPhone() {
	
	}

	public NokiaPhone(String model, int screenSize) {
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
