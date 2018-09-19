package Lab5_Dimensional;

import java.util.Arrays;

/**
 * @author Alex han
 */
public class Dimensional {

    /**
     * sum of all elements in the array
     * @param arr arr
     * @return sum
     */
    public static int arraySum(int[] arr){
        int sum =0;
        for(int i =0; i<arr.length; i++){
            sum += arr[i];}
            return sum;
            }

    /**
     *
     * @param arr2D 2D array
     * @return sum of each arrays
     */
    public static int[] rowSums(int[][] arr2D){

        int[] result = new int[arr2D.length];
        for(int i =0; i<arr2D.length;i++){
            result[i]=arraySum(arr2D[i]);
            System.out.println(Arrays.toString(result));
            }return result;

        }

    /**
     * chech all sum of array are all different
     * @param arr2D 2D arry
     * @return boolean
     */
    public static boolean isDiverse(int[][] arr2D){
        int[] resultArray = rowSums(arr2D);

        if(resultArray[0]==resultArray[1]||
        resultArray[0]==resultArray[2]||
        resultArray[0]==resultArray[3]||
        resultArray[1]==resultArray[2]||
        resultArray[1]==resultArray[3]||
        resultArray[2]==resultArray[3]
                ){return false;

        }else
            return true;
    }








    public static void main(String[] args) {
        int [] arr1 = {1,3,2,7,3};
        System.out.println(arraySum(arr1));


        int[][] arr2D ={
                {1,3,2,7,3},
                {10,10,4,6,2},
                {5,3,5,9,6},
                {7,6,4,2,1}
        };

        int[][] arr2D_false ={
                {1,3,2,7,3},
                {10,10,4,6,2},
                {5,3,5,9,6},
                {7,6,4,2,9}
        };



        System.out.println(arr2D.length);
        System.out.println(rowSums(arr2D));
        System.out.println(isDiverse(arr2D));
        System.out.println(isDiverse(arr2D_false));





    }



}
