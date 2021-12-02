import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Array1 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        while(true){
            System.out.println("If you want to continue, enter 1 -->");
            int x = in.nextInt();
            if(x != 1){
                System.out.println("Thanks, bye!");
                break;
            }
            else{
                System.out.println("""
                        Tasks
                        1 - Task#1(Min and Max)
                        2 - Task#2(Random)
                        3 - Task#3(Index)
                        4 - Task#4(Sort1)
                        5 - Task#5(Sort2)""");
                int flag = in.nextInt();
                switch (flag){
                    case 1 ->{
                        System.out.println("Enter the size of array:");
                        int [] arr1 = {23,45,46,2,23,24,29};
                        System.out.println("Min: " + MInMax.min(arr1));
                        System.out.println("Max: " + MInMax.max(arr1));
                    }
                    case 2 ->{
                        int size1 = in.nextInt();
                        int [] arr2 = new int [size1];
                        FillRandom.random1(arr2, 10);
                        System.out.println(Arrays.toString(arr2));

                    }
                    case 3 ->{
                        int [] arr3 = {23,34,12,31,312,31,23};
                        System.out.println(Find.search(arr3, 12));
                    }
                    case 4 ->{
                        System.out.println("Size of array: ");
                        int q = in.nextInt();
                        int [] arr3 = new int[q];
                        for (int i = 0, j = 1; i < arr3.length; i++, j++) {
                            arr3[i] = j;
                        }
                        for (int i = arr3.length - 1; i >= 0 ; i--) {
                            System.out.println(arr3[i] + " ");
                        }
                        Arrays.sort(arr3);
                        System.out.println(Arrays.toString(arr3));


                    }
                    case 5 ->{
                        System.out.println("Size of array: ");
                        int w = in.nextInt();
                        Integer [] arr4 = new Integer[w];
                        for (int i = 0, j = 23; i < arr4.length; i++, j++) {
                            arr4[i] = j;
                        }
                        /*for (int i = 0; i < arr4.length; i++) {
                            System.out.println(arr4[i] + " ");
                        }*/
                        Arrays.sort(arr4, Collections.reverseOrder());
                        System.out.println(Arrays.toString(arr4));
                    }
                }
            }
        }
    }


}
