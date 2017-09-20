package ru.neustupov.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.neustupov.impls.robot.ModelT1000;

public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		ModelT1000 t1000 = (ModelT1000) context.getBean("T1000");
		System.out.println(t1000.getHand());
		t1000 = (ModelT1000)context.getBean("T1000");
		System.out.println(t1000.getHand());
		t1000 = (ModelT1000)context.getBean("T1000");
		System.out.println(t1000.getHand());
	}
}
