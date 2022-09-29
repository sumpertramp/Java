public class Main {
    public static void main(String[] args) {
        Employee E1 = new Employee("Sümeyye Derelli",3000,45,2020);
        E1.toPrint();
        E1.raiseSalary();
        E1.bonus();
        E1.tax();
        E1.totalSalary();
    }
}