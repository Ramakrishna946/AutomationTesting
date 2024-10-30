package SampleTests;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		
		String St1=scn.nextLine();
		
		int in=scn.nextInt();
		System.out.println("The Input number is :" +in);
		int in2,sum=0,temp;
		temp=in;
		while(in>0){    
			   in2=in%10;  //getting remainder  
			   sum=(sum*10)+in2;    
			   in=in/10;    
			  }    
		
	
		
		
			if(temp==sum) {
				System.out.println("The given input is Paliendrome");
			}
			else {
				System.out.println("The given input is Not Paliendrome ");
			}
		
		System.out.println("The Input String is :" +St1);
		//String St1="KIngcobra";
		String St2="";
		
		for(int i=St1.length()-1; i>=0; i--) {
			char c=St1.charAt(i);
			St2=St2+c;
			
			
			//asdfgfdsaSystem.out.println("The String Reversed :" +St2);
		}
		System.out.println("The String Reversed :" +St2);
		boolean b=St1.equals(St2);
		{
			if(b==true) {
				System.out.println("The given input is Paliendrome");
			}
			else {
				System.out.println("The given input is Not Paliendrome ");
			}
		}
	}

}
