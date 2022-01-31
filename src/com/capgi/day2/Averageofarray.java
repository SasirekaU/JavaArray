package com.capgi.day2;

public class Averageofarray {
public static void main(String args[])
{
	int a[]= {12,32,45,64};
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		sum=sum+a[i];
	}
	double avg=sum/a.length;
	System.out.println("average is: "+avg);
}
}
