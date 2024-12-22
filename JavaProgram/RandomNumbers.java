import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
     Random randomNum = new Random();
     int bound = 10000;
     for(int i = 0; i < 5; i++){
     int randomInt = randomNum.nextInt(bound);
     System.out.println("Random Number: " + randomInt);
        }
     }

}