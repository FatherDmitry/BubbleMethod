import java.util.Scanner; //Библиотека для работы scanner

public class Main
{
    public static void bubbleSortAscending(int[] array)
    {
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - 1 - i; j++)
            {
                if (array[j] > array[j + 1])
                {
                    // Меняем местами элементы, если они в неправильном порядке
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Метод для сортировки массива по убыванию
    public static void bubbleSortDescending(int[] array)
    {
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - 1 - i; j++)
            {
                if (array[j] < array[j + 1])
                {
                    // Меняем местами элементы, если они в неверном порядке
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    ////////////////////////////////////////////////////////////////////
    // Метод для вывода массива на экран
    public static void printArray(int[] array)
    {
        for (int num : array)
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Запрос на ввод размера массива
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        // Объявляем массив указанного размера
        int[] array = new int[size];

        // Заполнение массива пользователем
        System.out.println("Введите " + size + " целых чисел:");
        for (int i = 0; i < size; i++)
        {
            array[i] = scanner.nextInt();
        }

        bubbleSortAscending(array);
        System.out.print("Отсортированный массив (по возрастанию): ");
        printArray(array);

        bubbleSortDescending(array);
        System.out.print("Отсортированный массив (по убыванию): ");
        printArray(array);
    }
}