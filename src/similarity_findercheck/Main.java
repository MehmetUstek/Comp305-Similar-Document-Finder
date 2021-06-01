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
	    	array_of_vertice[i].setNameofTxt(name_of_txt); /// Preperation COst of O(n)
	    	array_of_vertice[i].setTxt(name_of_txt);
	  		nameofTxt[i]=name_of_txt;
	  		array_of_vertice[i].setU_group(n);
	  		array_of_vertice[i].setId(i);
	  		i++;        
}
	    
	    
	    System.out.println(	"Comparison of all txt files are "); 
	    
	 int toadd= 0 ;    
     EdgeMatrix= new  int[n][n];
     fill_edges(array_of_vertice,n,toadd);
    for(int l = 0 ; l <n ; l++) {
    	
    	System.out.println(	"----------------------------------------------"); 
    	
    	for(int j = 0 ; j <n ; j++) {
   	System.out.println(	"Similarity between "+nameofTxt[l]+" and "+nameofTxt[j]+ " is "+ EdgeMatrix[l][j] ); 	
    }
   }
    int limit = 3;   
    
    
    txtVertice[] temp= new txtVertice[n];
    int m = 0; 
    for(txtVertice vert : array_of_vertice) {
    temp[m]= vert;
    	
   m++;
    }
    
    
    
    
    
    
    
    System.out.println(	"\n\n\n\n\n                 Unorthodox Sets" ); 
    
    System.out.println(	"----------------------------------------------" ); 
   
   int groupid=1;
   int groups[] = new int[n];
   for(int q = 0 ; q <n; q++ ) {
   	groups[q]= 0 ; 
   }
   int cc=0;
   int  layer=0;
   for(int k = 0 ; k<n; k++ ) { 		
	   int visited[]    = new int[n];
	    for(int q = 0 ; q <n; q++ ) {
	    	visited[q]= 0 ; 
	    }

	  
	  if(groups[k]==0 ) {	
 printer(n, limit,k , array_of_vertice , visited,  layer,groups,groupid);	  
	  }
   }   
  }

	private static int fill_edges(txtVertice[] array_of_vertice,int n ,int actual_index){
		
		if(n==1)return 0;
		txtVertice master = array_of_vertice[0];
			for(int i = 1; i<n;i++) {
			
			
			
			int weight= similarity_finder(master.txt,array_of_vertice[i].txt); // O(n^3)
	
			EdgeMatrix[actual_index][actual_index+i]=weight ;
			EdgeMatrix[actual_index+i][actual_index]=weight ;
}
		
		txtVertice[] array_of_vertice2 = new txtVertice[array_of_vertice.length-1]; /// Her file 1 kere dönülüyor, analize etkisi ??? 
		
		
		for(int i = 1; i<n;i++) {
			array_of_vertice2[i-1]= array_of_vertice[i];
		}
		n--;
		actual_index++;
		fill_edges(array_of_vertice2,n , actual_index);
	
	return 1 ;
	}

	
	
	
	
	
	
	
	private static void printer(int n,int limit,int source, txtVertice[] Set, int[] visited, int layer ,int [] groups, int groupid ) {
		if(visited[source]==0) { 
		String [] upperLimitNames = new  String[n];
		int [] upperLimitWeights = new  int[n];
		int[] indexes = new int [n];
		int c = 0 ; 
		
		for(int i = 0 ; i< n ; i++) {
		   if(EdgeMatrix[source][i]> limit) {
			  upperLimitNames[c]= Set[i].nameoftxt;
			  upperLimitWeights[c]= EdgeMatrix[source][i];
			  indexes[c]=i;
		      c++;
		   }
		}
		
		for(int i = 0 ; i <c; i++) {
			if(i==0) {
			if(layer==0)System.out.println("\n  Graph of the Similarites for source "+Set[source].nameoftxt+ " is: \n------------------------------------------------- ");	
			System.out.println("According to NODE "+ Set[source].nameoftxt+" edges are");
			
			}
			System.out.println("---->Similarity of "+ Set[source].nameoftxt+" and "+upperLimitNames[i] +" is "+upperLimitWeights[i] );
		
		}			
	
		 visited[source]=1;	
		 groups[source]= 1;
		 layer++;
		for(int i = 0 ; i < c; i++) {
			
			printer(n,limit, indexes[i],Set,visited,layer,groups, groupid);

		
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
