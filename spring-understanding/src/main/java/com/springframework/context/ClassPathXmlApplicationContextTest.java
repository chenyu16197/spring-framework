package com.springframework.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author mango
 * @date 2018-10-11 15:26
 */
public class ClassPathXmlApplicationContextTest {


	public void test() {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:");

	}


}
