import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class EmployeeTest {
   @Test
   public void createEmployeeTest(){
       String name = "Andrii";
       String surname = "Kuts";
       double salary = 1;
       Employee testEmp = null;
       try {
           testEmp = new Employee(name, surname, salary);
       } catch (FieldLengthLimitException | IncorrectSalaryException e) {
           throw new RuntimeException(e);
       }
       Assert.assertEquals(name, testEmp.getName());
       Assert.assertEquals(surname, testEmp.getSurname());
   }

   @Test
    public void exceptionNameTesting(){
       String name = "andddddddddddddddddd";
       String surname = "Kuts";
       double salary = 1;

       FieldLengthLimitException thrown = assertThrows(
               FieldLengthLimitException.class,
               ()-> new Employee(name, surname, salary)
       );
       System.out.print(thrown.getMessage());
       assertTrue(thrown.getMessage().contains("Too much sumbols in name!"));

   }

    @Test
    public void exceptionSurNameTesting(){
        String name = "andrii";
        String surname = " kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk";
        double salary = 1;
        FieldLengthLimitException thrown = assertThrows(
                FieldLengthLimitException.class,
                ()-> new Employee(name, surname, salary)
        );
        System.out.print(thrown.getMessage());
        assertTrue(thrown.getMessage().contains("Too much sumbols in surname!"));
   }

    @Test
    public void exceptionSalaryTesting(){
        String name = "andrii";
        String surname = "Kuts";
        double salary = -1;

        IncorrectSalaryException thrown = assertThrows(
                IncorrectSalaryException.class,
                ()-> new Employee(name, surname, salary)
        );
        System.out.print(thrown.getMessage());
        assertTrue(thrown.getMessage().contains("Salary cannot be less than 0"));
   }
}
