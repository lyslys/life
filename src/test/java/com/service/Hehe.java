package com.service;

import java.util.Date;

public interface Hehe {
	String str ="李丽红我爱你";
	String msg ="李丽红我喜欢你";
	
	void say();
}

class He implements Hehe{

	@Override
	public void say() {
		System.out.println("李丽红");
	}
	
}

class Hee implements Hehe{
	
	@Override
	public void say() {
		System.out.println("李丽红");
	}
	
}

abstract class Lilihong{
	Date d = new Date();
	
	void zuoai(){
		System.out.println("和我");
	}
	
	public abstract void yuehui();
	
}

class Heee extends Lilihong{

	@Override
	public void yuehui() {
		System.out.println("李丽红 miss you!");
	}
	
}

class Heeeee extends Lilihong{

	@Override
	public void yuehui() {
		System.out.println("李丽红miss you!");
	}
	
}

interface  HeheFactory{
	Hehe getHehe();
}

class HeFactory implements HeheFactory{

	@Override
	public Hehe getHehe() {
		return new He();
	}
	
}

class HeeFactory implements  HeheFactory{

	@Override
	public Hehe getHehe() {
		return new Hee();
	}
	
}

class T {
	
	private String vr = "今晚下班后打电话给李丽红";
	
	class G{
		private int i = 11;
		public int value(){
			return i;
		}
	}
	
	class De{
		
		private String label;
		
		De(String wt){
			label = wt;
		}
		
		String r(){
			return label;
		}
		
		public void cjy(){
			System.err.println(vr);
		}
		
	}
	
	 public  De to(String s){
		 return new De(s);
	 }
	
	public G getG(){
		return new G();
	}
	
	public static void aa(HeheFactory fact){
		Hehe h = fact.getHehe();
		h.say();
	}
	
	public  void ship(String dest){
		G g = getG();
		System.err.println(g.value());
		De de = to(dest);
		System.err.println(de.r());
	}
	
	
	
	public static void main(String[] args) {
		Lilihong h = new Heeeee();
		h.yuehui();
		h.zuoai();
		
		aa(new HeFactory());
		aa(new HeeFactory());
		
		T t = new T();
		t.ship("李丽红我爱你");
		
		T tt = new T();
		T.G g = tt.getG();
		System.err.println(g.value());
		T.De de = tt.to("李丽红我爱你");
		System.err.println(de.r());
		de.cjy();
		
	}
}

