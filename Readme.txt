----------------------------------------------------------
			HOW TO RUN
Programming Language : JAVA
Program used: Eclipse
How to Compile: Compilation is done by  "javac Main.java" command.This command will let us our executuble to run on the Java Virtual Machine.
Necessities: In the working directory of the program there should be a folder or another direcotry called "here" which includes all txt files that we want to be compared.
If there is no such a file and there is no txt files in that directory program wont make comparison and won't work.
--------------------------------------------------------------
		   How We Implemented
Data Structure:
------------
All txt files are stored in txtVertice Data Structure. Which is basically a Node and conatins "name of the txt file" and all txt file in terms of String. 
We used this node structure to increase accesibility to names and txt files while making comparisons and printing the names
---------
Global Variables:
There is 2D int array([][] EdgeMatrix) which will store the similarities of the txt files in the directory. This matrix is nxn matrix(n is number of txt files in here directory)
There is 1D String array ([]nameofTxt) which store name of the txt files in the here directory. This is sized n array.
---------
Variables:
txtVertice[] stores all of txtVertice Nodes in an array. It is self indexed.So every txtVertice has it's own index in that array
all global variables works parallel with this array so it is the most important variable in the program.
------------
Functions:


fill_edges(txtVertice[] array_of_vertice,int n ,int actual_index): 
first parameter is the array of the txtVertice who have not been the master txtVertive
second parameter is the number of txtVertices in the first parameter. It makes sure that our program terminates
third parameter is actual index values that is used analogus to the Global Variables and txtVertice[] in the main.
this function picks the first txtVertex in the array and makes it master and compares it one by one with the rest of the array(with function similarity_finder(master.txt,array_of_vertice[i].txt))updates the EdgeMatrix by weights  and after then creates another array and updates the actual index value and decrements the n 
This function has the complexity(O(n^2))


similarity_finder(String txt1,String txt2 ):
This function takes 2 txt file as an input and compares these two txt files with 8 word sequences.
If we prefered to use less than 8 it would act more likely to be comparing the txt files word by word and if it was more than 8 it would be acting like comparing the whole txt file and checking if they are the same or not.
So we preffered it to be 8.
This function returns the weight of the similarities of txt files.


void printer(int n,int limit,int source, txtVertice[] Set, int[] visited, int layer ,int [] groups):
First parameter is the number of txtVertice in the program.
Second parameter is the limit that we want to mach the txt files as an unorthodox set 
Third parameter is the vertex index which we will gonna use to check if this vertex is visited or not
Fourth parameter is the Array that contains all txtVertices
Fifth input is holding the vertexes which have been visited so far and actual array is stored in the main and. This array proivides us to our program terminate if we are investigating alreadly visited vertex. This array is updated when a TxtVertice becomes the source vertex.
Sixth input is holding which layer we are investigating
Seventh inputh is the group array which is updated when that vertex has a group. It is marked as 1. actual groups array is stored at main.
Complexity of the function is O(n) since every txtVertex() we mark the vertexes in the same group and mark visited vertexes. The worst case is there can be n different groups so the algorithm calls itself n times.
This problem is different than sub problem. 
Notice that 1 vertex can not be in more than 1 group. 


------------------------------------------------------------
Our Procedure:
First:
Our program compares all txt files in "here" folder and assigns the comparison results to the 2D matrix. O(n^2) complexity since every file is compared with each other.
Second:
Unorthodox sets are printed by printer function and it uses ([][] EdgeMatrix) to print the weights

----------------------------------------------------------
 TEST CASES
 In 4 files: 0.404 seconds.
 In 8 files: 1.475 seconds
 In 14 files: 5.537 seconds.
 In 26 files: 23.841 seconds
 ===============================================================================
 
 
 
