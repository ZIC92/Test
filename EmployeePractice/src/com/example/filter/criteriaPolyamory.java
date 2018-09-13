package com.example.filter;

import java.util.ArrayList;
import java.util.List;

public class criteriaPolyamory implements criteria {



	public List<person> meetCriteria(List<person> persons) {
		List<person> polyamoryPersons = new ArrayList<person>();

		for (person person : persons ){
			if(person.getMaritalStatus().equalsIgnoreCase("polyamory")){
				polyamoryPersons.add(person);
			}
		}
		return polyamoryPersons;
	}

}
