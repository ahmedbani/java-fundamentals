/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {


    public static void main(String[] args) {
        System.out.println(hasErrors("/Users/macbookpro/projects/401/java-fundamentals/linter/app/src/main/resources/gates.js"));
    }
    public static String hasErrors(String path){
        Path file = Paths.get(path);
        String hasError = "";
        try {
            BufferedReader readerFile = Files.newBufferedReader(file);
            String textLine= readerFile.readLine();
            int counter = 1;
            int numOfErrors = 0;
            while (textLine != null) {
                if(textLine.isEmpty()){
                    System.out.println(textLine);
                }
                else if ((!textLine.endsWith(";")) && (!textLine.endsWith("{")) && (!textLine.endsWith("}")) && (!textLine.contains("if")) && (!textLine.contains("else"))) {
                    System.out.println("Missing Semicolon at Line: " + counter);
                    numOfErrors++;
                }
                else {
                    System.out.println(textLine);
                }

                textLine= readerFile.readLine();
                counter++;
            }

            if(numOfErrors > 0)
                hasError = "this file has "+numOfErrors+" error/s";
            else
                hasError = "this file has no errors";
        } catch (IOException err) {
            System.err.println(err);
        }
    return hasError;
    }
}
