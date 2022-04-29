import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class squadTest {
    @Test
    public void squad_instantiatesCorrectly_true() {
        Squad testSquad = new Squad(3, "gitter", "water", 1);
        assertEquals(true, testSquad instanceof Squad);
    }
}
