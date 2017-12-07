package com.service;

public class T1 {
	void f(){
		System.out.println("T1.f()");
	}
	
	public class Inner{
		public T1 outer(){
			return T1.this;
		}
	}
	
	public Inner inner(){
		return new Inner();
	}  
	
	public static void main(String[] args) {
		T1  t = new T1();
		T1.Inner ti = t.inner();
		ti.outer().f();
	}
	
}
