package com.junit5.testcases;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.Month;
import java.util.stream.Stream;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

public class Junit_Test {
	String s1 = "1234";
	
	@BeforeAll //available from junit 5
	public static void beforeAllTest() {
		System.out.println("Executes beforeAll test cases");
		
	}
	@BeforeEach
	public void beforeEachTest() {
		System.out.println("Executes before each test case");
		
	}
	
	@Test
	public void testFalse() {
		System.out.println(1);
		assertFalse(2==(s1.length()));
	}
	@RepeatedTest(5)//execute this test for 5 times
	@DisplayName("Repeated Test 5")
	 void repeatedTest() {
		int i=1;
		System.out.println("it will execute for 5 times");
	}
	@Test
	@DisplayName("Naming the testcase")
	public void testTrue() {
		System.out.println(2);
		assertTrue(2==(s1.length()));
	}
	
	@Test
	public void testSubStringTrue() {
		System.out.println(3);
		assertTrue(s1.substring(0, 2).equals("12"));
	}
	@AfterEach
	public void afterEachTest() {
		System.out.println("Executes after each test case");
		
	}
	@Test
	public void assertSame() {
		Assertions.assertSame("123", s1);
		
	}
	
	@Test
	public void assertNotSame() {
		Assertions.assertNotSame("123", s1);
		
	}
	@Test
	public void assertNull() {
		Assertions.assertNull(null);//passed
		Assertions.assertNull(s1);//failed --> in single test case one pass,one fail that results entire testcase is failed , one failed then rest
		//of code will be skipped
	}
	@Test
	public void assertNotNull() {
		Assertions.assertNotNull(s1);
	}
	
	@ParameterizedTest//it will make same test case execute multiple times with the given array input from valuesource. 
	@ValueSource(ints = {1,2,3,40})
	public void paramTest(int in) {
		System.out.println(in);
		assertTrue(in>2);
		
	}
	
	@ParameterizedTest
	@MethodSource("dataProvider")//it will pick the data from the given method and pass that data as parameters
	public void methodSource(int a,int b) {
		System.out.println(a+" -- "+b);
		assertTrue(a>90&&b>100);
		
	}
	//This method gives steam of data as arguments
	static Stream<Arguments> dataProvider() {

		return Stream.of(Arguments.of(1, 4), 
						 Arguments.of(7, 9), 
						 Arguments.of(10, 50), 
						 Arguments.of(100, 150));
	}
	
	@ParameterizedTest//custome argument provider
	@ArgumentsSource(CustomeArgumentProvider.class)// it will pass argumentsf from CustomeArgumentProvider.class
	public void customeArgumentProvider(String in) {
		System.out.println("customeArgumentProvider :\n"+in);
		assertEquals("Doctor", in);
	}
	
	@ParameterizedTest
	@MethodSource//no method name given then Junit looks for same method name
	public void noMethodSourceName(String in) {
		assertTrue(Utils.isBlank(in));
	}
	public static Stream<String> noMethodSourceName() {
		return Stream.of(null,""," ");
	}
	
	@ParameterizedTest
	@NullSource//it will pass single null value, cannot be used for an argument that has a primitive type
	public void nullSource(String in) {
		assertTrue(Utils.isBlank(in));
	}
	@ParameterizedTest
	@EmptySource//it will pass single null value for not primitives because primitives can't accept null
	public void emptySource(String in) {
		assertTrue(Utils.isBlank(in));
	}
	
	@ParameterizedTest
	@EnumSource(Month.class)
	public void enumSource(Month month) {
		assertEquals(3, month.getValue());
		}
	
	//arguments from different class
	@ParameterizedTest
	@MethodSource("com.junit5.testcases.Utils#arguments")
	public void argumentsFromAnotherClass(String in) {
		System.out.println("argumentsFromAnotherClass :\n"+in);
		assertEquals("NTR", in,"NTR fan base");//this msg will display for failed cases
	}
	
	@Test
	void assertall() {// from JUnit 5
		
		assertAll(
				()->assertEquals(1,0),
				()->assertTrue(true),
				()->assertEquals(10, 10)
				);
	}
	
	@AfterAll//available from junit 5
	public static void afterAllTest() {
		System.out.println("Executes after all test cases");
	}
	
	@Test()
	public void exceptionTest() {
		NullPointerException np = Assertions.assertThrows(NullPointerException.class, ()->{//JUnit 5
		String str=null;
		str.length();
		});
		System.out.println("------>"+np.getMessage());//null
		Assertions.assertEquals(null, np.getMessage());
	}
	@Test()
	public void exceptionTest2() { //This follows  Hierarchy like multiple catch blocks in exceptions
		Exception np = Assertions.assertThrows(Exception.class, ()->{//JUnit 5
		String str=null;
		str.length();
		});
		System.out.println("------>"+np.getMessage());//null
		Assertions.assertEquals(null, np.getMessage());
	}
}
