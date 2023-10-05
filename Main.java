// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try {
            Employee emp1 = new Employee("Andreii", "Kuts", -1);
            emp1.printEmployee();
        }
        catch (FieldLengthLimitException | IncorrectSalaryException ex){
            System.out.println(ex.getMessage());
        }

        try {
            Employee emp1 = new Employee("Rostik", "Tsarko", 2);
            emp1.printEmployee();
        }
        catch (FieldLengthLimitException | IncorrectSalaryException ex){
            System.out.println(ex.getMessage());
        }
    }
}
