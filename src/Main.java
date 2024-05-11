public class Main {
    static Employee[] employees = new Employee[5];
    public static void MonthlySalary() {
        int totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на ЗП в месяц: " + totalSalary);
    }
    public static void MinSalary() {
        Employee minSalaryEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employees[i];
            }
        }
        System.out.println("Сотрудник с минимальной ЗП: " + minSalaryEmployee.toString());
    }
    public static void MaxSalary() {
        Employee maxSalaryEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employees[i];
            }
        }
        System.out.println("Сотрудник с максимальной ЗП: " + maxSalaryEmployee.toString());
    }
    public static void AverageSalary() {
        int totalSalary = 0;
        int numberOfEmployees = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
                numberOfEmployees++;
            }
        }
        double averageSalary = (double) totalSalary / numberOfEmployees;
        System.out.println("среднее значение ЗП: "+averageSalary);
    }
    public static void printEmployeeNames() {
        System.out.println("ФИО всех сотрудников:");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFirstName() + " " + employee.getLastName());
            }
        }
    }
    public static void main(String[] args) {
        Employee one = new Employee("Михаил", "Пантюшенко", "тэстеровщик", 50000);
        Employee two = new Employee("Мария", "Чиркова", "техлид", 60000);
        Employee free = new Employee("Павел", "Тонкоглаз", "архитектор", 100000);
        Employee four = new Employee("София", "Монзалевская", "дизайнер", 30000);
        Employee five = new Employee("Игорь", "Обручков", "бэкэндразработчик", 40000);

        int employee1Id;
        employee1Id = two.getId();
        System.out.println(employee1Id);
        employees[0] = one;
        employees[1] = two;
        employees[2] = free;
        employees[3] = four;
        employees[4] = five;
        System.out.println(employees[0]);
        System.out.println(employees[1]);
        System.out.println(employees[2]);
        System.out.println(employees[3]);
        System.out.println(employees[4]);
        MonthlySalary();
        MinSalary();
        MaxSalary();
        AverageSalary();
        printEmployeeNames();

    }
}
