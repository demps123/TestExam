package ie.gmit.testexam;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
    private Employee employee1;

    @Test
    void testValidTitle() {
        employee1 = new Employee("Mr", "Conor", "12345H", "full-time", 23);
        assertEquals("Mr", employee1.getTitle());
    }
}
