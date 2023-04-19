package Chaithra;

import java.util.Scanner;//ctrl+shift+o

public class StringEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the name");
	String name=sc.next();
	String uname="";
	for (int i = 0; i < name.length(); i++) {
		if (i%2==1) {
			uname=uname+name.charAt(i);}}
			System.out.println(uname);
		
			
		}
		
	}
	
	


