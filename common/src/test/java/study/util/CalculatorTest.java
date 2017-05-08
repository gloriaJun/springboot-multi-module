package study.util;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class CalculatorTest {
  @Test
  public void shouldCalculateFibonacci() {
    Calculator calculator = new Calculator();
    int expected = 13;
    int actual = calculator.nextFibonacci(5, 8);

    assertThat(actual).isEqualTo(expected);
  }
}
