package utils;

import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class MyUtilsTest {
	
	// Tests for static int sum(List<Integer> list)
	
		// Null parameters
	
	@Test
	public void sumTest_ParamIsNull() {
		assertEquals(0, MyUtils.sum(null));
	}
	
	@Test
	public void sumTest_ListIsEmpty() {
		List<Integer> list = new ArrayList<Integer>();
		assertEquals(0, MyUtils.sum(list));
	}
	
	@Test
	public void sumTest_ListElementAllAreNull() {
		List<Integer> list = Arrays.asList(null,null,null,null,null);
		assertEquals(0, MyUtils.sum(list));
	}
	
	@Test
	public void sumTest_ListElementSomeAreNull() {
		List<Integer> list = Arrays.asList(1,2,null,3,null);
		assertEquals(6, MyUtils.sum(list));
	}
	
		// Others
	@Test
	public void sumTest_CorrectResult() {
		List<Integer> list = Arrays.asList(1,2,3,4,15);
		int resultTest = MyUtils.sum(list);
		assertEquals(25, resultTest);
	}
	
	
	// Tests for public static String emptyToNull(String s)
		
		// Null parameters
	
	@Test
	public void emptyToNullTest_ParamIsNull() {
		assertEquals(null, MyUtils.emptyToNull(null));
	}
	
	@Test
	public void emptyToNullTest_StringIsNull() {
		String string = null;
		assertEquals(null, MyUtils.emptyToNull(string));
	}
	
	@Test
	public void emptyToNullTest_StringIsEmpty() {
		String string = new String();
		assertEquals(null, MyUtils.emptyToNull(string));
	}
		
		// Others
	
	@Test
	public void emptyToNullTest_StringIsFullOfSpaces() {
		String string = "   ";
		assertEquals(null, MyUtils.emptyToNull(string));
	}
	
	
	@Test
	public void emptyToNullTest_StringContainsStringNull() {
		String string = "null";
		assertEquals("null", MyUtils.emptyToNull(string));
	}
	
	@Test
	public void emptyToNullTest_StringContainsSpaces() {
		String string = "this is a test";
		assertEquals("this is a test", MyUtils.emptyToNull(string));
	}
	
	
	// Tests for public static List<Integer> filterEvenNumbers(List<Integer> integers)
	
		// Null parameters
	
	@Test
	public void filterEvenNumbersTest_ParamIsNull() {
		assertEquals(null, MyUtils.filterEvenNumbers(null));
	}
	
	@Test
	public void filterEvenNumbersTest_ListIsEmpty() {
		List<Integer> list = new ArrayList<Integer>();
		assertEquals(Collections.EMPTY_LIST, MyUtils.filterEvenNumbers(list));
	}
	
	@Test
	public void filterEvenNumbersTest_ListElementAllAreNull() {
		List<Integer> list = Arrays.asList(null,null,null,null,null);
		assertEquals(Collections.EMPTY_LIST, MyUtils.filterEvenNumbers(list));
		// expect an empty list as result
	}
	
	@Test
	public void filterEvenNumbersTest_ListElementSomeAreNull() {
		List<Integer> list = Arrays.asList(1,null,3,4,null);
		List<Integer> listTest = Arrays.asList(4);
		
		assertEquals(listTest, MyUtils.filterEvenNumbers(list));
		// expect an empty list as result
	}
	
		// Others

	@Test
	public void filterEvenNumbersTest_ListNoEven() {
		List<Integer> list = Arrays.asList(1,3,5,11,99);
		assertEquals(Collections.EMPTY_LIST, MyUtils.filterEvenNumbers(list));
		// expect an empty list as result
	}

	@Test
	public void filterEvenNumbersTest_ListAllEven() {
		List<Integer> list = Arrays.asList(null,4,6,12,51,100,7,null);
		List<Integer> listResult = Arrays.asList(4,6,12,100);
		assertEquals(listResult, MyUtils.filterEvenNumbers(list));
		// expect an empty list as result
	}
	
	@Test
	public void filterEvenNumbersTest_CorrectResult() {
		List<Integer> list = Arrays.asList(2,4,6,12,100);
		assertEquals(list, MyUtils.filterEvenNumbers(list));
		// expect an empty list as result
	}
	
	
	// Tests for public static List<Float> transformSquarePlusPointFive(List<Integer> integers)
	
		// Null parameters
	
	@Test
	public void transformSquarePlusPointFive_ParamIsNull() {
		assertEquals(null, MyUtils.transformSquarePlusPointFive(null));
	}
	
	@Test
	public void transformSquarePlusPointFive_ListIsEmpty() {
		List<Integer> list = new ArrayList<Integer>();
		assertEquals(Collections.EMPTY_LIST, MyUtils.transformSquarePlusPointFive(list));
	}
	
	@Test
	public void transformSquarePlusPointFive_ListElementAllAreNull() {
		List<Integer> list = Arrays.asList(null,null,null,null,null);
		assertEquals(Collections.EMPTY_LIST, MyUtils.transformSquarePlusPointFive(list));
		// expect an empty list as result
	}
	
	@Test
	public void transformSquarePlusPointFive_ListElementSomeAreNull() {
		List<Integer> list = Arrays.asList(1,2,null,4,null);
		List<Float> listResult = Arrays.asList(1.5f,4.5f,16.5f);
		assertEquals(listResult, MyUtils.transformSquarePlusPointFive(list));
		// expect an empty list as result
	}
	
	// Others
	
	@Test
	public void transformSquarePlusPointFive_ListElementNegatives() {
		List<Integer> list = Arrays.asList(0,-1,-2,-4,-20);
		List<Float> listResult = Arrays.asList(0.5f,1.5f,4.5f,16.5f,400.5f);
		assertEquals(listResult, MyUtils.transformSquarePlusPointFive(list));
		// expect an empty list as result
	}
	
	
	@Test
	public void transformSquarePlusPointFive_CorrectResult() {
		List<Integer> list = Arrays.asList(0,1,2,4,20,200);
		List<Float> listResult = Arrays.asList(0.5f,1.5f,4.5f,16.5f,400.5f,40000.5f);
		assertEquals(listResult, MyUtils.transformSquarePlusPointFive(list));
		// expect an empty list as result
	}
	
}
