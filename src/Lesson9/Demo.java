package Lesson9;

import Lesson9.utils.Cheker;

public class Demo {
    public static void main(String[] args) {
        Company company = new Company();
        //   System.out.println(company.countryFounded);
        //   System.out.println(company.name);
        //  company.name = "IBM";
        Cheker cheker = new Cheker();
        //  cheker.checkCompanyname(company.name);
        //   System.out.println(cheker.companyNamesValidayCount);
        System.out.println(cheker.checkCompanyname("Google"));
        company.getName();

    }
}
