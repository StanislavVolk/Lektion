package Less_3;

public class less_3
{
    public static int summaArr ( int len, int initialValue)
    {
        int [] arr5 = new int[len];
        for (int i = 0; i < arr5.length; i++)
        {
            arr5[i] = initialValue;
            System.out.println("arr5[" + i + "] = " + arr5[i]);
        }

        return len;
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }


        System.out.println("**********");


        int[] arr2 = new int[100];
        for (int i = 0; i <= 99; i++)
        {
            arr2[i] = i + 1;
            System.out.println("arr2[" + i + "] = " + arr2[i]);
        }


        System.out.println("**********");


        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++)
        {
             if (arr3[i] < 6) arr3[i] *= 2;
            System.out.println("arr3[" + i + "] = " + arr3[i]);
        }

        System.out.println("**********");


        int[][] arr4 = new int[5][5];

        for (int i = 0; i < arr4.length; i++)
        {
            arr4[i][i] = 1;
            arr4[i][arr4.length - 1 - i] = 1;
        }

        for (int i = 0; i < arr4.length; i++)
        {
            for (int j = 0; j < arr4.length; j++)
            {
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("**********");


        summaArr(5, 777);


        System.out.println("ТХЕ ЕНД!!! ");

        System.out.println("**********");
    }


}
