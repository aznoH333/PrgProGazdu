import java.util.ArrayList;
import java.util.Scanner;

public class Javoid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Float> numbers = new ArrayList<>();

        System.out.println("pis cisla");
        System.out.println("pro ukonceni napis exit");
        while (true){
            try{
                numbers.add(sc.nextFloat());
            }catch (Exception e){
                break;
            }
        }

        float e = 0;
        for (Float i: numbers) {
            e+=i;
        }
        e/=numbers.size();
        System.out.println("Průjem je : " + e);

    }
}
