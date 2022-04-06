import java.util.ArrayList;
import java.util.Scanner;

public class Karel {
    public static void main(String[] args) {
        String[] slovicka = {"amogus", "karel", "pavel", "slovo", "maslo", "kokos", "ban", "ledvina",
                "plice", "tvoje mama", "cau martine", "xd", "pavel gameskuje nejakou starou gamesku",
                "karel to zacyklil", "operacni systemy", "educanet je moje oblibena skola maji fakt dobre zachody",
                "pavel pise v kotlinu to neni fer zabanujte ho prosim", "nejneobhospodarovavatelnejsimi"};
        String slovo = slovicka[(int)(Math.random()*slovicka.length)];
        ArrayList<Character> hadanypismenka = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        StringBuilder slovoid;
        int kolik = 5;


        while (kolik > 0){
            System.out.println("\n");
            slovoid = new StringBuilder();
            System.out.println("Mas " + kolik + " zivotu");
            System.out.println();
            for (char slovko: slovo.toCharArray()) {
                if (slovko == ' ')                           slovoid.append(' ');
                else if (hadanypismenka.contains(slovko))    slovoid.append(slovko);
                else                                         slovoid.append("_");
            }
            System.out.println(slovoid);
            if (slovoid.indexOf("_") == -1) break;
            System.out.println();
            System.out.println("Hadan piss menka");
            for (char piss: hadanypismenka) {
                System.out.print(piss + ", ");
            }
            System.out.println();
            System.out.println("Hadaj piss menko");
            char vlozeni = (sc.nextLine() + " ").charAt(0);
            if (hadanypismenka.contains(vlozeni) || slovo.indexOf(vlozeni) == -1){
                kolik--;
                System.out.println("spatne hadas");
            }else{
                System.out.println("dobro hadas");
            }
            if (!hadanypismenka.contains(vlozeni)) hadanypismenka.add(vlozeni);

        }

        if (kolik>0){
            System.out.println("epicke viteztvi");
        }else {
            System.out.println(slovo);
            System.out.println("neumis gamesit");
        }
    }
}
