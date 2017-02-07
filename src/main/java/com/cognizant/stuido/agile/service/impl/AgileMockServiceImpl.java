
package com.cognizant.stuido.agile.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.stuido.agile.dao.AgileMockDao;
import com.cognizant.stuido.agile.service.AgileMockService;

/**
 * @author 472731
 *
 */
@Service
public class AgileMockServiceImpl implements AgileMockService {

	@Autowired
	private AgileMockDao agileMockDao;

	public Integer multiply(Integer firstValue, Integer secondValue) {

		return agileMockDao.multiply(firstValue, secondValue);
	}

}
