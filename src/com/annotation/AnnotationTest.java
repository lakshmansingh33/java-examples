/**
 * 
 */
package com.annotation;

import java.lang.annotation.Annotation;

/**
 * @author lmuriyal
 *
 */
public class AnnotationTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*SamSung ss = new SamSung("G7",99);
		System.out.println("model "+ss.getModel()+" and screenSize "+ss.getScreenSize());
		
		NokiaPhone nk = new NokiaPhone("1100",49);
		System.out.println("model "+nk.getModel()+" and screenSize "+nk.getScreenSize());*/
		
		NewNokiaPhone nk2 = new NewNokiaPhone();
		System.out.println("model "+nk2.getModel()+" and screenSize "+nk2.getScreenSize());
		
		Class clazz = nk2.getClass();
		
		Annotation[] an = clazz.getAnnotations();
		for (Annotation annotation : an) {
			SmartPhone smartPhone=(SmartPhone)annotation;
			System.out.println(smartPhone.osName()+" -- "+smartPhone.version());
			
		}
	}

}
