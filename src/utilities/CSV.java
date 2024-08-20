package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {

    //This function will read data from a CSv file and return as a list
    public static List<String[]> read(String file) {
        List<String[]> data = new LinkedList<String[]>();
        String dataRow;


       try{
           BufferedReader bufRead = new BufferedReader(new FileReader(file));
           while((dataRow = bufRead.readLine()) != null){
               String[] dataRecords = dataRow.split(",");
               data.add(dataRecords);
           }
       } catch (FileNotFoundException e){
           System.out.println("File not found!");
        } catch(IOException e){
           System.out.println("File unreadable!");
       }
       return data;
    }
}
