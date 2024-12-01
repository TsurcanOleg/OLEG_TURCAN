package homework_nr_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee e1 = new Employee("Victor", "Strogov", 35, false);
        Employee e2 = new Employee("Serghei", "Bodrov", 23, true);
        Employee e3 = new Employee("Nikita", "Petrescu", 18, true);
        Employee e4 = new Employee("Andrei", "Popescu", 22, false);


        List<Employee> employeeList = new ArrayList<>(Arrays.asList(e1, e2, e3, e4));

        Predicate<Employee> worksSoftwareDepartment = new WorksSoftwareDepartment();

        Predicate<Employee> olderTwenty = e -> {
            if (e.age > 20){
                return true;
            }
            return false;
        };

        testEmployee(new WorksSoftwareDepartment(), employeeList);
        System.out.println("------------------");
        testEmployee(olderTwenty, employeeList);
        System.out.println("------------------");
        testEmployee(e -> e.name.startsWith("A"), employeeList);
    }

    public static void testEmployee (Predicate<Employee> filter, List<Employee> employeeList){
        for (int i = 0; i != employeeList.size(); i++){
            if (filter.test(employeeList.get(i)) == true){
                System.out.println(employeeList.get(i).name + " " + employeeList.get(i).surname);
            }
        }

    }
}

