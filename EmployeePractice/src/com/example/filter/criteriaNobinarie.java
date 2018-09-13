package com.example.filter;

import java.util.ArrayList;
import java.util.List;

public class criteriaNobinarie implements criteria {



	public List<person> meetCriteria(List<person> persons) {
		List<person> noBinariePersons = new ArrayList<person>();

		for (person person : persons ){
			if(person.getGender().equalsIgnoreCase("no binarie")){
				noBinariePersons.add(person);
			}
		}
		return noBinariePersons;
	}

}
