package com.facade.feed;

import javax.annotation.Resource;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/beans.xml")
public class TestAop {
	
	@Resource(name = AnInterface.BEAN_NAME)
	AnInterface anInterface;
	
	@Test
	public void testClass() {
		Assert.assertNotSame(AnInterfaceImpl.class, anInterface.getClass());
	}

}
