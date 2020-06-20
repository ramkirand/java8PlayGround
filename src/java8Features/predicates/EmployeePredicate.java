package java8Features.predicates;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeePredicate {

	public static Predicate<Employee> isAgeGreaterThan60() {
		return e -> e.getAge() > 60;
	}

	public static Predicate<Employee> isAdultFemale() {
		return e -> e.getGender().equalsIgnoreCase("F");
	}
	
	public static Predicate<Employee> isAdultMale() {
		return e -> e.getGender().equalsIgnoreCase("M");
	}

	public static List<Employee> filterEmployees(List<Employee> employees, Predicate<Employee> empPredicate) {
		return employees.stream().filter(empPredicate).collect(Collectors.toList());
	}
}
