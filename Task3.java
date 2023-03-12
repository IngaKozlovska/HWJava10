package Lesson10.HW;

public class Task3 {
    //Напишите метод, который в качестве входящего параметра принимает строку и выводит
    // данную строку в консоль, но со словами, отображёнными в обратном порядке.
    //      Пример:
    //Входная строка - "I like Java"
    //Вывод в консоль - "I ekil avaJ"
    public static void main(String[] args) {


        StringBuilder s1 = new StringBuilder("I like Java");
        char[] array = {'I'};
        System.out.print(array);
       char[] array1 = {'l', 'i', 'k', 'e'};
       for (int i = array1.length-1; i >=0; i--){
           System.out.print(array1[i]);
           String string = new String (array1);
       }
       char[] array2 = {'J', 'a', 'v', 'a'};
       for (int i2 = array2.length-1; i2 >= 0; i2--){
            System.out.print(array2[i2]);






    }}


}
