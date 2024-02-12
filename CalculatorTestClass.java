import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CalculatorTestClass {

    @BeforeClass
    public static void setUpClass() {
        // One-time setup logic, runs before any test in the class
        System.out.println("BeforeClass - One-time setup logic");
    }

    @Before
    public void setUp() {
        // Setup logic here, runs before each test
        System.out.println("Before - Setup logic");
    }

    @Test
    public void testAddition() {
        // Test logic here
        int result = 2 + 3;
        assertEquals(5, result);
        System.out.println("Test - Addition");
    }

    @Test
    public void testSubtraction() {
        // Test logic here
        int result = 5 - 3;
        assertEquals(2, result);
        System.out.println("Test - Subtraction");
    }

    @Test
    public void testMultiplication() {
        // Test logic here
        int result = 2 * 4;
        assertEquals(8, result);
        System.out.println("Test - Multiplication");
    }

    @Test
    public void testDivision() {
        // Test logic here
        int result = 10 / 2;
        assertEquals(5, result);
        System.out.println("Test - Division");
    }

    @Test(timeout = 1000)
    public void testWithTimeout() {
        // Test logic that should complete within 1000 milliseconds
        System.out.println("Test - With Timeout");
    }

    @Ignore
    @Test
    public void ignoredTest() {
        // This test will be ignored
        System.out.println("Test - Ignored");
    }

    @After
    public void tearDown() {
        // Cleanup logic here, runs after each test
        System.out.println("After - Cleanup logic");
    }

    @AfterClass
    public static void tearDownClass() {
        // One-time cleanup logic, runs after all tests in the class
        System.out.println("AfterClass - One-time cleanup logic");
    }
}
