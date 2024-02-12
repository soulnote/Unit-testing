### What is unit testing
Unit testing is a software testing technique where individual units or components of a software system are tested in isolation to ensure that each unit functions correctly. In unit testing, the focus is on testing small, independent pieces of code, such as functions, methods, or classes, to verify that they produce the expected output for a given input.
### Advantages of unit testing
- Find bugs early
- Easy to fix bugs
- Reduce the cost and time
### How to perform unit test
- `JUNIT` - most popular framework for unit testing
- JUNIT-4
- JUNIT-5
- **Then what is Mockito?**
- Its a mocking framework
- Its a Java library for testing that allows the creation of mock objects in unit test. Mock objects simulate the behavior of real objects, helping developers isolate and test specific parts of their code.

`Here are the steps to test methods using JUnit in Eclipse:`

- Install JUnit Plugin (if not already installed):
If you haven't already installed the JUnit plugin, you can do so by going to Help -> Eclipse Marketplace, then search for JUnit and install it.

- Create a New Java Project:
Open Eclipse and create a new Java project by going to File -> New -> Java Project. Give your project a name and click Finish.

- Create a New Package (Optional):
Right-click on your project in the Package Explorer, select New -> Package, and give it a name.

- Create a Java Class:
Right-click on the package where you want to create your class, select New -> Class. Name your class and click Finish.

- Write the Class to be Tested:
Write the Java class containing the methods you want to test.

- Create a New JUnit Test Case:
Right-click on the class you want to test in the Package Explorer, select New -> JUnit Test Case. Make sure to select the methods you want to test, then click Finish. Eclipse will generate a new JUnit test class for you.

- Write Test Cases:
In the generated JUnit test class, write test methods for each method you want to test. Use annotations such as @Test to denote test methods. Write assertions to verify that the method under test behaves as expected.

- Run the Tests:
Right-click on the test class or individual test methods, then select Run As -> JUnit Test. Eclipse will execute the test methods and display the results in the JUnit view.

- Analyze the Results:
After running the tests, Eclipse will show you which tests passed and which failed. If any tests fail, you can examine the failure messages to understand what went wrong.

- Iterate and Refactor:
If any tests fail, go back to your code, make necessary adjustments, and rerun the tests until they all pass. Refactor your code as needed to improve testability and maintainability.
