
package com.cognizant.stuido.agile.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

/**
 * @author 472731
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {
	AgileMockConfig.class
})
public class AgileBaseMockJunitConfig {

	@Test
	public void test_always_return_true() {
		Assert.isTrue(true);
	}
}
