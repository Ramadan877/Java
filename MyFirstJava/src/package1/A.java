package package1;
import package2.*;// importieren wir hier alles von package 2

public class A {
// (1)//    public static void main(String[] args){
//        C c = new C();
//        System.out.println(c.defaultMessage);// wir können darauf nicht zugreifen, und der Grund dafür ist dass wir nur das sehen können was innerhalb unserer package ist. wir können das jzt vom Asub klasse versuchen ! wir müssen das hier zuerst rauskommentieren.

// (2)
        // lass uns jetzt aber eine zweite variable in C erstellen

//        C c = new C();
//        System.out.println(c.publicMessage);// jzt können wir das schon sehen, der Grund dafür ist weil wir auf alles was innerhalb unserem Pfad und public ist zugreifen können.

        // (3)
        // lass uns jzt protected access modifier auch lernen, in C klasse
        // (3)
        protected String protectedMessage = "This is protected";// protected access modifier bedeutet, das wir auf diese klasse zugreifen können, auch von andere packages, sobald die klasse von dem wir darauf zugreifen eine sub-klasse ist also vererbt diese klasse.
     // dann nehmen wir unsere main Methode und fügen es in unsere Asub klasse hinzu.
//        public static void main(String[] args){
//            Asub asub = new Asub();
//        }

//    // (4)
//    public static void main(String[] args){// und diese main methode vom Asub löschen.
//
//        B b = new B();// und ich will auf die privateMessage von die Klasse B darauf zugreifen.
//        System.out.println(b.privateMessage);// und hier können wir sehen das wir darauf nicht zugreifen können.
//        }
}



