package com.runoob.test;


public class myfirstpro {
	
	
	String name;
	int number;
	
	
	public myfirstpro(String name,boolean t )
	{
		 if(t==true)
		 {
			 
		name="init the class name";
		number =0x99999;
		System.out.println("����OK :" + name ); 
		 }
		 else
		 {
			 
		 System.out.println("����fali:" + name );  
			 
		 }
		
	}
	
	
	int setnum(int a)
	{
		
		 System.out.println("set number  :" + a ); 
		 number=a; 
		 return 0;
		
	}
	
   int getnum()
	{
		 System.out.println("get number  :" + number ); 
		 return number;
	}
	
   
	 public static void main(String[] args){
	      // �������佫����һ������
		boolean  i=true;
	
		  myfirstpro mypro = new  myfirstpro("new class ok!!",true);
		  
		  
			do
			 {
				mypro.setnum(123456);
			    mypro.getnum(); 
				// i++;
			 } while(i==true);
		
		   
	   }
	
	 //System.out.println("test of end "); 
	

}
