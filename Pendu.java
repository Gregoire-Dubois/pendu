import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Pendu {

    ArrayList<Character> ArrayWord = new ArrayList<Character>();
    ArrayList <Character> anonymusWord = new ArrayList<Character>();


    public void wordGenerator(){
        // générator for create one word from dictionnaryWords
        final String dictionnaryWords[] = {"java", "Python", "javascript", "cobol", "pearl", "c++","crêpes", "Bretagne"};
         String theWord;

        // générator for create one word from dictionnaryWords

        //int min=0;
        int max=dictionnaryWords.length;
        Random nombre = new Random();
        int nb;
        nb = nombre.nextInt(max );
        theWord = dictionnaryWords[nb];

        // générator for create one word from dictionnaryWords

        System.out.println(theWord);

        // hide the word under stars
        char anonymous = '*';
        char[] letter = new char[theWord.length()];
        String stars = " ";

        for(int i =0; i< theWord.length(); i++)
        {
            letter[i] = theWord.charAt(i);
            ArrayWord.add(letter[i]);
        }

        char[] starLetter = new char[theWord.length()];
        for(int i =0; i < theWord.length(); i++)
        {
            starLetter[i] = anonymous;
            anonymusWord.add(starLetter[i]);
        }

        for(Character star : anonymusWord)
        {
            stars += star+"";
        }
        System.out.println("_____________________________");
        System.out.println("Le mot mystère est : " + stars);
        System.out.println("_____________________________");

        play(theWord,stars);
    }

    public void play(String theWord, String stars){

        char attemptletter;
        String discoveryLetters="";

        int max = 9; // Max chances
        int chances=0;


        while ( chances < max){

            // catch input's user
            System.out.println("Entrez une lettre pour tenter de trouver le mot mystère");
            Scanner userinp = new Scanner(System.in);
            char attempt = userinp.next().charAt(0);
            attemptletter = attempt;

            int goodLetters=0; // count if one or many letters are find
            for (int i = 0; i < ArrayWord.size(); i++) {
                if (attemptletter == ArrayWord.get(i)) {
                    anonymusWord.set(i, attemptletter);
                    goodLetters++;
                }
            }

            if (goodLetters==0){chances++;}


            discoveryLetters = anonymusWord.toString().replace(",", "");

            if (anonymusWord.equals(ArrayWord)) {
                System.out.println("_____________________________");
                System.out.println("Félicitation le mot était " + discoveryLetters);
                System.out.println("_____________________________");

                break;
            }

            System.out.println(discoveryLetters);
            int reste = max - chances;
            System.out.println("Il vous reste encore " + reste + " chances");

            if (chances==max){
                System.out.println("_____________________________");
                System.out.println("Pas de chance, tu n'as pas trouvé le mot magique qui était : " + theWord);
                System.out.println("_____________________________");
            }

        }

    }

}
