import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CohortTest {

//    @Before
//    public void setUp() {
//        Cohort cohort = new Cohort();
//    }

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
