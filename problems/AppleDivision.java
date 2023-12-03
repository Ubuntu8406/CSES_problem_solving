import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AppleDivision{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int n = tokenizer.countTokens(); long sum = 0; int index = 0;
        long arr[] = new long[n];
        
        while (tokenizer.hasMoreTokens()){
            arr[index] = Long.parseLong(tokenizer.nextToken());
            sum+=arr[index];
            index++;
        }
        //long average = (long)Math.ceil((double)(sum)/2);
        int low = 0, high = arr.length - 1;
        quickSort(arr, low, high);
        System.out.println(check(n, sum, arr[0], arr[n-1]));
    }

    public static long check(int n, long sum, long min, long max){
        long result = ((n == 1) || (n == 2)) ? max - min : 0;
        if (n > 2){
            if (max >= (sum - max))
                result = max - (sum - max);
            else{
                result = 1;
            }
        }
        return result;
    }

    public static void quickSort(long[] arr, int low, int high){
        if (arr.length == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        long base = arr[middle];

        int i = low, j = high;
        while (i <= j){
            while (arr[i] < base)
                i++;

            while (arr[j] > base)
                j--;

            if (i <= j){
                long temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--; 
            }
        }
        if (low < j)
            quickSort(arr, low, j);
        if (high > i)
            quickSort(arr, i, high);
    }
}