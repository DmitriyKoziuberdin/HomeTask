public class MInMax {
    public static int min(int [] arr1){
        int x = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (x > arr1[i]){
                x = arr1[i];
            }
        }
        return x;
    }

    public static int max(int [] arr1){
        int x = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (x < arr1[i]){
                x = arr1[i];
            }
        }
        return x;
    }
}
