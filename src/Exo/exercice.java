package Exo;

import java.util.*;

public class exercice {
    //#region exercice

    public static void estBissextille(int année) {

        if (année % 4 == 0 && année % 100 != 0 || année % 400 == 0) {

            System.out.println("est bisextille");

        } else {

            System.out.println("est pas bisextille");
        }
    }

    public static void LanceurDeBalles() {

        int balles = 10;

        boolean panierVide = false;

        int i = 1;

        while (i == 1) {

            if (balles == 0) {

                panierVide = true;
            }

            if (panierVide == true) {

                System.out.println("Le panier est vide ");

                i--;
            }

            if (estPrêt() == true) {

                balles--;

                System.out.println("une balle à été lancer");
            } else {

                System.out.println("on lance pas de balle");

                i--;

            }


        }

    }

    public static boolean estPrêt() {

        Scanner scanner = new Scanner(System.in);

        boolean prêt = false;


        System.out.println("Est tu prêt ? (tap y pour 'oui' ou n pour 'non' ");


        String choix = scanner.next();


        if (choix.equals("y")) {

            prêt = true;
        } else if (choix.equals("n")) {

            prêt = false;
        }


        return prêt;
    }


    public static void distributeurDeBoissons() {

        System.out.println("**** Distributeur ****");

        System.out.println("Coca   : 1");
        System.out.println("Fanta  : 2");
        System.out.println("Sprite : 3");
        System.out.println("Eau    : 4");
        System.out.println("Whisky : 5");

        int stockCoca = 4;
        int stockFanta = 1;
        int stockSprite = 4;
        int stockEau = 0;
        int stockWhisky = 9;

        System.out.println("________________________");

        System.out.println("Choisissez une boissons");


        Scanner scanner = new Scanner(System.in);


        int choix = scanner.nextInt();


        switch (choix) {

            case 1:

                if (stockCoca == 0) {

                    System.out.println("stock vide");
                } else {

                    System.out.println("coca");

                    stockCoca--;
                }


                break;

            case 2:

                if (stockFanta == 0) {

                    System.out.println("stock vide");
                } else {
                    System.out.println("fanta");

                    stockFanta--;
                }

                break;
            case 3:

                if (stockSprite == 0) {

                    System.out.println("stock vide");
                } else {

                    System.out.println("sprite");

                    stockSprite--;
                }


                break;
            case 4:
                if (stockEau == 0) {


                    System.out.println("stock vide");
                } else {

                    System.out.println("eau");
                    stockEau--;
                }


                break;
            case 5:
                if (stockWhisky == 0) {

                    System.out.println("stock vide");
                } else {

                    System.out.println("whisky");
                    stockWhisky--;
                }


                break;
            default:
                System.out.println("le chiffre ne correspond a aucune boisson ");
        }


    }

    public static void calculatrice() {

        final String PLUS = "+";

        final String MOINS = "-";

        final String DIVISER = "/";

        final String FOIX = "*";
        Scanner scanner = new Scanner(System.in);

        System.out.println("");

        System.out.print("entre un nombre : ");

        int nombre1 = scanner.nextInt();

        System.out.println();

        System.out.print("opperateur == > '+' '-' '*' '/' : ");

        String opérateur = scanner.next();

        System.out.println();

        System.out.print("entre un nombre : ");


        int nombre2 = scanner.nextInt();

        switch (opérateur) {


            case PLUS:

                System.out.println(nombre1 + nombre2);

                break;

            case MOINS:

                System.out.println(nombre1 - nombre2);

                break;

            case DIVISER:

                if (nombre2 == 0) {

                    System.out.println("La divison par 0 n'existe pas ");
                } else if (nombre1 == 0) {

                    System.out.println("0 ne peut pas être diviser ");
                } else {

                    System.out.println(nombre1 / nombre2);

                }

                break;

            case FOIX:

                System.out.println(nombre1 * nombre2);

                break;

            default:
                System.out.println("error d'opperateur");

        }

        /*
        if (opérateur.equals(plus)) {

            System.out.println(nombre1 + nombre2);
        }

        if (opérateur.equals(moins)) {

            System.out.println(nombre1 - nombre2);
        }

        if (opérateur.equals(diviser)) {

            System.out.println(nombre1 / nombre2);

            if (nombre2 == 0 ){

                System.out.println("La divison par 0 n'existe pas ");
            } else if (nombre1 == 0){

                System.out.println("0 ne peut pas être diviser ");
            }
        }

         */


    }

    public static void RapportDesNotes(int notes) {

        if (notes < 0 || notes > 20) {

            System.out.println("notes invalid");
        } else if (notes < 10) {
            System.out.println(notes + " : insuffisant ");
        } else if (notes == 10 || notes <= 12 || notes == 11) {

            System.out.println(notes + " : S ");
        } else if (notes == 13 || notes == 15 || notes == 14) {

            System.out.println(notes + " : B ");
        } else if (notes == 16 || notes == 17 || notes == 18) {

            System.out.println(notes + " : TB ");
        } else {

            System.out.println(notes + " : parfait ! ");
        }

    }

    public static void ConvertiseurDesecondes() {

        int jourTotal, heureTotale, minuteTotale, secondeTotal;
        int heures, minutes, secondes;

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre de secondes");

        secondeTotal = Integer.parseInt(sc.nextLine());
        secondes = secondeTotal % 60;
        minuteTotale = secondeTotal / 60;
        minutes = minuteTotale % 60;
        heureTotale = minuteTotale / 60;
        heures = heureTotale % 24;
        jourTotal = heureTotale / 24;

        System.out.printf(
                "%s jours, %s heures, %s minutes, %s secondes",
                jourTotal, heures, minutes, secondes
        );
    }

    public static void tableDe2() {

        int nb = 0;

        while (nb <= 20) {

            System.out.println(nb);

            nb = nb + 2;
        }
    }

    public static void TableDemultiplicationDe1A9() {

        int nb = 1;

        while (nb <= 9) {

            System.out.println("| Table de | " + nb);

            for (int i = nb; i <= nb * 10; i = i + nb) {
                System.out.print("|" + i);
            }

            System.out.println();

            System.out.println("_______________________________");


            nb++;
        }


    }

    public static void askDrink() {

        Scanner scanner = new Scanner(System.in);

        int i = 1;

        while (i > 0) {

            System.out.println("Voulez vous une boissons ? ====> tap 'y' for yes or tap an other charac ");

            String choix = scanner.next();

            if (choix.equals("y")) {

                distributeurDeBoissons();
            } else {

                System.out.println("Good bye");

                i--;
            }


        }


    }

    public static void askCalcule() {

        Scanner scanner = new Scanner(System.in);

        int i = 1;

        while (i > 0) {

            System.out.println("Voulez vous faire un calcule ? ====> tap 'y' for yes or tap an other charac ");

            String choix = scanner.next();

            if (choix.equals("y")) {

                calculatrice();
            } else {

                System.out.println("Good bye");

                i--;
            }
        }

    }

    public static void puissanceDe_n(int n, int expo) {

        int nb = n;

        for (int i = 0; i < expo; i++) {

            nb = nb * n;

        }

        System.out.println(nb);

    }

    public static void min_de_10_entier() {

        Scanner scanner = new Scanner(System.in);

        int i = 0;


        System.out.print("taper 1 entiers : ");

        int min = scanner.nextInt();

        System.out.println();

        while (i < 9) {

            System.out.print("taper 1 entiers : ");

            int nb = scanner.nextInt();

            if (min > nb) {

                min = nb;
            }

            System.out.println();

            i++;

        }

        System.out.println("Le minimum = " + min);


    }

    public static void ask_3_nombre(int nbRep, int nbTiret, int nbEspace) {

        int i = 0;
        while (i < nbRep) {

            for (int tiret = 0; tiret < nbTiret; tiret++) {

                System.out.print("-");
            }

            for (int espace = 0; espace < nbEspace; espace++) {

                System.out.print(" ");
            }

            System.out.print(" | ");

            i++;

        }


    }

    public static void exo_22() {

        int[] tab = new int[6];

        Scanner scanner = new Scanner(System.in);

        int i = 0;

        while (i < tab.length) {

            System.out.print("taper 1 entiers : ");

            int entier = scanner.nextInt();

            tab[i] = entier;

            i++;

        }

        afficher_tab(tab);


    }

    public static void exo23() {

        int n = 2;

        int nb = n;

        int[] tab = new int[10];

        for (int i = 0; i < tab.length; i++) {

            tab[i] = nb;

            System.out.print(" | " + nb);

            nb = nb * n;


        }
        System.out.print(" | ");


    }

    public static void afficher_tab(int[] tab) {

        for (int nb : tab) {

            System.out.print(" | " + nb);
        }

        System.out.print(" | ");
    }


    public static void tableau_miroire(int[] tab) {

        int[] tab2 = new int[tab.length];

        for (int i = tab.length - 1; i >= 0; i--) {

            System.out.print(" | " + tab[i]);

        }

        System.out.print(" | ");


    }

    public static void tableau_trier(int[] tab) {

        // int[] tab2 = new int[tab.length];

        int init = 0;


        int sav = 0;


        while (init < tab.length - 1) {

            int i = init;


            int min = i;

            while (i < tab.length) {


                if (tab[min] > tab[i]) {
                    //tab[min] = tab[i + 1];
                    min = i;

                }


                i++;


            }
            // System.out.println(min);


            sav = tab[min];

            tab[min] = tab[init];

            tab[init] = sav;

            init++;


        }

        afficher_tab(tab);


    }

    public static void rechercheVal(int valeur, int[] tab) {

        boolean trouver = false;

        for (int i = 0; i < tab.length; i++) {

            if (tab[i] == valeur) {


                trouver = true;
            }
        }

        if (trouver == false) {

            System.out.println("il n'y a pas la valeur dans le tableau");
        } else {
            System.out.println("trouver : " + valeur);

        }
    }

    public static void pion() {

        Scanner scanner = new Scanner(System.in);

        String pion = "P";

        String[] tab = new String[10];


        int i = 1;


        int pos = 0;

        int gauche = pos - 1;

        int droite = pos + 1;

        tab[pos] = pion;


        afficherTabString(tab);


        System.out.println(" déplacer par la gauche (g), par la droite (d) ou de stopper\n" +
                "l'algorithme (q). ");

        while (i > 0) {


            String action = scanner.next();


            switch (action) {

                case "g":

                    if (pos - 1 < 0) {

                        System.out.println("error mouvement imposimble");


                    } else {

                        pos = pos - 1;
                        tab[pos] = pion;
                        tab[pos + 1] = null;

                        afficherTabString(tab);
                    }


                    break;

                case "d":
                    if (pos + 1 > tab.length - 1) {

                        System.out.println("error mouvement impossible");


                    } else {

                        pos = pos + 1;
                        tab[pos] = pion;
                        tab[pos - 1] = null;

                        afficherTabString(tab);


                    }


                    break;

                case "q":

                    System.out.println("good bye ");

                    i--;

                    break;

                default:

                    System.out.println("erreur recommencez !");


            }


        }


    }

    public static void inscription(int numéro, int[] tab) {

        int[] tab2 = new int[tab.length + 1];

        int save = 0;

        for (int i = 0; i < tab.length; i++) {

            tab2[i] = tab[i];


        }

        int i = 0;

        int trouver = 1;


        while (trouver > 0) {

            if (numéro > tab2[i]) {

                i++;

            } else {

                tab2[tab2.length - 1] = tab2[i];

                tab2[i] = numéro;

                //trouver --;


                for (int j = tab2.length - 1; j >= 1; j--) {

                    if (tab2[j] < tab2[j - 1]) {

                        save = tab2[j];

                        tab2[j] = tab2[j - 1];

                        tab2[j - 1] = save;
                    } else {

                        trouver--;
                    }

                }


            }

        }

        afficher_tab(tab2);
    }

    public static void tableau_miroure_2(int[] tab) {
        int[] tab2 = new int[tab.length];

        for (int i = 0; i < tab.length; i++) {

            tab2[i] = tab[tab.length - i - 1];
        }

        afficher_tab(tab2);
    }


    public static void afficherTabString(String[] tab) {


        for (String elem : tab) {

            if (elem == null) {

                System.out.print(" | " + "*");

            } else {

                System.out.print(" | " + elem);
            }

        }

        System.out.print(" | ");

    }

    public static void triBull(int[] tab) {

        boolean permutation;

        int temp;

        int passage = 0;

        do {
            permutation = false;

            for (int i = 0; i < tab.length - 1 - passage; i++) {

                if (tab[i] > tab[i + 1]) {

                    permutation = true;
                    temp = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = temp;
                }


            }
            passage++;


        } while (permutation);


        afficher_tab(tab);


    }

    public static void fusion_2_tableau(int[] tab1, int[] tab2) {


    }

    public static int suiteDefibonnacci(int n) {

        int valeur_initiale = 1;

        int index = 0;

        int valeur = 0;

        int index_derièrre = 1;

        int index_derièrre_encore = 1;

        if (n == 0) {

            valeur = 0;

        } else if (n == 1) {

            valeur = 1;

        } else if (n == 2) {

            valeur = 1;

        } else {

            while (index < n - 2) {

                valeur = index_derièrre + index_derièrre_encore;

                index_derièrre_encore = index_derièrre;

                index_derièrre = valeur;

                index++;


            }
        }


        return valeur;
    }

    public static String inverse_chaîne_de_caractère(String mot) {

        String mot_inverse = "";


        for (int i = mot.length() - 1; i >= 0; i--) {


            mot_inverse = mot_inverse + mot.charAt(i);


        }


        return mot_inverse;


    }

    public static void nombre_paire_entre_2_nombre_entier(int nombre1, int nombre2) {

        int nombre_paire = 0;


        if (nombre1 < nombre2) {

            int i = 0;

            if (nombre1 % 2 == 0) {

                i = nombre1;
            } else {

                i = nombre1 + 1;
            }

            while (i < nombre2 + 1) {

                if (i % 2 == 0) {

                    System.out.print(" | " + i);

                    i++;
                } else {

                    i++;
                }
            }

        } else {

            int i = 0;

            if (nombre2 % 2 == 0) {

                i = nombre2;
            } else {

                i = nombre2 + 1;
            }

            while (i < nombre1 + 1) {

                if (i % 2 == 0) {

                    System.out.print(" | " + i);

                    i++;
                } else {

                    i++;
                }
            }

        }


    }

    //#endregion
    //#region est_un_palindrome

    public static boolean est_un_palindrome(String mot) {

        mot = mot.toLowerCase(Locale.ROOT);

        if (mot.equals(inverse_chaîne_de_caractère(mot))) {

            return true;
        }

        return false;
    }
    //#endregion
    //#region fusion2Tab

    public static void fusion2Tab(int[] tab1, int[] tab2) {
        int[] tab3 = new int[tab1.length + tab2.length];

        boolean fromTab2 = false;

        for (int i = 0; i < tab3.length; i++) {
            // On trouve le minimum des tableaux
            int minimum = Integer.MAX_VALUE;
            int posMin = -1;
            for (int j = 0; j < tab1.length; j++) {
                if (minimum > tab1[j] && tab1[j] != -1) {
                    minimum = tab1[j];
                    posMin = j;
                    fromTab2 = false;
                }
            }

            for (int k = 0; k < tab2.length; k++) {
                if (minimum > tab2[k] && tab2[k] != -1) {
                    minimum = tab2[k];
                    posMin = k;
                    fromTab2 = true;
                }
            }

            if (fromTab2) {
                tab2[posMin] = -1;
            } else {
                tab1[posMin] = -1;
            }

            tab3[i] = minimum;

        }

        for (int elem : tab3) {
            System.out.print(" | " + elem);
        }
    }

    //#endregion


    public static String pioche(int pioche, List<String> liste) {


        liste.get(pioche);


        return liste.get(pioche);
    }

    public static void afficherList(List<String> list) {

        for (String elem : list
        ) {

            System.out.print("|" + elem);

        }

    }

    public static void afficherHashMap(HashMap<String, String> couple) {


        for (Map.Entry<String, String> mapentry : couple.entrySet()) {
            System.out.println("Donneur : " + mapentry.getKey()
                    + " | Receveur : " + mapentry.getValue());
        }

    }

    public static List<Integer> liste_entier_taille_inviter(List<String> list) {

        List<Integer> list_entier = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            list_entier.add(i);
        }

        Collections.shuffle(list_entier);

        return list_entier;
    }

    public static void afficherList_entier(List<Integer> list) {

        for (int elem : list
        ) {

            System.out.print("|" + elem);

        }

    }


    public static HashMap<String, String> création_list_couple_donneur_vers_receveur(List<String> invité) {


        HashMap<String, String> coupleGenerer = new HashMap<>();

        while (invité.size() != 0) {


            List<Integer> list_entier = liste_entier_taille_inviter(invité);


            HashMap<String, String> map = couple(list_entier.get(0), list_entier.get(1), invité);

            ArrayList<String> keys = new ArrayList<>(map.keySet());
            ArrayList<String> value = new ArrayList<>(map.values());

            coupleGenerer.put(keys.get(0), value.get(0));


        }
        System.out.println();

        return coupleGenerer;


    }

    public static List<String> list_donneur(HashMap<String, String> coupe) {

        List<String> list_des_donneurs = new ArrayList<>();


        for (Map.Entry<String, String> mapentry : coupe.entrySet()) {

            list_des_donneurs.add(mapentry.getKey());


        }

        return list_des_donneurs;
    }

    public static List<String> list_receveur(HashMap<String, String> coupe) {

        List<String> list_des_donneurs = new ArrayList<>();


        for (Map.Entry<String, String> mapentry : coupe.entrySet()) {

            list_des_donneurs.add(mapentry.getValue());


        }

        return list_des_donneurs;
    }


    public static HashMap<String, String> nouvelle_Liste_donneur(List<String> list_nouveau_donneur, List<String> list_nouveau_receveur) {

        HashMap<String, String> nouvelles_liste = new HashMap<>();


        return nouvelles_liste;

    }


    public static HashMap<String, String> couple(int donneur, int receveur, List<String> invité) {

        String donneurs = pioche(donneur, invité);

        String receveurs = pioche(receveur, invité);


        HashMap<String, String> couple = new HashMap<>();


        couple.put(donneurs, receveurs);


        for (int i = 0; i < invité.size(); i++) {

            if (invité.get(i).equals(donneurs)) {

                invité.remove(i);
            }

        }

        for (int i = 0; i < invité.size(); i++) {

            if (invité.get(i).equals(receveurs)) {

                invité.remove(i);
            }

        }

        return couple;

    }

    public static void Liste_invitation(List<String> invité) {

        Collections.shuffle(invité);

        int donneur = 0;

        int reçeveur = 1;

        //System.out.println(invité.size());
        if (invité.size() % 2 == 0) {

            while (reçeveur < invité.size()) {

                System.out.println("Donneur : " + invité.get(donneur) + " | Receveur : " + invité.get(reçeveur));

                donneur++;

                reçeveur++;

            }

            System.out.println("Donneur : " + invité.get(invité.size()-1) + " | Receveur : " + invité.get(0));
        } else {

            while (reçeveur < invité.size() - 1 ) {

                System.out.println("Donneur : " + invité.get(donneur) + " | Receveur : " + invité.get(reçeveur));

                donneur++;

                reçeveur++;
            }

            System.out.println("Donneur : " + invité.get(invité.size()-1) + " | Receveur : " + invité.get(0));


        }
    }


    public static void main(String[] args) {

        List<String> invité = new ArrayList<>();

        invité.add("King-Niwem");
        invité.add("James");
        invité.add("Malou");
        invité.add("Lossature");
        invité.add("Bobby");
        invité.add("Nigel");
        invité.add("Zelison");
        invité.add("Scoubidoubi");
        invité.add("Capitaine Pirate");
        invité.add("Japo");
        invité.add("Whisky");

        Liste_invitation(invité);



        // afficherHashMap(création_list_couple_donneur_vers_receveur(invité));


        // afficherList(list_donneur(création_list_couple_donneur_vers_receveur(invité)));


    }
}
//#region test
 /*
 System.out.println(est_un_palindrome("AlLa")); // true
System.out.println(est_un_palindrome("alla")); // true

        System.out.println(est_un_palindrome("alfezzaerzla")); // false
       nombre_paire_entre_2_nombre_entier(15,26);

        System.out.println();

        nombre_paire_entre_2_nombre_entier(14,28);

        System.out.println();

        nombre_paire_entre_2_nombre_entier(144,20);


 String mot1 = "salut" ;

        String mot2 = "mot1" ;

        String mot3 = mot1 + " " + mot2 ;

        String mot4 = "" ;

        StringBuilder chara = new StringBuilder();

        char c = mot1.charAt(0) ;

        chara.append(mot4).append(c) ;

        System.out.println(chara);

        c = mot1.charAt(2);

        chara.append(mot4).append(c) ;

        System.out.println(chara);


        String joe = "Joe";
        StringBuilder sb = new StringBuilder();
        String sep = "";
        for (char c: joe.toCharArray()) {
            sb.append(sep).append(c);
            sep = " ";
        }

        System.out.println(sb.toString());

      System.out.println(suiteDefibonnacci(0));
        System.out.println(suiteDefibonnacci(1));
        System.out.println(suiteDefibonnacci(2));
        System.out.println(suiteDefibonnacci(3));
        System.out.println(suiteDefibonnacci(4));
        System.out.println(suiteDefibonnacci(5));
        System.out.println(suiteDefibonnacci(6));
        System.out.println(suiteDefibonnacci(7));
        System.out.println(suiteDefibonnacci(8));

       int[] tab3 = new int[tab1.length + tab2.length];

        // System.out.println(tab3.length);


        int indice_tab2 = 0;


        int minimum_trouver = 0;

        int indice_tab1 = 0;

        int minimum_du_tab_1 = 0;

        int minimum_du_tab_2 = 0;

        int minimum_trouver_tab_2 = 0;

        int tableau3_remplie = 0;

        int indice_du_tab_3 = 0;

        boolean tab1_vide = false;

        int compteur_tab1_moins1 = 0;

        int compteur_tab2_moins1 = 0;

        boolean tab2_vide = false;

        int i = 0;


        if (tab1.length < tab2.length) {

            while (i < 2) {

                afficher_tab(tab1);
                System.out.println();

                afficher_tab(tab2);
                System.out.println();

                afficher_tab(tab3);

                compteur_tab1_moins1 = 0;

                minimum_du_tab_1 = 0;

                minimum_du_tab_2 = 0;


                for (int val : tab1) {

                    if (val == -1) {

                        compteur_tab1_moins1++;


                    }


                }

                System.out.println();

                System.out.println("il y 'a : " + compteur_tab1_moins1 + " -1");

                if (compteur_tab1_moins1 == tab1.length) {

                    tab1_vide = true;

                    i = 2;
                }

                System.out.println("la taille du tableau : " + tab1.length);

                System.out.println("le tab 1 est vide ? " + tab1_vide);

                if (tab1_vide == false) {

                    while (minimum_trouver == 0) {

                        int p = 0;


                        boolean condition1 = false;

                        while (condition1 == false) {

                            if (tab1[p] == -1) {

                                p++;

                                System.out.println("val diff de -1 tab 1 ? " + condition1);

                            } else {

                                minimum_du_tab_1 = tab1[p];

                                System.out.println("le minimum du tab 1 : " + minimum_du_tab_1);

                                condition1 = true;


                            }
                        }


                        if (minimum_du_tab_1 > tab1[indice_tab1 + 1] && tab1[indice_tab1 + 1] >= 0) {

                            minimum_du_tab_1 = tab1[indice_tab1 + 1];

                            indice_tab1++;

                        } else {

                            indice_tab1++;
                        }

                        if (indice_tab1 == tab1.length - 1) {


                            if (tab1[indice_tab1] == minimum_du_tab_1) {

                                tab1[indice_tab1] = -1;

                                minimum_trouver++;

                            } else {

                                tab1[indice_tab1 - 1] = -1;

                                minimum_trouver++;

                            }



                        }


                    }

                    while (minimum_trouver_tab_2 == 0) {

                        int l = 0;

                        boolean condition2 = false;
                        while (condition2 == false) {

                            if (tab2[l] == -1) {

                                l++;

                                System.out.println("val diff de -1 ? tab 2 " + condition2);

                            } else {

                                minimum_du_tab_2 = tab2[l];
                                System.out.println("Le minimum du tab 2 :  " + minimum_du_tab_2);
                                condition2 = true;




                            }
                        }

                        minimum_du_tab_2 = tab2[indice_tab2];

                        if (minimum_du_tab_2 > tab2[indice_tab2 + 1] && tab2[indice_tab2 + 1] >= 0) {

                            minimum_du_tab_2 = tab2[indice_tab2 + 1];

                            indice_tab2++;

                        } else {

                            indice_tab2++;
                        }

                        if (indice_tab2 == tab2.length - 1) {


                            if (tab2[indice_tab2] == minimum_du_tab_2) {

                                tab2[indice_tab2] = -1;
                            } else {

                                tab2[indice_tab2 - 1] = -1;
                            }


                            minimum_trouver_tab_2++;
                        }

                    }

                    if (minimum_du_tab_1 > minimum_du_tab_2) {

                        tab3[indice_du_tab_3] = minimum_du_tab_2;

                        tab3[indice_du_tab_3 + 1] = minimum_du_tab_1;

                        indice_du_tab_3 = indice_du_tab_3 + 2;

                        System.out.println("indice tab 3 : " + indice_du_tab_3);


                    } else {

                        tab3[indice_du_tab_3] = minimum_du_tab_1;

                        tab3[indice_du_tab_3 + 1] = minimum_du_tab_2;

                        indice_du_tab_3 = indice_du_tab_3 + 2;

                        System.out.println("indice tab 3 : " + indice_du_tab_3);


                    }

                }


                i++;

                System.out.println("tour : " + i);


            }


        }

       int[] tab = {1, 5, 6, 7, 8, 9, 14, 25, 30};

        //System.out.println(tab[tab.length - 1]);

        inscription(4, tab);
      pion();
      int[] tab = {13, 5, 18, 12, 4, 6};

        rechercheVal(15, tab);
        rechercheVal(13, tab);
        rechercheVal(6, tab);
      exo23();
      exo_22();
       ask_3_nombre(2,5,4);
      min_de_10_entier();
      puissanceDe_n(2,4);
      puissanceDe_n(1);
      askCalcule();
      TableDemultiplicationDe1A9();
       tableDe2();
       RapportDesNotes(-1);
        RapportDesNotes(0);
        RapportDesNotes(1);
        RapportDesNotes(10);
        RapportDesNotes(13);
        RapportDesNotes(18);
        RapportDesNotes(20);
        RapportDesNotes(25);
       Scanner scanner = new Scanner(System.in);
Calculatrice();
 DistributeurDeBoissons();
        estBissextille(2000);
        estBissextille(1996);
        estBissextille(1900);
        estBissextille(1997);

 LanceurDeBalles();


        System.out.println("Insérez une année : ");

        int année = Integer.parseInt(scanner.nextLine());

        boolean div4 = année % 4 == 0 ;
        boolean div100 = année % 4 == 0 ;
        boolean div400 = année % 4 == 0 ;

        if(div4 && !div100 || div400){

            System.out.println("est bisextille");
        }else {

            System.out.println("est pas bisextille");
        }
        */
//#endregion

