package java8Features.predicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeePredicate {
	public static Predicate<Employee> isAdultMale() {
		return e -> e.getGender().equals("M");
	}

	public static Predicate<Employee> isAdultFemale() {
		return e -> e.getAge() > 21 && e.getGender().equals("F");
	}

	public static Predicate<Employee> isAgeMoreThan(Integer age) {
		return e -> e.getAge() > age;
	}

	public static List<Employee> filterEmployees(List<Employee> employees, Predicate<Employee> predicate) {
		return employees.stream().filter(predicate).collect(Collectors.<Employee>toList());
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(12, 25, "M", "Laddu", "Meenu");
		Employee e2 = new Employee(13, 28, "F", "Laddu2", "Meenu2");
		Employee e3 = new Employee(14, 35, "M", "2Laddu", "2Meenu");
		Employee e4 = new Employee(15, 45, "F", "Laddu3", "Meenu3");

		List<Employee> employees = new ArrayList<>();
		employees.addAll(Arrays.asList(new Employee[] { e1, e2, e3, e4 }));
		System.out.println(filterEmployees(employees, isAdultMale()));

		System.out.println(filterEmployees(employees, isAdultFemale()));

		System.out.println(filterEmployees(employees, isAgeMoreThan(35)));

		// Employees other than above collection of "isAgeMoreThan(35)"
		// can be get using negate()
		System.out.println(filterEmployees(employees, isAgeMoreThan(35).negate()));
	}

}
