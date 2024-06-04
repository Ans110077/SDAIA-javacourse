package day2;

import java.time.Year;

public class Employee {

    String name;
    int salary;
    int year;

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Employee (String n, int s, int y){
        this.name = n;

        this.salary = s;
        this.year = y;

    }
    public  int calS (){


        return salary*12;
    }
    public int caly(){
        int cy= Year.now().getValue();
        return (cy-year);



    }


}
