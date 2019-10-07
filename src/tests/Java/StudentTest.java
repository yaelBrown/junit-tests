import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Before
    public void setUp() {
        this.id = 0;
    }

    @Test
    public void testIdReturnsLong () {
        assertEquals(0, Student.getId());
    }

}