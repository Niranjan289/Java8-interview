import com.niru.dto.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        getEmployeeList().stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(key -> System.out.println(key.getKey() + " " + key.getValue()));
    }

    public static List<Employee> getEmployeeList(){
        return Arrays.asList(new Employee(1, "Mani", 20, "M", "MCA", 2024, 1000),
                new Employee(2, "Moxi", 20, "M", "CA", 2024, 2000),
                new Employee(3, "Lilly", 21, "F", "MA", 2024, 3000),
                new Employee(4, "Janu", 22, "F", "ACA", 2023, 4000),
                new Employee(5, "Kanni", 23, "M", "AC", 2022, 8000));
    }
}
