import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class app_pendu {

    public static void main(String[] args) {

        String dicoWords[] = { "python", "java", "php", "pascal", "javascript", "cobol" };

        // générer un nombre aléatoire
        int minValueRandom = 0;
        int maxValueRandom = dicoWords.length;
        Random chf = new Random();
        int randomNumber = chf.nextInt(maxValueRandom) + minValueRandom;

        // Afficher le mot mystère
        System.out.println(dicoWords[randomNumber]);
        String theWord;
        theWord = dicoWords[randomNumber];

        // System.out.print(theWord.getClass());

        // convertir le mot qui est en STR en arrayList

        char[] ch = new char[theWord.length()];
        ArrayList<Character> arrayWord = new ArrayList<Character>();
        for (int i = 0; i < theWord.length(); i++) {
            ch[i] = theWord.charAt(i);

            arrayWord.add(ch[i]);
        }

        // masquer le mot magique sous des étoiles
        ArrayList<Character> arrayStarsWord = new ArrayList<Character>();
        char[] chStars = new char[theWord.length()];
        for (int i = 0; i < theWord.length(); i++) {
            chStars[i] = '*';
            arrayStarsWord.add(chStars[i]);
        }
        // afficher le mot magique sous des étoiles au format String
        String starsword = "";

        for (Character letter : arrayStarsWord) {
            starsword += letter;

        }
        System.out.println(starsword);

        //récupérer la saisie utilisateur

        Scanner scannerLetter = new Scanner(System.in);
        System.out.println("Saisissez une lettre : ");
        char charUserInput = scannerLetter.next().charAt(0);
        System.out.println("Vous avez saisi : " + charUserInput);
        System.out.println(charUserInput); 

        // Créer le démascage des caractères ex : **e***
        ArrayList<Character> arrayUnStarsWord = new ArrayList<Character>();


        // vérifier si la saisie utilsateur comprend une correspondace ou plusieurs avec le mot magique




    }

}

/*
 * 3) instancier un nombre de chance max
 * 5) tant que l'utilisateur a des chances il peut recommancer
 * 6) si la lettre est bonne découvrir la lettre validée
 * 7) si la lettre est mauvaise décompter une chance
 * 8) si les chances sont épuisées alors terminer le jeu
 * 
 * public static String repettte(String starsword){
 * System.out.println("Le mot magique est ------------->" + starsword);
 * return starsword;
 * }
 
 */