package lesson21;

public class Demo {
    public static void main(String[] args) throws Exception {
        Company company = new Company(100, "Iphone");

        Company.setLicence("g4536"); // call by class

        System.out.println(company.getLicence());

        Company company1 = new Company(0, "Test");

        System.out.println(company1.getLicence());

        Company.setLicence("t6574");

        System.out.println(company.getLicence());
        System.out.println(company1.getLicence());

        Company.check();

        // demo utils

        int min = ArrayUtils.minElement(new int[]{1, 3, 5});
    }
}
