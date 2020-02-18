package com.srini.thread;

public class MyThread extends Thread{

	public static void main(String[] args) {
		MyThread mt=new MyThread();
        //Thread t=new Thread(mt);
       mt.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" My Thread in Run method");
	}

}
