package Exo;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Le_pendu {

    public static java.util.List<String> list_De_mot() {

        List<String> list = new ArrayList<>();

        list.add("bonjour");
        list.add("tableau");
        list.add("bayern");
        list.add("maison");
        list.add("football");
        list.add("whisky");
        list.add("telephone");
        list.add("James");
        list.add("diplome");
        list.add("belgique");

        //Collections.shuffle(list);


        return list;

    }

    public static String selectionner_mot(List<String> list) {

        return list.get(0);
    }


    public static void le_pendu() {

        System.out.println("***** Le PENDU *****");

        int lettre_trouver = 0;

        String mot = selectionner_mot(list_De_mot());

        String mot_cacher = "";


        for (int i = 0; i < mot.length(); i++) {

            mot_cacher = mot_cacher + "*";
        }

        System.out.println(mot_cacher);

        /*

         */


        int chance = mot.length() + 4;

        while (chance > 0) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("choissez une lettre : ");

            char a = scanner.next().charAt(0);

          //  String bonne_lettre = "";

            System.out.println();




//        char[] indices = new char[] {1, 4};

            String newTxt = "";
            for (int i = 0; i < mot.length(); i++) {
                if (mot.charAt(i) == a) {

                    newTxt += a;

                    lettre_trouver ++ ;

                } else {

                    newTxt += mot_cacher;

                }
            }

            System.out.println(newTxt);

            if (lettre_trouver == mot.length()) {

                System.out.println("vous avez gagner");

                chance = 0;


            }
            chance--;
        }


        //System.out.println();
        //System.out.println(mot);


    }


    public static void main(String[] args) {

        //exercice.afficherList(list_De_mot());

        le_pendu();


    }

    public static void test() {
        String txt = "b******";
        String txtHide = "bonjour";
        char a = 'o';
//        char[] indices = new char[] {1, 4};

        String newTxt = "";
        for (int i = 0; i < txt.length(); i++) {
            if (txtHide.charAt(i) == a) {
                newTxt += a;
            } else {
                newTxt += txt;
            }
        }


    }


}
