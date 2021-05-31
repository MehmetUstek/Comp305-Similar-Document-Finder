package similarity_findercheck;

import java.util.*;
import java.io.*;

class txtVertice  {
  
	
public String nameoftxt;	
  public String txt; 
  private int id;  
  public int u_id;
  public  txtVertice[] u_group;
  public int counter=0;
public txtVertice(){
}

public int getId() {
return id;	
}

public void setNameofTxt(String name) {
nameoftxt=name;
}


public void addU_group(txtVertice toAdd) {
u_group[counter]= toAdd;	
counter++;
}


public void setU_group(int n) {
u_group= new txtVertice[n];	
}


public void setId(int weight){
this.id=weight;

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