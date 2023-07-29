public abstract class Employee implements Payable {
    String firstName, lastName, socialSecurityNumber;
    Employee(String firstName, String lastName, String socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    @Override
    public String toString() {
        return firstName + " " + lastName + " "  + socialSecurityNumber;
    }
}
