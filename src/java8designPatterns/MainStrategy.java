package java8designPatterns;

import java.math.BigDecimal;

public class MainStrategy {

	public static void main(String[] args) {
		
		System.out.println(IdiscounterStrategy.christmasDiscounter().applyDiscount(new BigDecimal(3999)).toBigInteger());
		System.out.println(IdiscounterStrategy.easterDiscounter().applyDiscount(new BigDecimal(3999)).toBigInteger());
		System.out.println(IdiscounterStrategy.newYearDiscounter().applyDiscount(new BigDecimal(3999)).toBigInteger());
		

	}

}
