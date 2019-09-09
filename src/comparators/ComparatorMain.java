package comparators;

import java.util.*;

public class ComparatorMain {

    public static void main(String args[])
    {
        List<Employees> employeesList=new ArrayList<>();

        employeesList.add(new Employees("randy",3,"single"));
        employeesList.add(new Employees("vasu",1,"single"));
        employeesList.add(new Employees("anto",2,"married"));
        Collections.sort(employeesList,new compareId());
        for(Employees employees:employeesList)
        {
            System.out.println(employees.toString());
        }
    }



}


class compareName implements Comparator<Employees>
{
    @Override
    public int compare(Employees o1, Employees o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class compareId implements Comparator<Employees>
{
    @Override
    public int compare(Employees o1, Employees o2) {
        int result=o1.getId()-o2.getId();
        return result;
    }
}

class compareStatus implements Comparator<Employees>
{
    @Override
    public int compare(Employees o1, Employees o2) {
        return o1.getStatus().compareTo(o2.getStatus());
    }
}

