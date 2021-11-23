import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VisitorTest {
    ComputerPart computer = null;

    @BeforeEach
    void setUp() {
        computer = new Computer();
    }

    @Test
    void testDisplaying() {
        System.out.println("Running: testDisplaying");

        computer.accept(new ComputerPartDisplayVisitor());
    }
}
