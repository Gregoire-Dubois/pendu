import java.util.ArrayList;

public class WordMystificator {

    public WordMystificator() {

        starsMaker();
    }

    public String starsMaker() {
        // boucle pour passer le mot de String à Array
        for (int i = 0; i < WordGenerator.theWord.length(); i++) {
            ch[i] = WordGenerator.theWord.charAt(i);
            arrayWord.add(ch[i]);
        }

        // boule pour masquer le mot sous des étoiles
        char[] chStars = new char[WordGenerator.theWord.length()];
        for (int i = 0; i < WordGenerator.theWord.length(); i++) {
            chStars[i] = '*';
            arrayStarsWord.add(chStars[i]);
        }

        // afficher le mot magique sous des étoiles au format String
        String starsword = "";

        for (Character letter : arrayStarsWord) {
            starsword += letter;
        }
        System.out.println("Découvre le mot mystère caché sous les étoiles : " + starsword);
        return this.starsword;
    }

    public String starsword = "";
    public ArrayList<Character> arrayWord = new ArrayList<Character>(); // passer le mot de STR à Array
    public ArrayList<Character> arrayStarsWord = new ArrayList<Character>(); // Array destiné à recevoir les * pour
    public char[] ch = new char[WordGenerator.theWord.length()];
}
