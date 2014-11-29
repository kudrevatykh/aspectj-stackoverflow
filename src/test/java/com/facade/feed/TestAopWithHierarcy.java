package com.facade.feed;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAopWithHierarcy {

	@Test
	public void testClass() {
		try (ClassPathXmlApplicationContext parentContext = new ClassPathXmlApplicationContext("classpath:/beans-parent.xml");
				ClassPathXmlApplicationContext childContext = new ClassPathXmlApplicationContext(new String[] { "classpath:/beans-child.xml" }, parentContext)) {
			Assert.assertSame(AnInterfaceImpl.class, childContext.getBean(AnInterface.BEAN_NAME).getClass());
		}
	}

}
