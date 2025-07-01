package code_challenges_100_days;

import java.io.*;

//copy contents from one file to another using BufferedReader and BufferedWriter.
public class day_57 {
    public static void main(String[] args) {
//        source and destination file name
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try{
//            initialize reader and writer
            reader = new BufferedReader(new FileReader(sourceFile));
            writer = new BufferedWriter(new FileWriter(destinationFile));
            String line;
//            read each line from source and write to destination
            while ((line =reader.readLine())!=null){
                writer.write(line);
                writer.newLine();
            }
            System.out.println("file copied successfully.");
        }catch (IOException e){
            System.out.println("An error occurred: "+e.getMessage());
        }finally {
            try{
                if (reader!= null) 
                    reader.close();
                if (writer !=null)
                    writer.close();
            }catch (IOException e){
                System.out.println("Error closing files ."+ e.getMessage());
            }
        }
    }
}
