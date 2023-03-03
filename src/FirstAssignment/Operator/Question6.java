package FirstAssignment.Operator;

/**
 * Program for relational operators (<,<==, >, >==)
 */
public class Question6 {
    public static void main(String[] args) {
        int arr [] = {1,2,4,5,3,6,7,9,8};
        int x=0;
        for(int i = 0; i < arr.length;i++){
            if (i<arr.length-1 && arr[i]>arr[i+1]){
                x = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=x;
            }
        }
        for (int i= 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
