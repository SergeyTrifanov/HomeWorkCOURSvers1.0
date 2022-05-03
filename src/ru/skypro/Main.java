package ru.skypro;

public class Main {

    public static void main(String[] args) {
        System.out.println("============");
        Employee[] employee = new Employee[2];
        employee[0] = new Employee("Ivan", "Ivanovich", "Ivanov", 1,
                100_000);
        employee[1] =  new Employee("Petr", "Petrovich", "Petrov", 2,
                200_000);
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getSalary();
            System.out.println("employee = " + employee[i]);
        }
        System.out.println(sum);
        System.out.println("============");

        Employee employeeWithMaxSalary = employee[0];
        Employee employeeWithMinSalary = employee[0];
        for (int j = 0; j < employee.length; j++){
            if (employee[j].getSalary() > employeeWithMaxSalary.getSalary())
                employeeWithMaxSalary = employee[j];
            if (employee[j].getSalary() < employeeWithMinSalary.getSalary())
                employeeWithMinSalary = employee[j];
        }
        System.out.println("сотрудник с макс ЗП " + employeeWithMaxSalary);
        System.out.println("сотрудник с мин ЗП " + employeeWithMinSalary);

        System.out.println("============");

        double average = 0;
        if (employee.length>0)
        {
            double sum1 = 0;
        for (int o = 0; o <employee.length; o++){
            sum1 += employee[o].getSalary();
        }
        average = sum1 / employee.length;
            System.out.println("средняя зп составляет " + average);
            System.out.println("============");
        }
        for (int h = 0; h < employee.length; h++) {
            System.out.println(employee[h].getFirstName()+ " " +employee[h].getMiddleName()+ " " +employee[h].getLastName());
        }
        System.out.println("============");
    }
    }

