import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        File file = new File("C://Users//misha//OneDrive//Рабочий стол//input.txt");
        Scanner sc = new Scanner(file);
        File result = new File("C://Users//misha//OneDrive//Рабочий стол//output.txt");
        FileWriter writer = new FileWriter(result);
        String str = "";
        int counter = 0;
        double res = 0;
        while (sc.hasNext()) {
            try {
                str = sc.nextLine();
                String[] str1 = str.split(" ");
                double a = Double.parseDouble(str1[0]);
                double b = Double.parseDouble(str1[2]);
                if (str1[1].equals("/") && str1[2].equals("0")) {
                    writer.write(str + " = Error! Division by zero" + "\n");
                    throw new Exception("Error! Division by zero");
                }
                if (!str1[1].equals("+") && !str1[1].equals("-") && !str1[1].equals("*") && !str1[1].equals("/")) {
                    writer.write(str + " = Operation Error!" + "\n");
                    throw new Exception("Operation Error!");
                } else {
                    String op = str1[1];
                    if (op.equals("+")) {
                        res = a + b;
                    }
                    if (op.equals("-")) {
                        res = a - b;
                    }
                    if (op.equals("*")) {
                        res = a * b;
                    }
                    if (op.equals("/")) {
                        res = a / b;
                    }
                }
                System.out.println(res);
                writer.write(str + " = " + String.valueOf(res) + "\n");
            }
        catch(NumberFormatException nf){
                System.out.println("Error! Not number");
                writer.write(str + " = Error! Not number" + "\n");
            }
        catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        sc.close();
        writer.close();
    }
}
