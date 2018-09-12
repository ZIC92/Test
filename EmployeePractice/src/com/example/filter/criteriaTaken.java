package com.example.filter;

import java.util.ArrayList;
import java.util.List;

public class criteriaTaken implements criteria {



	public List<person> meetCriteria(List<person> persons) {
		List<person> takenPersons = new ArrayList<person>();

		for (person person : persons ){
			if(person.getMaritalStatus().equalsIgnoreCase("taken")){
				takenPersons.add(person);
			}
		}
		return takenPersons;
	}

}
