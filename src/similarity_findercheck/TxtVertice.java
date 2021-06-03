package similarity_findercheck;

import java.util.*;
import java.io.*;

class txtVertice  {
  
	
public String nameoftxt;	
  public String txt; 
   
  
  
public txtVertice(){
}



public void setNameofTxt(String name) {
nameoftxt=name;
}




public void setTxt(String txt )throws FileNotFoundException{
  
	String txt_ = (System.getProperty("user.dir")+"/here/"+txt);
	
	BufferedReader br = new BufferedReader(new FileReader(txt_));
try {
    StringBuilder sb = new StringBuilder();
    String line = br.readLine();

    while (line != null) {
        sb.append(line);
        sb.append(System.lineSeparator());
        line = br.readLine();

    }
    String everything = sb.toString();
this.txt= everything;
  br.close();

}catch (IOException e) {
    System.out.println("Can't read a"); // Or something more intellegent
}





}
}