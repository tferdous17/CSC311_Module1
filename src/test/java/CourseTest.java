import org.example.Course;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CourseTest {

    Course course = new Course();

    //Test setter
    @Test
    public void testSomeMethod1() {
        course.setName("Tasnim");
        course.setCode("CSC311");
        course.setId(1234);
    }

    //Test getters
    @Test
    public void testSomeMethod2() {
        assertEquals("Tasnim", course.getName());
    }

    @Test
    public void testSomeMethod3() {
        assertEquals("CSC311", course.getCode());
    }

    @Test
    public void testSomeMethod4() {
        assertEquals(1234, course.getId());
    }

    // Test new object isn't null
    @Test
    public void testSomeMethod5() {
        Course course2 = new Course(456, "Tasnim", "CSC555");
        assertNotNull(course2);
    }

}
