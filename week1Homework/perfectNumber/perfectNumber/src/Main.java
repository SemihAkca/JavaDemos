public class Main {
    public static void main(String[] args) {
        int[] numbers = {6,12,28,56};
        int total=0;
        for (int i=0; i< numbers.length; i++) {
            for (int j=1; j<numbers[i];j++){
                if (numbers[i]%j ==0 ){
                    total+=j;
                }
            }
            if (total==numbers[i]){
                System.out.println(numbers[i] +" is perfect number");
            }
            else {
                System.out.println(numbers[i]+" is not perfect number");
            }
            total =0;
        }

    }
}