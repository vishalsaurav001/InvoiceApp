package com.Invoice.vishal004;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Bill {


	public static void main(String[] args)throws IOException{
		
		System.out.println("WELCOME TO Invoice APP");
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	    while(true) {
	    	System.out.println("PRESS 1 to ADD Invoice");
	    	System.out.println("Press 2 to Exit");
	    	int c = Integer.parseInt(br.readLine());
	    	
	   if(c==1) {
		
		 System.out.println("Enter Coustmer name : ");
		    String name = br.readLine();
		    
		 System.out.println("-------------------------");
		 System.out.println("Enter Mobile no : ");
		    String mobile = br.readLine();
		 System.out.println("-------------------------");
		 System.out.println("Enter Coustmer Address");
		  String address = br.readLine();
		  System.out.println("-------------------------");
		 System.out.println("Enter Product Name : ");
		    String product = br.readLine();
		 System.out.println("-------------------------");
		 System.out.println("Enter Product price : ");
		   Double pvalue = Double.parseDouble(br.readLine());
		 System.out.println("-------------------------");
		 System.out.println("Enter its Quantity");
		    Double quantity = Double.parseDouble(br.readLine());
		  System.out.println("-------------------------");
		  Double sum = pvalue*quantity;
		 System.out.println("Total Price : "+sum);
		 System.out.println("-------------------------");
	System.out.println("How to do payment sir (cash),(cheque),(credit) [[NO ANOTHER INPUT REQUIRED]]");
         System.out.println("Enter Payment Method ");
		 String paym = br.readLine();
		 System.out.println();
		  
		 if(paym.equals("cash")){
			 System.out.println("Amount collected\n"+"\nthankyou sir see you again :)");
		 }else if(paym.equals("cheque")){
			 System.out.println("Amount collected\n"+"\nthankyou sir see you again :)");
		 }else if(paym.equals("credit")){
			double p = sum*90/100;
			    System.out.println("You have to pay after 10% discount:"+p);
				System.out.println("Amount collected.....\n"+"\nthankyou sir see you again :)"); 
		 }	
 
		//create student object to store person details
		  Details dt = new Details(name,mobile,address,product,pvalue,quantity,sum,paym,sum);
		  boolean answer = BillDao.insertBillToDB(dt);
		  if(answer) {
  			System.out.println("Person is added Successfully...");
  		}else {
  			System.out.println("Something went Worng try Again...");
  		}
  		System.out.println(dt);
		
	  }else if(c==2) {
		  //exit
		  break;
	  }else {
		  
	  }
	 }
	    
	    System.out.println("THANKYOU for ussing my application ....");
	    System.out.println("See you soon ..... bye bye :)");    
	    
  }
}
