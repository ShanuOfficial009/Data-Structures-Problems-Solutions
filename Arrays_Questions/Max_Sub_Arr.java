package Arrays_Questions;

public class Max_Sub_Arr {
public static int solution(int [] arr){
    int csum = arr[0];
    int osum = arr[0];
     for(int i = 1; i < arr.length; i++){
         if(csum >= 0){
             csum += arr[i];
         }
         else{
             csum = arr[i];
         }
         if(csum > osum){
             osum = csum;
         }
     }
     return osum;
}

    public static void main(String[] args) {
        int arr[] = {1, 3, 8, -2, 6, -8, 5};
        System.out.println(solution(arr));
    }
}
