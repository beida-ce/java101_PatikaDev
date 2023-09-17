public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public int tax(){
        if(this.salary<1000){
            return 0;
        }else {
            return this.salary * 3 /100;
        }
    }

    public int bonus(){
        if(this.workHours>40){
           return (this.workHours - 40)*30;
        }
        return 0;
    }
    public int raiseSalary(){
        int currentYear = 2021;
        if(currentYear - this.hireYear < 10){
            return this.salary * 5 / 100;
        }else if( currentYear - this.hireYear > 9 && currentYear - this.hireYear < 20){
            return this.salary * 10 / 100;
        }else if( currentYear - this.hireYear > 19){
            return this.salary * 15 / 100;
        }
        return 0;
    }

    public String toString() {
        return "Name: " + this.name +
                "\nSalary: " + this.salary +
                "\nWork Hours: " + this.workHours +
                "\nHire Year: " + this.hireYear +
                "\nTax: " + tax() +
                "\nBonus: " + bonus() +
                "\nSalary increase: " + raiseSalary() +
                "\nNet Salary: " + (this.salary + raiseSalary() + bonus() - tax()+
                "\nSalary with the tax and bonuses: " + (this.salary + bonus() - tax()) );
    }

}
