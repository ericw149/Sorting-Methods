import java.lang.Math;

public class QuickSort{
  
  public static int partition(int[] data, int start, int end){
    int pivot = (int) (Math.random() * (end - start)) + start;
    if (pivot != start){
      int temp = data[pivot];
      data[pivot] = data[start];
      data[start] = temp;
      pivot = start;
      start++;
    }
    while (start != end) {
      if (data[start] > data[pivot]){
        int temp = data[start];
        data[start] = data[end];
        data[end] = temp;
        end--;
      }
      else 
        start++;
    }
    if (data[start] <= data[pivot]){
      int temp = data[pivot];
      data[pivot] = data[start];
      data[start] = temp;
      pivot = start;
    }
    else {
      int temp = data[pivot];
      data[pivot] = data[start-1];
      data[start-1] = temp;
      pivot = start - 1;
    }
    return pivot;
  }
  
  public static int QuickSelect(int[] data, int start, int end, int k){
    int pivot = partition(data, start, end);
    if (pivot > k - 1)
        QuickSelect(data, start, pivot - 1, k);
    else if (pivot < k - 1)
        QuickSelect(data, pivot + 1, end, k);
    else
        return data[k-1];
    return data[k-1];
  }

  public static void QuickSort(int[] data, int start, int end){
    if (start < end){
        int pivot = partition(data, start, end); 
        QuickSort(data, start, pivot - 1);
        QuickSort(data, pivot + 1, end);
    }
  }
    
}
