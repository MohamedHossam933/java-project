package employee;

import java.util.ArrayList;

public interface maindata {
     public void getMaxSalary();
     public void getMinSalary();
     public ArrayList getgreater(double salary);
     public ArrayList getless(double salary);
     public ArrayList GetOlderThanAge(int age);
     public Object[] Delete(String name);
     public ArrayList SortBySalary();
}
