
package com.cognizant.stuido.agile.dao;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cognizant.stuido.agile.config.AgileBaseMockJunitConfig;

/**
 * @author 472731
 *
 */
public class AgileMockDaoJunit extends AgileBaseMockJunitConfig {

	@Autowired
	private AgileMockDao agileMockDao;

	@Test
	public void mockDaoTest() {

		assertThat(agileMockDao, instanceOf(AgileMockDao.class));
		Assert.assertEquals(36, agileMockDao.multiply(9, 4).intValue());
	}
}
