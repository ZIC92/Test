package com.example.filter;

import java.util.ArrayList;
import java.util.List;

public class criteriaMale implements criteria {



	public List<person> meetCriteria(List<person> persons) {
		List<person> malePersons = new ArrayList<person>();

		for (person person : persons ){
			if(person.getGender().equalsIgnoreCase("Male")){
				malePersons.add(person);
			}
		}
		return malePersons;
	}

}
