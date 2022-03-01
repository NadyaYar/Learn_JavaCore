package Lesson9;

public class Company {
    private String name;
    private String countryFounded;
    protected String code;
    public int someField;

    public String getName() { //read
        return name;
    }

    public void setName(String name) { // write
        this.name = name;
    }

    public String getCountryFounded() {
        return countryFounded;
    }

    public void setCountryFounded(String countryFounded) {
        this.countryFounded = countryFounded;
    }
}
