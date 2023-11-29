public class Main {
    public static void main(String[] args) {


        System.out.println( "Задача №1");

        for ( int i = 1; i <= 10; i ++){
            System.out.println(i);
        }

        System.out.println( "Задача №2");

        for ( int i = 10; i > 0; i --){
            System.out.println(i);
        }

        System.out.println( "Задача №3");

        for (int i = 0; i < 17; i = i + 2){
            System.out.println(i);
        }

        System.out.println( "Задача №4");

        for (int i = 10; i >= -10; i --){
            System.out.println( i);
        }

        System.out.println( "Задача №5");

        for (int year = 1904; year < 2096; year = year + 4){
            System.out.println(year + " Год является високосным ");
        }

        System.out.println( "Задача №6");


        for (int i = 7; i <= 98; i = i +7){
            System.out.println(i);
        }

        System.out.println( "Задача №7");

        for (int i = 1; i <= 512; i = i * 2){
            System.out.println(i);
        }

        System.out.println( "Задача №8 + задача №9");

        int monthSalary = 29000;
        int total = 0;
        for (int i = 0; i < 12; i ++){
            total = total + total / 100;
            total = total + monthSalary;

            System.out.println("Месяц " + i + " Сумма накоплений равна " + total );
        }

        System.out.println( "Задача №10");

        int n = 2;

        for (int i = 1; i <= 10; i ++){


            System.out.println( n + "*" + i + " =" + i * n );
        }





















    }
}