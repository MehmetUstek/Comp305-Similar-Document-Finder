package similarity_findercheck;

import java.util.*;
import java.io.*;
import java.io.File;

class Main {
	private static int [][] EdgeMatrix;
	
	private static String [] nameofTxt;
	
	public static void main(String[] args) throws IOException   {
   //we should count number of txt in directory and assign it to n 	
		File directory=new File(System.getProperty("user.dir")+"/here");
	    int n=  directory.list().length;
	    txtVertice[] array_of_vertice= new txtVertice[n];
	    
	    nameofTxt= new String[n];
	    
	    
	    int i = 0 ; 
	    for (String name_of_txt  : directory.list()) {
	    	
	    	array_of_vertice[i]	= new txtVertice();
	  			  array_of_vertice[i].setTxt(name_of_txt);
	  			nameofTxt[i]=name_of_txt;
	  		i++;        
        }
	   int toadd= 0 ;    
     EdgeMatrix= new  int[n][n];

    fill_edges(array_of_vertice,n,toadd);

    for(int l = 0 ; l <n ; l++) {

    for(int j = 0 ; j <n ; j++) {
        	
   	System.out.println(	"Similarity between "+nameofTxt[l]+" and "+nameofTxt[j]+ " is "+ EdgeMatrix[l][j] );
    	
    }
    
   }
    int limit = 3;
    print_group(limit , n );
  }

	private static int fill_edges(txtVertice[] array_of_vertice,int n ,int actual_index){
		
		if(n==1)return 0;
		txtVertice master = array_of_vertice[0];

		
		
		for(int i = 1; i<n;i++) {
			
			//System.out.println(	"Comparing "+array_of_vertice[i].txt+master.txt );
			
			int weight= similarity_finder(master.txt,array_of_vertice[i].txt);
	
			EdgeMatrix[actual_index][actual_index+i]=weight ;
			EdgeMatrix[actual_index+i][actual_index]=weight ;
		}
		
		txtVertice[] array_of_vertice2 = new txtVertice[array_of_vertice.length-1];
		
		
		for(int i = 1; i<n;i++) {
			array_of_vertice2[i-1]= array_of_vertice[i];
		}
		n--;
		actual_index++;
		fill_edges(array_of_vertice2,n , actual_index);
	
	return 1 ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	private static void print_group(int limit   ,int n ){
	String group[]=new String[n]; 
		for(int i = 0 ; i <n ; i++) {		
			for(int j = 0 ; j <n ; j++) {		
			
				if(EdgeMatrix[i][j]> limit) {
			
				}
				}
			
			
			
			
			
		}
		
		
		
		
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
private static int similarity_finder(String txt1,String txt2 ){
String[] str1 = txt1.split("[\\s']");
String[] str2 = txt2.split("[\\s']");
int str1len= str1.length;
int str2len = str2.length;
int similarity=0;
for(int i = 0 ; i < str1len; i ++){

for(int k = 0 ; k < str2len; k ++){

int flag=0;
//checks in 3 sequence
for( int j = 0; j<3; j++){


if(i+j < str1len && j+k < str2len){ 
if( str1[i+j].equals(str2[j+k])) flag++;

if(flag==3) similarity++;
}
}
}
}
return similarity;
}











}