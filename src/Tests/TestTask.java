import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestTask {
    private Task task;

    @BeforeEach
    void setUp(){
        task = new Task();
    }

    @Test
    void parityCheck (){
        assertTrue(task.evenOddNumber(4));
    }
    @Test
    void checkingForOddNumbers (){
        assertFalse(task.evenOddNumber(7));
    }
    @Test
    void checkNumberInInterval (){
        assertTrue(task.numberInInterval(25));
        assertTrue(task.numberInInterval(100));
        assertTrue(task.numberInInterval(51));
    }
    @Test
    void checkNumberNotInInterval (){
        assertFalse(task.numberInInterval(24));
        assertFalse(task.numberInInterval(101));
        assertFalse(task.numberInInterval(2));

    }
}
