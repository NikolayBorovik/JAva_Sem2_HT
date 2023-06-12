package Java_Seminar2.Java_Sem2_HomeTasks;

import java.io.FileWriter;
import java.util.Arrays;

public class Java_sem2_HT2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите 
        // в лог-файл.
        // 1 3 4 2
        // 1 3 2 4
        // 1 2 3 4

        try {
            FileWriter file = new FileWriter("file.txt", false);
            int[]arr = {3,4,2,1};
            for (int i = 0; i < arr.length-1; i++) {
                for (int j = 0; j < arr.length-1; j++) {
                    if (arr[j] > arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        file.write("");
                }
            }
        }
        System.out.println(Arrays.toString(arr));
            writer.close();

        }
        catch (Exception e) {
            System.out.println("Smth went wrong!");
        }
        
        

    }
}
