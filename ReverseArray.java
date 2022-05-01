public class ReverseArray {
    public static void reverseArray(int[] input, int index1, int index2) {
        int[] reversed = new int[index2 - index1 + 1];
        int index = 0;
        for (int i = index2; i >= index1; i--) {
            reversed[index] = input[i];
            index++;
        }
        index = 0;
        for (int i = index1; i <= index2; i++) {
            input[i] = reversed[index];
            index++;
        }
    }
}
