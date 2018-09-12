package com.example.filter;

import java.util.ArrayList;
import java.util.List;

public class criteriaSingle implements criteria {



	public List<person> meetCriteria(List<person> persons) {
		List<person> singlePersons = new ArrayList<person>();

		for (person person : persons ){
			if(person.getMaritalStatus().equalsIgnoreCase("single")){
				singlePersons.add(person);
			}
		}
		return singlePersons;
	}

}
