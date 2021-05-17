package mainPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SimilarFileFinder {

	public SimilarFileFinder() {
		// TODO Auto-generated constructor stub
		
	}
	public static void main(String[] args) throws IOException {

		String str= readFileIntoString("file1.txt");
		String str2= readFileIntoString("file2.txt");
		HashMap<String,ArrayList<String>> map = compareTwoFiles(str,3);
		HashMap<String,ArrayList<String>> map2 = compareTwoFiles(str2,3);
		int count =getTheNumbers(map, map2, 4);
		System.out.println("count"+count);
	}
	public static int getTheNumbers(HashMap<String,ArrayList<String>> map, HashMap<String,ArrayList<String>> map2, int wordCount) {
		int i=0;
		int count=0;
		Object[] arr;
		Object[] arr2;
		
		for(Map.Entry<String, ArrayList<String>> entry: map.entrySet()) {
			ArrayList<String> list= entry.getValue();
			arr=  list.toArray();
			ArrayList<String> list2 = new ArrayList<String>();
				if(map2.containsKey(entry.getKey())) {
					list2= map2.get(entry.getKey());
				}
				ArrayList<String> sameElementsInTheLists = new ArrayList<String>();
				sameElementsInTheLists= iterativeCheck(list,list2);
				for(String element : sameElementsInTheLists) {
					System.out.println(element);
//					for(int j=0;j<wordCount;j++) {
//						getTheNumbers(map,map2,wordCount);
					boolean checker= recursiveElementCounter(element, map, map2, wordCount-2,-1);
					System.out.println(checker);
					if(checker) {
						System.out.println(element);
					}
//					}
				}
			
			i=0;
		}
		
		
		return count;
	}
	public static boolean recursiveElementCounter(String element,HashMap<String,ArrayList<String>> map, HashMap<String,ArrayList<String>> map2, int count,int recursionDepth) {
//		for(int i=0;i<count;i++) {
		if(count==0) {
			return true;
		}
		else if(recursionDepth>= count) {
			return false;
		}
		ArrayList<String> listSame = new ArrayList<String>();
			if(map.containsKey(element) && map2.containsKey(element)) {
				ArrayList<String> list1 = map.get(element);
				ArrayList<String> list2 = map2.get(element);
				listSame =iterativeCheck(list1, list2);
				if(listSame!=null) {
					count--;
					if(count!=0) {
						for(int i=0;i<listSame.size();i++) {
							ArrayList<String>list = map.get(listSame.get(i));
							recursionDepth++;
							recursiveElementCounter(listSame.get(i), map, map2, count,recursionDepth);
							
						}
					}
					else {
						return true;
					}
				}
			}
			return false;
			
			
			
//		}
		
	}
	public static ArrayList<String> iterativeCheck(ArrayList<String> arr, ArrayList<String> arr2) {
		// For every element in this list, check if two elements are equal, if equal then set the same element to be the next element to search for in the map.
		ArrayList<String> list = new ArrayList<String>();
		for(String item : arr) {
			if(arr2.contains(item)) {
				list.add(item);
			}
		}
		return list;
	}
	public static String readFileIntoString(String filename) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(filename));
		StringBuilder stringBuilder = new StringBuilder();
		String line = null;
		String ls = System.getProperty("line.separator");
		while ((line = reader.readLine()) != null) {
			stringBuilder.append(line);
			stringBuilder.append(ls);
		}
		// delete the last new line separator
		stringBuilder.deleteCharAt(stringBuilder.length() - 1);
		reader.close();
		System.out.print(stringBuilder.toString());
		return stringBuilder.toString();
	}
	public static HashMap<String,ArrayList<String>> compareTwoFiles(String str1,int sequenceNumber) {
		HashMap<String,ArrayList<String>> map1 = new HashMap<String,ArrayList<String>>();
		String[] arr= str1.split(" +|\\. +");
		for (int i=0;i<arr.length;i++) {
			String lineA=arr[i];
			if(map1.containsKey(lineA)) {
				if(i+1<arr.length) {
					String lineAchild= arr[i+1];
					map1.get(lineA).add(lineAchild);
				}
			}
			else {
	        	ArrayList<String> list = new ArrayList<String>();
	        	if(i+1<arr.length) 
        		{
	        		String lineAchild= arr[i+1];
		        	list.add(lineAchild);
		        	map1.put(lineA,list);
        		}
	        }
		}
		System.out.print(map1.toString());
		
		return map1;
	}

}
