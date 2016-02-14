package cn.ssh_struts2.project.test;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	@Test
	public void testBean() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		TestAction test = (TestAction) ctx.getBean("testAction");
		System.out.println(test);

		((ConfigurableApplicationContext) ctx).close();

	}

	@Test
	public void sessionFactory() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		SessionFactory sf = (SessionFactory) ctx.getBean("sessionFactory");
		System.out.println(sf);
		((ConfigurableApplicationContext) ctx).close();
	}
	
	@Test
	public void transactionFactory() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		TestService testService=(TestService) ctx.getBean("testService");
		testService.saveTwoUsers();
		((ConfigurableApplicationContext) ctx).close();
	}
}
