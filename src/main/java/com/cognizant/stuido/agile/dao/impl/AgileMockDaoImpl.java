package com.cognizant.stuido.agile.dao.impl;

import org.springframework.stereotype.Repository;

import com.cognizant.stuido.agile.dao.AgileMockDao;

/**
 * @author 472731
 *
 */
@Repository
public class AgileMockDaoImpl implements AgileMockDao {

	public Integer multiply(Integer firstValue, Integer secondValue) {

		return (firstValue*secondValue);
	}

	
}
