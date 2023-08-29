import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        try{
            File file = new File("путь к файлу");
            Scanner sc = new Scanner(file);
            String str = sc.nextLine();
            double res = 0;
            String[] str1 = str.split(" ");
            double a = Double.parseDouble(str1[0]);
            double b = Double.parseDouble(str1[2]);
            if (str1[1].equals("/") && str1[2].equals("0")){
                throw new Exception("Error! Division by zero");
            }
            if (!str1[1].equals("+") && !str1[1].equals("-") && !str1[1].equals("*") && !str1[1].equals("/")){
                throw new Exception("Operation Error!");
            } else {
                String op = str1[1];
                if (op.equals("+")){
                    res = a + b;
                }
                if (op.equals("-")){
                    res = a - b;
                }
                if (op.equals("*")){
                    res = a * b;
                }
                if (op.equals("/")){
                    res = a / b;
                }
            }
            System.out.println(res);
        }
        catch (NumberFormatException nf){
            System.out.println("Error! Not number");
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
