public class Main {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5};
        int sum = 0;
        double harmonicSeries= 1.0;

        for(int i=0; i < numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println("Average:" + sum/ numbers.length);

        for (int k=0; k < numbers.length; k++){
            harmonicSeries+= 1/numbers[k];
        }
        System.out.println("Harmonic Average: "+ numbers.length/harmonicSeries);
    }
}