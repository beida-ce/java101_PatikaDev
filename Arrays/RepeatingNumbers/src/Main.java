import java.util.Arrays;

public class Main {
    static boolean isThere(int[] arr, int val){
        for(int i : arr){
            if(i==val) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int [] list = {1,22,43,2,534,1,2,22,43,34,64,34,43,53,1,64};
        int [] list2 = new int[list.length];
        int startIndex = 0;
        System.out.println("Your array --> " + Arrays.toString(list));
        Arrays.sort(list);

        for (int i=0; i<list.length; i++){
            for (int j=0; j< list.length; j++){
                if(i!=j && list[i]==list[j] && list[i]%2==0){
                   if(!isThere(list2,list[i])){
                       list2[startIndex++] = list[i];
                   }
                break;
                }
            }
        }
        for(int k : list2){
            if(k!=0){
                System.out.println("Repeating even numbers in your array --> " + k);
            }
        }
    }
}