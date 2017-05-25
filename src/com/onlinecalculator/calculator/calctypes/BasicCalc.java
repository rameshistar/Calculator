package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;

public class BasicCalc
{
	int a,b,c,ch,res;
	
	public BasicCalc()
        {//;l;
		a=0;
		b=0;
		c=0;
		res=0;
		
	}
	
	public int menu()
        {
    	System.out.println("********* select option********");
    	System.out.println("1.Adition");
    	System.out.println("2.Substraction");
    	System.out.println("3.Multiplication");
    	System.out.println("4.Division");
    	System.out.println("********************************");
    	System.out.println("Enter your choice ");
    	Scanner s=new Scanner(System.in);
    	ch=s.nextInt();
    	switch(ch)
    	{
    	case 1: System.out.println("Addition:");
    			res=add();
    			System.out.println(res);
    			break;
    	case 2: break;
    	case 3: break;
    	case 4: break;
    	default: System.out.println(" Invalid..... chioce. plz... try..again");
    		
    		
    		
    	
    	
    	// just it is template for student demonstration.
    	
    	/* hello .... iSTAR */
    	
	}
	
    public void userInputs()
    {
    	Scanner s=new Scanner(System.in);
    System.out.println(" Enter first number");
    a=s.nextInt();
    System.out.println(" Enter second number");
    b=s.nextInt();
 
    }

    public void performOperation()
{
    	
}
       
    }
    
	int add()
	{
		c=a+b;
		return c;
		
	}
	
	int subtract()
	{
		c=a-b;
		return c;
		
	}
	
	int multiply()
	{
		c=a*b;
		return c;
		
	}
	
	int divide()
	{
		c=a/b;
		return c;
		
	}
	
}