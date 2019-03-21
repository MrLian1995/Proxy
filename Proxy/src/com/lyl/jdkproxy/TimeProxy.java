package com.lyl.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 时间代理
 * @author Administrator
 *
 */
public class TimeProxy implements InvocationHandler{
	private Object target;

	/**
	 * proxy:被代理对象
	 * method:被代理对象的方法
	 * args:方法参数
	 * 
	 * Object:方法返回值
	 */
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		long starttime=System.currentTimeMillis();
		System.out.println("汽车开始行驶.....");
		method.invoke(target);
		long endtime=System.currentTimeMillis();
		System.out.println("汽车结束行驶.....行驶了"+(endtime-starttime)+"毫秒！");
		return null;
	}
	
	public TimeProxy(Object target) {
		super();
		this.target = target;
	}
}
