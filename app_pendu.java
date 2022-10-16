import java.util.Scanner;


public class App_pendu {

    public static void main(String[] args) {

        char selectPlayer =' ';

        while(selectPlayer != 'N'){

            Pendu jeu = new Pendu();
            jeu.wordGenerator();
            jeu.anonymousWord();

            int retry=0;

            while(retry<8) {

                jeu.userInput();
                jeu.verification();
                retry++;
            }

            System.out.println("Souhaitez vous rejouer ? Tapez 'N' pour arreter ou 'Y' pour recommencer");
            Scanner again = new Scanner(System.in);
            selectPlayer = again.next().charAt(0);
        }	
    }
}


