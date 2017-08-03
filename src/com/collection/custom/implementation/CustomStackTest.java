/**
 * 
 */
package com.collection.custom.implementation;

import java.util.Scanner;

/**
 * @author lmuriyal
 *
 */
public class CustomStackTest {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Stack test\n");
		System.out.println("Enter the size of the stack");
		int n = scan.nextInt();
		
		// Create custom stack with the passed parameter\
		CustomStack stk = new CustomStack(n);
		
		// Variable to hold confirmation
		char ch;
		
		do{
			System.out.println("\nStack operation\n");
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.peek");
			System.out.println("4.chek empty");
			System.out.println("5.check full");
			System.out.println("6.size");
			
			// Take user choice
			int choice =scan.nextInt();
			
			switch(choice){
			case 1:
				System.out.println("Please enter the element to be pushed");
				try{
					stk.push(scan.nextInt());
				}catch(Exception e){
					System.out.println("Error message is :"+e.getMessage());
				}
				break;
			case 2:
				try{
					System.out.println("popped element is :"+stk.pop());
				}catch(Exception e){
					System.out.println("Error message is :"+e.getMessage());
				}
				break;
			case 3:
				try{
					System.out.println("peeked element is :"+stk.peek());
				}catch(Exception e){
					System.out.println("Error message is :"+e.getMessage());
				}
				break;
			case 4:
				System.out.println("Stack is empty :"+stk.isEmpty());
				break;
			case 5:
				System.out.println("Stack is full :"+stk.isFull());
				break;
			case 6:
				System.out.println("Current size of the Stack is :"+stk.getSize());
				break;
			default:
				System.out.println("\nWrong input provided");
				break;
			}
		System.out.println("\nDisplaying current stack elements");	
		stk.display();
		System.out.println("\nDo you want to continue ? (type y or n");
		ch = scan.next().charAt(0);
			
		}while(ch == 'Y'||ch=='y');
		
	}

}
