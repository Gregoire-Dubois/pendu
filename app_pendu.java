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

        int chances = 7;

        ArrayList<Character> arrayStarsWord = new ArrayList<Character>(); // Array destiné à recevoir les * pour couvrir
                                                                          // le mot

        // while (chances > 0) {

        // Todo décompter le nombre de chances

        // Afficher le mot mystère
        System.out.println(dicoWords[randomNumber]);
        String theWord;
        theWord = dicoWords[randomNumber];

        // System.out.print(theWord.getClass());

        // convertir le mot qui est en STR en arrayList

        char[] ch = new char[theWord.length()];

        ArrayList<Character> arrayWord = new ArrayList<Character>(); // passer le mot de STR à Array
        for (int i = 0; i < theWord.length(); i++) {
            ch[i] = theWord.charAt(i);
            arrayWord.add(ch[i]);
        }

        // masquer le mot magique sous des étoiles

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
        System.out.println("Découvre le mot mystère caché sous les étoiles : " + starsword);

        ArrayList<Character> arrayUnStarsWord = new ArrayList<Character>(theWord.length());



        while (chances > 0) {

            // récupérer la saisie utilisateur

            Scanner scannerLetter = new Scanner(System.in);
            System.out.println("Saisissez une lettre : ");

            char charUserInput = scannerLetter.next().charAt(0);

            // Créer le démascage des caractères ex : **e***
            // le ArrayList doit contenir autant d'indexe que le ArrayList qui contient les
            // étoiles

            //ArrayList<Character> arrayUnStarsWord = new ArrayList<Character>(theWord.length());

            //vérifier si la saisie utilsateur comprend une correspondance ou plusieurs avec le mot magique

            for (int i = 0; i < arrayWord.size(); i++) {
                if (charUserInput == arrayWord.get(i)) {
                    arrayStarsWord.set(i, charUserInput);
                } 

            }
            System.out.println("Vos découvertes " + arrayStarsWord);
            System.out.println("Il vous reste : " + chances);
        }
    }
}

/*
 * convertire le arrayStarsWord en String et l'afficher en sortie  
 * Prévoir une sortie de boucle si l'utilisateur trouve toutes les lettres avant la fin de ses chances
 * ajouter un mécanisme de décompte des chances
 * créer une boucle pour demander à l'utilisateur s'il veut recommancer
 */