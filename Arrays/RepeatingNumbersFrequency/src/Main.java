public class Main {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};

        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            int frequency = 0;

            if (element == -1) {
                continue;
            }

            for (int j = i; j < array.length; j++) {
                if (element== array[j]) {
                    frequency++;
                    array[j] = -1;
                }
            }

            System.out.println("Number " + element + "'s frequency is " + frequency);
        }
    }
}