import com.demoqa.entities.Employee;
import org.testng.annotations.Test;

import java.util.List;

public class WebTableTest extends BaseTest{

    @Test(description = "Practice form test")
    public void test123(){
        driver.get("https://demoqa.com/webtables");
        demoQAPages.getWebTablePage().addNewEmployee(randomUtils.creatMocEmployee());

        List<Employee> employees = demoQAPages.getWebTablePage().getEmployeesFromTable();

        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }
}
