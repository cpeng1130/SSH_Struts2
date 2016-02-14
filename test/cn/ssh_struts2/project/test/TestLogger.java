package cn.ssh_struts2.project.test;

import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLogger {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	private static final Log LOGGER = LogFactory.getLog(TestLogger.class);
	private static final Logger LOGGER2 = Logger.getLogger(TestLogger.class.getName());

	@Test
	public void testLog() {
		LOGGER2.info("asldjfasdfasdf");
		LOGGER.debug("this is from debug level in the test Logger");
		LOGGER.info("this is from info level in the test Logger");
	}
}
