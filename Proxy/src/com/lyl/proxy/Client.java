package com.lyl.proxy;
/**
 * 测试类
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
//		Car car=new Car();
//		car.move();
		//通过集成的方式
//		Moveable car2=new Car2();
//		car2.move();
		//通过聚合的方式
//		Car car=new Car();
//		CarTimeProxy car3=new CarTimeProxy(car);
//		car3.move();
		
		Car car=new Car();
		CarTimeProxy ctp=new CarTimeProxy(car);
		CarLogProxy clp=new CarLogProxy(ctp);
		clp.move();
	}
}
