public class Practice5_Find_Min {
    public static void main(String[] args) {
        int[] arr = {2, 3, 35, 6, 32, 5, 3, 5};
        int index = minValue(arr);
        System.out.println("The smallest number in the array is " + arr[index]);

    }
    public static int minValue(int[] array){
        int indexMin = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] < array[indexMin]){
                indexMin = i ;
            }
        }
        return indexMin;
    }
}
