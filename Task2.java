package Lesson10.HW;

public class Task2 {
    //Дан массив символов, объедините его в строку и замените символ '?' на правильный символ, выведите результат на консоль.
    //char[] arr = {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};
    //Попытайтесь решить данное задание двумя разными способами.
    public static void main(String[] args) {
        char[] arr = {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};

        String string = new String(arr);
        System.out.println(string.replace("?", "e"));
        System.out.println();

String string1 = String.copyValueOf(arr);
        System.out.println(string.replace("?", "e"));





    }
}
