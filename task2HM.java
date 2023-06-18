import java.io.FileWriter;

public class task2HM {
    public static void main(String[] args) {
        // 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат
        // после каждой итерации запишите в лог-файл.
        // 1 3 4 2
        // 1 3 2 4
        // 1 2 3 4
        try {
            FileWriter writer = new FileWriter("file.txt", true);

            int[] array = new int[] { 5, 8, 9, 1, 4 };
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int tmp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = tmp;
                        for (int k = 0; k < array.length; k++) {
                            writer.write(array[k] + " ");
                        }
                        writer.write("\n");
                    }
                }
            }
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
            writer.close();
        } catch (Exception e) {
            System.out.println("Что то пошло не так!");
        }
    }
}
