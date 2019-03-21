package com.lyl.proxy;
/**
 * 通过继承实现静态代理
 * @author Administrator
 *
 */
public class Car2 extends Car{

	public void move() {
		long starttime=System.currentTimeMillis();
		System.out.println("汽车开始行驶.....");
		super.move();
		long endtime=System.currentTimeMillis();
		System.out.println("汽车结束行驶.....行驶了"+(endtime-starttime)+"毫秒！");
	}
}
