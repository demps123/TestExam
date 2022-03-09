package ie.gmit.testexam;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {
    private Employee employee1;

    @Test
    void testValidTitle() {
        employee1 = new Employee("Mr", "Conor", "1234567H", "full-time", 23);
        assertEquals("Mr", employee1.getTitle());
    }
    @Test
    void testInvalidTitle() {
        final String invalid = "Invalid Title";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class,()-> new Employee("edfr", "Conor", "1234567H", "full-time", 23));
        assertEquals(invalid, exceptionThrown.getMessage());
    }
    @Test
    void testValidName() {
        employee1 = new Employee("Mr", "Conor", "1234567H", "full-time", 23);
        assertEquals("Conor", employee1.getName());
    }
    @Test
    void testInvalidName() {
        final String invalid = "Name provided is not valid";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class,()-> new Employee("Mr", "Co", "1234567H", "full-time", 23));
        assertEquals(invalid, exceptionThrown.getMessage());
    }
    @Test
    void testValidPps() {
        employee1 = new Employee("Mr", "Conor", "1234567H", "full-time", 23);
        assertEquals("1234567H", employee1.getPps());
    }
    @Test
    void testInvalidPps() {
        final String invalid = "Invalid PPS Number";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class,()-> new Employee("Mr", "Conor", "12345H", "full-time", 23));
        assertEquals(invalid, exceptionThrown.getMessage());
    }
}
