package homework_nr_11;

import java.util.function.Predicate;

public class WorksSoftwareDepartment implements Predicate<Employee> {
    @Override
    public boolean test(Employee employee) {
        if (employee.softwareDepartment == true){
            return true;
        }
        return false;
    }
}
