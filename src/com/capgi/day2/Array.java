package com.capgi.day2;
import java.util.Scanner;
public class Array {
	public static void main(String args[])
	{
      int a[]=new int[10];
      int i;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number");
      for(i=0;i<5;i++)
      {
    	  a[i]=sc.nextInt();
      }
      for(i=0;i<5;i++)
      {
    	  System.out.println("the array is" +a[i]);
      }
	}
}
