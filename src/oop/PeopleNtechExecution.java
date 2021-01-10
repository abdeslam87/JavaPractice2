package oop;

public class PeopleNtechExecution {

    public static void main(String[] args) {

        PeopleNtech peopleNtech = new PeopleNtech();
        peopleNtech.setinformationsofstudents("abdeslam", "philadelphia", "male");

        System.out.println(peopleNtech.getName());
        System.out.println(peopleNtech.getLocation());
        System.out.println(peopleNtech.getGender());

    }
}
