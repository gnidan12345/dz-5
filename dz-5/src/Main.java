public class Main {
    public static void main(String[] args) {

        int a = 3;
        int b = 5;
        int c = 1;
        int d = 4;

        int sumA = a + b;

        int sumB = c + d;


         System.out.println(sumA > sumB ? "true": "false");


        sumA++;
        sumB = sumB - 2;

         System.out.println(sumA > sumB ? "true": "false");


        int o1 = sumA%2;

        int o2 = sumB%2;


        System.out.println(o1 == 0 || o2 == 0 ? "true": "false");

    }


    }
