package employee;

import static employee.db.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class emp_class implements maindata {

    @Override
    public void getMaxSalary() {
        double[] salaries = fillToArray();

        double max = salaries[0];
        for (int i = 0; i < salaries.length; i++) {
            //if any element is greater than th value in max variable
            //replace the value of max with the value which in array
            if (salaries[i] > max) {
                max = salaries[i];
            } else {
            }
        }
        System.out.println(max);
    }

    @Override
    public void getMinSalary() {
        double[] salaries = fillToArray();

        double min = salaries[0];
        for (int i = 0; i < salaries.length; i++) {
            //if any element is greater than th value in min variable
            //replace the value of min with the value which in array
            if (salaries[i] < min) {
                min = salaries[i];
            } else {
            }
        }
        System.out.println(min);
    }

    @Override
    public ArrayList getgreater(double salary) {
        double[] salaries = fillToArray();

        double great = salary;
        //we create new arraylist to store into it the salaries which greater than salary
        //passed in parameter
        ArrayList<Double> AllSalary = new ArrayList<Double>();
        //we check every element in array if we found any item in array
        //greater than salary which passed in parameter
        //we store it in arraylist (AllSalary)
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] > great) {
                great = salaries[i];
                AllSalary.add(great);
                great = salary;
            } else {
            }
        }

        for (double i : AllSalary) {
            System.out.println(i);
        }
        //finally we return AllSalary arraylist
        return AllSalary;
    }

    @Override
    public ArrayList getless(double salary) {
        double[] salaries = fillToArray();

        double less = salary;
        ArrayList<Double> AllSalary = new ArrayList<Double>();
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] < less) {
                less = salaries[i];
                AllSalary.add(less);
                less = salary;
            } else {
            }
        }
        for (double i : AllSalary) {
            System.out.println(i);
        }
        return AllSalary;
    }

    @Override
    public ArrayList GetOlderThanAge(int age) {
        int[] ages = fillWithAges();

        int old = age;
        ArrayList<Integer> AllAges = new ArrayList<Integer>();
        //we check every element in arraylist
        //when we found any of them is older than age which we passed in paramater
        //we add it to arraylist (AllAges)
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] > old) {
                old = ages[i];
                AllAges.add(old);
                old = age;
            } else {
            }
        }
        for (int i : AllAges) {
            System.out.println(i);
        }
        //we finally return AllAges
        return AllAges;
    }

    @Override
    public Object[] Delete(String name) {
        Object[] names = getName();
        Object[] newNames = remove(names, name);
        for(Object str:newNames) {
            System.out.println(str+"\t");
        }
        return newNames;
    }

    private static Object[] remove(Object[] array, Object element) {
        if (array.length > 0) {
            int index = -1;
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(element)) {
                    index = i;
                    break;
                }
            }
            if (index >= 0) {
                Object[] copy = (Object[]) Array.newInstance(array.getClass()
                        .getComponentType(), array.length - 1);
                if (copy.length > 0) {
                    System.arraycopy(array, 0, copy, 0, index);
                    System.arraycopy(array, index + 1, copy, index, copy.length - index);
                }
                return copy;
            }
        }
        return array;
    }

    @Override
    public ArrayList SortBySalary() {
        ArrayList<emp> salary = new ArrayList<>();
        salary = getSalary();

        Collections.sort(salary, new emp());

        System.out.println(" ");

        for (emp e : salary) // printing the sorted list of salaries
        {
            System.out.print(e.getSalary() + "\t");
        }

        //this is built in method uses to sort arraylist in descinding order
        /*Collections.sort(salary, Collections.reverseOrder());
        for (double i : salary) {
            System.out.print(i + "\t");
            
        }
        System.out.println();*/
        return salary;
    }

}
