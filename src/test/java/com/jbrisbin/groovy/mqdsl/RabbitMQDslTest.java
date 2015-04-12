package com.jbrisbin.groovy.mqdsl;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

/**
 * Created by IntelliJ IDEA.
 * User: jbrisbin
 * Date: Mar 31, 2010
 * Time: 8:34:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class RabbitMQDslTest {

	@Rule
	public final ExpectedSystemExit exit = ExpectedSystemExit.none();

	@Test
	public void testRabbitMQDsl() {
		exit.expectSystemExitWithStatus(0);
		RabbitMQDsl.main(new String[]{"-f", "src/test/groovy/rabbitmqtest.groovy"});

	}

}
