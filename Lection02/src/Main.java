import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        !NullPointerException - у переменной нет данных
//        String name = null;
//        System.out.println(name.length());

//        !ClassCastException - невозможно преобразовать формат
//        Object object = new String("123");
//        File file = (File) object;
//        System.out.println(file);

//        !NumberFormatException - неверный вормат
//        String string = "123qwe";
//        int result = Integer.parseInt(string);
//        System.out.println(result);

//        !UnsupportedOperationException - add ту поддерживается в неизменяемых листах
//        List<Object> emptyList = Collections.emptyList();
//        emptyList.add(new Object());


////        !!!Обработка ArithmeticException - деление на ноль
//        int num = 1;
//        try {
//            num = 10/1;
//        } catch (ArithmeticException e){
//            System.out.println("operation divide by zero not supported");
//        }
//        System.out.println(num);

////        2 or more Exception
//        int num = 1;
//        try {
//            num = 10/1;
//            String test = null;
////            System.out.println(test.length());
//            Collections.emptyList().add(new Object());
//        } catch (ArithmeticException e){
//            System.out.println("operation divide by zero not supported");
//        } catch (NullPointerException e){
//            System.out.println("NullPointer exception");
//        } catch (Exception e){
//            System.out.println("eny exceptions");
//        }
//        System.out.println(num);

//        FileReader всегда заставляет сделать проверку на исключения
//        Можно перечислить блок исключений через |
//        Блок finally после трай\кетч выполнится всегда, в любом случае,
//        в данном случае закроет чтение файла
        FileReader file = null;
        try {
            file = new FileReader("C:\\learning\\09. Exeption\\ExceptionsLection\\README.md");
//            file.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        } finally {
            System.out.println("finally start");
            if (file != null){
                try {
                    file.close();
                } catch (IOException e) {
                    System.out.println("exception while closed");
                }
            }
            System.out.println("finally finished");
        }

    }
}