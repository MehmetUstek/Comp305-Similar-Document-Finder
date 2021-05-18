package mainPackage;
import java.io.*;

public class TxtVertice {
  public String txt; 
  public TxtVertice(){
	
}
public void setTxt(String txt )throws FileNotFoundException{
	BufferedReader br = new BufferedReader(new FileReader(txt));
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

}	catch (IOException e) {
    System.out.println("Can't read a"); // Or something more intellegent
}

}
}