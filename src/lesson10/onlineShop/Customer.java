package lesson10.onlineShop;

public class Customer {
    private String name;
    private String city;
    private String gender;

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
