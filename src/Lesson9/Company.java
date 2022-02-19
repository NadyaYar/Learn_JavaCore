package Lesson9;

public class Company {
    private String name;
    private String countryFounded;
    protected String code;
    public int someField;

    public String getName() { //write
        return name;
    }

    public void setName(String name) { // read
        this.name = name;
    }

    public String getCountryFounded() {
        return countryFounded;
    }

    public void setCountryFounded(String countryFounded) {
        this.countryFounded = countryFounded;
    }
}
