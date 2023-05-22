package JavaLanguage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static String readFileContent(String fileName){

        StringBuilder sb = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = reader.readLine()) != null){
                sb.append(line).append("\n");
            }
        } catch (IOException e){
            System.err.println("Error reading this file: " + e.getMessage());
        }

        return sb.toString();


    }

}
