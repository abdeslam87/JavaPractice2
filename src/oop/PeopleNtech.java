package oop;

public class PeopleNtech {

    private String name;
    private String location;
    private String gender;


    public void setinformationsofstudents(String name, String location, String gender) {
        this.name = name;
        this.location = location;
        this.gender = gender;

    }

    public String getName() {
        return name;

    }

    public String getLocation() {
        return location;

    }

    public String getGender() {
        return gender;

    }
}
