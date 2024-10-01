//import java.util.Random;
//
//public class DiceRoller {
//    DiceRoller(){ // erstellen wir einen Konstruktur
//
//        Random random = new Random();
//        int number = 0;
//        roll();
//    }
//    void roll(){// die methode um rolldice auszuführen
//        number = random.nextInt(6)+1; // da wir sonst normalweise 0 bis 5 bekommen
//        System.out.println(number);
//        // Hier haben wir das problem das die beide Random instanz und int nummer locale sind, die Roll methode hat deswegen keine zugriff darauf. und hier haben wir zwei lösungen dazu!
//    }
//}

//import java.util.Random;
//
//public class DiceRoller {
//    DiceRoller(){
//        Random random = new Random();
//        int number = 0;
//        roll(random, number);// wir können die beide in unsere Methode als Argumente hinzugügen
//    }
//    void roll(Random random, int number){ // auch hier.
//        number = random.nextInt(6)+1;
//        System.out.println(number);
//
//
//
//    }
//}


// oder wir können unsere Variablen außerhalb unsere Konstruktur deklarieren !

import java.util.Random;

public class DiceRoller {
    Random random;
    int number;
    DiceRoller(){
//        Random random = new Random();
//        int number = 0;
        random = new Random();
        number = 0;
        roll(random, number);// wir können die beide in unsere Methode als Argumente hinzugügen
    }
    void roll(Random random, int number){ // auch hier.
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}