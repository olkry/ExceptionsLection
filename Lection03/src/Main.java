import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        FileReader file = null;
//        try {
//            file = new FileReader("C:\\learning\\09. Exeption\\ExceptionsLection\\README.md");
////            file.read();
//        } catch (RuntimeException | IOException e) {
//            System.out.println("catch exception: " + e.getClass().getSimpleName());
//        } finally {
//            System.out.println("finally start");
//            if (file != null) {
//                try {
//                    file.close();
//                } catch (IOException e) {
//                    System.out.println("exception while closed");
//                }
//            }
//            System.out.println("finally finished");
//        }
        // Модернизация с try with resorses
        try (
                FileReader reader = new FileReader("C:/learning/09. Exeption/ExceptionsLection/test.txt");
                FileWriter writer = new FileWriter("testwrite")
        ) {
            while (reader.ready()){
                writer.write(reader.read());
            }
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        }
        System.out.println("Copy successfully");
    }
}