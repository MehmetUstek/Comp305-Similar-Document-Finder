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
 
----------------------------------------------------------
Example Output:
In 26 Files:
Comparison of all txt files are 
----------------------------------------------
Similarity between abf0704.txt and abf0704.txt is 0
Similarity between abf0704.txt and abf70402.txt is 536
Similarity between abf0704.txt and bef1121.txt is 0
Similarity between abf0704.txt and bgt221.txt is 0
Similarity between abf0704.txt and bmu5.txt is 0
Similarity between abf0704.txt and bwa248.txt is 0
Similarity between abf0704.txt and catchmeifyoucan.txt is 0
Similarity between abf0704.txt and ckh80.txt is 0
Similarity between abf0704.txt and ecu201.txt is 0
Similarity between abf0704.txt and edo14.txt is 0
Similarity between abf0704.txt and edo20.txt is 0
Similarity between abf0704.txt and edo26.txt is 471
Similarity between abf0704.txt and ehc229.txt is 0
Similarity between abf0704.txt and erk185.txt is 0
Similarity between abf0704.txt and esv254.txt is 0
Similarity between abf0704.txt and hal10.txt is 0
Similarity between abf0704.txt and hte42.txt is 0
Similarity between abf0704.txt and jrf1109.txt is 0
Similarity between abf0704.txt and prz100.txt is 0
Similarity between abf0704.txt and sra107.txt is 0
Similarity between abf0704.txt and sra119.txt is 0
Similarity between abf0704.txt and sra126.txt is 0
Similarity between abf0704.txt and sra31.txt is 0
Similarity between abf0704.txt and sra42.txt is 0
Similarity between abf0704.txt and tyc12.txt is 0
----------------------------------------------
Similarity between abf70402.txt and abf0704.txt is 536
Similarity between abf70402.txt and abf70402.txt is 0
Similarity between abf70402.txt and bef1121.txt is 0
Similarity between abf70402.txt and bgt221.txt is 0
Similarity between abf70402.txt and bmu5.txt is 0
Similarity between abf70402.txt and bwa248.txt is 0
Similarity between abf70402.txt and catchmeifyoucan.txt is 0
Similarity between abf70402.txt and ckh80.txt is 0
Similarity between abf70402.txt and ecu201.txt is 0
Similarity between abf70402.txt and edo14.txt is 0
Similarity between abf70402.txt and edo20.txt is 0
Similarity between abf70402.txt and edo26.txt is 145
Similarity between abf70402.txt and ehc229.txt is 0
Similarity between abf70402.txt and erk185.txt is 0
Similarity between abf70402.txt and esv254.txt is 0
Similarity between abf70402.txt and hal10.txt is 0
Similarity between abf70402.txt and hte42.txt is 0
Similarity between abf70402.txt and jrf1109.txt is 0
Similarity between abf70402.txt and prz100.txt is 0
Similarity between abf70402.txt and sra107.txt is 0
Similarity between abf70402.txt and sra119.txt is 0
Similarity between abf70402.txt and sra126.txt is 0
Similarity between abf70402.txt and sra31.txt is 0
Similarity between abf70402.txt and sra42.txt is 0
Similarity between abf70402.txt and tyc12.txt is 0
----------------------------------------------
Similarity between bef1121.txt and abf0704.txt is 0
Similarity between bef1121.txt and abf70402.txt is 0
Similarity between bef1121.txt and bef1121.txt is 0
Similarity between bef1121.txt and bgt221.txt is 0
Similarity between bef1121.txt and bmu5.txt is 0
Similarity between bef1121.txt and bwa248.txt is 0
Similarity between bef1121.txt and catchmeifyoucan.txt is 0
Similarity between bef1121.txt and ckh80.txt is 0
Similarity between bef1121.txt and ecu201.txt is 0
Similarity between bef1121.txt and edo14.txt is 342
Similarity between bef1121.txt and edo20.txt is 0
Similarity between bef1121.txt and edo26.txt is 0
Similarity between bef1121.txt and ehc229.txt is 0
Similarity between bef1121.txt and erk185.txt is 0
Similarity between bef1121.txt and esv254.txt is 0
Similarity between bef1121.txt and hal10.txt is 0
Similarity between bef1121.txt and hte42.txt is 0
Similarity between bef1121.txt and jrf1109.txt is 0
Similarity between bef1121.txt and prz100.txt is 0
Similarity between bef1121.txt and sra107.txt is 0
Similarity between bef1121.txt and sra119.txt is 0
Similarity between bef1121.txt and sra126.txt is 0
Similarity between bef1121.txt and sra31.txt is 0
Similarity between bef1121.txt and sra42.txt is 0
Similarity between bef1121.txt and tyc12.txt is 0
----------------------------------------------
Similarity between bgt221.txt and abf0704.txt is 0
Similarity between bgt221.txt and abf70402.txt is 0
Similarity between bgt221.txt and bef1121.txt is 0
Similarity between bgt221.txt and bgt221.txt is 0
Similarity between bgt221.txt and bmu5.txt is 0
Similarity between bgt221.txt and bwa248.txt is 0
Similarity between bgt221.txt and catchmeifyoucan.txt is 0
Similarity between bgt221.txt and ckh80.txt is 0
Similarity between bgt221.txt and ecu201.txt is 0
Similarity between bgt221.txt and edo14.txt is 0
Similarity between bgt221.txt and edo20.txt is 0
Similarity between bgt221.txt and edo26.txt is 0
Similarity between bgt221.txt and ehc229.txt is 0
Similarity between bgt221.txt and erk185.txt is 0
Similarity between bgt221.txt and esv254.txt is 0
Similarity between bgt221.txt and hal10.txt is 0
Similarity between bgt221.txt and hte42.txt is 0
Similarity between bgt221.txt and jrf1109.txt is 0
Similarity between bgt221.txt and prz100.txt is 0
Similarity between bgt221.txt and sra107.txt is 0
Similarity between bgt221.txt and sra119.txt is 0
Similarity between bgt221.txt and sra126.txt is 0
Similarity between bgt221.txt and sra31.txt is 0
Similarity between bgt221.txt and sra42.txt is 0
Similarity between bgt221.txt and tyc12.txt is 0
----------------------------------------------
Similarity between bmu5.txt and abf0704.txt is 0
Similarity between bmu5.txt and abf70402.txt is 0
Similarity between bmu5.txt and bef1121.txt is 0
Similarity between bmu5.txt and bgt221.txt is 0
Similarity between bmu5.txt and bmu5.txt is 0
Similarity between bmu5.txt and bwa248.txt is 0
Similarity between bmu5.txt and catchmeifyoucan.txt is 0
Similarity between bmu5.txt and ckh80.txt is 0
Similarity between bmu5.txt and ecu201.txt is 0
Similarity between bmu5.txt and edo14.txt is 0
Similarity between bmu5.txt and edo20.txt is 0
Similarity between bmu5.txt and edo26.txt is 0
Similarity between bmu5.txt and ehc229.txt is 0
Similarity between bmu5.txt and erk185.txt is 0
Similarity between bmu5.txt and esv254.txt is 0
Similarity between bmu5.txt and hal10.txt is 0
Similarity between bmu5.txt and hte42.txt is 0
Similarity between bmu5.txt and jrf1109.txt is 0
Similarity between bmu5.txt and prz100.txt is 0
Similarity between bmu5.txt and sra107.txt is 0
Similarity between bmu5.txt and sra119.txt is 0
Similarity between bmu5.txt and sra126.txt is 0
Similarity between bmu5.txt and sra31.txt is 0
Similarity between bmu5.txt and sra42.txt is 0
Similarity between bmu5.txt and tyc12.txt is 0
----------------------------------------------
Similarity between bwa248.txt and abf0704.txt is 0
Similarity between bwa248.txt and abf70402.txt is 0
Similarity between bwa248.txt and bef1121.txt is 0
Similarity between bwa248.txt and bgt221.txt is 0
Similarity between bwa248.txt and bmu5.txt is 0
Similarity between bwa248.txt and bwa248.txt is 0
Similarity between bwa248.txt and catchmeifyoucan.txt is 0
Similarity between bwa248.txt and ckh80.txt is 0
Similarity between bwa248.txt and ecu201.txt is 0
Similarity between bwa248.txt and edo14.txt is 0
Similarity between bwa248.txt and edo20.txt is 0
Similarity between bwa248.txt and edo26.txt is 0
Similarity between bwa248.txt and ehc229.txt is 0
Similarity between bwa248.txt and erk185.txt is 0
Similarity between bwa248.txt and esv254.txt is 0
Similarity between bwa248.txt and hal10.txt is 0
Similarity between bwa248.txt and hte42.txt is 0
Similarity between bwa248.txt and jrf1109.txt is 0
Similarity between bwa248.txt and prz100.txt is 0
Similarity between bwa248.txt and sra107.txt is 0
Similarity between bwa248.txt and sra119.txt is 0
Similarity between bwa248.txt and sra126.txt is 0
Similarity between bwa248.txt and sra31.txt is 0
Similarity between bwa248.txt and sra42.txt is 0
Similarity between bwa248.txt and tyc12.txt is 0
----------------------------------------------
Similarity between catchmeifyoucan.txt and abf0704.txt is 0
Similarity between catchmeifyoucan.txt and abf70402.txt is 0
Similarity between catchmeifyoucan.txt and bef1121.txt is 0
Similarity between catchmeifyoucan.txt and bgt221.txt is 0
Similarity between catchmeifyoucan.txt and bmu5.txt is 0
Similarity between catchmeifyoucan.txt and bwa248.txt is 0
Similarity between catchmeifyoucan.txt and catchmeifyoucan.txt is 0
Similarity between catchmeifyoucan.txt and ckh80.txt is 0
Similarity between catchmeifyoucan.txt and ecu201.txt is 286
Similarity between catchmeifyoucan.txt and edo14.txt is 0
Similarity between catchmeifyoucan.txt and edo20.txt is 0
Similarity between catchmeifyoucan.txt and edo26.txt is 0
Similarity between catchmeifyoucan.txt and ehc229.txt is 0
Similarity between catchmeifyoucan.txt and erk185.txt is 0
Similarity between catchmeifyoucan.txt and esv254.txt is 0
Similarity between catchmeifyoucan.txt and hal10.txt is 318
Similarity between catchmeifyoucan.txt and hte42.txt is 0
Similarity between catchmeifyoucan.txt and jrf1109.txt is 0
Similarity between catchmeifyoucan.txt and prz100.txt is 0
Similarity between catchmeifyoucan.txt and sra107.txt is 0
Similarity between catchmeifyoucan.txt and sra119.txt is 0
Similarity between catchmeifyoucan.txt and sra126.txt is 0
Similarity between catchmeifyoucan.txt and sra31.txt is 0
Similarity between catchmeifyoucan.txt and sra42.txt is 0
Similarity between catchmeifyoucan.txt and tyc12.txt is 453
----------------------------------------------
Similarity between ckh80.txt and abf0704.txt is 0
Similarity between ckh80.txt and abf70402.txt is 0
Similarity between ckh80.txt and bef1121.txt is 0
Similarity between ckh80.txt and bgt221.txt is 0
Similarity between ckh80.txt and bmu5.txt is 0
Similarity between ckh80.txt and bwa248.txt is 0
Similarity between ckh80.txt and catchmeifyoucan.txt is 0
Similarity between ckh80.txt and ckh80.txt is 0
Similarity between ckh80.txt and ecu201.txt is 0
Similarity between ckh80.txt and edo14.txt is 0
Similarity between ckh80.txt and edo20.txt is 0
Similarity between ckh80.txt and edo26.txt is 0
Similarity between ckh80.txt and ehc229.txt is 0
Similarity between ckh80.txt and erk185.txt is 0
Similarity between ckh80.txt and esv254.txt is 0
Similarity between ckh80.txt and hal10.txt is 0
Similarity between ckh80.txt and hte42.txt is 0
Similarity between ckh80.txt and jrf1109.txt is 0
Similarity between ckh80.txt and prz100.txt is 0
Similarity between ckh80.txt and sra107.txt is 0
Similarity between ckh80.txt and sra119.txt is 0
Similarity between ckh80.txt and sra126.txt is 0
Similarity between ckh80.txt and sra31.txt is 0
Similarity between ckh80.txt and sra42.txt is 0
Similarity between ckh80.txt and tyc12.txt is 0
----------------------------------------------
Similarity between ecu201.txt and abf0704.txt is 0
Similarity between ecu201.txt and abf70402.txt is 0
Similarity between ecu201.txt and bef1121.txt is 0
Similarity between ecu201.txt and bgt221.txt is 0
Similarity between ecu201.txt and bmu5.txt is 0
Similarity between ecu201.txt and bwa248.txt is 0
Similarity between ecu201.txt and catchmeifyoucan.txt is 286
Similarity between ecu201.txt and ckh80.txt is 0
Similarity between ecu201.txt and ecu201.txt is 0
Similarity between ecu201.txt and edo14.txt is 0
Similarity between ecu201.txt and edo20.txt is 0
Similarity between ecu201.txt and edo26.txt is 0
Similarity between ecu201.txt and ehc229.txt is 0
Similarity between ecu201.txt and erk185.txt is 0
Similarity between ecu201.txt and esv254.txt is 0
Similarity between ecu201.txt and hal10.txt is 0
Similarity between ecu201.txt and hte42.txt is 0
Similarity between ecu201.txt and jrf1109.txt is 0
Similarity between ecu201.txt and prz100.txt is 0
Similarity between ecu201.txt and sra107.txt is 0
Similarity between ecu201.txt and sra119.txt is 0
Similarity between ecu201.txt and sra126.txt is 0
Similarity between ecu201.txt and sra31.txt is 0
Similarity between ecu201.txt and sra42.txt is 0
Similarity between ecu201.txt and tyc12.txt is 0
----------------------------------------------
Similarity between edo14.txt and abf0704.txt is 0
Similarity between edo14.txt and abf70402.txt is 0
Similarity between edo14.txt and bef1121.txt is 342
Similarity between edo14.txt and bgt221.txt is 0
Similarity between edo14.txt and bmu5.txt is 0
Similarity between edo14.txt and bwa248.txt is 0
Similarity between edo14.txt and catchmeifyoucan.txt is 0
Similarity between edo14.txt and ckh80.txt is 0
Similarity between edo14.txt and ecu201.txt is 0
Similarity between edo14.txt and edo14.txt is 0
Similarity between edo14.txt and edo20.txt is 0
Similarity between edo14.txt and edo26.txt is 0
Similarity between edo14.txt and ehc229.txt is 0
Similarity between edo14.txt and erk185.txt is 0
Similarity between edo14.txt and esv254.txt is 0
Similarity between edo14.txt and hal10.txt is 0
Similarity between edo14.txt and hte42.txt is 0
Similarity between edo14.txt and jrf1109.txt is 0
Similarity between edo14.txt and prz100.txt is 0
Similarity between edo14.txt and sra107.txt is 0
Similarity between edo14.txt and sra119.txt is 0
Similarity between edo14.txt and sra126.txt is 0
Similarity between edo14.txt and sra31.txt is 0
Similarity between edo14.txt and sra42.txt is 0
Similarity between edo14.txt and tyc12.txt is 0
----------------------------------------------
Similarity between edo20.txt and abf0704.txt is 0
Similarity between edo20.txt and abf70402.txt is 0
Similarity between edo20.txt and bef1121.txt is 0
Similarity between edo20.txt and bgt221.txt is 0
Similarity between edo20.txt and bmu5.txt is 0
Similarity between edo20.txt and bwa248.txt is 0
Similarity between edo20.txt and catchmeifyoucan.txt is 0
Similarity between edo20.txt and ckh80.txt is 0
Similarity between edo20.txt and ecu201.txt is 0
Similarity between edo20.txt and edo14.txt is 0
Similarity between edo20.txt and edo20.txt is 0
Similarity between edo20.txt and edo26.txt is 0
Similarity between edo20.txt and ehc229.txt is 0
Similarity between edo20.txt and erk185.txt is 0
Similarity between edo20.txt and esv254.txt is 0
Similarity between edo20.txt and hal10.txt is 0
Similarity between edo20.txt and hte42.txt is 0
Similarity between edo20.txt and jrf1109.txt is 0
Similarity between edo20.txt and prz100.txt is 0
Similarity between edo20.txt and sra107.txt is 0
Similarity between edo20.txt and sra119.txt is 0
Similarity between edo20.txt and sra126.txt is 0
Similarity between edo20.txt and sra31.txt is 0
Similarity between edo20.txt and sra42.txt is 0
Similarity between edo20.txt and tyc12.txt is 0
----------------------------------------------
Similarity between edo26.txt and abf0704.txt is 471
Similarity between edo26.txt and abf70402.txt is 145
Similarity between edo26.txt and bef1121.txt is 0
Similarity between edo26.txt and bgt221.txt is 0
Similarity between edo26.txt and bmu5.txt is 0
Similarity between edo26.txt and bwa248.txt is 0
Similarity between edo26.txt and catchmeifyoucan.txt is 0
Similarity between edo26.txt and ckh80.txt is 0
Similarity between edo26.txt and ecu201.txt is 0
Similarity between edo26.txt and edo14.txt is 0
Similarity between edo26.txt and edo20.txt is 0
Similarity between edo26.txt and edo26.txt is 0
Similarity between edo26.txt and ehc229.txt is 0
Similarity between edo26.txt and erk185.txt is 0
Similarity between edo26.txt and esv254.txt is 0
Similarity between edo26.txt and hal10.txt is 0
Similarity between edo26.txt and hte42.txt is 0
Similarity between edo26.txt and jrf1109.txt is 0
Similarity between edo26.txt and prz100.txt is 0
Similarity between edo26.txt and sra107.txt is 0
Similarity between edo26.txt and sra119.txt is 0
Similarity between edo26.txt and sra126.txt is 0
Similarity between edo26.txt and sra31.txt is 0
Similarity between edo26.txt and sra42.txt is 0
Similarity between edo26.txt and tyc12.txt is 0
----------------------------------------------
Similarity between ehc229.txt and abf0704.txt is 0
Similarity between ehc229.txt and abf70402.txt is 0
Similarity between ehc229.txt and bef1121.txt is 0
Similarity between ehc229.txt and bgt221.txt is 0
Similarity between ehc229.txt and bmu5.txt is 0
Similarity between ehc229.txt and bwa248.txt is 0
Similarity between ehc229.txt and catchmeifyoucan.txt is 0
Similarity between ehc229.txt and ckh80.txt is 0
Similarity between ehc229.txt and ecu201.txt is 0
Similarity between ehc229.txt and edo14.txt is 0
Similarity between ehc229.txt and edo20.txt is 0
Similarity between ehc229.txt and edo26.txt is 0
Similarity between ehc229.txt and ehc229.txt is 0
Similarity between ehc229.txt and erk185.txt is 0
Similarity between ehc229.txt and esv254.txt is 0
Similarity between ehc229.txt and hal10.txt is 0
Similarity between ehc229.txt and hte42.txt is 0
Similarity between ehc229.txt and jrf1109.txt is 0
Similarity between ehc229.txt and prz100.txt is 0
Similarity between ehc229.txt and sra107.txt is 0
Similarity between ehc229.txt and sra119.txt is 0
Similarity between ehc229.txt and sra126.txt is 0
Similarity between ehc229.txt and sra31.txt is 0
Similarity between ehc229.txt and sra42.txt is 0
Similarity between ehc229.txt and tyc12.txt is 0
----------------------------------------------
Similarity between erk185.txt and abf0704.txt is 0
Similarity between erk185.txt and abf70402.txt is 0
Similarity between erk185.txt and bef1121.txt is 0
Similarity between erk185.txt and bgt221.txt is 0
Similarity between erk185.txt and bmu5.txt is 0
Similarity between erk185.txt and bwa248.txt is 0
Similarity between erk185.txt and catchmeifyoucan.txt is 0
Similarity between erk185.txt and ckh80.txt is 0
Similarity between erk185.txt and ecu201.txt is 0
Similarity between erk185.txt and edo14.txt is 0
Similarity between erk185.txt and edo20.txt is 0
Similarity between erk185.txt and edo26.txt is 0
Similarity between erk185.txt and ehc229.txt is 0
Similarity between erk185.txt and erk185.txt is 0
Similarity between erk185.txt and esv254.txt is 0
Similarity between erk185.txt and hal10.txt is 0
Similarity between erk185.txt and hte42.txt is 0
Similarity between erk185.txt and jrf1109.txt is 0
Similarity between erk185.txt and prz100.txt is 0
Similarity between erk185.txt and sra107.txt is 0
Similarity between erk185.txt and sra119.txt is 0
Similarity between erk185.txt and sra126.txt is 0
Similarity between erk185.txt and sra31.txt is 0
Similarity between erk185.txt and sra42.txt is 0
Similarity between erk185.txt and tyc12.txt is 0
----------------------------------------------
Similarity between esv254.txt and abf0704.txt is 0
Similarity between esv254.txt and abf70402.txt is 0
Similarity between esv254.txt and bef1121.txt is 0
Similarity between esv254.txt and bgt221.txt is 0
Similarity between esv254.txt and bmu5.txt is 0
Similarity between esv254.txt and bwa248.txt is 0
Similarity between esv254.txt and catchmeifyoucan.txt is 0
Similarity between esv254.txt and ckh80.txt is 0
Similarity between esv254.txt and ecu201.txt is 0
Similarity between esv254.txt and edo14.txt is 0
Similarity between esv254.txt and edo20.txt is 0
Similarity between esv254.txt and edo26.txt is 0
Similarity between esv254.txt and ehc229.txt is 0
Similarity between esv254.txt and erk185.txt is 0
Similarity between esv254.txt and esv254.txt is 0
Similarity between esv254.txt and hal10.txt is 0
Similarity between esv254.txt and hte42.txt is 0
Similarity between esv254.txt and jrf1109.txt is 0
Similarity between esv254.txt and prz100.txt is 0
Similarity between esv254.txt and sra107.txt is 0
Similarity between esv254.txt and sra119.txt is 0
Similarity between esv254.txt and sra126.txt is 0
Similarity between esv254.txt and sra31.txt is 0
Similarity between esv254.txt and sra42.txt is 0
Similarity between esv254.txt and tyc12.txt is 0
----------------------------------------------
Similarity between hal10.txt and abf0704.txt is 0
Similarity between hal10.txt and abf70402.txt is 0
Similarity between hal10.txt and bef1121.txt is 0
Similarity between hal10.txt and bgt221.txt is 0
Similarity between hal10.txt and bmu5.txt is 0
Similarity between hal10.txt and bwa248.txt is 0
Similarity between hal10.txt and catchmeifyoucan.txt is 318
Similarity between hal10.txt and ckh80.txt is 0
Similarity between hal10.txt and ecu201.txt is 0
Similarity between hal10.txt and edo14.txt is 0
Similarity between hal10.txt and edo20.txt is 0
Similarity between hal10.txt and edo26.txt is 0
Similarity between hal10.txt and ehc229.txt is 0
Similarity between hal10.txt and erk185.txt is 0
Similarity between hal10.txt and esv254.txt is 0
Similarity between hal10.txt and hal10.txt is 0
Similarity between hal10.txt and hte42.txt is 0
Similarity between hal10.txt and jrf1109.txt is 0
Similarity between hal10.txt and prz100.txt is 0
Similarity between hal10.txt and sra107.txt is 0
Similarity between hal10.txt and sra119.txt is 0
Similarity between hal10.txt and sra126.txt is 0
Similarity between hal10.txt and sra31.txt is 0
Similarity between hal10.txt and sra42.txt is 0
Similarity between hal10.txt and tyc12.txt is 0
----------------------------------------------
Similarity between hte42.txt and abf0704.txt is 0
Similarity between hte42.txt and abf70402.txt is 0
Similarity between hte42.txt and bef1121.txt is 0
Similarity between hte42.txt and bgt221.txt is 0
Similarity between hte42.txt and bmu5.txt is 0
Similarity between hte42.txt and bwa248.txt is 0
Similarity between hte42.txt and catchmeifyoucan.txt is 0
Similarity between hte42.txt and ckh80.txt is 0
Similarity between hte42.txt and ecu201.txt is 0
Similarity between hte42.txt and edo14.txt is 0
Similarity between hte42.txt and edo20.txt is 0
Similarity between hte42.txt and edo26.txt is 0
Similarity between hte42.txt and ehc229.txt is 0
Similarity between hte42.txt and erk185.txt is 0
Similarity between hte42.txt and esv254.txt is 0
Similarity between hte42.txt and hal10.txt is 0
Similarity between hte42.txt and hte42.txt is 0
Similarity between hte42.txt and jrf1109.txt is 0
Similarity between hte42.txt and prz100.txt is 0
Similarity between hte42.txt and sra107.txt is 0
Similarity between hte42.txt and sra119.txt is 0
Similarity between hte42.txt and sra126.txt is 0
Similarity between hte42.txt and sra31.txt is 0
Similarity between hte42.txt and sra42.txt is 0
Similarity between hte42.txt and tyc12.txt is 0
----------------------------------------------
Similarity between jrf1109.txt and abf0704.txt is 0
Similarity between jrf1109.txt and abf70402.txt is 0
Similarity between jrf1109.txt and bef1121.txt is 0
Similarity between jrf1109.txt and bgt221.txt is 0
Similarity between jrf1109.txt and bmu5.txt is 0
Similarity between jrf1109.txt and bwa248.txt is 0
Similarity between jrf1109.txt and catchmeifyoucan.txt is 0
Similarity between jrf1109.txt and ckh80.txt is 0
Similarity between jrf1109.txt and ecu201.txt is 0
Similarity between jrf1109.txt and edo14.txt is 0
Similarity between jrf1109.txt and edo20.txt is 0
Similarity between jrf1109.txt and edo26.txt is 0
Similarity between jrf1109.txt and ehc229.txt is 0
Similarity between jrf1109.txt and erk185.txt is 0
Similarity between jrf1109.txt and esv254.txt is 0
Similarity between jrf1109.txt and hal10.txt is 0
Similarity between jrf1109.txt and hte42.txt is 0
Similarity between jrf1109.txt and jrf1109.txt is 0
Similarity between jrf1109.txt and prz100.txt is 0
Similarity between jrf1109.txt and sra107.txt is 0
Similarity between jrf1109.txt and sra119.txt is 0
Similarity between jrf1109.txt and sra126.txt is 0
Similarity between jrf1109.txt and sra31.txt is 1499
Similarity between jrf1109.txt and sra42.txt is 0
Similarity between jrf1109.txt and tyc12.txt is 0
----------------------------------------------
Similarity between prz100.txt and abf0704.txt is 0
Similarity between prz100.txt and abf70402.txt is 0
Similarity between prz100.txt and bef1121.txt is 0
Similarity between prz100.txt and bgt221.txt is 0
Similarity between prz100.txt and bmu5.txt is 0
Similarity between prz100.txt and bwa248.txt is 0
Similarity between prz100.txt and catchmeifyoucan.txt is 0
Similarity between prz100.txt and ckh80.txt is 0
Similarity between prz100.txt and ecu201.txt is 0
Similarity between prz100.txt and edo14.txt is 0
Similarity between prz100.txt and edo20.txt is 0
Similarity between prz100.txt and edo26.txt is 0
Similarity between prz100.txt and ehc229.txt is 0
Similarity between prz100.txt and erk185.txt is 0
Similarity between prz100.txt and esv254.txt is 0
Similarity between prz100.txt and hal10.txt is 0
Similarity between prz100.txt and hte42.txt is 0
Similarity between prz100.txt and jrf1109.txt is 0
Similarity between prz100.txt and prz100.txt is 0
Similarity between prz100.txt and sra107.txt is 0
Similarity between prz100.txt and sra119.txt is 0
Similarity between prz100.txt and sra126.txt is 0
Similarity between prz100.txt and sra31.txt is 0
Similarity between prz100.txt and sra42.txt is 0
Similarity between prz100.txt and tyc12.txt is 0
----------------------------------------------
Similarity between sra107.txt and abf0704.txt is 0
Similarity between sra107.txt and abf70402.txt is 0
Similarity between sra107.txt and bef1121.txt is 0
Similarity between sra107.txt and bgt221.txt is 0
Similarity between sra107.txt and bmu5.txt is 0
Similarity between sra107.txt and bwa248.txt is 0
Similarity between sra107.txt and catchmeifyoucan.txt is 0
Similarity between sra107.txt and ckh80.txt is 0
Similarity between sra107.txt and ecu201.txt is 0
Similarity between sra107.txt and edo14.txt is 0
Similarity between sra107.txt and edo20.txt is 0
Similarity between sra107.txt and edo26.txt is 0
Similarity between sra107.txt and ehc229.txt is 0
Similarity between sra107.txt and erk185.txt is 0
Similarity between sra107.txt and esv254.txt is 0
Similarity between sra107.txt and hal10.txt is 0
Similarity between sra107.txt and hte42.txt is 0
Similarity between sra107.txt and jrf1109.txt is 0
Similarity between sra107.txt and prz100.txt is 0
Similarity between sra107.txt and sra107.txt is 0
Similarity between sra107.txt and sra119.txt is 0
Similarity between sra107.txt and sra126.txt is 0
Similarity between sra107.txt and sra31.txt is 0
Similarity between sra107.txt and sra42.txt is 0
Similarity between sra107.txt and tyc12.txt is 0
----------------------------------------------
Similarity between sra119.txt and abf0704.txt is 0
Similarity between sra119.txt and abf70402.txt is 0
Similarity between sra119.txt and bef1121.txt is 0
Similarity between sra119.txt and bgt221.txt is 0
Similarity between sra119.txt and bmu5.txt is 0
Similarity between sra119.txt and bwa248.txt is 0
Similarity between sra119.txt and catchmeifyoucan.txt is 0
Similarity between sra119.txt and ckh80.txt is 0
Similarity between sra119.txt and ecu201.txt is 0
Similarity between sra119.txt and edo14.txt is 0
Similarity between sra119.txt and edo20.txt is 0
Similarity between sra119.txt and edo26.txt is 0
Similarity between sra119.txt and ehc229.txt is 0
Similarity between sra119.txt and erk185.txt is 0
Similarity between sra119.txt and esv254.txt is 0
Similarity between sra119.txt and hal10.txt is 0
Similarity between sra119.txt and hte42.txt is 0
Similarity between sra119.txt and jrf1109.txt is 0
Similarity between sra119.txt and prz100.txt is 0
Similarity between sra119.txt and sra107.txt is 0
Similarity between sra119.txt and sra119.txt is 0
Similarity between sra119.txt and sra126.txt is 0
Similarity between sra119.txt and sra31.txt is 0
Similarity between sra119.txt and sra42.txt is 0
Similarity between sra119.txt and tyc12.txt is 0
----------------------------------------------
Similarity between sra126.txt and abf0704.txt is 0
Similarity between sra126.txt and abf70402.txt is 0
Similarity between sra126.txt and bef1121.txt is 0
Similarity between sra126.txt and bgt221.txt is 0
Similarity between sra126.txt and bmu5.txt is 0
Similarity between sra126.txt and bwa248.txt is 0
Similarity between sra126.txt and catchmeifyoucan.txt is 0
Similarity between sra126.txt and ckh80.txt is 0
Similarity between sra126.txt and ecu201.txt is 0
Similarity between sra126.txt and edo14.txt is 0
Similarity between sra126.txt and edo20.txt is 0
Similarity between sra126.txt and edo26.txt is 0
Similarity between sra126.txt and ehc229.txt is 0
Similarity between sra126.txt and erk185.txt is 0
Similarity between sra126.txt and esv254.txt is 0
Similarity between sra126.txt and hal10.txt is 0
Similarity between sra126.txt and hte42.txt is 0
Similarity between sra126.txt and jrf1109.txt is 0
Similarity between sra126.txt and prz100.txt is 0
Similarity between sra126.txt and sra107.txt is 0
Similarity between sra126.txt and sra119.txt is 0
Similarity between sra126.txt and sra126.txt is 0
Similarity between sra126.txt and sra31.txt is 0
Similarity between sra126.txt and sra42.txt is 0
Similarity between sra126.txt and tyc12.txt is 0
----------------------------------------------
Similarity between sra31.txt and abf0704.txt is 0
Similarity between sra31.txt and abf70402.txt is 0
Similarity between sra31.txt and bef1121.txt is 0
Similarity between sra31.txt and bgt221.txt is 0
Similarity between sra31.txt and bmu5.txt is 0
Similarity between sra31.txt and bwa248.txt is 0
Similarity between sra31.txt and catchmeifyoucan.txt is 0
Similarity between sra31.txt and ckh80.txt is 0
Similarity between sra31.txt and ecu201.txt is 0
Similarity between sra31.txt and edo14.txt is 0
Similarity between sra31.txt and edo20.txt is 0
Similarity between sra31.txt and edo26.txt is 0
Similarity between sra31.txt and ehc229.txt is 0
Similarity between sra31.txt and erk185.txt is 0
Similarity between sra31.txt and esv254.txt is 0
Similarity between sra31.txt and hal10.txt is 0
Similarity between sra31.txt and hte42.txt is 0
Similarity between sra31.txt and jrf1109.txt is 1499
Similarity between sra31.txt and prz100.txt is 0
Similarity between sra31.txt and sra107.txt is 0
Similarity between sra31.txt and sra119.txt is 0
Similarity between sra31.txt and sra126.txt is 0
Similarity between sra31.txt and sra31.txt is 0
Similarity between sra31.txt and sra42.txt is 0
Similarity between sra31.txt and tyc12.txt is 0
----------------------------------------------
Similarity between sra42.txt and abf0704.txt is 0
Similarity between sra42.txt and abf70402.txt is 0
Similarity between sra42.txt and bef1121.txt is 0
Similarity between sra42.txt and bgt221.txt is 0
Similarity between sra42.txt and bmu5.txt is 0
Similarity between sra42.txt and bwa248.txt is 0
Similarity between sra42.txt and catchmeifyoucan.txt is 0
Similarity between sra42.txt and ckh80.txt is 0
Similarity between sra42.txt and ecu201.txt is 0
Similarity between sra42.txt and edo14.txt is 0
Similarity between sra42.txt and edo20.txt is 0
Similarity between sra42.txt and edo26.txt is 0
Similarity between sra42.txt and ehc229.txt is 0
Similarity between sra42.txt and erk185.txt is 0
Similarity between sra42.txt and esv254.txt is 0
Similarity between sra42.txt and hal10.txt is 0
Similarity between sra42.txt and hte42.txt is 0
Similarity between sra42.txt and jrf1109.txt is 0
Similarity between sra42.txt and prz100.txt is 0
Similarity between sra42.txt and sra107.txt is 0
Similarity between sra42.txt and sra119.txt is 0
Similarity between sra42.txt and sra126.txt is 0
Similarity between sra42.txt and sra31.txt is 0
Similarity between sra42.txt and sra42.txt is 0
Similarity between sra42.txt and tyc12.txt is 0
----------------------------------------------
Similarity between tyc12.txt and abf0704.txt is 0
Similarity between tyc12.txt and abf70402.txt is 0
Similarity between tyc12.txt and bef1121.txt is 0
Similarity between tyc12.txt and bgt221.txt is 0
Similarity between tyc12.txt and bmu5.txt is 0
Similarity between tyc12.txt and bwa248.txt is 0
Similarity between tyc12.txt and catchmeifyoucan.txt is 453
Similarity between tyc12.txt and ckh80.txt is 0
Similarity between tyc12.txt and ecu201.txt is 0
Similarity between tyc12.txt and edo14.txt is 0
Similarity between tyc12.txt and edo20.txt is 0
Similarity between tyc12.txt and edo26.txt is 0
Similarity between tyc12.txt and ehc229.txt is 0
Similarity between tyc12.txt and erk185.txt is 0
Similarity between tyc12.txt and esv254.txt is 0
Similarity between tyc12.txt and hal10.txt is 0
Similarity between tyc12.txt and hte42.txt is 0
Similarity between tyc12.txt and jrf1109.txt is 0
Similarity between tyc12.txt and prz100.txt is 0
Similarity between tyc12.txt and sra107.txt is 0
Similarity between tyc12.txt and sra119.txt is 0
Similarity between tyc12.txt and sra126.txt is 0
Similarity between tyc12.txt and sra31.txt is 0
Similarity between tyc12.txt and sra42.txt is 0
Similarity between tyc12.txt and tyc12.txt is 0





                 Unorthodox Sets
----------------------------------------------

  Graph of the Similarites for source abf0704.txt is: 
------------------------------------------------- 
According to NODE abf0704.txt edges are
---->Similarity of abf0704.txt and abf70402.txt is 536
---->Similarity of abf0704.txt and edo26.txt is 471
According to NODE abf70402.txt edges are
---->Similarity of abf70402.txt and abf0704.txt is 536
---->Similarity of abf70402.txt and edo26.txt is 145
According to NODE edo26.txt edges are
---->Similarity of edo26.txt and abf0704.txt is 471
---->Similarity of edo26.txt and abf70402.txt is 145

  Graph of the Similarites for source bef1121.txt is: 
------------------------------------------------- 
According to NODE bef1121.txt edges are
---->Similarity of bef1121.txt and edo14.txt is 342
According to NODE edo14.txt edges are
---->Similarity of edo14.txt and bef1121.txt is 342

  Graph of the Similarites for source catchmeifyoucan.txt is: 
------------------------------------------------- 
According to NODE catchmeifyoucan.txt edges are
---->Similarity of catchmeifyoucan.txt and ecu201.txt is 286
---->Similarity of catchmeifyoucan.txt and hal10.txt is 318
---->Similarity of catchmeifyoucan.txt and tyc12.txt is 453
According to NODE ecu201.txt edges are
---->Similarity of ecu201.txt and catchmeifyoucan.txt is 286
According to NODE hal10.txt edges are
---->Similarity of hal10.txt and catchmeifyoucan.txt is 318
According to NODE tyc12.txt edges are
---->Similarity of tyc12.txt and catchmeifyoucan.txt is 453

  Graph of the Similarites for source jrf1109.txt is: 
------------------------------------------------- 
According to NODE jrf1109.txt edges are
---->Similarity of jrf1109.txt and sra31.txt is 1499
According to NODE sra31.txt edges are
---->Similarity of sra31.txt and jrf1109.txt is 1499
----------------------------------------------
Total RUNTIME:21.122seconds

 ===============================================================================
 
 
 
 
