package com.example.filter;

import java.util.ArrayList;
import java.util.List;

public class criteriaFemale implements criteria {



	public List<person> meetCriteria(List<person> persons) {
		List<person> femalePersons = new ArrayList<person>();

		for (person person : persons ){
			if(person.getGender().equalsIgnoreCase("female")){
				femalePersons.add(person);
			}
		}
		return femalePersons;
	}

}
