import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    @Test
    public void shouldReturnWhatIsGiven() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.sayWhat(1);
        assertThat(result, is("1"));
    }

    @Test
    public void shouldReturnFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.sayWhat(3);
        assertThat(result, is("Fizz"));
    }
}
