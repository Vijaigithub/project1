package calculator;

import java.util.Scanner;

import calci.calci;

public class calculatorApp {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 calci c=new calci();
	 boolean exit=true;
	 
	 while(exit) {
		 System.out.println("enter ur choice\n");
		 System.out.println("1.addition\n 2.subtraction\n 3.multiplication\n 4.division\n");
		 int choice=sc.nextInt();
		 
		 switch(choice)
		 {
		 case 1:{
			 int result=c.add(90,10);
			System.out.println("add "+result);
				
		 }
		 break;
		 case 2:{
			 int result=c.sub(100,88);
			 System.out.println("sub "+result);
		 }
		 break;
		 case 3:
			 
		 {
			 int result=c.multi(12,12);
			 System.out.println("multiplication "+result);
			 
		 }
		 break;
		 case 4:
		 {
			 int result=c.div(99,3);
			 System.out.println("division  "+result);
		 }
		 break;
		 case 5:
		 {
			 System.out.println("thank you");
			exit=false; 
		 }
		 break;
		 default:
		 {
			 System.out.println("input is invalid");
		 }
		 }
	 }
}
}
