import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MommifierTest {

    Mommifier mommifier = new Mommifier();

    @Test
    void should_throw_when_input_is_null() {
        Assertions.assertThrows(Exception.class, () -> {
            mommifier.convert(null);
        });
    }

    @Test
    void should_throw_when_input_is_empty() {
        Assertions.assertThrows(Exception.class, () -> {
            Mommifier.convert("");
        });
    }

    @Test
    void should_return_itselt_if_input_has_less_than_30_percent_of_vowels() {
        //Given
        String input = "hyphen";
        //When
        String result = Mommifier.convert(input);
        //Then
        Assertions.assertEquals(result, "hyphen");
    }

    @Test
    void should_return_itself_if_input_has_30_percent_of_vowels() {
        //Given
        String input = "abcdefghij";
        //When
        String result = Mommifier.convert(input);
        //Then
        Assertions.assertEquals(result, "abcdefghij");
    }

    @Test
    void should_return_itself_when_input_has_no_continuous_vowels() {
        //Given
        String input = "Eva";
        //When
        String result = Mommifier.convert(input);
        //Then
        Assertions.assertEquals(result, "Eva");
    }

    @Test
    void should_mommify_when_30_percent_of_vowels_and_continuous_vowels_are_present() {
        //Given
        String input = "keep";
        //When
        String result = Mommifier.convert(input);
        //Then
        Assertions.assertEquals(result, "kemommyep");
    }
}
