package com.lyl.cglibProxy;

public class Client {

	public static void main(String[] args) {
		CGlibProxy cglib=new CGlibProxy();
		Train t=(Train)cglib.getProxy(Train.class);
		t.move();
	}
}
