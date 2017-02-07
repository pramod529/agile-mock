package com.cognizant.stuido.agile.service;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


import com.cognizant.stuido.agile.config.AgileBaseMockJunitConfig;
import com.cognizant.stuido.agile.service.AgileMockService;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;


/**
 * @author 472731
 *
 */
public class AgileMockServiceJunit extends AgileBaseMockJunitConfig{

	@Autowired
	private AgileMockService agileMockService;
	
	@Test
	public void mockServiceTest()
	{
		assertThat(agileMockService, instanceOf(AgileMockService.class));
		Assert.assertEquals(36, agileMockService.multiply(9, 4).intValue());
	}
}
