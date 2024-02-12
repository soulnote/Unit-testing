## Commonly Asked JUnit4 Annotations in Interview Questions

1. **@Test:**
   - Used to mark a method as a test method. JUnit runs the methods annotated with @Test to execute the test cases.

2. **@Before:**
   - Denotes a method that should be executed before each test method. It is often used for setup tasks.

3. **@After:**
   - Denotes a method that should be executed after each test method. It is often used for cleanup tasks.

4. **@BeforeClass:**
   - Specifies a method that should be run once before any of the test methods in the class. It is typically used for setup that should occur only once.

5. **@AfterClass:**
   - Specifies a method that should be run once after all the test methods in the class have been executed. It is used for cleanup that should occur only once.

6. **@Ignore:**
   - Used to temporarily disable a test method. It can be helpful when a test is known to fail but is not critical at the moment.

7. **@RunWith:**
   - Specifies a custom test runner class. This annotation is used when you want to use a custom test runner instead of the default one.

8. **@Test(timeout):**
   - Specifies a maximum execution time for a test method. If the test takes longer than the specified timeout, it is considered a failure.
