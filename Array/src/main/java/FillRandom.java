import java.util.Random;

public class FillRandom {
    public static void  random1(int [] arr2, int n){
        Random r = new Random();
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = r.nextInt(n);
        }
    }
}
