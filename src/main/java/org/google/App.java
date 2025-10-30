package org.google;

import java.io.*;
import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        File f = new File("demo.txt");
//        try {
//
//            if(f.createNewFile()){
//                System.out.println(f.getAbsolutePath());
//            }
//            else{
//                System.out.println("already exist" + f.getAbsolutePath());
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        try {
//            FileWriter fw = new FileWriter("demo.txt");
//            fw.write("hello hi how are you");
//            System.out.println("Successfully wrote the text in file");
//            fw.close();
//        }
//        catch (IOException e) {
//            System.out.println("Error has occurred");
//            e.printStackTrace();
//        }
//
//        try {
//            FileWriter fw = new FileWriter("demo.txt", true);
//            fw.write("al alaakalkaaka ");
//            System.out.println("Successfully wrote the text in file");
//            fw.close();
//        }
//        catch (IOException e) {
//            System.out.println("Error has occurred");
//            e.printStackTrace();
//        }
//
//        try (FileReader fr = new FileReader("demo.txt")) {
//            char[] buffer = new char[100];
//            int charsRead;
//            while ((charsRead = fr.read(buffer)) != -1) {
//                System.out.print(new String(buffer, 0, charsRead));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        
//        try (FileReader fr = new FileReader("demo.txt")) {
//            char[] buffer = new char[100];
//            fr.read(buffer);
//            for(char c : buffer){
//                System.out.print(c);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try(FileReader fr = new FileReader("demo.txt")){
//            BufferedReader br = new BufferedReader(fr);
//            br.mark(7);
//            String s;
//            while((s = br.readLine()) != null){
//                System.out.println(s);
//            }
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }

//        try{
//            Scanner sc = new Scanner(System.in);
//            String fileName = sc.nextLine();
//
//            File file = new File( fileName);
//            if(file.createNewFile()){
//                System.out.println("New file has been created");
//            }
//            System.out.println("file path : " + file.getAbsolutePath());
//        }
//        catch(IOException e){
//            System.out.println(e.getMessage());
//        }
    }
}
