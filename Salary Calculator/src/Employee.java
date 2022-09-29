public class Employee{

    String name;
    int salary;
    int workHours;
    int hireYear;
    double tax;
    double bonus;
    double raiseSalary;
    double workTime;
    double totalSalary;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.bonus = bonus;
        this.raiseSalary = raiseSalary;
        this.workTime = workTime;
        this.totalSalary = totalSalary;
    }

    void tax() {
        if (this.salary <= 1000 && this.salary > 0) {
            this.tax = 0;
        } else if (this.salary > 1000) {
            this.tax = this.salary * 0.03;
        }
        System.out.println("Tax: " + this.tax);
    }

    void bonus(){
        if(this.workHours >40){
            this.bonus = (this.workHours - 40)*30;
            System.out.println("Bonus: " + this.bonus);
        }else{
            System.out.println("You did not earn bonuses this month.");
        }
    }

    void setRaiseSalary(){
        if((2022-this.hireYear)>9 && (2022-this.hireYear)<20){
            this.raiseSalary = this.salary*0.10;
        }else if((2022-this.hireYear)>19){
            this.raiseSalary = this.salary*0.15;
        }else{
            this.raiseSalary = this.salary*0.05;
        }
        System.out.println("Salary increase:" + this.raiseSalary);
    }

    void setTotalSalary(){
        this.totalSalary = ((this.salary + this.bonus + this.raiseSalary) - this.tax);
        System.out.println("Total salary: " + this.totalSalary );
    }

    void toPrint(){
        System.out.println("Employee's name: " + this.name + "\n"
        + "Employee's salary: " + this.salary + "\n"
        + "Working hour: " + this.workHours + "\n"
        + "Start year: " + this.hireYear);
    }

    public void totalSalary(){
        this.totalSalary = ((this.salary + this.bonus + this.raiseSalary) - this.tax);
        System.out.println("Total salary: " + this.totalSalary);
    }

    void raiseSalary(){
        if((2022-this.hireYear)>9 && (2022-this.hireYear)<20){
            this.raiseSalary = this.salary*0.10;
        }else if((2021-this.hireYear)>19){
            this.raiseSalary = this.salary*0.15;
        }else{
            this.raiseSalary = this.salary*0.05;
        }
        System.out.println("Salary increase: "+this.raiseSalary);
    }
}


