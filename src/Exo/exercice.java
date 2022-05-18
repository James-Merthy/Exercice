package Exo;

import com.sun.source.tree.CaseTree;

import java.util.Scanner;

public class exercice {

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
            System.out.println(min);


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

                    tab[pos - 1] = pion;


                    if (gauche < 0) {

                        System.out.println("error mouvement imposimble");


                    } else {

                        afficherTabString(tab);
                    }

                    break;

                case "d":

                    tab[pos + 1] = pion;




                    if (droite > tab.length - 1) {

                        System.out.println("error mouvement impossible");


                    } else {

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

    public static void main(String[] args) {

        pion();


    }
}
      /*
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