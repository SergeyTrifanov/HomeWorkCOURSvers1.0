package ru.skypro;

public class Employee {
    private String firstName;
    private String middleName;
    private String lastName;
    private int department;
    private int salary;
    private int id;
    private static int counter = 1; /// чтобы номера сотрудников начинались с 1, а не с нуля

    public Employee(String firstName, String middleName, String lastName, int department, int salary){
        this.firstName=firstName;
        this.middleName=middleName;
        this.lastName=lastName;
        this.department=department;
        this.salary=salary;
        this.id=counter++;
    }
    public String getFirstName(){return this.firstName;}
    public String getMiddleName(){return this.middleName;}
    public String getLastName(){return  this.lastName;}
    public int getDepartment(){return this.department;}
    public int getSalary(){return this.salary;}
    public int getCounter(){return this.id;}

    public void setDepartment(int department){this.department=department;}
    public void setSalary(int salary){this.salary=salary;}

    public String toString(){return this.firstName+ ", " +this.middleName+ ", " +this.lastName+ ", " +this.department+ ", " +this.salary+ ", " +this.id;}


}
