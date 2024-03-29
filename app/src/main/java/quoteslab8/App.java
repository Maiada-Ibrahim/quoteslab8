/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quoteslab8;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {


    public static void main(String[] args) throws IOException {
        Gson gson=new Gson();
        Reader reader = Files.newBufferedReader(Paths.get("app/src/main/resources/data.json"));
        BufferedReader readFromArray =new BufferedReader(reader);

        Quotes[] convertArray = gson.fromJson(readFromArray, Quotes[].class);
        int radnomQuote = (int)(Math.random()*(convertArray.length-1));
        System.out.println("Name of Author: "+convertArray[radnomQuote].getAuthor());
        System.out.println("The Quote : " + convertArray[radnomQuote].getText());
//        System.out.println("Quote number : " + radnomQuote);

    }}
