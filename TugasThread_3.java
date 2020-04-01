package com.d3ti.PBOlanjut.prakthread;

public class TugasThread_3 extends Thread{
	public TugasThread_3(String nama) {
		super (nama);
	}
	
	public static synchronized void tampil(String nama) {
		for(int j=0;j<4;j++) {
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				//TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread " + nama + " posisi " +j);
			}
		}
	
	public void run() {
		tampil(getName());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TugasThread_3 l1=new TugasThread_3("l1");
		TugasThread_3 l3=new TugasThread_3("l3");
		l1.setPriority(MAX_PRIORITY);
		l1.start();
		l3.start();
		ExtendsThread l2=new ExtendsThread("l2");
		ExtendsThread l4=new ExtendsThread("l4");
		l2.start();
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {
			//TODO Auto-generate catch block
			e.printStackTrace();
		}
		l4.start();
	}
	}