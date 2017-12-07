package com.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ForTest extends Test {

	static {
		System.out.println("aa");
	}

	{
		System.out.println("呵呵");
	}

	public ForTest() {
		System.out.println("bb");
	}

	public void f() {
		System.out.println("forTest");
	}

	public static void main(String[] args) {
		// a();
		// test("hello", "world", "13sd", "china", "cum", "ict");
		// test(new ForTest(),new ForTest());

		// new ForTest().f();

//		 lilihong();
		 jia();
	}

	public static void a() {
		flag: for (; true;) {
			String str = new String("李丽红");
			System.out.println(str);
			while (true) {
				System.out.println(str + 1);
				return;
			}
		}
	}

	public static void test(Object... arguments) {
		for (int i = 0; i < arguments.length; i++) {
			System.out.println(arguments[i]);
		}

	}

	public static void lilihong() {
		for (;true;) {
			System.out.print(Hehe.str);
			System.err.println(Hehe.msg);
			System.err.println(callBack("*"));
		}
	}


	public static String callBack(String input) {

		int[] array = { 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1,
				0, 0, 1, 1, 4, 5, 2, 3, 4, 1, 0, 1,

				0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0 };

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < array.length; i++) {

			if (i % 7 == 0)

				sb.append("  \n");

			if (array[i] == 0)

				sb.append("   ");

			else if (array[i] == 4)

				sb.append("  ");

			else if (array[i] == 5)

				sb.append(" I ");

			else if (array[i] == 2)

				sb.append("Lvoe ");

			else if (array[i] == 3)

				sb.append("You");

			else

				sb.append("  " + input);

		}

		return sb.toString();

	}
	
	public static void jia() {
		Map<Integer,Object> map = new HashMap<Integer,Object>();
		int i = 0;
		while(true){
			map.put(i++,new Date());
			System.out.println(map.get(i-1));
		}
	}


}
