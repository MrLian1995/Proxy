package com.lyl.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.lyl.proxy.Car;
import com.lyl.proxy.Moveable;

/**
 * JDK动态代理测试类
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		Car car =new Car();
		InvocationHandler h=new TimeProxy(car);
		Class<?> cls = car.getClass();
		/**loader:   类加载器
		 * interfaces:  实现接口
		 * h:  InvocationHandler
		 */
		Moveable m=(Moveable)Proxy.newProxyInstance(cls.getClassLoader(), 
				cls.getInterfaces(), h);
		
		m.move();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
