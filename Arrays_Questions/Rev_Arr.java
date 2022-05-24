package Arrays_Questions;
                                                                       //Write a program to reverse an array or string
public class Rev_Arr {
    static void Rev_Arrs(int[]arr,int start, int end){                    //Reverse logic using recursion
        int temp;
        if(start >= end)
            return;
        temp = arr[start];                                                   //Swapping the numbers
        arr[start] = arr[end];
        arr[end] = temp;
        Rev_Arrs(arr, start + 1, end - 1);
    }
  static void Print_Arr(int[]arr, int size){                            //For printing the arrays we are making this method
    for(int i = 0; i < size; i++){
        System.out.print(arr[i]+ " ");
        //System.out.println("");
    }
      System.out.println("");
  }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 8, 9};
        System.out.print("Before reverse: ");
        Print_Arr(arr, 6);
        Rev_Arrs(arr, 0, 5);
        System.out.print("After reverse: ");
        Print_Arr(arr, 6);
    }
}
