package B;

public class ArrayDemo {
    public static void reverseFunction(int[] list){
        int[] result = new int[list.length];
//        for(int i = 0, j = result.length - 1; i < list.length; i++, j-- ){
//            result[j] = list[i];
//        }
        for(int i = 0, j = result.length - 1; i < list.length; i++, j--){
            result[j] = list[i];
        }
        System.out.println("Run case1: ");
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i] + " ");
        }
        System.out.println("Run case2: ");
        for(int a : result){
            System.out.println(a + " ");
        }
    }
    public static void main(String[] args){
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        reverseFunction(arr);
    }
}
