public class Find {
    public static int search(int[] arr3, int key) {
        int index = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] == key){
                index += i;
                break;
            }
        }
        return index;
    }
}
