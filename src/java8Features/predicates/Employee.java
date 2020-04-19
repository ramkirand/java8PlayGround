package java8Features.predicates;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Employee {
	private Integer id;
	private Integer age;
	private String gender;
	private String firstName;
	private String lastName;
}
