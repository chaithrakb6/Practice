package Chaithra;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);//chaithra=catr
	    System.out.println("enter the name"); 
		String name=sc.next();//HAITHRAC
        String name1="";
        int i,j;
        for (i = 1; i < name.length(); i++) {
        	
        	name1=name1+name.charAt(i);
			
		}
        for ( j= 0; j<=0;j++) {
        	name1=name1+name.charAt(j);}
        	System.out.println(name1);
			
		}
	}

