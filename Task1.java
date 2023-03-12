package Lesson10.HW;

public class Task1 {
    //Напишите метод, который принимает две строки в качестве входящих параметров,
    //объединяет их друг с другом и результат выводит в консоль в обратном порядке.

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Пушистые животные ");
        sb.append("коты");
        sb.reverse();
        System.out.println(sb);


    }
}
