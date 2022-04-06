import java.util.Scanner;

public class Pavel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input;
        char computerInput;
        int score = 0;


        while (true){
            System.out.println("--== Hra začala ==--");
            System.out.println("Možnosti :");
            System.out.println("Kámen");
            System.out.println("Nůžky");
            System.out.println("Papír");
            System.out.println("Exit");

            input = (sc.nextLine()+"ano").toLowerCase().charAt(0);

            if (input == 'k'|| input == 'n'|| input == 'p'){
                switch ((int) (Math.random()*2)){
                    case 0 -> computerInput = 'k';
                    case 1 -> computerInput = 'n';
                    default -> computerInput = 'p';
                }

                switch (getGameStatus(input,computerInput)){
                    case Nic -> System.out.println("Nejde nic");
                    case Vyhra -> {System.out.println("epicka vyhra");score++;}
                    case Prohra -> {System.out.println("drtiva porazka"); score--;}
                }
                System.out.println();
                System.out.println("Tvoje scóre je : " + score);
                System.out.println();
            }else if (input == 'e'){
                System.out.println("Konec gamesky");
                break;
            }

        }
    }

    private static Papir getGameStatus(char playerInput, char computerInput){
        if (playerInput == computerInput) return Papir.Nic;
        switch (playerInput){
            case 'p': if (computerInput == 'k') return Papir.Vyhra; else  return Papir.Prohra;
            case 'n': if (computerInput == 'p') return Papir.Vyhra; else  return Papir.Prohra;
            case 'k': if (computerInput == 'n') return Papir.Vyhra; else  return Papir.Prohra;
            default: return Papir.Nic;
        }
    }
}
