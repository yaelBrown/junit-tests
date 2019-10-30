import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CohortTest {


    // Have to define variables for the @before method

    @BeforeAll
    public void setUp() {
        Cohort cohort = new Cohort();
    }

    @Test
    public void testCohortNotNull() {
        Cohort cohort = new Cohort();
        assertNotNull(cohort);
    }

    @Test
    public void testAddStudentToList() {
        Cohort cohort = new Cohort();
        assertEquals(0, cohort.size());

        Student stevie = new Student(1L, "Stevie");
        cohort.addStudent(stevie);

        assertEquals(1, cohort.size());
    }

    @Test
    public void testCohortAverage() {
        Cohort cohort = new Cohort();
        Student stevie = new Student(1L, "Stevie");
        stevie.addGrade(100);
        Student owen = new Student(1L, "Owen");
        owen.addGrade(50);

        cohort.addStudent(stevie);
        cohort.addStudent(owen);

        // Need delta to test floating point numbers
        assertEquals(75, cohort.getCohortAverage(), 0);
    }


}