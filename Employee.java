public class Employee {
    private int id;
    private static int nextId = 1;
    private String name;
    private String surname;
    private double salary;
    Employee(String name, String surname, double salary) throws FieldLengthLimitException, IncorrectSalaryException {
        id = nextId++;
        if(name.length()>15){
            throw new FieldLengthLimitException("Too much sumbols in name!");
        }
        else {
            this.name = name;
        }
        if(surname.length()>15){
            throw new FieldLengthLimitException("Too much sumbols in surname!");
        }
        else{
            this.surname = surname;
        }
        if(salary < 0){
            throw new IncorrectSalaryException("Salary cannot be less than 0");
        }
        else {
            this.salary = salary;
        }
    }

    void printEmployee(){
        System.out.println("| ID: " + id + " | name: " + name + " | surname: " + surname + " | salary: " + salary+ " |");
    }
    String getName(){
        return name;
    }

    String getSurname(){
        return surname;
    }

}
