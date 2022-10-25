public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private long hireYear;

    public double raise;

    public double tax;

    public double bonus;

    public Employee(String name, double salary, int workHours, long hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.tax = tax;
        this.raise = raise;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public long getHireYear() {
        return hireYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public void tax(){
        if (salary<1000) {
            tax = 0;
        }else{
            tax = salary*3/100;
        }
        System.out.println("Vergi: " + tax);
    }

    public void bonus() {
        if (workHours > 40){
            bonus = (workHours - 40)*30;
        }else {
            bonus = 0;
        }
        System.out.println("Bonus: " + bonus);
    }

    public void raiseSalary() {
        if ((hireYear - 2021) <10) {
            raise = salary*5/100;
        }else if((2021 - hireYear) > 9 && (2021 - hireYear) < 20){
            raise = salary * 10/100;
        }else {
            raise = salary * 15 / 100;
        }
        System.out.println("Maaş Artışı:" + raise);

    }

    public void bonusTaxSalary() {
        double bonusTaxSalary;
        bonusTaxSalary = salary - tax + bonus;
        System.out.println("Vergi ve bonuslar ile birlikte maaş: " + bonusTaxSalary);
    }

    public void totalSalary() {
        double totalSalary;
        totalSalary = salary + bonus - tax + raise;
        System.out.println("Toplam maaş: " + totalSalary);
    }

    public String toString() {
        System.out.println( "Adı: " + this.name);
        System.out.println( "Maaşı: " + this.salary);
        System.out.println( "Çalışma Saati: " + this.workHours);
        System.out.println( "Başlangıç yılı: " + this.hireYear);
        tax();
        bonus();
        raiseSalary();
        bonusTaxSalary();
        totalSalary();
        return null;
    }
}
