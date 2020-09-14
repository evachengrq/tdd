import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MommifierTest {

    @Test
    void should_throw_when_input_is_null() {
        Assertions.assertThrows(Exception.class, () -> {
            Mommifier mommifier = new Mommifier();
            mommifier.convert(null);
        });
    }

    @Test
    void should_throw_when_input_is_empty() {
        Assertions.assertThrows(Exception.class, () -> {
            Mommifier.convert("");
        });
    }

}
