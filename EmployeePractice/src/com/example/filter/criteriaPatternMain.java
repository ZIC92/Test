package com.example.filter;

import java.util.ArrayList;
import java.util.List;

public class criteriaPatternMain {
	public static void main(String[] args) {
		List<person> persons = new ArrayList<person>();
		for (int i = 0; i < 10; i++) {
			int maritalSituationRNG = 1 + (int) (java.lang.Math.random() * 3);
			int genderRNG = 1 + (int) (java.lang.Math.random() * 3);
			int nameRNG = 1 + (int) (java.lang.Math.random() * 20);

			String maritalSituation = "single";
			String gender = "no binarie";
			String name = "David";
			if (maritalSituationRNG == 1) {
				maritalSituation = "single";
			} else if (maritalSituationRNG == 2) {
				maritalSituation = "taken";
			} else if (maritalSituationRNG == 3) {
				maritalSituation = "polyamory";
			}

			if (genderRNG == 1) {
				gender = "female";
			} else if (genderRNG == 2) {
				gender = "male";
			} else if (genderRNG == 3) {
				gender = "no binarie";
			}
			if (nameRNG == 1) {
				name = "Elliot";
			} else if (nameRNG == 2) {
				name = "Finn";
			} else if (nameRNG == 3) {
				name = "James";
			} else if (nameRNG == 4) {
				name = "Kim";
			} else if (nameRNG == 5) {
				name = "Dell";
			} else if (nameRNG == 6) {
				name = "Kyle";
			} else if (nameRNG == 7) {
				name = "Gale";
			} else if (nameRNG == 8) {
				name = "Raven";
			} else if (nameRNG == 9) {
				name = "Tristan";
			} else if (nameRNG == 10) {
				name = "Valentine";
			}  else if (nameRNG == 11) {
				name = "Brook";
			} else if (nameRNG == 12) {
				name = "Grayson";
			} else if (nameRNG == 13) {
				name = "Kim";
			} else if (nameRNG == 14) {
				name = "Chase";
			} else if (nameRNG == 15) {
				name = "Corin";
			} else if (nameRNG == 16) {
				name = "Darnell";
			} else if (nameRNG == 17) {
				name = "Jean";
			} else if (nameRNG == 18) {
				name = "Ivy";
			} else if (nameRNG == 19) {
				name = "Beverly";
			} else if (nameRNG == 20) {
				name = "Billie";
			} else if (nameRNG == 21) {
				name = "Cecil";
			} else if (nameRNG == 22) {
				name = "Collin";
			} else if (nameRNG == 23) {
				name = "Jayme";
			} else if (nameRNG == 24) {
				name = "Jayden";
			} else if (nameRNG == 25) {
				name = "Jade";
			} else if (nameRNG == 26) {
				name = "Evan";
			} else if (nameRNG == 27) {
				name = "Drew";
			} else if (nameRNG == 28) {
				name = "Devin";
			} else if (nameRNG == 29) {
				name = "Channing";
			} else {
				name = "Greer";
			}
			persons.add(new person(name, gender, maritalSituation));
		}


		criteria male = new criteriaMale();
		criteria female = new criteriaFemale();
		criteria nobinarie = new criteriaNobinarie();

		criteria single = new criteriaSingle();
		criteria taken = new criteriaTaken();
		criteria polyamory = new criteriaPolyamory();

		criteria singleMale = new andCriteria(single, male);
		criteria singleFemale = new andCriteria(single, female);
		criteria singleNobinarie = new andCriteria(single, nobinarie);

		criteria takenMale = new andCriteria(taken, male);
		criteria takenFemale = new andCriteria(taken, female);
		criteria takenNobinarie = new andCriteria(taken, nobinarie);

		criteria polyamoryMale = new andCriteria(polyamory, male);
		criteria polyamoryFemale = new andCriteria(polyamory, female);
		criteria polyamoryNobinarie = new andCriteria(polyamory, nobinarie);

		criteria takenOrFemale = new orCriteria(taken, female);
		criteria singleOrPolyamory = new orCriteria(single, polyamory);
		criteria singleOrMale = new orCriteria(single, male);

		System.out.println("Males: ");
		printPersons(male.meetCriteria(persons));

		System.out.println("\nFemales: ");
		printPersons(female.meetCriteria(persons));

		System.out.println("\nNo binaries: ");
		printPersons(nobinarie.meetCriteria(persons));

		System.out.println("\nSingle Males: ");
		printPersons(singleMale.meetCriteria(persons));

		System.out.println("\nSingle Females: ");
		printPersons(singleFemale.meetCriteria(persons));

		System.out.println("\nSingle No binaries: ");
		printPersons(singleNobinarie.meetCriteria(persons));

		System.out.println("\nSingle Or Male: ");
		printPersons(singleOrMale.meetCriteria(persons));

		System.out.println("\nTaken Males: ");
		printPersons(takenMale.meetCriteria(persons));

		System.out.println("\nTaken Females: ");
		printPersons(takenFemale.meetCriteria(persons));

		System.out.println("\nTaken No binaries: ");
		printPersons(takenNobinarie.meetCriteria(persons));

		System.out.println("\nTaken or Females: ");
		printPersons(takenOrFemale.meetCriteria(persons));

		System.out.println("\nPolyamory Males: ");
		printPersons(polyamoryMale.meetCriteria(persons));

		System.out.println("\nPolyamory Females: ");
		printPersons(polyamoryFemale.meetCriteria(persons));

		System.out.println("\nPolyamory No binaries: ");
		printPersons(polyamoryNobinarie.meetCriteria(persons));

		System.out.println("\nSingle Or Polyamory: ");
		printPersons(singleOrPolyamory.meetCriteria(persons));
	}

	public static void printPersons(List<person> persons) {

		for (person person : persons) {
			System.out.println("Person : [ Name : " + person.getName()
					+ ", Gender : " + person.getGender()
					+ ", Marital Status : " + person.getMaritalStatus() + " ]");
		}
	}
}
