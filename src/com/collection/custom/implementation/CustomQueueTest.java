/**
 * 
 */
package com.collection.custom.implementation;

import java.util.Scanner;

/**
 * @author lmuriyal
 *
 */
public class CustomQueueTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of the Queue\n");
		int size = scan.nextInt();
		CustomQueue queue = new CustomQueue(size);
		//Variable to hold user interation
		char ch;
		do{
			System.out.println("Queue Operations\n");
			System.out.println("1.Insert");
			System.out.println("2.Remove");
			System.out.println("3.Peek");
			System.out.println("4.Check Empty");
			System.out.println("5.Check full");
			System.out.println("6.Size");
			
			int choice = scan.nextInt();
			
			switch(choice){
				case 1:
					System.out.println("Please enter the element to be insert\n");
					try{
						queue.insert(scan.nextInt());
					}catch(Exception e){
						System.out.println("Exception occourred :"+e.getMessage());
					}
					break;
				case 2:
					try{
						System.out.println("Removed element is "+queue.remove());
					}catch(Exception e){
						System.out.println("Exception occourred :"+e.getMessage());
					}
					break;
				case 3:
					try{
						System.out.println("Peeked element is "+queue.peek());
					}catch(Exception e){
						System.out.println("Exception occourred :"+e.getMessage());
					}
					break;
				case 4:
					System.out.println("Empty status "+queue.isEmpty());
					break;
				case 5:
					System.out.println("Full status "+queue.isFull());
					break;
				case 6:
					System.out.println("Current size "+queue.getSize());
					break;
				default:
					System.out.println("Wrong user input\n");
					break;
			}
			queue.display();
			System.out.println("\n Do you want to continue (type y or n )?\n");
			ch=scan.next().charAt(0);
			
		}while(ch=='Y'||ch=='y');
		
	}

}
