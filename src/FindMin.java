public class FindMin {
    public static void main(String[] args) {
        int[] arr = {9,4,2,3,1,5,6,7,8,3};
        int min = arr[0];
        for(int i = 0; i< arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
