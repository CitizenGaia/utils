package dk.lejengnaver.utils;

import org.junit.*;

public class Json2XsdUtilTest {

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.out.println("@BeforeClass");
    }

    @AfterClass
    public static void runOnceAfterClass() {
        System.out.println("@AfterClass");
    }

    @Before
    public void runBeforeTestMethod() {
        System.out.println("@Before");
    }

    @After
    public void runAfterTestMethod() {
        System.out.println("@After");
    }
	
    @Test
    public void testExampleson() {	
        System.out.println("Inside testExampleson()");
    }

}
