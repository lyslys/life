package com.service;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test {
	
	static{
		System.out.println("ccccccccc");
	}
	
	public Test(){
		System.out.println("test");
	}
	
	{
		System.out.println("没有");
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	//	test("hello", "world", "13sd", "china", "cum", "ict");
		Integer y = 6;
		Integer i = 6;
//		System.out.println(i == y);
//		System.out.println(i == y);
//		System.out.println(y.equals(i));
		
//		String t = "a";
//		
//		Class c = t.getClass();
//		Object str = c.newInstance();
//		String r = new String("b");
//		System.out.println(str);
//		
		
		Class c = Class.forName("java.lang.Integer");  
        //获取所有的属性?  
      Field[] fs = c.getDeclaredFields();  
      Method[] fm = c.getDeclaredMethods();  
 
             //定义可变长的字符串，用来存储属性  
      StringBuffer sb = new StringBuffer();  
      //通过追加的方法，将每个属性拼接到此字符串中  
      //最外边的public定义  
      sb.append(Modifier.toString(c.getModifiers()) + " class " + c.getSimpleName() +"{\n");  
      //里边的每一个属性  
      for(Field field:fs){  
          sb.append("\t");//空格  
          sb.append(Modifier.toString(field.getModifiers())+" ");//获得属性的修饰符，例如public，static等等  
          sb.append(field.getType().getSimpleName() + " ");//属性的类型的名字  
          sb.append(field.getName()+";\n");//属性的名字+回车  
      }  
      
      for(Method method:fm){
    	  System.out.println(method.getName());
      }

      sb.append("}");  

      System.out.println(sb);  
      
	}

	public static void test(Object... arguments) {
		for (int i = 0; i < arguments.length; i++) {
			System.out.println(arguments[i]);
		}
	}
	
	public void f(){
		System.out.println("Test f()");
	}

}
