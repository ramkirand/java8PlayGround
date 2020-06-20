package java8designPatterns;

import java.math.BigDecimal;

public interface IdiscounterStrategy {
	BigDecimal applyDiscount(BigDecimal amount);

	static IdiscounterStrategy christmasDiscounter() {
		return amount -> amount.multiply(BigDecimal.valueOf(0.6));
	}

	static IdiscounterStrategy newYearDiscounter() {
		return amount -> amount.multiply(BigDecimal.valueOf(0.8));
	}

	static IdiscounterStrategy easterDiscounter() {
		return amount -> amount.multiply(BigDecimal.valueOf(0.5));
	}
}
