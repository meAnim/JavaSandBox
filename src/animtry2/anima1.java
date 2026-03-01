package animtry2;

import java.util.*;

public class anima1 {

//	public static List<String> arrangeList(List<String> mySample) {
//
//		Map<Integer, String> wordPositions = new HashMap<>();
//		Map<Integer, String> numberPositions = new HashMap<>();
//		List<String> wordPositionsL = new ArrayList<>();
//		List<String> numberPositionsL = new ArrayList<>();
////	    Iterator<String> gc = numberPositionsL.iterator();
//
//		// looping through the sample ArrayList and using HashMap to store the position
//		// and the word or number as a key value per
//		for (int i = 0; i < mySample.size(); i++) {
//			try {
//				Integer.parseInt(mySample.get(i));
//				numberPositions.put(i, mySample.get(i));
//				numberPositionsL.add(mySample.get(i));
//			} catch (NumberFormatException e) {
//				wordPositions.put(i, mySample.get(i));
//				wordPositionsL.add(mySample.get(i));
//
//			}
//		}
//
//		for (String g : mySample) {
//			try {
//				Integer.valueOf(g);
//				numberPositions.put(mySample.indexOf(g), g);
//				numberPositionsL.add(g);
//			} catch (Exception e) {
//				wordPositions.put(mySample.indexOf(g), g);
//				wordPositionsL.add(g);
//			}
//		}
//
//		mySample.stream().forEach(g -> {
//			try {
//				Integer.valueOf(g);
//				numberPositions.put(mySample.indexOf(g), g);
//				numberPositionsL.add(g);
//			} catch (Exception e) {
//				wordPositions.put(mySample.indexOf(g), g);
//				wordPositionsL.add(g);
//			}
//		});
//
//		// number list and word list sorted in ascending order
//		Collections.sort(wordPositionsL);
//
//		Collections.sort(numberPositionsL);
//
//		// aligning the numbers with the correct keys
//		int a = 0;
//		for (Integer i : numberPositions.keySet()) {
//			numberPositions.put(i, numberPositionsL.get(a));
//			a++;
//		}
//		// aligning the words with the correct keys
//		int b = 0;
//		for (Integer i : wordPositions.keySet()) {
//			wordPositions.put(i, wordPositionsL.get(b));
//			b++;
//		}
//		// created the list to contain the answer
//		List<String> answer = new ArrayList<>();
//
//		for (int i = 0; i < mySample.size(); i++) {
//			if (numberPositions.get(i) == null) {
//				answer.add(wordPositions.get(i));
//			} else {
//				answer.add(numberPositions.get(i));
//			}
//		}
//
//		return answer; // Task completed
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String [] get = {"asd","kate","han","askke"};

//		for (String x:get) {
//			if(x.startsWith("as"))
//				System.out.println(x);
//		}

//List<String> mySample = new ArrayList<>();
//	    
//	    mySample.add("world");
//	    mySample.add("4");
//	    mySample.add("hello");
//	    mySample.add("2");
//	    mySample.add("3");
//	    mySample.add("1");
//	    mySample.add("coding");
//	    mySample.add("test");

//	    forEach example: mySample.forEach(i -> System.out.println(i));

//	    System.out.println("Sample Arraylist Provided");
//	    System.out.println(mySample);
//	    System.out.println();
//	    System.out.println();
//	    System.out.println("Answer From Emmanuel");
//	    System.out.println(arrangeList(mySample));

//	    final Formatter h;
//	    
//	    try {
//	    	h = new Formatter("animdoc.doc");
//	    	System.out.println("file created");
//	    }catch (Exception e) {
//	    	System.out.println("shid!!");
//		}

//		List<Integer> mySample = new ArrayList<>();
//		mySample.add(1);
//	    mySample.add(2);
//	    mySample.add(3);
//	    mySample.add(4);
//	    mySample.add(5);
//	    mySample.add(6);
//	    mySample.add(7);
//	    mySample.add(8);

//	    System.out.println(rotLeft(mySample, 10)); find the lowest positive number not present

		int[] arr = { 1, 2, 3 };
	    
		List<Integer> gh= new ArrayList<>();
		
		Set<Integer> set = new HashSet<>();
		for (int num : arr) {
//		    if (!set.add(num)) {
		        System.out.println(gh.add(num));
//		    }
		}
		
//		List<Integer> g = Arrays.asList(k);
//
//		Collections.sort(g);
//		System.out.println(g);
//		int count = 1;
//
//		for (int b : g) {
//			if (count > 0 && !g.contains(count)) {
//				System.out.println(count);
//				break;
//			} else {
//				++count;
//				if (count > g.size()) {
//					System.out.println(count);
//					break;
//				}
//			}
//
//		}
//
////		for(int i =0; ) {
////	    	
////	    }
//
//	}

//	public static List<Integer> rotLeft(List<Integer> a, int d) {
//
//    	for(int i = 0; i< d; i++){
//            a.add(a.get(0));
//            a.remove(0);
//        }
//        return a;
}
//	

}
