package java8Features.predicates;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
	private Integer id;
	private Integer age;
	private String gender;
	private String firstName;
	private String lastName;
}
