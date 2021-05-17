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
		HashMap<String,ArrayList<String>> map = compareTwoFiles(str,str2,3);
		int count =getTheNumbers(map,0);
//		System.out.print(count);
	}
//	public void aaa(int count,HashMap<String,ArrayList<String>> map ) {
//		for(int i=0;i<count;i++) {
//			map.get(key)
//		}
//	}
	public static int getTheNumbers(HashMap<String,ArrayList<String>> map, int wordCount) {
		for(Map.Entry<String, ArrayList<String>> entry: map.entrySet()) {
			ArrayList<String> list= entry.getValue();
			Object[] arr=  list.toArray();
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[j]);
				map.get(arr[j]);
			}
//			while(it.hasNext()) {
//				for(int i=0;i<wordCount;i++) {
//					String current=it.next();
//					map.get(current);
//				}
//				
//				
//				if(it.hasNext()) {
//					if(current.equals(it.next())) {
//						count++;
//						break;
//					}
//				}
//			}
		}
		return 0;
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
	public static HashMap<String,ArrayList<String>> compareTwoFiles(String str1, String str2,int sequenceNumber) {
		HashMap<String,ArrayList<String>> map1 = new HashMap<String,ArrayList<String>>();
		String[] arr= str1.split(" +|\\. +");
		String[] arr2= str2.split(" +|\\. +");
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
		for (int i=0;i<arr2.length;i++) {
			String lineB=arr2[i];
			if(map1.containsKey(lineB)) {
				if(i+1<arr.length) {
					String lineBchild= arr2[i+1];
					map1.get(lineB).add(lineBchild);
				}
			}
			else {
	        	ArrayList<String> list = new ArrayList<String>();
	        	if(i+1<arr2.length) 
        		{
	        		String lineBchild= arr2[i+1];
		        	list.add(lineBchild);
		        	map1.put(lineB,list);
        		}
	        }
		}
		
//		while (tokenizer.hasMoreTokens()) {
//					line1 = tokenizer.nextToken();
//					temp.nextToken();
//			        if(map1.containsKey(line1)) {
//			        	if(tokenizer.hasMoreTokens()) 
//			        		{
//			        		line1Child = tokenizer.nextToken().toString();
//			        		map1.get(line1).add(line1Child);
//			        		tokenizer=temp;
//			        		}
//			        	
//			        }
//			        else {
//			        	ArrayList<String> list = new ArrayList<String>();
//			        	if(tokenizer.hasMoreTokens()) 
//		        		{
//				        	line1Child = tokenizer.nextToken().toString();
//				        	list.add(line1Child);
//				        	map1.put(line1,list);
//				        	tokenizer=temp;
//		        		}
//			        }
//			}
		System.out.print(map1.toString());
		
		return map1;
	}

}
