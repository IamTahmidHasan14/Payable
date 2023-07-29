public class SalariedEmployee extends Employee {
    double weeklySalary;
    SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        setWeeklySalary(weeklySalary);
    }
    public double getWeeklySalary() {
        return weeklySalary;
    }
    public void setWeeklySalary(double weeklySalary) {
        if(weeklySalary < 0.0) throw new IllegalArgumentException();
        else this.weeklySalary = weeklySalary;
    }
    @Override
    public double getPaymentAmount() {
        return weeklySalary;
    }
    @Override
    public String toString() {
        return "salaried employee " + super.toString();
    }
}
