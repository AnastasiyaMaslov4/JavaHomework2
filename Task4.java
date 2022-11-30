
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class Task4 {
    public static void main(String[] args) throws IOException{
        java.util.logging.Logger log = java.util.logging.Logger.getLogger(Task4.class.getName());
        log.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("calclog.txt");
        log.addHandler(fh);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = iScanner.nextInt();
        System.out.println(" ");
        System.out.print("Введите операцию(+ - * /): ");
        String operand = iScanner.next();
        System.out.println(" ");
        System.out.print("Введите второе число: ");
        int b = iScanner.nextInt();
        iScanner.close();
        if (operand.equals("+")) {
            Sum(a, b);
            int res = Sum(a,b);
            log.info(a + "+" + b + "="+res);
        }
        else if(operand.equals("-")) {
            Min(a, b);
            int res = Min(a,b);
            log.info(a + "-" + b + "="+res);
        }
        else if(operand.equals("*")) {
            Mul(a, b);
            int res = Mul(a,b);
            log.info(a + "*" + b + "="+res);
        }
        else if(operand.equals("/")) {
            Div(a, b);
            int res = Div(a,b);
            log.info(a + "/" + b + "="+res);
        }
        else {
            System.out.print("Операнда не распознана, попробуйте еще раз.");
            log.info("Операнда не распознана, попробуйте еще раз.");
        }
    }

    public static int Sum(int a, int b) {
        int res = a + b;
        System.out.println(" ");
        System.out.println("Результат: " + res);
        return res;
    }

    public static int Min(int a, int b) {
        int res = a - b;
        System.out.println(" ");
        System.out.println("Результат: " + res);
        return res;
    }

    public static int Mul(int a, int b) {
        int res = a * b;
        System.out.println(" ");
        System.out.println("Результат: " + res);
        return res;
    }

    public static int Div(int a, int b) {
        int res = a / b;
        System.out.println(" ");
        System.out.println("Результат: " + res);
        return res;
    }
}

