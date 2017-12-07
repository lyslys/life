package com.service;

/**
 * @author zhengbinMac
 */
public class NoVisibility {
    private static boolean ready;
    private static int number;
    private static class ReaderThread extends Thread {
        @Override
        public void run() {
            while(!ready) {
                Thread.yield();
            }
            System.out.println(number);
        }
    }
    
    public static void tt(Test test){
    	 test.f();
    }
    
    public static void main(String[] args) {
//        new ReaderThread().start();
//        number = 42;
//        ready = true;
        
//    	ForTest ft = new ForTest();
//    	
//    	ConsumerServiceTest cst = new ConsumerServiceTest();
//    	tt(cst);
//    	tt(ft);
    	
    	Test test = new ForTest();
    	Test testc = new ConsumerServiceTest();
    	test.f();
    	testc.f();
    	
    }
}
