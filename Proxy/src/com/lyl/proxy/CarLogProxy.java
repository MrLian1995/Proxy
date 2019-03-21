package com.lyl.proxy;

public class CarLogProxy implements Moveable{
	//通过聚合的方式实现静态代理
	private Moveable m;
	public void move() {
		System.out.println("日志开始处理");
		//通过聚合
		m.move();
		System.out.println("日志处理结束");
	}
	
	
	public CarLogProxy(Moveable m) {
		this.m = m;
	}
	

}
