package com.jsonwang.reflection.clazz;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class clazz = Class.forName("com.jsonwang.reflection.clazz.User");
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		//Field[] fields = clazz.getFields(); //for public fields
		Field[] fields = clazz.getDeclaredFields();
		for(Field f: fields){
			System.out.println(f.getName());
		}
		Method[] methods = clazz.getDeclaredMethods();//getMethods() this method can get All methods include notifyAll etc.
		for(Method m: methods){
				System.out.println(m.getName());
		}
		System.out.println("getName   :  " + clazz.getMethod("getName", null));
		System.out.println("setName   :  " + clazz.getMethod("setName", String.class));
		
		Constructor[] constructors =clazz.getConstructors();
		Constructor c = clazz.getDeclaredConstructor(String.class,int.class);
		System.out.println(c);
		for (Constructor constructor : constructors) {
				System.out.println("constructor  :  "+ constructor);
		}
	}

}
