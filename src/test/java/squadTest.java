import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class squadTest {
    @Test
    public void squad_instantiatesCorrectly_true() {
        Squad testSquad = new Squad("gitter", "water");
        assertEquals(true, testSquad instanceof Squad);
    }
    @Test
    public void squad_instantiatesSquadsize_true() {
        Squad testSquad = new Squad("gitter", "water");
        assertEquals(4, testSquad.getSquadSize());
    }
    @Test
    public void squad_instantiatesName_String() {
        Squad testSquad = new Squad("gitter", "water");
        assertEquals("gitter", testSquad.getSquadName());
    }
    @Test
    public void squad_instantiatesCause_String() {
        Squad testSquad = new Squad("gitter", "water");
        assertEquals("water", testSquad.getSquadCause());
    }
    @Test
    public void squad_instantiatesId_int() {
        Squad testSquad = new Squad( "gitter", "water");
        assertEquals(1, Squad.getAll().size());
    }
}
