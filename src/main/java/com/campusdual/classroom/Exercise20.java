package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

    public static List<Person> getPeopleList() {
        List<Person> peopleList = new ArrayList<>();

        peopleList.add(new Person("Juan", "Perez"));
        peopleList.add(new Teacher("Luis", "Martinez", "Matematicas"));
        peopleList.add(new PoliceOfficer("Carlos", "Lopez", "Criminalistica"));
        peopleList.add(new Doctor("Ana", "Gomez", "Cardiologia"));

        return peopleList;

    }

    public static void showPeopleDetails(List<Person> stringList) {
        for (Person person : stringList) {
            person.getDetails();
        }
    }

    public static void main(String[] args) {
        List<Person> stringList = getPeopleList();
        showPeopleDetails(stringList);
    }



}
