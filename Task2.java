
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;


public class Task2 {
    // Реализуйте алгоритм сортировки пузырьком числового массива, 
    // результат после каждой итерации запишите в лог-файл.
    public static void main(String[] args) throws IOException{
        java.util.logging.Logger log = java.util.logging.Logger.getLogger(Task2.class.getName());
        log.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("log.txt");
        log.addHandler(fh);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);
        int[] array = {8, 12, 24, 15, 0, 6};
        int temp;
        for (int i = array.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                } 
            } 
            String res = Arrays.toString(array);
            log.info(res);
            }
        }
    }

