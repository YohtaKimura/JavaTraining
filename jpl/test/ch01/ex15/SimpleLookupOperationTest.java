import static org.junit.jupiter.api.Assertions.assertEquals;
public class SimpleLookupOperationTest {
    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        Lookup tester = new SimpleLookupOperation();

        // assert statements
        assertEquals(0, tester.multiply(10, 0), "10 x 0 must be 0");
        assertEquals(0, tester.multiply(0, 10), "0 x 10 must be 0");
        assertEquals(0, tester.multiply(0, 0), "0 x 0 must be 0");
    }
}