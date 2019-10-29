package utils;

import java.util.*;
import java.util.stream.Collectors;

public class MyUtils {

//	public static int sum(List<Integer> list) {
//		int sum = 0;
//		
//		if (list == null) {
//			return sum;
//		}
//		
//		for (Integer listNumber : list) {
//			if (listNumber != null) {
//				sum += listNumber;
//			}
//		}
//		
//		return sum;
//	} // Version without stream
	
	public static int sum(List<Integer> list) {
		int sum = 0;
		
		if (list == null) {
			return sum;
		}
		
		sum = list.stream()
				.filter(listNumber -> listNumber != null)
				.reduce(0, Integer::sum);
		
		return sum;
	}
	
	public static String emptyToNull(String s) {
		if (s == null) {
			return null;
		} else if (s.trim().isEmpty()) {
			return null;
		}
		return s;
	}
	
//	public static List<Integer> filterEvenNumbers(List<Integer> integers) {
//		if (integers == null) {
//			return null;
//		}
//		
//		List<Integer> result = new ArrayList<Integer>();
//		
//		for (Integer listElem : integers) {
//			if (listElem != null && listElem % 2 == 0) {
//				result.add(listElem);
//			}
//		}
//		
//		return result;
//	}   // Version without stream
	
	public static List<Integer> filterEvenNumbers(List<Integer> integers) {
		if (integers == null) {
			return null;
		}
		
		List<Integer> result = new ArrayList<Integer>();
		
		result = integers.stream()
				.filter(number -> number != null && number % 2 == 0)
				.collect(Collectors.toList());
		
		return result;
	}
	
//	public static List<Float> transformSquarePlusPointFive(List<Integer> integers) {
//		if (integers == null) {
//			return null;
//		}
//		
//		List<Float> result = new ArrayList<Float>();
//		
//		for (Integer listElem : integers) {
//			if (listElem != null) {
//				result.add((Float) (Math.pow(listElem,2)+0.5F));
//			}
//		}
//		
//		return result;
//	} // Version without stream
	
	public static List<Float> transformSquarePlusPointFive(List<Integer> integers) {
		if (integers == null) {
			return null;
		}
		
		List<Float> result = new ArrayList<Float>();
		
		result = integers.stream()
				.filter(number -> number != null)
				.map(number -> (float) (Math.pow(number,2)) + 0.5F)
				.collect(Collectors.toList());
		
		return result;
	}
	
}
