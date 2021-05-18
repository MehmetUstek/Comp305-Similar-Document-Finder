package mainPackage;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException   {
    TxtVertice deneme = new TxtVertice();
    TxtVertice deneme2 = new TxtVertice();
    int WORD_COUNT = 4;
    deneme.setTxt("file1.txt");
    deneme2.setTxt("file2.txt");
    similarity_finder(deneme2.txt,deneme.txt,WORD_COUNT);
  	}


private static void similarity_finder(String txt1,String txt2, int wordCount){
	String[] str1 = txt1.split("[\\s']");
	String[] str2 = txt2.split("[\\s']");
	int str1len= str1.length;
	int str2len = str2.length;
	int similarity=0;
	
	for(int i = 0 ; i < str1len-1; i ++){
		for(int k = 0 ; k < str2len-1; k ++){
			int flag=0;
			//checks in 3 sequence
			for( int j = 0; j<wordCount; j++){
				if(i+j < str1len && i+j+k < str2len) { 
					if(str1[i+j].equals(str2[i+j+k])) {
						flag++;
					}
					if(flag==wordCount) {
						similarity++;
					}
				}
			}
			}
	}
System.out.println("Similarity is"+similarity);
	}
}