package Less_2;

public class Less_2
{

        public static int summa(int a, int b)
        {
            int c = a + b;
            if (c >= 10 && c <= 20 ) System.out.println("true");
            else System.out.println("false");
            return a + b;
        }
        public static int summa2 (int a)
        {
            if (a >= 0) System.out.println("Положительное число.");
            else System.out.println("Отрицательное число.");
            return a;
        }
        public static int summa3(int a)
        {
            if (a < 0) System.out.println("true");
            else System.out.println("false");
            return a;
        }
        public static void printSumma(String a, int b)
        {
            for (int i = 0; i < b; i++)
            {
                System.out.println(a + "");
            }
        }
        public static boolean visocos (int a)
        {
            boolean b;
            if ((a % 4 == 0) && (a % 400 == 0 || a % 100 != 0))
            {
                b = true;
                System.out.println("true");
            }
            else
            {
                b = false;
                System.out.println("false");
            }
            return b;
        }

        public static void main(String[] args)
        {
            summa(3,2);
            summa2(-185);
            summa3(30);
            printSumma("Hello", 5);
            visocos(2056);
        }


}
