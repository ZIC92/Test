package com.example.filter;

import java.util.List;

public class orCriteria implements criteria {
	private criteria criteria;
	private criteria othercriteria;

	public orCriteria (criteria criteria, criteria othercriteria){
		this.criteria = criteria;
		this.othercriteria = othercriteria;
	}

	public List<person> meetCriteria(List<person> persons) {
		List<person> firstCriteriaItems = criteria.meetCriteria(persons);
	      List<person> otherCriteriaItems = othercriteria.meetCriteria(persons);

	      for (person person : otherCriteriaItems) {
	         if(!firstCriteriaItems.contains(person)){
	            firstCriteriaItems.add(person);
	         }
	      }
		return firstCriteriaItems;
	}

}
