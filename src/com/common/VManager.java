/**
 * 
 */
package com.common;

import java.util.Scanner;

import com.search.VComputer;

/**
 * @author lmuriyal
 *
 */
public class VManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to election sytem");
		
		VManager vm = new VManager();
		vm.processTheInputData();

	}

	private void processTheInputData() {
		SystemInputs[] inputs = SystemInputs.values();
		for (SystemInputs systemInputs : inputs) {
			System.out.println(systemInputs.getMessage()+"==>"+systemInputs.getInput());
		}
		/*int i =0;
		while(i<=5){
			System.out.println(i);
			i++;
		}*/
		
		VComputer vc = new VComputer();
		Scanner input = new Scanner(System.in);
		while(true){
			String inputData = input.next();
			System.out.println(inputData);
			vc.processData(inputData);
		}
		
		
	}

}
