package employee;

import java.util.Comparator;

public class emp implements Comparator<emp>{
    private int ID;
    private String fname;
    private String lname;
    private int age;
    private double salary;
    private String address;
    
    emp(){}
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int compare(emp e1, emp e2) {
        return (int) (e1.salary - e2.salary);
    }
}
