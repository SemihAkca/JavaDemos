public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{8, 7, 11,9, 19, 23, 30};
        boolean status= true;

        for (int i = 0; i < numbers.length; i++) {
            for (int count = 2; count < numbers[i]; count++) {
                if (numbers[i] % count == 0 ){
                    status = false;
                    break;
                }
            }
            if (!status){
                System.out.println(numbers[i] + " is not Prime");
            }
            else {
                System.out.println(numbers[i] + " is Prime");
            }
        }
    }
}