import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {

        int sum = 0;
        int count = 0;
        int a, b;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк массива: ");
        a = in.nextInt();

        System.out.print("Введите количество столбцов массива: ");
        b = in.nextInt();


        int[][] arr = new int[a][b];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Введите элемент arr[" + i + "][" + j + "]:");
                arr[i][j] = in.nextInt();
            }
        }
        in.close();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");

                sum += arr[i][j];
                count++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        int x=arr.length;
        int s=0;
        int Str1=0;
        int Str2=0;
        while(s<x){
            for (int i=0;i<x;i++){
                Str1+=arr[s][i];
                if (Str2 == 0){
                    Str2=arr[s][i];
                }
                else Str2=Str2*arr[s][i];
            }
            s++;
            System.out.println("Сумма элементов строки " +s+ " равна: " +Str1);
            System.out.println("Произведение элементов строки " +s+ " равна: " +Str2);
            Str1=0;
            Str2=0;
            }
            s++;

        }
    }

/*
        for (int i = 0; i < x; i++) {
            Str2 += arr[1][i];
            if (Str2_1 == 0){
                Str2_1=arr[1][i];
            }
            else Str2_1=Str2_1*arr[1][i];
        }
        System.out.println();

        System.out.println(Str1+"\t"+Str1_1+"\n"+Str2+"\t"+Str2_1+"\n");



            System.out.println("Сумма элементов - "+sum +"  "+ "Количество элементов - " + count);
        }
    }

 */