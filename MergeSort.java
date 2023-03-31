public class MergeSort{

    public static int[] merge(int[] left, int[] right){
        int[] merged = new int[left.length + right.length]; 
        int leftCount = 0;
        int rightCount = 0;
        int curIn = 0;
        while (rightCount < right.length && leftCount < left.length) {
            if (left[leftCount] >= right[rightCount]){
                merged[curIn++] = right[rightCount];
                rightCount++;
            }
            else if (right[rightCount] > left[leftCount]){
                merged[curIn++] = left[leftCount];
                leftCount++;
            }
        }
        if (rightCount == right.length){
            for(int i = leftCount; leftCount < left.length;leftCount++)
                merged[curIn++] = left[leftCount];
        }
        if (leftCount == left.length) {
            for(int i = rightCount; rightCount < right.length;rightCount++)
                merged[curIn++] = right[rightCount];
        }
        return merged;
    }

    public static int[] MergeSort(int[] data){
        if (data.length > 1){
            int[] left = new int[data.length/2];
            int[] right = new int[data.length-left.length];
            for(int i = 0; i < left.length; i++) {
                left[i] = data[i];
            }
            for(int j = 0; j < right.length; j++)
                right[j] = data[j + left.length];
            int[] L = MergeSort(left);
            int[] R = MergeSort(right);
            return merge(L,R);
        }
        else {
            return data;
        }
    }
}
