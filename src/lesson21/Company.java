package lesson21;

public class Company {
    private int numberOfEmployees;
    private String name;

    private  static String licence; // one field same to each object

    private static  int maxNumberOfEmployees = 100;

   static  {
       System.out.println("Code block is called"); // use once
        init();
    }

    public Company(int numberOfEmployees, String name) throws Exception {
        if(numberOfEmployees > maxNumberOfEmployees){
            throw  new Exception("Company can have max " + maxNumberOfEmployees + " employees");
        }
        this.numberOfEmployees = numberOfEmployees;
        this.name = name;
    }

    private static void init(){
         maxNumberOfEmployees = 100;
    }

    public static void check() throws Exception {
        if(!licence.equals("ttt1")){
            throw new Exception("Wrong licence " + licence);
        }
    }

    public  static void setLicence(String licence) {
        Company.licence = licence;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public String getName() {
        return name;
    }

    public String getLicence() {
        return licence;
    }

    private static class Test{

    }
}
