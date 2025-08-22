package com.tka.july;

public class constructor {
	String name;
	int roll_no;
	int marks;
	int age;

constructor(){
	System.out.println("zero constructor");
}
constructor(String n){
	name=n;
	System.out.println(name);
}
constructor(String n,int r){
	name=n;
	roll_no=r;
	System.out.println(name+roll_no);
}
constructor(String n,int r,int m){
	name=n;
	roll_no=r;
	marks=m;
	System.out.println(name+roll_no+marks);
}
}
	