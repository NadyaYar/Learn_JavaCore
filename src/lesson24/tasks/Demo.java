package lesson24.tasks;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        AbstractDao<Sys> systemAbstractDao = new AbstractDao<>();
        Sys system1 = new Sys(11,"London");
        systemAbstractDao.save(system1);

        AbstractDao<Tool> toolAbstractDao = new AbstractDao<>();
        Tool tool = new Tool("something","London");
        toolAbstractDao.save(tool);

        System.out.println(Arrays.toString(systemAbstractDao.getAll()));

        System.out.println(Arrays.toString(toolAbstractDao.getAll()));
    }
}
