package com.example.filter;

import java.util.List;

public class andCriteria implements criteria {
	private criteria criteria;
	private criteria othercriteria;
	public andCriteria(criteria criteria, criteria othercriteria){
		this.criteria = criteria;
		this.othercriteria = criteria;
	}

	public List<person> meetCriteria(List<person> persons){
		List<person> firstCriteriaPersons = criteria.meetCriteria(persons);
		return othercriteria.meetCriteria(firstCriteriaPersons);
	}
}
