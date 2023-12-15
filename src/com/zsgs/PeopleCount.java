package com.zsgs;

import java.util.ArrayList;

class Person {
	String name;
	int birthYear;
	int endYear;

	Person(String name, int birthYear, int endYear) {
		this.name = name;
		this.birthYear = birthYear;
		this.endYear = endYear;
	}
}

public class PeopleCount {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("ajay", 1950, 1999));
		list.add(new Person("arjun", 2000, 2033));
		list.add(new Person("karthik", 1920, 1970));
		list.add(new Person("ram", 1985, 2070));
		int year = 1994;
		for (Person p : list) {
			if (p.birthYear < year && p.endYear > year) {
				System.out.println(p.name);
			}
		}

	}

}
