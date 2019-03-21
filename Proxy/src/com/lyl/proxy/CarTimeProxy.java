package com.lyl.proxy;

public class CarTimeProxy implements Moveable{
	//通过聚合的方式实现静态代理
	private Moveable m;
	public void move() {
		long starttime=System.currentTimeMillis();
		System.out.println("汽车开始行驶.....");
		//通过聚合
		m.move();
		long endtime=System.currentTimeMillis();
		System.out.println("汽车结束行驶.....行驶了"+(endtime-starttime)+"毫秒！");
	}
	
	
	public CarTimeProxy(Moveable m) {
		this.m = m;
	}
	

}
