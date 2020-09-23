import com.guseyn.rewrite.UsefulClass;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class UsefulTests {
    @Test
    void test1() {
        assertEquals(UsefulClass.usefulMethod("a", "b", 4, false), "ab4false");
    }

    @Test
    void test2() {
        assertEquals(UsefulClass.anotherUsefulMethod('a', 2.0, 4, true), "a2.04true");
    }
}
