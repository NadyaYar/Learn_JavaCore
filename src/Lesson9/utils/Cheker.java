package Lesson9.utils;

public class Cheker {
    // public - скрізь
    //protected - внутрі класа + внутрі пакета + в наследніках класа
    // default (package-private) - внутрі пакета
    //private - тільки внутрі класа

    private int companyNamesValidayCount = 0;

    public boolean checkCompanyname(String companyName) {
        if (companyNamesValidayCount > 10)
            return false;
        companyNamesValidayCount++;
        return companyName != "Google" && companyName != "Amazon";
    }
}
