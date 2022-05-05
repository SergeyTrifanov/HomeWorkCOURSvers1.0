package ru.skypro;

public class Main {
    private static Employee[] employee = new Employee[2];
    public static int salary() {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getSalary();
            System.out.println("employee = " + employee[i]);
        }
        return sum;
    }
public static Employee minSalary(){
    Employee employeeWithMinSalary = employee[0];
    for (int j = 0; j < employee.length; j++){
        if (employee[j].getSalary() < employeeWithMinSalary.getSalary())
            employeeWithMinSalary = employee[j];
    }
    return employeeWithMinSalary;

}
public static Employee maxSalary(){
    Employee employeeWithMaxSalary = employee[0];
    for (int j = 0; j < employee.length; j++){
        if (employee[j].getSalary() > employeeWithMaxSalary.getSalary())
            employeeWithMaxSalary = employee[j];
    }
    return employeeWithMaxSalary;
}
public static double averageSalary(){
    double average = 0;
    if (employee.length>0) {
        double sum1 = 0;
        for (int o = 0; o <employee.length; o++){
            sum1 += employee[o].getSalary();
        }
        average = sum1 / employee.length;
    }
    return average;
}
public static void list(){
    for (int h = 0; h < employee.length; h++) {
        System.out.println(employee[h].getFirstName()+ " " +employee[h].getMiddleName()+ " " +employee[h].getLastName());
    }
}
    public static void main(String[] args) {
        employee[0] = new Employee("Ivan", "Ivanovich", "Ivanov", 1,
                100_000);
        employee[1] =  new Employee("Petr", "Petrovich", "Petrov", 2,
                200_000);

        System.out.println("сумма зарплат " + salary());
        System.out.println("сотрудник с мин зп " + minSalary());
        System.out.println("сотрудник с макс зп " + maxSalary());
        System.out.println("средняя зп на предприятии " + averageSalary());
        list();
    }
    }




