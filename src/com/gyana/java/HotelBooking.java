package com.gyana.java;

import java.util.*;
public class HotelBooking{
	
	public static void roomtype() 
	{
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("please enter the room type\n1.AC\n2.NON AC");
		int ac = sc.nextInt();
		if(ac==1)
		{
			System.out.println("Selected for ac");
			payment();
		}
		else if(ac==2)
		{
			System.out.println("Selected for non ac");
			payment();	
		}
		
	}
	public static void payment() {
		Scanner sc= new Scanner(System.in);
		System.out.println("select your payment");
		System.out.print("1.gpay\n2.phonepae\n3.qr scan\n4.netbanking\n5.amazonpay");
		int pay=sc.nextInt();
		if(pay==1) 
		{
			System.out.println("enter upi id");
			int pin= sc.nextInt();
			if(String.valueOf(pin).length()==4)
			{
				System.out.println("your hotel room is booking");
			}
			else if(pay==2)
			{
				
				System.out.println("enter upi id");
				int pin1= sc.nextInt();
				if(String.valueOf(pin1).length()==4)
				{
					System.out.println("your hotel room is booking");
			}
			}
			else if(pay==3)
				{
				System.out.println("enter upi id");
				int pin1= sc.nextInt();
				if(String.valueOf(pin1).length()==4)
				{
					System.out.println("your hotel room is booking");
				}
				}
			else if(pay==4)
			{
			System.out.println("enter upi id");
			int pin1= sc.nextInt();
			if(String.valueOf(pin1).length()==4)
			{
				System.out.println("your hotel room is booking");
			}
			}
			else if(pay==5)
			{
			System.out.println("enter upi id");
			int pin1= sc.nextInt();
			if(String.valueOf(pin1).length()==4)
			{
				System.out.println("your hotel room is booking");
			}
			}
			else
			{
				System.out.println("enter correct pin");
				
			}
			System.out.println("thank you");
			
			}
			
		
	}
	public static void family() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the total no of members");
		int fam=sc.nextInt();
		if(fam>0&&fam<=4)
		{
			System.out.print("enter maximum no of peole stayed in a room");
			int fam1=sc.nextInt();
			if(fam1>0&&fam1<=4)
			{
				System.out.println("in"+fam1+"please enter the no of Childrens who are having age below 10");
				int ch=sc.nextInt();
				System.out.println("in"+fam1+"please enter the no of adults who are having age above 10");
				int au=sc.nextInt();
				if((ch>=0&&ch<=2)&&(au>=0&&au<=2))
				{
					if(ch>2)
						{
							System.out.println("no charges for 2 children"+ch+"IF MORE THAN 2 THEN THERE WILL BE CHARGE");
							roomtype();
						}
						
//						else 
//						{
//							roomtype();
//							
//						}
						else
						{
							System.out.println("more than 2 adults are not allowed");
							
							family();
						}
					
				}
				
			}
			else
			{
				System.out.println("book another room");
			}
		}
		
		
		
		
	}

	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("welcome to Shimla");
		System.out.println("======================================");
		System.out.println();
		System.out.println("please choose hotel");
		System.out.println("1.mayfair\n2.lesancy boutique\n3.premium luxury\n4.itc");
		int ht=sc.nextInt();
		if(ht==1) {
			int ac=3000;
			int nonac=2500;
			System.out.println("===========welcome to mayfair========");
			System.out.println("for ac"+ac+"non ac"+nonac);
			System.out.println();
			family();
		}
		else if(ht==2) 
		{
			int ac=5000;
			int nonac=3500;
			System.out.println("===========welcome to lesancy========");
			System.out.println("for ac"+ac+"non ac"+nonac);
			System.out.println();
			family();
		}
		
		else if(ht==3) 
		{
			int ac=5000;
			int nonac=3500;
			System.out.println("===========premium luxury========");
			System.out.println("for ac"+ac+"non ac"+nonac);
			System.out.println();
			family();
		}
		else if(ht==4) 
		{
			int ac=5000;
			int nonac=3500;
			System.out.println("===========welcome to itc========");
			System.out.println("for ac"+ac+"non ac"+nonac);
			System.out.println();
			family();
		}
		else
			System.out.println("invalid");
			
			
		
		}
		
		
	
	}	
