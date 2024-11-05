//public class App {
//    public static void main(String[] args) throws Exception {
//    }
//}
// two steps happen under the hood:
// compilation :
//
// source code -> Java compiler -> Byte code
//
//
// Execution :
// Byte code ".class" -> Java Virtual Machine -> Native code "Windows, Mac..."
//
// Variables:
//
//public class App {
//    public static void main(String[] args) {
//        int age = 30, temperature = 20;
//        System.out.println(age);
//        System.out.println(temperature);
//
//    }
//}
//
//public class App {
//    public static void main(String[] args) {
//        int myAge = 30;
//        int herAge = myAge;
//        System.out.println(herAge);
//    }
//}
//
// Primitive types:
//primitive -> for storing simple values
//reference -> for storing complex objects
//
//
// byte = [-128, 127]
// short = 2 bytes
// int = 4 bytes
// long = 8 bytes
// float = 4 bytes
// double = 8 bytes
// char = 2 bytes
// boolean = 1 byte
//
//
//public class App {
//    public static void main(String[] args) {
//        byte age = 30;
//        int viewsCount = 123_456_789;
//        int viewsCount2 = 3_123_456_789;// we get an error that the number is too large for an integer, so let's change it into a long
//        long viewsCount3 = 3_123_456_789;// the reason is that by default Java sees values as an integer, so java compiler still thinks this value as an integer.
//
//        long viewsCount4 = 3_123_456_789L;
//
//        float price = 10.99;// java sieht diese  Nummber auch als double, so :
//        float price2 = 10.99F;
//
//        char letter = 'A';
//
//        boolean isEligible = false;
//        System.out.println();
//    }
//}
//
//
//
//
////Primitive types:
//
//import java.util.Date; // java wird diese Zeile automatisch importieren sobald wir Date java.utils auswählen wenn wir Date als Variable definieren.
//
//public class App {
//    public static void main(String[] args) {
//        byte age = 30;
//        Date now = new Date();
//        // Date. "dann sehen wir dass es verschiedene primitive members gibt, und nicht wie age zb.
//
//        System.out.println(now); // dann sehen wir die aktuelle Zeit unserer Machine
//        System.out.println();
//    }
//}
//
//
//
//primitive und reference types:
//
//
////primitive:
//public class App {
//    public static void main(String[] args) {
//        byte x = 1;
//        byte y = x;
//        x = 2;
//        System.out.println(y);// sehen wir dass y nicht beeinflusst ist, da x und y total unabhängig voneinander sind
//    }
//}
//
////Reference;
//
//import java.awt.*;// ist automatisch hinzugefügt sobald wir Point .awt auswählen
//
//public class App {
//    public static void main(String[] args) {
//        Point point1 = new Point(1, 1);
//        Point point2 = point1;
//        point1.x = 2;
//
//        System.out.println(point2);// reference types sind mit der Referenzen kopiert, gegenseitig primitive types sind mit der Values kopiert.
//    }
//}
//
//
// import java.util.Locale;
//// Strings:
//public class App {
//    public static void main(String[] args) {
//        String message = "Hello world" + " !! ";
//
////        message.endsWith(" !! "); // eine methode die prüft ob unsere message mit dem string als parameter gegeben endet, auch startsWith methode
////        message.startsWith("!!")
//
////        System.out.println(message.endsWith(" !! "));
////        System.out.println(message.startsWith(" !! "));
////        System.out.println(message.length());
////        System.out.println(message.indexOf("e")); // das gibt uns der index in dem dieses Charakter den wir als parameter reingeben passiert.
////        System.out.println(message.indexOf("sky"));
////        System.out.println(message.replace(" !! ", "*"));
////
////        // der Unterschied zwischen Arguments und Parameters ist das Parameters sind die Variablen die wir später definieren und ändern können, Arguments sind die neue Werte die wir als im Platz der Parameters reingeben.
////
////        System.out.println(message);// sehen wir dass unsere String nicht geändert wurde, da in Java Strings immutable sind, wir können unsere Strings nicht ändern, und zwar, alle methoden die wir verwenden um einen String zu modifizieren, geben uns ein ganz neuen String zurück.
////
////        System.out.println(message.toLowerCase());
////        System.out.println(message.toUpperCase());
//        System.out.println(message.trim());
//        System.out.println(message.trim().length());
//    }
//}
//
//
//public class App {
//    public static void main(String[] args) {
////          String message = "Hello \"Mosh\"";
////          String message = "c:\\Windows\\...";
////            String message = "c:\tWindows\\..."; //tab zwischen c und windows
////            String message = "c:\nWindows\\...";// Breakpoint, den Rest wird in eine neue Zeile angezeigt.
//
//
//
//
//        System.out.println(message);
//    }
//}
//
//
//Arrays sind verwendet um mehrere Werte innerhalb vom einzelne Variable zu speichern.
//
//import java.util.Arrays;
//
//public class App {
//    public static void main(String[] args) {
//        int[] numbers = new int[5]; // da Arrays den Referenz type hat, müssen wir mit new anfangen
//        numbers[0] = 1;
//        numbers[1] = 2;
////        numbers[10] = 3; // da bekommen wir einen Error"Exception" und das ist den Art wie Java ein Fehler Zeigt.
// wenn wir das jetzt ausdrücken, bekommen wir zufällige Werte, da Java Jeder Objekt in einen verschiedenen Speicher Ort speichert.
//
//        System.out.println(numbers);
//        System.out.println(Arrays.toString(numbers));// Wir bekommen unsere erste Zwei Werte, und die restlichen Werte werden by default auf 0 eingesetzt, oder wenn unsere Array ein Boolean Array ist kriegen wir einen False.
//    }
//}// Das ist aber eine anstrengende Methode um Arrays zu definieren, und zwar machen wir unsere Array definition wie folgendes;
//
//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//
//public class App {
//    public static void main(String[] args) {
//            int[] numbers = {2, 3, 5, 1, 4};
////        int[] numbers = new int[5];
////        numbers[0] = 1;
////        numbers[1] = 2;
////        numbers[2] = 3;
////        numbers[3] = 4;
////        numbers[4] = 5;
//
//        System.out.println(numbers.length);
//        // in Java Arrays haben bestimmte große, und sobald wir unsere große definieren können wir keine Werte hinzufügen oder löschen.
//
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//    }
//}
//
// wenn das Array int[] wir dürfen nur integers reingeben, gleichfalls wenn es ein String[] ist dann dürfen wir nur String reingeben.
//
//
//public class App {
//    public static void main(String[] args) {
//        String[] cars = {"Camaro", "Corvette", "Tesla"};
//
//        cars[0] = "Mustang"; // um den Wert unsere erste Element umzuschreiben.
//        System.out.println(cars[0]);
//
//
//    }
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//// Zwei Dimensioales Array:
//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//
//public class App {
//    public static void main(String[] args) {
//        int[][] numbers = new int[2][3];
//        numbers[0][0]= 1;
//        System.out.println(Arrays.toString(numbers));// nocheinmal bekommen wir ein komisches string, da es hier um einen multidimensionales Array geht, können wir folgendes machen :
//        System.out.println(Arrays.deepToString(numbers));//und diese Methode wird verwendet um multidimensionales array auszudrucken.
//
//    }
//}
//
//
//
//
//
//
//
//
//
//
//// Drei Dimensioales Array:
//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//
//public class App {
//    public static void main(String[] args) {
//        int[][][] numbers = new int[2][3][5];
//        numbers[0][0][0]= 1;
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(Arrays.deepToString(numbers));
//
//    }}
//
//
//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//
//public class App {
//    public static void main(String[] args) {
//        int[][] numbers = { { 1, 2, 3}, {4, 5, 6 } };
//        System.out.println(Arrays.deepToString(numbers));
//
//    }
//}
//
//// Constants:
//
//public class App {
//    public static void main(String[] args) {
//        float PI = 3.14F;
//        PI = 1;// in diesen Moment, werden alle unsere berchnungen abgebruchen. deswegen verwenden wir hier einen Final vor dem float definition, damit es eine Finales Wert hat, das nicht geändert werden konnte.
////        final float PI = 3.14F;
//
//    }
//}
//
//
//
//// Arthmetic Expressions:
//
//public class App {
//    public static void main(String[] args) {
//        int result = 10 + 3;
//        int result1 = 10 - 3;
//        int result2 = 10 * 3;
//        int result3 = 10 / 2;
//        int result4 = 10 % 3;
//
//        System.out.println(result);
//        System.out.println(result1);
//        System.out.println(result2);
//        System.out.println(result3);
//        System.out.println(result4);
//
//        // Was gibt uns aber ;
//        int result5 = 10 / 3;
//        System.out.println(result5);// deswegen müssen wir unsere Wert auf einen double ändern;
//        double result6 = (double)10 / (double)3;
//
//        System.out.println(result6);
//    }
//}
//
// Increment und Decrement Operator;
//
//public class App {
//    public static void main(String[] args) {
//////        int x = 1;
////////        x++;// oder :
////////        ++x;
//////        System.out.println(x);
////        int x = 1;
////        int y = x++;// in diesem Fall y wird den Wert von x zugewiesen bekommen, und zwar die 1, und danach die x wird mit 1 incremented, und zwar das neue Wert wird 2.
////        System.out.println(x);
////        System.out.println(y);
//// auf der andere Seite:
//        int x = 1;
//        int y = ++x;// in diesem fall x wird zuerst mit 1 incremented, danach wird den Wert von x zu y zugewiesen.
//        System.out.println(x);
//        System.out.println(y);
//    }
//}
//
//// wie wäre es wenn wir eine Wert mit 2 incrementieren wollen und nicht nur mit 1:
//public class App {
//    public static void main(String[] args) {
////        int x = 1;
//////        x = x + 2;
//////        System.out.println(x);
//        // oder verwenden wir die augmented oder compound assinment operator:
////        x += 2;
////        x -= 2;
////        System.out.println(x);
//
//    }
//}
//
//
//// order of operations :
//
//public class App {
//    public static void main(String[] args) {
////        int x = 10 + 3 * 2;
//        int x = (10 + 3) * 2;
//        System.out.println(x);
//    }
//}
//
//
//
//
//// Casting:
//
//public class App {
//    public static void main(String[] args) {
//
////        short x = 1; // short -> 2 bytes
////        int y = x + 2; // int -> 4 bytes
////        // Implicit Casting
////        // byte -> short -> int -> long -> float -> double
//
////        double x = 1.1;
//////        int y = x + 2; // wir müssen das auch auf double ändern da wir hier einen double auf der linke Seite haben.
////        double y = x + 2; // da double mehr präzise Werte haben, in diesem Fall wird unsere 2 Wert auf 2.0 konvertiert, und danach mit der x addiert.
//
////        // Wie wäre es wenn wir auf der Dezimal nummer verzichten wollen:
////        int y = (int)x + 2;
////
////        // und das ist explizit casting
////        System.out.println(y);
//
//        // Wie wäre es wenn x ein String ist:
////        String x = "1";
//        // wir können String casting zum integer machen, aber es gibt eine methode mit dem wir unsere int auf string wechseln können ;
////        Integer.parseInt(x)
////                // wir haben auch parseShort(), die ein String nimmt und gibt ein short zurück.
////        Short.parseShort()
////                Float.parseFloat()
//
////        String x = "1";
////        int y = Integer.parseInt(x) + 2;
////        System.out.println(y);
////
////        // Warum sollen wir String auf int überhaupt ändern !
////        // in die meisten Frameworks, wir bekommen vom User einen String als input, und deswegen müssen wir diese Inputs zum Intgers ändern.
//
//        String x = "1.1";
//        double y = Double.parseDouble(x) + 2;
//
//        System.out.println(y);
//    }
//}
//
//
//
//
//// The Math Class:
//// Random Werte Erstellung:
//
//import java.util.Random;
//
//public class App {
//    public static void main(String[] args) {
//        Random random = new Random();// wir haben jetzt zugriff auf die Random instanz um einige Zufallswerte zu generieren .
//        int x = random.nextInt();
//        System.out.println(x); // die Ergibnisse sind fast unter -2milliarden, bis fast über 2Milliarden.
//        // um das Einzuschränken können wir aber einen Zahl als parameter reingeben.
//        int y = random.nextInt(6);
//        System.out.println(y);
//        // aber das hier gibt uns einen Wert zwischen 0 und 5, deswegen müssen wir einen 1 hinzufügen.
//        int z = random.nextInt(6)+1;
//        System.out.println(z);
//        // jzt ist die 0 = 1, und die 5 = 6.
//
//
//        double f = random.nextDouble();
//        System.out.println(f);
//        // das gibt uns Werte zwischen 0 und 1.
//
//
//        boolean h = random.nextBoolean();
//        System.out.println(h);
//
//
//    }
//    }
//
//
//
//
//public class App {
//    public static void main(String[] args) {
//
//        int result = Math.round(1.1F);
//        System.out.println(result);
//
////        int result1 = Math.ceil(1.1F);// das gibt uns ein Ganzzahl zurück, did größer oder gleich dieser Zahl ist, sodass die Obergrenze von 1.1 -> 2 beträgt. Jetzt haben wir einen Komplilierungsfehler, weil diese Methode eine Double zurückgibt, aber wir speichern das Ergebnis in einer Ganzzahl, also müssen wir dies hier explizit in eine Ganzzahl umwandeln:
//        int result1 = (int)Math.ceil(1.1F);
//        System.out.println(result1);
//        // und jzt sehen wir dass die Obergrenze dieser Zahl 2 ist.
//        int result2 = (int)Math.floor(1.1F);
//        System.out.println(result2);
//        // ein Floor "Untergrenze" ist also die größte ganze Zahl, die kleiner oder gleich dieser Zahl ist. in diesem Fall 1.
//
//        int result3 = Math.max(1, 2);
//        System.out.println(result3);
//        // das gibt der größeren von zwei Werten zurück, auch hier ist diese Methode überladen, sodass wir in der ersten Implementierung zwei Ganzzahlen erhalten.
//
//        int result4 = Math.max(1, 2);
//        System.out.println(result4);
//
////        int result5 = Math.random();
////        System.out.println(result5);
////                // um einen Zufallswert zwischen 0 und 1 zu generieren, auch hier erhalten wir einen Komilierungsfehler,weil diese Methode ein Double zurückgibt, also lass uns das jzt in Double ändern.
//        double result5 = Math.random();
//        System.out.println(result5); // und diese nummer ist ein Gleitkommazahl zwischen 0 und 1 .
//// wie wäre es wenn wir einen nummer zwischen 0 und 100 anstelle von 0 bis 1 !
//        double result6 = Math.random() * 100;
//        System.out.println(result6);
//        // möchten wir diese Ziffern nach dem Dezimalpunkt nicht, können wir diese Zahl entweder runden oder in eine ganze Zahl umwandeln,
//
//        double result7 = Math.round(Math.random() * 100);
//        System.out.println(result7);// wir können hier aber kein Casting verwenden also nicht den double auf int umwandeln, und in diese Methode können wir keine implizite Umwandlung machen. da wir einen Wert haben, die in 8 bytes Speicher dargestellt wird, und Int hat nur 4 bytes Speicher. deswegen können wir den Wert selbst ändern um einen typ von int zu haben:
//        int result8 = (int) Math.round(Math.random() * 100);
//        System.out.println(result8);
//
//        // wie wäre es wenn wir die Round Methode nicht verwenden, :
//        int result9 = (int) Math.random() * 100;
//        System.out.println(result9);
//        // hier wenden wir dieses Casting auf das Ergebnis dieses Methodenaufrufs an, nicht auf diesen gesamten Ausdruck, und wie wir zuvor gesehen haben, sobald wir die Zufallsmethode aufrufen, generiert sie eine Zahl zwischen 0 und 1, wenn wir diese Zahl also in eine ganze Zahl umwandeln, verlieren wir den Bruch, den wir immer Null erhalten und Null mal 100 ist 0. deswegen müssen wir den gesamten Ausdruck umschließen in Klammern.
//        int result10 = (int) (Math.random() * 100);
//        System.out.println(result10);
//
//    }
//}
//
//
//
//public class App {
//    public static void main(String[] args) {
//        double y = -10;
//        double a = Math.abs(y);// absolute ist die Zahl ohne das negativ.
//        System.out.println(a);
//
//
//        double x = 9;
//        double b = Math.sqrt(x);
//        System.out.println(b);
//
//        double z = 3.14;
//        double c = Math.round(z);
//        System.out.println(c);
//
//        double d = Math.ceil(z);
//        System.out.println(d);
//// das wird immer auf der größere Zahl abgerundet, also 3.14 wird 4
//
//        double q = 3.9;
//        double e = Math.floor(q);
//        System.out.println(e);
//        // das wird immer auf der weniger Zahl abgerundet
//
//
//    }
//    }
//
//
//// Lass uns ein programm erstellen das die Hypotenuse eines Dreiecks findet, und wir werden den Benutzer nach seite x und y fragen.
//
//import java.util.Scanner;
//
//public class App {
//    public static void main(String[] args) {
//        double x;
//        double y;
//        double z;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter side x: ");
//        x = scanner.nextDouble();
//        System.out.println("Enter side y:");
//        y = scanner.nextDouble();
//
//        // unsere Mathematische Formel sieht wie folgendes aus:
////        Die Hypotenuse ist die längste Seite eines rechtwinkligen Dreiecks, die gegenüber dem rechten Winkel liegt. (x*x) + (y*y) und dann innerhalb einer squrt funktion
//        z = Math.sqrt((x*x) + (y*y));
//        System.out.println("The Hypotenuse is : " + z);
//
//        scanner.close();// good practice
//    }
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//// Formatting Numbers:
//
//
//import java.text.NumberFormat;
//
//public class App {
//    public static void main(String[] args) {
//////        // Währungwerte:
//////        NumberFormat currency = new NumberFormat();
//////        // allerdings erhalten wir hier einen Kompilierungsfehler. Abstrakt Nummer könnte nicht instanziert werden. In Java haben wir das Konzept abstrakter klassen, einige klassen sind also abstrakt und im Grunde wie ein halbgebackener Kuchen. Wir können den neuen Operator nicht verwenden, um eine Instanz davon zu erstellen. Anderen Weg:
//////        NumberFormat Currency = NumberFormat.getCurrencyInstance();
//////        String result = Currency.format(1234567.891);
//////        System.out.println(result);
////
////        // eine andere Methode die für Formatieren von Zahlen als Prozent spezialisiert ist:
////        // wir können die Name der Variable in alle Occurences ändern mit der Refactor option wenn wir right click machen .
////        NumberFormat percent = NumberFormat.getPercentInstance();
////        String result = percent.format(1234567.891);
////        System.out.println(result);
//
////        NumberFormat percent = NumberFormat.getPercentInstance();
////        String result = percent.format(0.1);
////        System.out.println(result);
//
////        NumberFormat.getPercentInstance(); // Diese Methode gibt ein Zahlenformatobjekt zurück.
//
//        String result = NumberFormat.getPercentInstance().format(0.1);// Das heißt Methodenverkettung, wir verketten mehrere Methoden miteinander.
//        System.out.println(result);
//    }
//}
//
//
//
//
// Reading Input:
//
//
//import java.sql.SQLOutput;
//import java.text.NumberFormat;
//import java.util.Scanner;
//
//public class App {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);// wir haben dieser Scannerklasse, die im Java-Util Paket definiert ist, in die klammer vom Scanner objekt müssen wir angeben, woher werden wir Daten lesen !, Wir haben System.in zum lesen von Inputs, System.out zum Ausdrücken von outputs.
////        scanner.nextByte();// das gibt einen byte Wert zurück so lass uns das in einer Byte-Variablen speichern, sagen wir zb. das Alter einer Person, und dann geben wir ihm auf einem Terminal aus:
//        byte age = scanner.nextByte();
//        System.out.println("You are " + age);// hier konkatenieren wir einen String mit einem byte, und in diesem Szenario werden wir eine implizite Umwandlung oder eine implizite Typkonvertierung zum String.
//
//         lass uns aber die Methode println aufrufen und sagen Age :
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Age: ");
//        byte age = scanner.nextByte();
//        System.out.println("You are " + age);
//        // alles was wir eingeben wird in einer neue Zeile angezeigt, und das ist weil println Methode eine neue Zeile hinzufügt. um das zu lösen können wir einfach die Methode print stattdessen verwenden;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Age: ");
//        byte age = scanner.nextByte();
//        System.out.println("You are " + age);
//
//         Wir wäre es wenn wir einen Gleitkommawert eingeben !, wir krigen ein exception, da diese Methode nur weiße Werte analysieren kann, wenn wir eine Gleitkommazahl erhalten möchten, müssen wir "nextFloor oder nextDouble aufrufen.
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Age: ");
////        byte age = scanner.nextFloat();// da next methode Jzt einen byte zurück gibt, müssen wir unsere Variable auf float umwandeln.
//        float age = scanner.nextFloat();
//        System.out.println("You are " + age);
//
//// genauso der Fall beim String :
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Name: ");
//        String Name = scanner.next();
//        System.out.println("You are " + Name);
//
//         wenn wir aber mehr als einen Wort " Abdelrahman Ramadan" reingeben, bekommen wir nur das erste Wort, es geht darum dass zwischen jedes Wort ein eigines Token hat, und da können wir den nextLine() funktion anwenden:
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Name: ");
//        String Name = scanner.nextLine();
//        System.out.println("You are " + Name);
//
//        // Wie wäre es wenn ich ein paar leerzeichen vor meine Name eingebe,  !! da bekommen wir den leerzeichen im Terminal, und da können wir den Trim methode anwenden.
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Name: ");
//        String Name = scanner.nextLine().trim();
//        System.out.println("You are " + Name);
//
//}}
//
//
//
//     Project: Mortgage Calculator :
//    Jzt ist es Zeit für ein Projekt, ich möchte dass ihr das anwendet, was Ihr gelernt habt, um einen Hypothekenrechner aufzubauen. wenn wie dieses Program ausführen wir bekommen ein paar Fragen, die erste Frage ist der Kapitalbetrag oder die Höhe des Darlehens, das wir erhalten möchten, sagen wir 100.000 USDollar, die zweite Frage ist der jährliche Zinssatz, sagen wir drei Punkte neun, zwei prozent und die dritte Frage ist der Zeitraum in Jahren. nehmen wir an, Ihr möchtet einen Kredit für dreißig Jahre aufnehmen, dann berechnet dieses Programm unsere monatlichen Zahlungen und zeigt sie als währung an. ein paar Hinweise bevor Ihr beginnt, da ist ein formula um Mortgage payment zu calculieren,
// Mortgage gleich P oder Kapial oder der Betrag , den wir leihen werden, multipliziert mit r, was unserem monatlichen Zinssatz entspricht. das ist sehr wichtig, diese Zahl die wir hier erhalten in r, unsere jährlicher Zinssatz, den wir durch 12 dividieren müssen, wird ein prozent Zahl dargestellt, deswegen müssen wir diese Zahl durch 100 dividieren. dann müssen wir 1 zu diesem Zinssatz addieren, und ihn mit n potenzieren, wobei n die Anzahl der Zahlungen ist, also müssen wir diese Zahl mit 12 multiplizieren, um die Anzahl der Zahlungen zu berechnen. um diese Zahl mit n potenzieren müssen wir die Math.pow Methode verwenden.Math.pow(a, b), die zwei Argumente annimmt, macht weiter und verbringt zehn bis fünfzehn Minuten mit dieser Übung.
//
//import java.util.Scanner;
//import java.text.NumberFormat;
//
//public class App {
//    public static void main(String[] args) {
//        final byte Months_in_year = 12;
//        final byte percent = 100;
//        // Der Grund warum ich diese Konstante deklariert habe, ist dass ich hier keine magischen Zahlen haben wollte, wie 12 oder 4 in der monatliche Zinssatz zb.
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Principal: ");// Hier erstellen wir die erste Frage, Prinzip und wir lesen die Antwort als Ganzzahl
//        int principal = scanner.nextInt();
//        // short kann maximal einen Wert bis 32000$ speichern, was nicht so optimal ist, aber int kann bis zu 2 Milliarden speichern
//
//        System.out.print("Annual Interest Rate: ");
//        float annualInterest = scanner.nextFloat();// wir lesen dies hier als float, ich könnte double verwenden, aber der zinssatz ist eine kleine Zahl.
//        if (annualInterest <= 0) {
//            System.out.println("Annual interest rate must be greater than 0.");
//            return;
//        }
//        float monthlyInterest = annualInterest / percent / Months_in_year;
//
//        System.out.print("Period (Years) : ");
//        byte years = scanner.nextByte(); // wir haben hier byte verwendet, da die maximale Zahl, die wir hier brauchen vielleicht 30 ist, und deswegen ist byte genug.
//        int numberOfPayments = years * Months_in_year;
//
//        double mortgage = principal
//                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
//                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
//        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
//        System.out.println("Mortgage: " + mortgageFormatted);
//    }
//}
//
//
//
//// Contro Flow:
//
//// Comparison Operators: "Vergleichsopertor"
//// wir verwenden diese Operatoren um primitive Werte zu vergleichen, zb. unser x und y die gleich sind oder nicht.
//
//public class App {
//    public static void main(String[] args) {
//        int x = 1;
//        int y = 1;
//        System.out.println(x == y);// das ist die Vergleichsoperator, und das ist nicht das gleiche wie unsere Zuweisungsoperator "=".
//        System.out.println(x != y);// Ungleichheitsoperator.
//        System.out.println(x < y);
//        System.out.println(x <= y);
//        System.out.println(x > y);
//        System.out.println(x >= y);
//    }
//    }
//
// Logical Operators:
//
//public class App {
//    public static void main(String[] args) {
////        int temperature = 22;
////        boolean isWarm = temperature > 20 && temperature < 30;
////        System.out.println(isWarm);
////        // das stellt den logischen Und Operator dar.
//        int temperature = 12;
//        boolean isWarm = temperature > 20 && temperature < 30;
//        System.out.println(isWarm);
//        // java wertet diesen Ausdruck zuerst von links nach rechts aus und betrachtet die erste Bedingung, die erste bedingung ist falsch, weil die Temperatur nicht größer als 20 ist, in diesem Fall egal was wir nach dem Und operator haben, java ignoriert die anderen Ausdrücke, da der und operator true zurückgibt, nur wenn beide bedingungen erfüllt sind.
//    }
//}
//
//public class App {
//    public static void main(String[] args) {
//        // stellen wir uns vor, wie erstellen einen Antrag für die Bearbeitung von Krediten, wir möchten sehen, ob ein neuer Antragsteller dies tut, ob er für einen Kredit in Frage kommet oder nicht. und hier ist die Regel, ein Antragsteller ist berechtigt, wen er über ein hohes Einkommen oder eine gute Bonität verfügt, wenn eine dieser Bedingungen zutrifft.
//        boolean hasHighIncome = true;
//        boolean hasGoodCredit = true;
//        boolean isEligible = hasHighIncome || hasGoodCredit; // diese zwei Balken repräsentieren den Oder-operator.
//        // Wenn Java diesen Ausdruck auswertet, es beginnt auf der linken Seite, diese boolische Variable ist wahr, es spielt also keine Rolle, was wir haben, im Rest dieses Ausdrucks , false diese Bedingung nicht zutrifft, java wird den rest dieses Ausdrucks weiter auswerten, in der Hoffnung dass der nächste bedingung zutrifft
//        System.out.println(isEligible);
//                // übrigens schauen wir uns die Namen an, die ich für diese Variablen verwendet habe, die sind sehr aussagekräftig und beschreibend.
//
//    }
//    }
//
//
//public class App {
//    public static void main(String[] args) {// lass uns eine andere boolische Variable deklarieren, und zwar ob er vorbestraft ist, wir setzen dies auf "false"
//        boolean hasHighIncome = true;
//        boolean hasGoodCredit = true;
//        boolean hasCriminalRecord = true;
//        // hier ist also die Regel, die wir implementieren möchten, damit jemand für einen Kredit in Frage kommt, er sollte entweder über ein hohes Einkommen, oder eine gute Bonität verfügen und keine Vorstrafen haben.
//        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;// hier wollen wir sicherstellen, dass er kein Vorstrafen hat, darum verwenden wir den !has CriminalRecord, damit wenn es true ist dann kriegen wir einen Falsch und damit ist er nicht berechtigt für ein Kredit.
//        System.out.println(isEligible);
//
//    }}
//
//
//// If Bedingung:
//// Wir wollen folgendes umsetzen;
//// if temp größer als 30, dann es ist warm heute, Trink viel wasser, else if oder sonst wenn es zwischen 20 und 30 grad, sagen wir das Wetter ist schön heute, else oder sonst sagen wir es ist kalt da draußen, ziehe dich was warmes an.
//public class App {
//    public static void main(String[] args) {
//        int temp = 32;
//        if(temp > 30){
//            System.out.println("Es ist warm heute");
//            System.out.println("TRINK VIEL WASSER");
//        } else if (temp > 20 && temp <= 30) {
//            System.out.println("Schönes Wetter heute");
//        } else {
//            System.out.println("Es ist Kalt heute");
//        }
//    }}
//
//
//// Wir machen es einfacher:
//public class App {
//    public static void main(String[] args) {
////        int income = 120_000;
////        if (income > 100_000)
////            boolean hasHighIncome = true;// wir bekommen einen Fehler "declaration ist nicht erlaubt" daher können wir hier keine Variable deklarieren, wir können Variablen nur innerhalb von Codeblöcken deklarieren also innerhalb von die geschwummenklammern:
////        if (income > 100_000) {
////            boolean hasHighIncome = true;
////        }// Jzt haben wir ein anderes problem, diese Variable die wir hier difiniert haben, ist nur auf diesen codeblock beschränkt, sodass sie nur hier verfügbar ist, wie können sie außerhalb dieses blocks nicht darauf zugreifen, :
////        System.out.println(hasHighIncome);// wir sehen einen Kompillierungsfehler, und hier ist die lösung, wir müssen diese Variable außerhalb des Blocks deklarieren.
////        int income = 120_000;
////        boolean hasHighIncome;// hier **
////        if (income > 100_000)
////            hasHighIncome = true;
////        else
////            hasHighIncome = false;
////
////        System.out.println(hasHighIncome);
//
////        Wir können das trotzdem noch verbessern;
////        int income = 120_000;
////        boolean hasHighIncome;// hier **
////        if (income > 100_000)
////            hasHighIncome = true;
//////        else
//////            hasHighIncome = false; dieses teil brauchen wir gar nicht da es sowieso falsch zurückgibt, wenn der Bedingung nicht zutrifft.
////
////        System.out.println(hasHighIncome);
//
////        // noch besser:
////        int income = 120_000;
////        boolean hasHighIncome = income > 100_000;
////        System.out.println(hasHighIncome);// dies ist also die einfachste, eleganteste und professionellste Art, dieses Szenario zu implementieren, noch eine Verbesserung:
//        int income = 120_000;
//        boolean hasHighIncome = (income > 100_000);// persönlich bevorzuge ich es, diesen Ausdruck jedoch in klammern zu setzen technisch gesehen brauchen wir hier keine klammern, aber diese Klammern machen unseren code klarer und lesbarer.
//        System.out.println(hasHighIncome);
//
//    }}
//
//
//
////Ternary Operator:
//
//public class App {
//    public static void main(String[] args) {
//        int income = 120_000;// stellen wir uns vor das ist das Einkommen unsere Kunden, abhängig vom Einkommen, ordnen wir unserer Kunden in verschiedene Klassen zu. wenn das einkommen mehr als 100.000$ beträgt, möchten wir sie in die erste klasse einordnen, andernfalls möchten wir sie in die Economy Klasse einteilen.
////        String className;
////        if(income > 100_000)
////            className = "First";
////        else
////            className = "Economy";
////        // aber wie wir im letzten beispiel gelernt haben, dieser code sieht amateurhaft aus, und nicht professionel, und um das einfacher zu schreiben, wir geben dieser Variable einen Anfangswert zu.
////        String className = "Economy";
////        if(income > 100_000)
////            className = "First";
//////        else
//////            className = "Economy"; // dann brauchen wir dieses teil gar nicht.
////        System.out.println(className);
//        // wir können hier aber unsere Boolische Ausdruck nicht wie früher deklarieren:
////        String className = (income > 100_000), da es hier um einen String geht, aber das hier ist ein Boolean Wert, aber wir können trotzdem folgendes machen :
//        String className = income > 100_000 ? "first" : "economy";
//        System.out.println(className);
//        // das ist der ternary operator in java, es hat drei Teile, wenn diese Bedingung erfüllt ist, diesesn Wert nach dem Fragezeichen wird zurückgegeben, andernfalls wurde die zweite Wert zurückgegeben.
//
//    }
//    }
//
//
//// Switch Statements:
//
//// in java verwenden wir um verschiedene Teile des codes auszuführen, abhängig vom Wert eines Ausdrucks, ähnlich wie bei If-Anweisungen:
//// lass uns sagen wir werden einen Programm schreiben, und die Rolle des aktuellen Benutzers prüfen, und dann werden wir unterschiedliche Nachrichten drucken, oder ihnen je nach Zeile unterschiedliche Funktionen geben.
//
//public class App {
//    public static void main(String[] args) {
////        String role = "Admin";
////        if(role == "Admin")
////            System.out.println("You're an admin");
////        else if (role == "Moderator")
////            System.out.println("You're a moderator");
////        else
////            System.out.println("You're a guest");
////// das ist die methode die wir bis jzt gelernt haben,
////        switch (role){
////            case "Admin":
////                System.out.println("You're an admin");
////                break;// wir müssen hier ein Break-Anweisung hinzufügen , um aus diesem Switch-Block zu springen!, wenn wir das break Anweisung hier nicht verwenden, java wird die nächste zeile weiter ausführen sogar wenn diese Bedingung schon zutrifft.
////            case "Moderator":
////                System.out.println("You're a moderator");
////                break;
////            default:
////                System.out.println("You're a guest");
////                // und hier brauchen wir keinen break da es denn Das default was wir bekommen werden falls die andere Bedingungen nicht zutriffen.
////        }
//        // Wir können unterschiedliche Code Ausführen, abhängig vom Wert eines Ausdrucks:
//        int role2 = 1;
//        switch (role2){
//            case 1:
//                System.out.println("You're an admin");
//                break;
//            case 2:
//                System.out.println("You're a moderator");
//                break;
//            default:
//                System.out.println("You're a guest");
//        }
//    }
//    }
//
// Übung: FizzBuzz:
//
// Diese Übung ist eine beliebte Frage in Vorstellungsgesprächen. Hier sollen wir eine Zahl eingeben, wenn diese Zahl durch fünf teilbar ist, erhalten wir einen Fizz, wenn diese Zahl aber durch 3 teilbar ist, erhalten wir Buzz, wenn diese Zahl sowohl durch 5 als auch durch 3 teilbar ist, wie 15 oder 30, erhalten wir FizzBuzz, und wenn diese Zahl durch fünf oder drei teilbar ist, wie 2, erhalten wir die gleiche zahl aufgedruckt.
//
//import java.util.Scanner;
//
//public class App {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Number; ");
//        int Number = scanner.nextInt();
//
//        if (Number % 5 == 0) {
//            System.out.println("Fizz");
//        } else if (Number % 3 == 0){
//            System.out.println("Buzz");
//        }else if(Number % 5 == 0 && Number % 3 == 0){
//            System.out.println("FizzBuzz");
//        }else{
//            System.out.println(Number);
//        }
//         aber der Warnung im dritten Bedingung sagt uns was ! und zwar dass dir dritte Bedingung niemals True sein wird! in solchen Situationen sollten wir also die spezifischen Bedingungen oben und die allgemeinste unten:
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Number; ");
//        int Number = scanner.nextInt();
//
//        if(Number % 5 == 0 && Number % 3 == 0) {
//            System.out.println("FizzBuzz");
//        }else if (Number % 5 == 0) {
//            System.out.println("Fizz");
//        } else if (Number % 3 == 0){
//            System.out.println("Buzz");
//        }else{
//            System.out.println(Number);
////        }
// aber in programmierung, haben wir einen Konzept der Dry heißt, und zwar "Don't Repeat Yourself", deswegen können wir folgende Verbesserung machen :
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Number; ");
//        int Number = scanner.nextInt();
//
//        if(Number % 5 == 0) {
//            if (Number % 3 == 0){
//                System.out.println("FizzBuzz");
//            }else {
//            System.out.println("Fizz");}
//        }else if (Number % 3 == 0) {
//            System.out.println("Buzz");
//        }else{
//            System.out.println(Number);
//        }
//        }
//    }// obwohl dieses Art als ein Bad Practice betrachtet wird, wegen der hässliche Struktur des Codes, und der verschachtelte if bedingung, deswegen kann jeder seine Art von Code auswählen. je mehr du programmierst, desto klarer wird es dir, dass es keine Möglichkeit gibt, eine ideale Softwareprogrammierung zu erstelln, und dass es bei der Problemlösung nur um Kompromisse geht, jede Lösung hat bestimmte Stärke und bestimmte Schwächen.
//
//
//
//
//// For loops:
//
//public class App {
//    public static void main(String[] args) {
////        for (int i = 0; i < 5; i++) // Wir müssen hier eine Schleifen oder Zählervariable deklarieren, als nächstes fügen wir ein semikolon hinzu, um die erste Anweisung zu beenden. Dann Schreiben wir einen Boolischen Ausdruck, der bestimmt, wie oft diese Schleife ausgeführt wird. und schließlich erhöhen wir i auf diese Weise um eins, und dies ist die Grundstruktur für eine for Schleife.
////            System.out.println("Hello world");// da es nur um eine einzelne Anweisung geht, wir brauchen keine geschwummene Klammern, aber wenn es um mehrere Anweisungen geht, müssen wir die geschwummene Klammern um unsere code block zu definieren.
//        // wir können diese Zahlen auch in umgekehrter Reihenfolge ausgeben, also intialisieren wir i auf fünf und führen diese Schleife so lange aus, aber statt i zu erhöhen, dekrementieren wir es jzt
//        for(int i = 5; i > 0; i--)
//            System.out.println("Hallo again" + i);
//    }
//    }
//
//
//// wie können wir for loops zb in arrays verwenden:
//
//public class App {
//    public static void main(String[] args) {
//        String[] cars = {"Camaro", "Corvette", "Tesla"};
//
//        cars[0] = "Camaro";
//        cars[1] = "Corvette";
//        cars[2] = "Tesla";
//
//        for(int i=0; i<cars.length; i++){
//            System.out.println(cars[i]);
//        }
//
//
//
//    }
//    }
//
//
//
//
//
//
//
//
//
//public class App {
//    public static void main(String[] args) {
//        String[][] cars = new String[3][3];
//
//        cars[0][0] = "Camaro";
//        cars[0][1] = "Corvette";
//        cars[0][2] = "Silverado";
//        cars[1][0] = "Mustang";
//        cars[1][1] = "Ranger";
//        cars[1][2] = "Lambo";
//        cars[2][0] = "Tesla";
//        cars[2][1] = "Ferrari";
//        cars[2][2] = "Audi";
//
//        for(int i=0; i<cars.length; i++){
//            System.out.println();
//            for (int j=0; j<cars[i].length; j++){// cars[i] damit es weiter ausführt sobald die Ende der aktuellen rows nicht erreicht hat, und sobald die drei Werte des Arrows ausgeführt sind, kommt es zur ende.
//                System.out.print(cars[i][j] + " ");// wir müssen hier print und nicht println.
//
//            }
//        }
//
//    }
//    }
//
//
//
//
//
//
//
//
//// While loops :
//
//public class App {
//    public static void main(String[] args) {// While loops sind ähnlich wie for loops in ihrer Funktionalität, aber sie unterscheiden sich in der syntax.
//        int i = 5;
//        while ( i > 0 ){
//            System.out.println("Hallo again" + i);
//            i--;
//            // wie wir sehen können, wir können dasselbe erreichen mit der while loop, jedoch ist der implementierung mit for loop etwas einfacher und sauberer. in situationen, in denen wir also im voraus wissen, wie oft wir eine oder mehrere Anweisungen ausführen möchten, ist es besser, for loop zu verwenden, while loops sind in situationen besser, in denen wir wissen nicht genau wie oft wir etwas wiederholen möchten.
//        }
//
//    }
//}
//
//
//import java.util.Scanner;
//
//public class App {
//    public static void main(String[] args) {
////        String input = "";
////        while(input != "quit");// wir wollen sagen sobald der input des users nicht quit ist, dann führen wir den Ausdruck weiter, aber dieser code funktioniert jzt nicht, da die eingabe ein string ist, der ein Referenztyp ist, und wir keine vergleichsoperatoren zwischen Referenztypen verwenden können, da diese operatoren die Adresse oder ein stringobjekt vergleichen, nicht deren Wert, wenn wir also zwei strings haben, die gleich sind "quit" und "quit", die haben jedoch verschiedenen Speicherorten, mit unterschiedliche Adressen. wir können deswegen die ungleichsoperator nicht verwenden um das Wert zu vergleichen, stattdessen müssen wir die methode "equals" verwenden.
////        while(input.equals("quit")){
////            System.out.print("Input: ");
////            Scanner scanner = new Scanner(System.in);
////            input = scanner.next();
////// aber hier, werden wir mit jeder iteration, ein neues Scannerobjekt erstellen, wenn der Benutzer also 10 Zahlen eingibt, erstellen wir 10 Scannerobjekte im Speicher. dies ist unnötig und eigentlich eine schlechte Vorgehensweise, da es unseren Speicher verschmutzt. daher ist es besser das scannerobjekt außerhalb der While Schleife:
//
//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//                while(!input.equals("quit")){
//                    System.out.print("Input: ");
//                    input = scanner.next().toLowerCase();// damit alle eingaben der User angenommen werden können, da sonst wenn er großbuchstaben reingibt, wird es nicht umgewandelt.
//                    System.out.println(input);
//        }
//    }}
//
//
//
//// Do. while loops:
//
//public class App {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        do{
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        }while (!input.equals("quit"));
//    }
//    }// Mit while loops, wir überprüfen zuerst die Bedingung, wenn die Bedingung also beim ersten mal falsch ist, wird diese Schleife nie ausgeführt, im gegensatz zu do while schleifen, überprüfen wir die Bedingung zuletzt, und zwar do while schleife wird immer mindestens einmal ausgeführtk, sogar wenn die Bedingung falsch ist.
//
//
//// Break and Continue:
//
//public class App {
//    public static void main(String[] args) {
////
////        Scanner scanner = new Scanner(System.in);
////        String input = "";
//////                while(!input.equals("quit")){
//////                    System.out.print("Input: ");
//////                    input = scanner.next().toLowerCase();
//////                    System.out.println(input);
////                    // in diesem Beispiel haben wir ein kleines bug, und zwar dass wir quit auch am ende bekommen wenn wir quit eingeben, und dass wollen wir nicht, was wir dafür machen können ist folgendes :
////        while(!input.equals("quit")){
////            System.out.print("Input: ");
////            input = scanner.next().toLowerCase();
////            if(!input.equals("quit"))
////                System.out.println(input);}
////
////        // eine andere möglichkeit ist aber, dass wir wenn der Benutzer "Quit" eingibt, aus der Schleife ausbrechen.
////        Scanner scanner = new Scanner(System.in);
////        String input = "";
////        while(!input.equals("quit")){
////            System.out.print("Input: ");
////            input = scanner.next().toLowerCase();
////            if(input.equals("quit"))
////                break;
////            System.out.println(input);
////            // Stellen wir uns vor, wenn der user ein bestimmtes wort eingibt wie "Pass" wir wollen das nicht nocheinmal ausdrücken, aber gleichzeitig wollen wir nicht ausbrechen, wir können das wie folgendes machen :
////        Scanner scanner = new Scanner(System.in);
////        String input = "";
////        while(!input.equals("quit")){
////            System.out.print("Input: ");
////            input = scanner.next().toLowerCase();
////            if(input.equals("pass"))
////                continue;
////            if(input.equals("quit"))
////                break;
////            System.out.println(input);
//// Zusammenfassend, break Anweisung beendet eine Schleife, und Continue Anweisung verschiebt die Steuerung and den Anfang einer Schleife.
//            // Wir können jzt "true" als unser loop Bedingung einsetzen, da wir diese bedingung nicht mehr brauchen da break Anweisung macht dieses Schritt für uns.
//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        while(true){
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            if(input.equals("pass"))
//                continue;
//            if(input.equals("quit"))
//                break;
//            System.out.println(input);
//        }// wir müssen aber sicherstellen, dass wir eine Break Anweisung haben, sonst werden wir am Ende bei einer Endlosschleife landen, die für immer ausgeführt wird.
//    }}
//
//
//
//// For Each loop :
//// wir verwenden for each loop um über arrays oder collections zu iterieren.
//public class App {
//    public static void main(String[] args) {
//        String[] fruits = {"Apple", "Mango", "Orange"};
////
////        for(int i = 0; i < fruits.length; i++)
////            System.out.println(fruits[i]);
//
//        // mit for each loop :
//        for(String fruit : fruits)
//            System.out.println(fruit);// nun in jeder Iteration"Fruit" wird den Wert eines Elements in diesem Array behalten. und hier müssen wir keinen numerischen Zähler oder boolischen Wert oder Incrementierungs Anweisung deklarieren.
//        // Allerdings hat diese for each schleife ein paar Einschränkungen, eine Einschränkung besteht darin, dass sie immer nur vorwärts ist, sodass wir dieses Array nicht vom ende zum anfang durchlaufen können, im gegensatz dazu können wir das leicht mit for schleife tun:
//        for(int i = fruits.length - 1; i >= 0; i--)
//            System.out.println(fruits[i]);
//        // wir beginnen mit i = fruits.length - 1 (der letzte gültige Index).
//        //Die Schleifenbedingung lautet i >= 0, um alle Indizes bis 0 zu durchlaufen.
//
//
//        // wenn wir also den index benötigen, müssen wir die klassische for loop verwenden, andernfalls ist es viel einfacher for each zu verwenden.
//    }
//    }
//
//
//
//
//// Projekt, Mortgage Calculator :
////
//// Hier will ich eine Validierung hinzufügen für jeder Eingabe, und zwar wenn der user eine ungültige eingabe reingibt, bekommt er die Frage nocheinmal.
//
//import java.util.Scanner;
//import java.text.NumberFormat;
//
//public class App {
//    public static void main(String[] args) {
//        final byte Months_in_year = 12;
//        final byte percent = 100;
//
//        int principal = 0;
//        float monthlyInterest = 0;
//        int numberOfPayments = 0;
//
//        Scanner scanner = new Scanner(System.in);
//
//        // Hier machen wir folgendes break statement:
//        while(true) {
//            System.out.print("Principal: ");
////            int principal = scanner.nextInt();
//            principal = scanner.nextInt();
//            if (principal >= 1000 && principal <= 1_000_000)
//                break;
//
//            System.out.println("Enter a value between 1000 and 1000000");
//        }// jzt ist der principal variable nur beschränkt innerhalb von diesem block und wir haben keinen zugriff darauf außerhalb dieses blocks, deswegen müssen wir ihm am Anfang noch einmal deklarieren.und die deklaration von hier entfernen "int"
//
//
//
//
//        while(true) {
//            System.out.print("Annual Interest Rate: ");
//            float annualInterest = scanner.nextFloat();
//            if (annualInterest >= 1 && annualInterest <= 30) {
//                monthlyInterest = annualInterest / percent / Months_in_year;
//                break;
//            }
//            System.out.println("Enter a value between 1 and 30");
//        }
////            float monthlyInterest = annualInterest / percent / Months_in_year;
//            // jzt haben wir noch eine Variable die nicht deklariert wurde "monthlyInterest"
//
//        while(true) {
//            System.out.print("Period (Years) : ");
//            byte years = scanner.nextByte();
//            if (years >= 1 && years <= 30) {
//                numberOfPayments = years * Months_in_year;
//                break;
//            }
//            System.out.println("Enter a value between 1 and 30");
//        }
//
//        double mortgage = principal
//                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
//                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
//        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
//        System.out.println("Mortgage: " + mortgageFormatted);
//    }
//}
//
//
//// Nested loops:
//
//import java.util.Scanner;
//
//public class App {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int rows;
//        int columns;
//        String symbol = "";
//
//        System.out.println("Enter # of rows: ");
//        rows = scanner.nextInt();
//        System.out.println("Enter # of columns: ");
//        columns = scanner.nextInt();
//        System.out.println("Enter symbol to use: ");
//        symbol = scanner.next();
//
//        for (int i=1; i<=rows; i++){
//            System.out.println();// das bewegt unserem cursor zur nächste Zeile.
//            for(int j=1; j<=columns; j++){
//                System.out.print(symbol);//wir müssen das hier aber mit einem print und nicht println.
//            }
//        }
//    }
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////GUI Application: "Graphical user interface"
//
//import javax.swing.JOptionPane;
//public class App {
//    public static void main(String[] args) {
//        String name = JOptionPane.showInputDialog("Enter Your Name: ");
//        JOptionPane.showMessageDialog(null, "Hello " + name);
////Dieser parentComponent-Parameter "null" ist wichtig, weil er das Fenster definiert, auf dem der Dialog zentriert werden soll. Wenn du null übergibst, wird der Dialog in der Mitte des Bildschirms angezeigt, da kein spezifisches Fenster (JFrame oder JPanel) als übergeordnete Komponente definiert ist.
//
////        int age = JOptionPane.showInputDialog("Enter Your Age: ");// Wenn wir jedoch das Dialogfeld verwenden, wird eine String zurückgegeben, und wir versuchen die String einer Ganzzahlvariablen "Integer" zuzuweisen. wir müssen deswegen der String in eine Ganzzahl umwandeln, mit der Methode Integer.parseInt():
//        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age: "));
//        JOptionPane.showMessageDialog(null, "You are " + age + " Years old");
//
//        Double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height: "));
//        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
//    }
//    }
//
//
//
//
// Jframe
//import javax.swing.*;
//
//public class App {
//    public static void main(String[] args) {
//        // Erstelle ein JFrame-Fenster
//        JFrame frame = new JFrame("Parent Frame");
//        frame.setSize(300, 200);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//
//        // Zeige einen InputDialog mit dem Frame als Parent
//        int age = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter Your Age:"));
//        JOptionPane.showMessageDialog(frame, "You are " + age + " years old");
//
//        // Zeige einen zweiten Dialog für die Größe, ebenfalls relativ zum JFrame
//        double height = Double.parseDouble(JOptionPane.showInputDialog(frame, "Enter Your Height:"));
//        JOptionPane.showMessageDialog(frame, "You are " + height + " cm tall");
//    }
//}
//
//
//
//
//// Strings Methoden:
//
//import java.util.Locale;
//
//public class App {
//    public static void main(String[] args) {
//        String name = "Bro";
//
//        boolean result = name.equals("Bro");// != "bro"
//        System.out.println(result);
//
//        boolean result2 = name.equalsIgnoreCase("bro"); // = "bro"
//        System.out.println(result2);
//
//        int result3 = name.length();
//        System.out.println(result3);
//
//        char result4 = name.charAt(1);// gibt uns das charakter im eingegebene index.
//        System.out.println(result4);
//
//        int result5 = name.indexOf("B");
//        System.out.println(result5);
//
//        boolean result6 = name.isEmpty();
//        System.out.println(result6);
//
//        String result7 = name.toUpperCase();
//        String result8 = name.toLowerCase();
//        String result9 = name.trim();
//        String result10 = name.replace("o", "a");
////
////        // du kanst einfach name. schreiben, dann bekommst du eine liste von funktionen die du herumpropieren kannst.
////    }
////    }
////
////
////




////
////
//////
////// Wrapper classes:
////// Wrapper class ist eine Methode mit dem wir die primitive Daten typ auf Referenz Daten typ umwandeln können.
////public class App {
////    public static void main(String[] args) {
////        Boolean a = true; // a. dann sehen wir verschiedene methode der boolean.
////        Character b = '@'; //b.
////        Integer c = 123; // c.
////        Double d = 3.14; // d.
////        String e = "Bro"; // e.
////
////        if(a == true){
////            System.out.println(true);// obwohl das ein Referenz Datentyp es wird sich verhalten wie ein primitive Datentyp und das ist die unboxing feature von java was bedeutet java compiler wir die Wrapper klasse auf primitive Klasse automatisch umwandeln.
////
////        }
////
////    }
////    }
//
//
//
//
//public class App {
//
//    public static void main(String[] args) {
//        // 1. Beispiel: Caching von Integer-Objekten mit Integer.valueOf()
//        System.out.println("Beispiel 1: Integer-Caching");
//        Integer a = Integer.valueOf(100); // Im Cache-Bereich (-128 bis 127)
//        Integer b = Integer.valueOf(100); // Dasselbe gecachte Objekt
//        Integer c = Integer.valueOf(200); // Außerhalb des Cache-Bereichs
//        Integer d = Integer.valueOf(200); // Neues Objekt
//
//        System.out.println("a == b: " + (a == b)); // true, weil `a` und `b` dasselbe Objekt sind
//        System.out.println("c == d: " + (c == d)); // false, weil `c` und `d` zwei verschiedene Objekte sind
//
//        // 2. Beispiel: Caching von Character-Objekten mit Character.valueOf()
//        System.out.println("\nBeispiel 2: Character-Caching");
//        Character x = Character.valueOf('A'); // Im Cache-Bereich (alle Characters)
//        Character y = Character.valueOf('A'); // Dasselbe gecachte Objekt
//
//        System.out.println("x == y: " + (x == y)); // true, weil `x` und `y` dasselbe Objekt sind
//
//        // 3. Beispiel: Veraltete Konstruktoren (Deprecated)
//        System.out.println("\nBeispiel 3: Deprecated-Konstruktoren");
//        @SuppressWarnings("deprecation")
//        Integer deprecatedInt = new Integer(100); // Deprecated seit Java 9
//        @SuppressWarnings("deprecation")
//        Character deprecatedChar = new Character('A'); // Deprecated seit Java 9
//
//        System.out.println("Deprecated Integer: " + deprecatedInt);
//        System.out.println("Deprecated Character: " + deprecatedChar);
//    }
//}

//
//Caching-Bereich für Integer-Objekte:
//Die Integer-Klasse verwendet einen internen Cache für Integer-Objekte mit Werten von -128 bis 127.
//Wenn Integer.valueOf(n) für einen Wert n in diesem Bereich aufgerufen wird, wird kein neues Objekt erzeugt. Stattdessen gibt Java ein bereits vorhandenes Objekt aus dem Cache zurück.
//Dieser Cache ist statisch und wird einmalig beim Laden der Integer-Klasse initialisiert.
//Warum Caching nur im Bereich -128 bis 127?
//Werte in diesem Bereich werden in der Praxis sehr häufig verwendet (z.B. Schleifenindizes, Array-Längen, Zähler).

//Werte außerhalb des Caching-Bereichs:
//Wenn Integer.valueOf(n) mit einem Wert außerhalb des Bereichs -128 bis 127 aufgerufen wird, erzeugt Java jedes Mal ein neues Integer-Objekt.
//        Dies bedeutet, dass für Integer.valueOf(-129) und Integer.valueOf(128) immer unterschiedliche Objekte erstellt werden.
//Daher führt der Vergleich mit == für diese Werte zu false, weil == überprüft, ob es sich um dasselbe Objekt handelt (Referenzvergleich).


//Verwendung von Integer.valueOf(n):
//Das Beispiel zeigt die Methode Integer.valueOf(n), um Integer-Objekte zu erstellen.
//Bei Werten im Bereich -128 bis 127 gibt valueOf(n) ein gecachtes Objekt zurück.

//Integer.valueOf() verwendet den Cache für Werte von -128 bis 127:
//Integer a = Integer.valueOf(100); und Integer b = Integer.valueOf(100); geben dasselbe Integer-Objekt zurück, daher ist a == b true.
//Integer c = Integer.valueOf(200); und Integer d = Integer.valueOf(200); erzeugen zwei verschiedene Objekte, daher ist c == d false.
//        Character.valueOf() verwendet einen Cache für alle Zeichen:
//Da Character alle möglichen Zeichen (char) cached, gibt Character.valueOf('A'); immer dasselbe Objekt zurück.
//Veraltete Konstruktoren (deprecated):
//Die Konstruktoren new Integer(100) und new Character('A') sind veraltet, aber funktionieren noch. Es wird jedoch empfohlen, sie nicht mehr zu verwenden.





////Unterschied zwischen == und .equals():
////Der ==-Operator vergleicht die Referenzen von Objekten.
////Die Methode .equals() vergleicht die Werte von Objekten.
//
//public class App {
//    public static void main(String[] args) {
//        Integer x = Integer.valueOf(128);
//        Integer y = Integer.valueOf(128);
//
//        System.out.println(x == y); // false, weil Referenzen unterschiedlich sind
//        System.out.println(x.equals(y)); // true, weil die Werte gleich sind
//    }
//}








//
//
//// Array lists:
//// im Array können wir elemente hinzufügen und löschen, aber arrays speichern nur Referenz Datentypen.
//
//import java.util.ArrayList;
//
//public class App {
//    public static void main(String[] args) {
//        ArrayList<String> food = new ArrayList<String>();
//        // ArrayList<Integer> falls wir einen integer array list erstellen wollen, da es hier um Referenz Datentyp geht.
//
//        food.add("Pizza");
//        food.add("Hamburger");
//        food.add("Hot Dog");
//
//        for(int i=0; i<food.size(); i++){// hier sollten wir normalweise food.length verwenden, aber mit arraylists verwenden wir food.size.
//            System.out.println(food.get(i));
//
//        }
//
//        // lass uns aber ein paar nützliche Methoden von arraylists anwenden:
//        food.set(0, "sushi");
//        System.out.println(food.get(0));// hier wird pizza mit sushi ersetzt.
//
//        food.remove(2);
//        food.clear();// hier löschen wir alle unsere elemente im array.
//    }
//    }
//
//
//
//
//
//
//
//
//
//// 2D ArrayLists;
//
//import java.util.ArrayList;
//
//public class App {
//    public static void main(String[] args) {
//
//        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
//
//
//        ArrayList<String> bakeryList = new ArrayList<String>();
//        bakeryList.add("pasta");
//        bakeryList.add("Donuts");
//        bakeryList.add("Croissants");
//        //        System.out.println(bakeryList);
////        System.out.println(bakeryList.get(1));
//
//        ArrayList<String> ProduceList = new ArrayList<String>();
//        ProduceList.add("tomato");
//        ProduceList.add("zucchini");
//        ProduceList.add("pepper");
//
//        ArrayList<String> drinksList = new ArrayList<String>();
//        drinksList.add("soda");
//        drinksList.add("coffee");
//
//
//        groceryList.add(bakeryList);
//        groceryList.add(ProduceList);
//        groceryList.add(drinksList);
//
//        System.out.println(groceryList);
//        System.out.println(groceryList.get(2));// um auf die dritte array zuzugreifen.
//        System.out.println(groceryList.get(2).get(1));// um auf die zweite elemente im dritte array zuzugreifen.
//    }
//    }
//
//
//
//
// Method:
// Eine Methode ist ein CodeBlock das implementiert wurde sobald es aufgerufen wird.
//
//public class App {
//    public static void main(String[] args) {
//        hello(); // da kriegen wir ein Fehler dass es nicht referenziert werden könnte von einem nicht statischen kontext, deswegen müssen wir unten einen static keyword hinzufügen.
//    }
//
////    void hello(){
////        System.out.println("Hello");
////    }
//    static void hello(){
//        System.out.println("Hello");
//    }
//    }
//
//public class App {
//    public static void main(String[] args) {
//        String name = "Bro";
//        hello(name);
//    }
////    static void hello(String name){ // um diese Methode aufgerufen zu werden, müssen wir passende parameters hier auch reingeben.
////        System.out.println("Hello " + name);
////    }
//    static void hello(String title){ // aber hier sollte die parameter nicht die gleiche name, sobald die beide ein String sind, hat die Methode Zugriff auf die parameters.
//        System.out.println("Hello " + title);
//    }
//}
//
//
//public class App {
//    public static void main(String[] args) {
//        String name = "Bro";
//        int age = 21;
//
//        hello(name, age);
//    }
//    static void hello(String name, int age){ // da hier unsere methode nur String akteptiert, obwohl wir einen int parameter im aufruf reingegeben haben, deswegen müssen wir int hier auch reingeben.
//        System.out.println("Hello " + name);
//        System.out.println("Youre " + age);
//    }}
//
//
//
//
//// Return :
//public class App {
//    public static void main(String[] args) {
//        int x = 3;
//        int y = 4;
//
////        int z = add(x,y); oder einfach :
//        System.out.println(add(x,y));
//    }
//    static int add(int x, int y){ // Hier müssen wir unsere static methode auf int umwandeln, da es hier um integers geht.
//
//        return x + y;
//
//    }}
//
//
//
//
//
//
//
// overloaded Methods:
// sind Methoden die die gleiche namen haben, aber mit unterschiedlichen parameters.
//
//
//public class App {
//    public static void main(String[] args) {
//        int x = add(1,2);
//        int y = add(1,2,3);
//        int z = add(1, 2, 3, 4);
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//    }
//    static int add(int a, int b){
//        System.out.println("This is overloaded method 1");
//        return a+b;
//    }
//    static int add(int a, int b, int c){
//        System.out.println("This is overloaded method 2");
//        return a + b + c;
//    }
//    static int add(int a, int b, int c, int d){
//        System.out.println("This is overloaded method 3");
//        return a + b + c + d;
//    }
//}
//
//// lass uns Double values auch dazu hinzufügen:
//
//public class App {
//    public static void main(String[] args) {
//        int x = add(1,2);
//        int y = add(1,2,3);
//        int z = add(1, 2, 3, 4);
//        double f = add(2.5, 3.5);
//        double g = add(3.5, 4.5, 5.5);
//        double h = add(4.5, 5.5, 6.5, 7.5);
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//        System.out.println(f);
//        System.out.println(g);
//        System.out.println(h);
//    }
//    static int add(int a, int b){
//        System.out.println("This is overloaded method 1");
//        return a+b;
//    }
//    static int add(int a, int b, int c){
//        System.out.println("This is overloaded method 2");
//        return a + b + c;
//    }
//    static int add(int a, int b, int c, int d){
//        System.out.println("This is overloaded method 3");
//        return a + b + c + d;
//    }
//    static Double add(double a, double b){
//        System.out.println("This is overloaded method 4");
//        return a + b;
//    }
//    static Double add(double a, double b, double c){
//        System.out.println("This is overloaded method 5");
//        return a + b +c;
//    }
//    static Double add(double a, double b, double c, double d){
//        System.out.println("This is overloaded method 6");
//        return a + b + c + d;
//    }// die ersten drei Methoden akzeptieren nur int Werte zwischen 2 und 4 werte, zweite drei Methoden akzeptieren nur double Werte zwischen 2 un 4 Werte.
//}
//
//
//
//
//
//// Printf methode:
//// eine optimale methode um den text in die konsole zu kontrollieren, formatieren und zuzeigen
//// die methode nimmt zu argumente ein, : format string + (objekt, variable, werte)
//// nachdem format specifier geben wir folgende combination ein wie folgendes : % (flags) (precision) (width) (conversion-character)
//
//public class App {
//    public static void main(String[] args) {
////        System.out.printf("%d This is a format string", 123);// d hier steht für unsere Dezimal Zahl
//
//        boolean myBoolean = true;
//        char myChar = '@';
//        String myString = "Bro";
//        int myInt = 50;
//        double myDouble = 10.5;
//
////        System.out.printf("%b", myBoolean);
////        System.out.printf("%c", myChar);
////        System.out.printf("%s", myString);
////        System.out.printf("%d", myInt);// für dezimalnum
////        System.out.printf("%f", myDouble);
//
////        // width: ist die minimum nummer von charakters die als ausgabe geschrieben werden.
////        System.out.printf("hello %10s", myString);// das gibt die restlichen char als leerzeichen.
////        System.out.printf("hello %-10s", myString);// das wird die variable mit unserem string genau anpassen.
////
////        // precision: das schränkt die double Zahlen ein.
////        System.out.printf("You have this much money %.2f", myDouble);
//
//        // Flags: das macht ein spezifische Wirkung abhängig vom flag .
//        System.out.printf("You have this much money %-20f", myDouble); // left justify - links anpassen
//        System.out.printf("You have this much money %+f", myDouble);// wäre das eine Negative nummer -10.5, bekommen wir das auch in die konsole.
//
//        System.out.printf("You have this much money %020f", myDouble);// jzt bekommen wir zeros neben der Zahl.
//
//        System.out.printf("You have this much money %,f", myDouble);// das fügt eine komma hinzu.
//    }
//    }
//
//
// Final Keyword:
//
//public class App {
//    public static void main(String[] args) {
//        final double pi= 3.14159;
//
//        pi = 4;
//
//        System.out.println(pi);// wenn wir eine Variable als Final deklarieren, können wir diese variable nicht mehr ändern, (genauso wie const in js)
//    }
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
// OOP in java:
//
//public class App {
//    public static void main(String[] args) {
////
////        // objekt, ist ein instanz von klasse, die attribute und methode enthält.
////// Z.b; eine Cafe Tasse könnte folgendes enthalten:
////        String color = "White";
////        double temp = 20.0;
////        boolean empty = true;
////        // dieses Cafe könnte folgende Methoden haben :
////        Drink(){
////            System.out.println("Drink your coffee");
////        }
////        // oder :
////        Spill(){
////            System.out.println("You spilled the coffee");
////        }
//
//    }
//    }
//
//
//
//
//// hier werde ich einen neuen Datei hinzufügen mit einer neue klasse car, aber du kannst es im gleichen Datei hinzufügen, du müsst aber sicherstellen das es sich außerhalb unsere App klasse befindet.
//public class App {
//    public static void main(String[] args) {
//
//        car myCar = new car();
//        System.out.println(myCar.model);
//        System.out.println(myCar.make);
//
//        myCar.drive();
//        myCar.brake();
//
//        // wir können aber mit unsere Methode eine neue Car klasse instanzieren.
//        car myCar2 = new car();
//        System.out.println();
//        System.out.println(myCar2.model);
//        System.out.println(myCar2.make);
//    }
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//// Constructors:
//// Eine methode die aufgerufen wird wenn einen objekt instanziert wurde.
//// hier erstellen wir auch eine neue Klasse Human .
//public class App {
//    public static void main(String[] args) {
////        Human human = new Human(); // ein konstruktur ist wie eine spezielle methode, und wir können sogar Argumente dazu reingeben, genauso wie Standart Methode.
////(1)
//
//        Human human = new Human("Rick", 65, 70.75);// warum sind konstrukturen nützlich überhaupt ! das gibt uns die möglichkeit, verschiedene objekte mit verschiedene attribute zu erstellen .
//
//
//        System.out.println(human.name);// das gibt uns einen null, das ist so weil wir jeden objekt zur anpassende Wert zuweisen müssen, und zwar mit this. keyword.
//
//
////        (2)
//
//        // lass uns jzt ein zweites human erstellen ;
//        Human human2 = new Human("Morty", 16, 50.3);
//        System.out.println(human2.name);
//
//        // und nun mit konstrukturen können wir objekte erstellen aber mit unterschiedliche attribute,
//
////. (3)
//
//        human2.eat();
//        human.drink();
//    }
//    }
//
//
//
//
//
//
//
//
//
//
//// Local und Global Variablen:
//// Local = ist alles was innerhalb der Methode deklariert wurde,
//// Global = ist alles was außerhalb der Methode deklariert wurde, aber ist für die Klasse sichtlich ist
//
//// Hier erstellen wir eine neue Klasse DiceRoller:
//
//public class App {
//    public static void main(String[] args) {
//
//        DiceRoller diceRoller = new DiceRoller();
//    }
//    }
//
//
//
//
//
//
//// Overloaded Constructors:
//// mehrere Konstrukturen innerhalb von einer Klasse mit der gleiche name, aber mit unterschiedliche Parametern
//
//// Lass uns hier eine Pizza klasse erstellen:
//// (1)
//public class App {
//    public static void main(String[] args) {
//        Pizza pizza = new Pizza("thick crust", "tomato", "mozzarella", "pepperoni");
//        // und jzt haben wir unsere pizza objekt.
//        System.out.println("Here are the ingredients of our pizza: ");
//        System.out.println(pizza.bread);
//        System.out.println(pizza.sauce);
//        System.out.println(pizza.cheese);
//        System.out.println(pizza.topping);
//
//
//
//        (2)
//         wie wäre es aber wenn wir cheese pizza möchten, ohne topping ! wenn wir die parameter für die topping löschen bekommen wir einen error, da wir nur drei parameters haben und wir müssen vier parameters reingeben !
//
//
//
//
//
//
//
//        Pizza pizza = new Pizza("thick crust", "tomato", "mozzarella");
//        // und jzt haben wir unsere pizza objekt.
//        System.out.println("Here are the ingredients of our pizza: ");
//        System.out.println(pizza.bread);
//        System.out.println(pizza.sauce);
//        System.out.println(pizza.cheese);
//
//
//        (3)
//         wie wäre es wenn wir jzt unsere pizza wegan machen wollen, und zwar ohne mozzarella !
//
//        Pizza pizza = new Pizza("thick crust", "tomato");
//        // und jzt haben wir unsere pizza objekt.
//        System.out.println("Here are the ingredients of our pizza: ");
//        System.out.println(pizza.bread);
//        System.out.println(pizza.sauce);
//    }
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//// ToString method:
//// Spezielle Methode, die alle objekte vererbt, und gibt ein string zurück, das ein objekt "textlich" repräsentiert
//
//public class App {
//    public static void main(String[] args) {
//        // für unsere Car klasse;
//        car car = new car();
////
////        System.out.println(car.make);
////        System.out.println(car.model);
////        System.out.println(car.color);
////        System.out.println(car.year);
//        // dis sind um die car attitude auszugeben, aber wie wäre es mit der car selbst:
//
//        System.out.println(car);// und zwar das ist die adresse von car klasse in Speicherplatz.
//
//        System.out.println(car.toString());// da werden wir unsere toString() methode umschreiben, damit wir die Eigenschaften vom car bekommen anstatt die adresse.
//
//        // und wie wir sehen können diese Methode können wir explizit sowohl als auch implezit verwenden
//    }
//    }
//
//
//
//
//
//// Array von objects:
//
//public class App {
//    public static void main(String[] args) {
////        int[] numbers = new int[3];
////        char[] characters = new char[3];
////        String[] strings = new String[3]; // das ist wie wir normalweise einen Array erstellen können.
//
//        // Hier erstellen wir einen Food Klasse
//
//        Food[] refrigerator = new Food[3];// ein Array das drei objekte hat.
//
//        Food food1 = new Food("pizza");
//        Food food2 = new Food("hamburger");
//        Food food3 = new Food("hotog");
//
//        refrigerator[0] = food1;
//        refrigerator[1] = food2;
//        refrigerator[2] = food3;
//        // Eine andere Methode die deklarierung unseres Arrays wäre wie folgendes:
////        food[] refrigerator = {food1, food2, food3};
//
//        System.out.println(refrigerator[0].name);
//        System.out.println(refrigerator[1].name);
//        System.out.println(refrigerator[2].name);
//        // ich versuche hier auf die Eigenschaft name darauf zugreifen.
//
//    }
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//// objekte als argumente weitergeben:
//
//// parameters übergeben :
//class Car {
//    String name; // wir deklarieren das zuerst als Variable.
//
//    Car(String name) {// hier geben nur einen parameter als String rein
//        this.name = name;
//    }
//}
//public class App {
//    public static void main(String[] args) {
//// wir haben hier zwei andere klassen, Garage klasse und Car klasse; was wir hier machen werden, ist unsere garage klasse ein paar car klasse übergeben.
//
//
//        Garage garage = new Garage();
//        Car car1 = new Car("BMW"); // lass uns sagen wir wollen einen BMW in unsere Garage Klasse übergeben, lass uns eine methode in unserer Garage klasse erstellen, die park() heißt.
//        Car car2 = new Car("Tesla");
//
//
//        garage.park(car1);// um die garage.park methode zu verwenden müssen wir einen Car Datentyp objekt verwenden, da wir es hier als parameter schon gegeben haben in unsere Garage klasse.
//        garage.park(car2);
//
//
//    }}
//
//    class Garage {
//    void park(Car car){// genau wie wir es machen mit String name, da Strings sind auch objekte. aber jzt können wir nur cars parken, und nicht Fahhräder zb. und das ist die parameter das wir verwenden sollen für diese methode.
//        System.out.println("the " + car.name + " is parked in the garage");
//    }
//}
//
//
//
//
//
//
//
//
//
//
//// Inheritance:
//// Eine prozess wo eine Klasse die Attribute und Methoden eine andere Klasse besitzt.
//
//public class App {
//    public static void main(String[] args) {
//        // wir haben hier unsere klasse mit main methode, eine bicycle klasse, car klasse und Vehicle klasse.
//        // was ich machen soll ist das die beide bicycle und car klasse alles von vehicle klasse vererben.
//
//
////        (2)
//        Car car = new Car();
//        car.go(); // da car vererbt alles vom Vehicle klasse, wir können auch die methoden der Vehicle klasse hier anwenden
//        Bicycle bike = new Bicycle();
//        bike.stop();
//
//        System.out.println(car.speed);
//        System.out.println(bike.speed);
//
////        (3)
//        System.out.println(car.doors);
//        System.out.println(bike.pedals);
//    }
//    }
//
//    class Vehicle{
//
//        double speed;
//
//        void go(){
//            System.out.println("This vehicle is moving");
//        }
//        void stop(){
//            System.out.println("This vehicle has stopped");
//        }
//    }
//    // um die klasse und methoden in vehicle klasse zu vererben müssen wir die methode extends verwenden.
//
//    class Bicycle extends Vehicle{
//
//
//    // (3)
//        int wheels = 2;
//        int pedals = 2;
//
//    }
//
//    class Car extends Vehicle{
//
//    // (3)
//        int wheels = 4;
//        int doors = 4;
//    }
//// und zwar definieren wir alle common variablen und methoden in unsere allgemeine Klasse ( vehicle klasse ) und nur die spezifischen klassen können wir in die car und bicycle klassen definieren.
//
//
//
//
//
//
//
//
//
//
//
//
//
//// Method overriding;
//
//// deklaration einer Methode in einer sub-klasse, welche bereits in parent klasse dargestellt wurde, sodass eine childklasse ihre eigene implementation ausführen kann.
//
//public class App {
//    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.speak();// hier geben wir diese klasse ihre eigene implementation (speak) .
//
//        Animal animal = new Animal();
//                animal.speak();// hier wird die Animal die originale parent Methode implementieren und nicht die child methode.
//
//    }
//    }
//
//
//
//class Animal {
//    void speak(){
//        System.out.println("The animal speaks");
//    }
//}
//class Dog extends Animal{
//
//    @Override
//    void speak(){
//        System.out.println("The dog is barking"); // hier schreiben wir unsere methode um "speak"
//    }
//}
//// jzt die Animal klasse ist die parent klasse, und die dog klasse ist die child klasse.
//
//
//
//
//
//
//
//
//
//
//// Super keyword:
//// das super wort referenziert der parent vom Objekt, ähnlich zur this. wort.
//
//public class App {
//    public static void main(String[] args) {
//        Hero hero1 = new Hero("Batman", 42, "$$$");
//
//        System.out.println(hero1.name);
//        System.out.println(hero1.age);
//        System.out.println(hero1.power);
//
//
//    }
//    }
//    class Person{
//        String name;
//        int age;
//
//        Person(String name, int age){
////            (2)
//            this.name = name;
//            this.age = age;
//        }
//    }
//    class Hero extends Person{
//    String power;
//
//        Hero(String name, int age, String power){// wir müssen die parameters für unsere hero hier reingeben
////        this.name = name;
////        this.age = age;
////        this.power = power;
//        // das ist aber nicht die optimale Methode um das zu machen ! da wir schon unsere name und age in unsere person klasse deklariert haben, wir müssen diese zu unsere person konstruktur klasse zuweisen, und nur die power variable können wir in unsere hero klasse mit der this.power methode zuweisen.
//        // (2)
//        super(name, age);
//        this.power = power;// dann können wir unsere name und age rauskommentieren.
//
//    }
//    }
//
//    // lass uns jetzt eine anderes hero hinzufügen :
//
//public class App {
//    public static void main(String[] args) {
//        Hero hero1 = new Hero("Batman", 42, "$$$");
//        Hero hero2 = new Hero("Superman", 43, "everything");// Hier erstellen wir einen zweiten hero.
//
//        System.out.println(hero1.name);
//        System.out.println(hero1.age);
//        System.out.println(hero1.power);
//
//        System.out.println(hero2.toString());
//
//
//
//    }
//}
//class Person{
//    String name;
//    int age;
//
//    Person(String name, int age){
////            (2)
//        this.name = name;
//        this.age = age;
//    }
//    public String toString(){// lass uns hier sagen unsere person klasse hat eine toString() methode um die name und age zu zeigen.
//        return this.name + "\n" + this.age + "\n";
//    }
//}
//class Hero extends Person{
//    String power;
//
//    Hero(String name, int age, String power){
//        super(name, age);
//        this.power = power;
//    }
//    public String toString(){// und hier haben wir auch einen toString methode für unsere hero klasse, und wir wollen toString von unsere super klasse aufrufen.
//        return super.toString()+this.power;
//    }
//}
//
//
//
//
////
////
////
////
////
////
////
////Abstract = abstract klassen können nicht instanziert werden, aber sie können eine sub-klasse haben,
//// abstract Methoden werden ohne implementation deklariert.
//
//
//// stellen wir uns vor, wie haben einen Auto Geschäft, und jemand kommt zu uns und fragt über einen Fahrzeug, wenn wir ihm aber fragen welches möchte er genau haben, beantwortet er dass er nur einen Fahrzeug haben möchte, welchs Abstract ist, da ein Fahrzeug eine Idee ist, und deswegen muss er genau sagen welche Typ von Fahrzeug möchte er ganau haben ! und das ist genau was wir nicht passieren wollen, das jemand eine abstract objekt instanziert:
//
//
//public class App {
//    public static void main(String[] args) {
//
//        Car car = new Car();
//        car.go();
//
//        // Uncommenting the line below will result in an error, since Vehicle cannot be instantiated.
//        // Vehicle vehicle = new Vehicle(); // Fehler: Vehicle ist eine abstrakte Klasse und kann nicht instanziiert werden.
//    }
//}
//
//// Die abstrakte Klasse Vehicle
//abstract class Vehicle {
//    // Abstrakte Methode, die keine Implementierung hat.
//    abstract void go();
//}
//
//// Subklasse Car, die von Vehicle erbt
//class Car extends Vehicle {
//    // Die Subklasse muss die abstrakte Methode implementieren.
//    @Override
//    void go() {
//        System.out.println("The driver is driving the car");
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
// Access modifiers:
// Hier erstellen wir zwei packages innerhalb unserer Pfad, package 1 = klasse A und B, package 2 = Klasse C und Asub ein package ist eine collection von klassen, aber eine klasse ist eine collection von codes.
//
//
//
//
//
//
//
//
// Encapsulation:
// Attributes einer Klasse werden unsichtlich oder privat, könnte nur durch getters und setters darauf zugegriffen werden.
// Attribute sollten private eingestellt, sobald wir kein Grund haben um sie public oder protected einzustellen.
//
//
//
//public class App {
//    public static void main(String[] args) {
//
//        Car car = new Car("Chevrolet","Camaro",2021);
////        System.out.println(car.make);//Hier können wir nicht darauf zugreifen, da es auf private eingestellt wurde, und zwar nur die Car klasse hat zugriff darauf, hier können wir nur darauf zugreifen mit dem get methode.
////        // (2)
//        System.out.println(car.getMake());
//        System.out.println(car.getModel());
//        System.out.println(car.getYear());
//    }
//    }
//
//    class Car{
//    private String make;
//    private String model;
//    private int year;
//
//    Car(String make, String model, int year){
//        this.make= make;
//        this.model= model;
//        this.year= year;
//    }
//// (2)
//    public String getMake(){
//        return make;
//    }
//    public String getModel(){
//        return model;
//    }
//    public int getYear(){
//        return year;
//    }// danach um auf diese Attribute zuzugreifen, müssen wir die get aufrufen
//}
//
//
//
//
//// aber wie können wir die private attribute einer objekte ändern !
//
//public class App {
//    public static void main(String[] args) {
//
//        Car car = new Car("Chevrolet","Camaro",2021);
//
//        System.out.println(car.getMake());
//        System.out.println(car.getModel());
//        System.out.println(car.getYear());
//
//        // (3)
////        car.year = 2022;wir können das hier aber nicht ändern da es privat ist deswegen müssen wir eine setter methode erstellen.
//        // (4)
//        // und jzt können wir die Werte unsere attribute ändern:
//        car.setYear(2022);
//        System.out.println(car.getMake());
//        System.out.println(car.getModel());
//        System.out.println(car.getYear());
//    }
//}
//
//class Car{
//    private String make;
//    private String model;
//    private int year;
//
//    Car(String make, String model, int year){
////        this.make= make;
////        this.model= model;
////        this.year= year;
//        this.setMake(make);
//        this.setModel(model);
//        this.setYear(year);
//    }
//    // (2)
//    public String getMake(){
//        return make;
//    }
//    public String getModel(){
//        return model;
//    }
//    public int getYear(){
//        return year;
//    }
//    // (3)
//    public void setMake(String make){
//        this.make = make;
//    }
//    public void setModel(String model){
//        this.model = model;
//    }
//    public void setYear(int year){
//        this.year = year;
//    }
//    // da wir hier die make, model und year mit einem setter methode einstellen, wir brauchen das nicht wieder am Anfang zu machen this.make = make; stattdessen können wir die methode aufrufen innerhalb unserer Konstruktur.
//}
//
//
//
//
//
//
//
//
//
//
//
//// objekte kopieren in java:
//
//public class App {
//    public static void main(String[] args) {
//        Car car1 = new Car("Chevrolet", "Camaro", 2021);
//        Car car2 = new Car("Ford", "Mustang", 2022);
//// ich will zuerst die adresse unsere objekte kopieren wo diese objekte gespeichert sind.
//        System.out.println(car1);
//        System.out.println(car2);
//        System.out.println();
//        System.out.println(car1.getMake());
//        System.out.println(car1.getModel());
//        System.out.println(car1.getYear());
//        System.out.println();
//        System.out.println(car2.getMake());
//        System.out.println(car2.getModel());
//        System.out.println(car2.getYear());
//
//        // lass uns sagen ich will die Eigenschaften von car1 zur car2 kopieren, normalweise macht man das so:
////        car1 = car2; aber das ist falsch, da car1 und car2 jzt werden die gleiche speicherplatz haben, und die gleiche Eigenschaften auch, also was wir hier gemacht haben, ist dass wir die car1 eine zweite name gegeben haben car2 und es gibt keine car2 mehr. um eine geeignete kopie methode aber zu erstellen können wir folgendes machen :
//        car2.copy(car1);// dann müssen wir diese methode in unserem car klasse definieren.
//
//        System.out.println(car1);
//        System.out.println(car2);
//        System.out.println();
//        System.out.println(car1.getMake());
//        System.out.println(car1.getModel());
//        System.out.println(car1.getYear());
//        System.out.println();
//        System.out.println(car2.getMake());
//        System.out.println(car2.getModel());
//        System.out.println(car2.getYear());
//        // jzt haben die beide die gleiche Attribute aber mit unterschiedliche speicheradresse.
//    }
//    }
//class Car{
//    private String make;
//    private String model;
//    private int year;
//
//    Car(String make, String model, int year){
//
//        this.setMake(make);
//        this.setModel(model);
//        this.setYear(year);
//    }
//    // (2)
//    public String getMake(){
//        return make;
//    }
//    public String getModel(){
//        return model;
//    }
//    public int getYear(){
//        return year;
//    }
//    // (3)
//    public void setMake(String make){
//        this.make = make;
//    }
//    public void setModel(String model){
//        this.model = model;
//    }
//    public void setYear(int year){
//        this.year = year;
//    }
//    public void copy(Car x){
////        this.setMake(make);
////        this.setModel(model);
////        this.setYear(year);// this hier steht auf car2, weil car2 das objekt ist, das diese methode aufgerufen hat.
//        // jzt wollen wir die Werte von Car x, das neue car das wir reingegeben haben mit get methode bekommen:
//        this.setMake(x.getMake());
//        this.setModel(x.getModel());
//        this.setYear(x.getYear());
//    }
//}
//
//
//
//
//
//
//
//
//// Interfaces:
//// ein template das wir auf eine Klasse anwenden können.
//// ähnlich wie vererbung aber müss eine spezification geben, was eine klasse machen muss.
//// eine klasse kann mehrere interfaces haben, aber nur einen super vererbungsklasse
//
//// Hier werden wir drei klassen und zwei interfaces erstellen.
//
//public class App {
//    public static void main(String[] args) {
//
////        (2) lass uns das jzt testen:
//        Rabbit rabbit = new Rabbit();
//        rabbit.flee();
////        (3)
//        Hawk hawk = new Hawk();
//        hawk.hunt();
//
////        (4)
//        Fish fish = new Fish();
//        fish.hunt();
//        fish.flee();
//
//
//    }
//    }
//
////    class Rabbit{// lass uns sagen der Rabbit wird der flee methode vom prey interface verwenden, dann können wir folgendes hinzufügen: class Rabbit implements Prey
////    }
//// (2)
//    class Rabbit implements Prey{
//        @Override
//        public void flee(){
//            System.out.println("The rabbit is fleeing");
//        }
//    }
//// (3)
//    class Hawk implements Predator{// lass die predator methode in die hawk klasse anwenden:
//        @Override
//        public void hunt(){
//            System.out.println("The hawk is hunting");
//        }
//    }
//
//    class Fish implements Predator, Prey {// fish könnte aber die beide interfaces verwenden
//
//        @Override
//        public void hunt() {
//            System.out.println("The fish is hunting");
//        }
//
//        @Override
//        public void flee() {
//            System.out.println("The fish is fleeing");
//        }
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//// Polymorphism:
//// Grieschisches Wort die steht für poly = many,morph = form
//// und das bedeutet die Fähigkeit eines Objekts sich als mehrere Datentypen zu identifizieren.
//
//// lass uns sagen wir haben mehrere Klassen, Vehicle "parent klasse", Car welche Vehicle vererbt, Bicycle welche Vehicle vererbt und Boat welche auch Vehicle vererbt.
//public class App {
//    public static void main(String[] args) {
//
//        Car car = new Car();
//        Bicycle bicycle = new Bicycle();
//        Boat boat = new Boat();
//        // lass uns diese objekte jzt in einem Array speichern.
////        Car[] racers = {car, bicycle, boat};// aber welches Datentyp wird dieses Array defininieren, Car, dann Bicycle und boat könnten nicht gespeichert werden, und genauso mit Bicycle und Boat Datentyp ! um dieses problem zu lösen können wir polymorphism verwenden, und zwar der Vehicle Datentyp
//        Vehicle[] racers = {car, bicycle, boat};
//
//////        (2)
////        car.go();
////        bicycle.go();
////
//        // eine bessere methode wäre eine for loop:
//        for (Vehicle x : racers){// wir verwenden x als Zähler und racers ist unsere Array
//            x.go();// wir müssen aber sicherstellen das unsere go methode in Vehicle klasse definiert ist.
//
//        }
//    }
//}
//    class Vehicle{
//
//    public void go(){
//
//    }
//}
//    class Car extends Vehicle{
//
//        @Override
//        public void go(){
//            System.out.println("The car begins moving");
//        }
//    }
//    class Bicycle extends Vehicle{
//
//        @Override
//        public void go(){
//            System.out.println("The bicycle begins moving");
//        }
//    }
//    class Boat extends Vehicle{
//
//        @Override
//        public void go(){
//            System.out.println("The boat begins moving");
//        }
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//// dynamic polymorphism: "After runtime"
// das ist genau die Idee in pokemon Spiele wo man gefragt wurde ob er ein jung oder ein mädchen ist, und danach wurde man eine liste von charakters angezeigt, die mit seinem Geschlecht geeignet sind.
//
//import java.util.Scanner;
//
//public class App {
//    public static void main(String[] args) {
//        Animal animal; // aber wir werden den user fragen welche Art von Animal dann können wir das hier spezifischer gestalten, und das ist dynamisches polymorphism, lass uns aber einpaar klassen erstellen
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What animal do you want ?");
//        System.out.println("1 -> dog or 2 -> cat:");
//        int choice = scanner.nextInt();
//
//        if (choice == 1) {
//            animal = new Dog();// instanzieren wir jzt unsere animal objekt.
//            animal.speak();
//        } else if (choice == 2) {
//            animal = new Cat();
//            animal.speak();
//        }else {
//            animal = new Animal();
//        System.out.println("That choice was invalid");
//        animal.speak();
//        }
//    }}
//
// class Animal{
//    public void speak(){
//        System.out.println("Animal goes brrrr");
//    }
//}
// class Cat extends Animal{
//  @Override
//    public void speak(){
//        System.out.println("cat goes meow");
//    }
//}
// class Dog extends Animal{
//    @Override
//    public void speak(){
//        System.out.println("dog goes park");
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//// Exception handling:
//// ein Event das passiert während ausführung des programms, und verursacht die Störung der normale ausführung der Anweisungen.
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class App {
//    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
////        System.out.println("Enter a whole number to divide: ");
////        int x = scanner.nextInt();
////
////        System.out.println("Enter a whole number to divide by: ");
////        int y = scanner.nextInt();
////
////        int z = x/y;
////
////        System.out.println("result: " + z);
//        // lass uns jzt 5 auf 0 teilen, dann bekommen wir einen Fehler: ArithmeticException .
//        // und hier können wir unsere try-catch methode verwenden, wo wir unsere gefährliches code mit try methode umgeben. wie folgendes:
//        try {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter a whole number to divide: ");
//            int x = scanner.nextInt();
//
//            System.out.println("Enter a whole number to divide by: ");
//            int y = scanner.nextInt();
//
//            int z = x / y;
//
//            System.out.println("result: " + z);
//        }// falls das ein Exception rausgibt, geben wir unsere default catch Ausgabe aus:
//        catch (ArithmeticException e){// hier geben wir das Exception den wir behandlen wollen, und dann geben wir ihm eine name wie e oder irgendwas.
//            System.out.println("You cannot divide by zero idiot !");
//        }
//        // wie wäre es aber wenn unsere user einen String objekt anstatt einen int eingibt!
//        catch (InputMismatchException e){
//            System.out.println("Please enter a number omg!");
//        }
//        // wir können aber alle exceptions auf einmal behandlen:
//        catch (Exception e){
//            System.out.println("Something went wrong");
//        }// aber ein best practice ist die unterschiedliche Exceptions einzelne zu behandlen, und dann am ende die allgemeine Exception hinzuzufügen, falls man irgendwelche exceptions vergessen hat.
////        finally {
////            System.out.println("This will always be printed");
////            scanner.close();// eine gute Verwednung der finally block ist die scanner zu zumachen, aber mann muss zuerst die Scanner methode außerhalb der try methode verschieben.
////        }
//    }
//}
//
//


// andere Exception handling methoden:

//
//1. Objects.requireNonNull(Object obj)
//Verwendung:
////Verwendung im Konstruktor, um sicherzustellen, dass ein erforderliches Argument nicht null ist.
//
//import java.util.Objects;
//
//public class App {
//
//    // Person-Klasse als verschachtelte Klasse in der App-Hauptklasse
//    static class Person {
//        private String name;
//        private int age;
//
//        // Konstruktor, der sicherstellt, dass name nicht null ist
//        public Person(String name, int age) {
//            // Überprüft, ob der Name null ist und löst eine NullPointerException aus, falls dies der Fall ist
//            this.name = Objects.requireNonNull(name, "Name darf nicht null sein!");
//            this.age = age;
//            //Wenn null als Name übergeben wird, wird eine NullPointerException ausgelöst, und der Text "Name darf nicht null sein!" wird angezeigt.
////Bei gültigen Eingaben funktioniert der Code einwandfrei.
//
//
//        }
//
//        // Methode zur Ausgabe der Personendetails
//        public void printDetails() {
//            System.out.println("Name: " + name + ", Alter: " + age);
//        }
//    }
//
//    // Hauptmethode
//    public static void main(String[] args) {
//        // Beispiel zur Demonstration von Objects.requireNonNull mit try-catch
//        try {
//            // Versucht, eine Person mit null-Name zu erstellen (löst eine Exception aus)
//            Person person = new Person(null, 25);
//        } catch (NullPointerException e) {
//            System.out.println("Fehler: " + e.getMessage()); // Gibt die benutzerdefinierte Fehlermeldung aus
//        }
//
//        // Erzeugt eine Person mit gültigem Namen
//        Person validPerson = new Person("Anna", 30);
//        validPerson.printDetails(); // Gibt aus: Name: Anna, Alter: 30
//    }
//}



//Diese Methode überprüft, ob das übergebene Objekt null ist.
//Wenn das Objekt null ist, wird eine NullPointerException ausgelöst.
//Wenn das Objekt nicht null ist, kehrt die Methode zurück und gibt das übergebene Objekt zurück.
//Typischer Verwendungszweck:
//Verwendung im Konstruktor, um sicherzustellen, dass ein erforderliches Argument nicht null ist.
//Verwendung am Anfang einer Methode, um zu verhindern, dass null-Werte verarbeitet werden.







//
//
//
//
////2. Objects.requireNonNullElse(Object obj, Object defaultObj)
//
//import java.util.Objects;
//
//public class App {
//
//    // Innere Klasse GreetingService innerhalb der App-Hauptklasse
//    static class GreetingService {
//        private String greetingMessage;
//
//        // Konstruktor, der einen Standardwert setzt, falls die Nachricht null ist
//        public GreetingService(String message) {
//            // Wenn message null ist, setze den Standardwert "Hallo, Welt!"
//            this.greetingMessage = Objects.requireNonNullElse(message, "Hallo, Welt!");
//        }
//
//        public void printGreeting() {
//            System.out.println(greetingMessage);
//        }
//    }
//
//    // Hauptmethode in der App-Klasse
//    public static void main(String[] args) {
//        // Beispiel 1: message ist null, daher wird "Hallo, Welt!" verwendet
//        GreetingService service1 = new GreetingService(null);
//        service1.printGreeting(); // Ausgabe: Hallo, Welt!
//
//        // Beispiel 2: message ist "Guten Tag!"
//        GreetingService service2 = new GreetingService("Guten Tag!");
//        service2.printGreeting(); // Ausgabe: Guten Tag!
//
//        // Beispiel 3: message ist leerer String, aber kein null
//        GreetingService service3 = new GreetingService("");
//        service3.printGreeting(); // Ausgabe: (Leer, da der String leer ist)
//
//        // Beispiel 4: Standardwert wird ersetzt mit einer benutzerdefinierten Nachricht
//        GreetingService service4 = new GreetingService("Willkommen bei Java!");
//        service4.printGreeting(); // Ausgabe: Willkommen bei Java!
//    }
//}
////Wenn null als Nachricht übergeben wird, verwendet der Konstruktor den Standardwert "Hallo, Welt!".
////Bei einer gültigen Eingabe wird die Nachricht normal verwendet.
//
//
//
////Verwendung:
////Diese Methode überprüft, ob das übergebene Objekt obj null ist.
////Wenn obj null ist, gibt die Methode defaultObj zurück.
////Wenn obj nicht null ist, kehrt sie zurück und gibt obj zurück.
////Typischer Verwendungszweck:
////Verwendung, wenn eine Standardreferenz anstelle eines null-Wertes verwendet werden soll.
////Hilfreich bei Methoden, die optionale Argumente akzeptieren, um sicherzustellen, dass ein null-Argument durch einen Standardwert ersetzt wird.



//Wann verwendet man welche Methode?
//Objects.requireNonNull:
//Diese Methode sollte verwendet werden, wenn ein null-Wert nicht akzeptabel ist.

//Objects.requireNonNullElse:
//Diese Methode ist nützlich, wenn ein null-Wert zulässig, aber nicht ideal ist.










//Andere Methoden:
//import java.util.Optional;
//
//public class App {
//
//    public static void main(String[] args) {
//        // 1. Beispiel: Erzeugung eines leeren Optional
//        Optional<String> emptyOptional = Optional.empty();
//        System.out.println("Empty Optional: " + emptyOptional); // Ausgabe: Optional.empty
//        System.out.println("Ist Wert vorhanden? " + emptyOptional.isPresent()); // Ausgabe: false // isPresent() Überprüft, ob ein Wert im Optional vorhanden ist.
//
//        // Versuch, den Wert eines leeren Optionals zu holen, führt zu Exception
//        try {
//            emptyOptional.get(); // Löst NoSuchElementException aus
//            //get():
//            //Gibt den Inhalt des Optional zurück, wenn ein Wert vorhanden ist.
//            //Wenn kein Wert vorhanden ist (leeres Optional), wird eine NoSuchElementException ausgelöst.
//        } catch (Exception e) {
//            System.out.println("Fehler: " + e.getMessage()); // Ausgabe: No value present
//        }
////        Optional ist eine Wrapper-Klasse in Java, die entweder einen Wert enthält oder leer ist.
//
////        Optional.empty():
////        Erzeugt ein Optional, das keinen Wert enthält.
////                Optional<String> emptyOptional = Optional.empty();
////        Versucht man emptyOptional.get() aufzurufen, wird eine NoSuchElementException ausgelöst.
//
//
//                // 2. Beispiel: Erzeugung eines Optional mit einem bestimmten Wert
//        Optional<String> valueOptional = Optional.of("Hallo, Welt!");
//        System.out.println("Optional mit Wert: " + valueOptional); // Ausgabe: Optional[Hallo, Welt!]
//        System.out.println("Ist Wert vorhanden? " + valueOptional.isPresent()); // Ausgabe: true
//        System.out.println("Wert: " + valueOptional.get()); // Ausgabe: Hallo, Welt!
//
//
//
//
//        // 3. Beispiel: Optional.of(null) - löst eine NullPointerException aus
//        try {
//            Optional<String> errorOptional = Optional.of(null); // Löst NullPointerException aus
//        } catch (Exception e) {
//            System.out.println("Fehler beim Erstellen von Optional.of(null): " + e.getMessage());
//        }
////        Optional.of(T value):
////        Erzeugt ein Optional mit einem bestimmten Wert.
////                Beispiel: Optional<String> valueOptional = Optional.of("Hallo, Welt!");
////        Es ist nicht erlaubt, null als Wert zu übergeben. Falls null übergeben wird, wird eine NullPointerException ausgelöst.
//
//
//
//
//        // 4. Beispiel: Optional.ofNullable - kann null akzeptieren
//        Optional<String> nullableOptional = Optional.ofNullable(null); // Erzeugt ein leeres Optional
//        System.out.println("Optional mit null (ofNullable): " + nullableOptional); // Ausgabe: Optional.empty
//        System.out.println("Wert oder Standardwert: " + nullableOptional.orElse("Standardwert")); // Ausgabe: Standardwert
//        //Optional.ofNullable(T value):
//        //Erzeugt ein Optional, das null akzeptiert.
//        //Wenn der übergebene Wert null ist, wird ein leeres Optional erzeugt.
//        //Beispiel: Optional<String> nullableOptional = Optional.ofNullable(null);
//
//
//
//
//        // 5. Beispiel: Optional mit einem Standardwert verwenden
//        // orElse(T other):
//        //Gibt den enthaltenen Wert zurück oder — falls kein Wert vorhanden ist — einen Standardwert.
//        Optional<String> optionalWithValue = Optional.ofNullable("Optional-Wert");
//        System.out.println("Wert oder Standardwert: " + optionalWithValue.orElse("Standardwert")); // Ausgabe: Optional-Wert
//
//
//
//        // 6. Beispiel: Verwendung von orElseGet (Erzeugung eines Standardwerts bei leerem Optional)
//        //orElseGet() Gibt den enthaltenen Wert zurück oder erzeugt einen neuen Wert über den Supplier.
//        System.out.println("Wert oder erzeugter Standardwert: " + nullableOptional.orElseGet(() -> "Erzeugter Standardwert"));
//        // Ausgabe: Erzeugter Standardwert
//
//
//
//        // 7. Beispiel: Optional.isPresent() und bedingte Verarbeitung
//        // ifPresent(Consumer<? super T> action):
//        //Führt die angegebene Aktion aus, falls ein Wert im Optional vorhanden ist.
//        optionalWithValue.ifPresent(value -> System.out.println("Der Wert ist vorhanden: " + value));
//        // Ausgabe: Der Wert ist vorhanden: Optional-Wert
//
//
//        // 8. Beispiel: Kombinierte Nutzung von orElse und ofNullable
//        //orElse(T other):
//        //Gibt den enthaltenen Wert zurück oder — falls kein Wert vorhanden ist — einen Standardwert.
//        String username = null;
//        String result = Optional.ofNullable(username).orElse("Anonymer Benutzer");
//        System.out.println("Benutzername: " + result); // Ausgabe: Anonymer Benutzer
//
//
//
//        // 9. Beispiel: Wert mit ofNullable und Bedingung prüfen
//        Integer age = null;
//        Optional<Integer> optionalAge = Optional.ofNullable(age);
//
//        // Bedingte Ausgabe, falls der Wert nicht vorhanden ist
//        // ispresent() Führt die angegebene Aktion aus, falls ein Wert im Optional vorhanden ist.
//        if (optionalAge.isPresent()) {
//            System.out.println("Alter ist gesetzt: " + optionalAge.get());
//        } else {
//            System.out.println("Alter ist nicht vorhanden."); // Ausgabe: Alter ist nicht vorhanden.
//        }
//
//
//        // 10. Beispiel: Optional mit einem Standardwert ersetzen
//        Integer newAge = optionalAge.orElse(18); // Setzt das Alter auf 18, falls null
//        System.out.println("Neues Alter: " + newAge); // Ausgabe: Neues Alter: 18
//    }
//}
//















//
////List.of(), Set.of(), Map.of() und Map.ofEntries() werden verwendet, um unveränderliche Collections zu erstellen. Diese Collections sind ideal, wenn die Daten unveränderlich bleiben sollen. Jede Operation, die versucht, diese Collections zu verändern, führt zu einer UnsupportedOperationException.
//
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//
//public class App {
//
//    public static void main(String[] args) {
//        // Beispiel 1: Unveränderliche Liste mit List.of()
//        System.out.println("Beispiel 1: Unveränderliche Liste mit List.of()");
//        List<String> fruits = List.of("Apple", "Banana", "Cherry");
//        System.out.println("Unveränderliche Liste: " + fruits);
//        System.out.println("Versuch, ein Element hinzuzufügen...");
//        try {
//            fruits.add("Orange"); // Wird eine UnsupportedOperationException auslösen
//        } catch (UnsupportedOperationException e) {
//            System.out.println("Fehler: Die Liste ist unveränderlich! (UnsupportedOperationException)");
//        }
//        System.out.println();
//
//        // Beispiel 2: Unveränderliches Set mit Set.of()
//        System.out.println("Beispiel 2: Unveränderliches Set mit Set.of()");
//        Set<String> colors = Set.of("Red", "Green", "Blue");
//        System.out.println("Unveränderliches Set: " + colors);
//        System.out.println("Versuch, ein Element zu entfernen...");
//        try {
//            colors.remove("Red"); // Wird eine UnsupportedOperationException auslösen
//        } catch (UnsupportedOperationException e) {
//            System.out.println("Fehler: Das Set ist unveränderlich! (UnsupportedOperationException)");
//        }
//        System.out.println();
//
//        // Beispiel 3: Unveränderliche Map mit Map.of()
//        System.out.println("Beispiel 3: Unveränderliche Map mit Map.of()");
//        Map<Integer, String> userMap = Map.of(
//                1, "Alice",
//                2, "Bob",
//                3, "Charlie"
//        );
//        System.out.println("Unveränderliche Map: " + userMap);
//        System.out.println("Versuch, einen Eintrag hinzuzufügen...");
//        try {
//            userMap.put(4, "David"); // Wird eine UnsupportedOperationException auslösen
//        } catch (UnsupportedOperationException e) {
//            System.out.println("Fehler: Die Map ist unveränderlich! (UnsupportedOperationException)");
//        }
//        System.out.println();
//
//        // Beispiel 4: Unveränderliche Map mit Map.ofEntries()
//        System.out.println("Beispiel 4: Unveränderliche Map mit Map.ofEntries()");
//        Map<Integer, String> countryCodes = Map.ofEntries(
//                Map.entry(49, "Germany"),
//                Map.entry(1, "USA"),
//                Map.entry(91, "India")
//        );
//        System.out.println("Unveränderliche Map (mit Map.ofEntries): " + countryCodes);
//        System.out.println("Versuch, einen Eintrag hinzuzufügen...");
//        try {
//            countryCodes.put(81, "Japan"); // Wird eine UnsupportedOperationException auslösen
//        } catch (UnsupportedOperationException e) {
//            System.out.println("Fehler: Die Map ist unveränderlich! (UnsupportedOperationException)");
//        }
//    }
//}












// Var Verwendung in java:

//
//import java.util.List;
//
//public class App {
//
//    public static void main(String[] args) {
//        // 1. Beispiel: Verwendung von `var` für einfache Datentypen
//        System.out.println("Beispiel 1: `var` mit einfachen Datentypen");
//        var number = 42; // `number` wird als `int` definiert
//        System.out.println("Typ von `number`: " + ((Object) number).getClass().getSimpleName()); // Ausgabe: Integer
//        //Mit ((Object) number).getClass().getSimpleName() kann der Typ zur Laufzeit geprüft werden.
//
//        var text = "Hello, World!"; // `text` wird als `String` definiert
//        System.out.println("Typ von `text`: " + ((Object) text).getClass().getSimpleName()); // Ausgabe: String
//        System.out.println();
//
//        // 2. Beispiel: Verwendung von `var` in einer Liste
//        System.out.println("Beispiel 2: `var` in einer Liste");
//        var integerList = List.of(1, 2, 3, 4, 5); // `integerList` wird als `List<Integer>` definiert
//        System.out.println("Liste: " + integerList);
//        System.out.println("Typ von `integerList`: " + integerList.getClass().getSimpleName()); // Ausgabe: ImmutableCollections$ListN
//        System.out.println();
//
//        // 3. Beispiel: `var` in Schleifen
//        System.out.println("Beispiel 3: `var` in Schleifen");
//        for (var value : integerList) {
//            System.out.println("Element: " + value); // `value` wird als `Integer` erkannt
//        }
////        for (var value : integerList): value wird als Integer erkannt, da integerList eine List<Integer> ist.
//
//        for (var i = 0; i < integerList.size(); i++) {
//            System.out.println("Index " + i + ": " + integerList.get(i)); // `i` wird als `int` definiert
//        }
////        for (var i = 0; i < integerList.size(); i++): i wird als int definiert, weil 0 ein int ist.
//        System.out.println();
//
//        // 4. Beispiel: `var` mit anonymen Klassen
////        anonyme Klasse ist eine Klasse, die keinen eigenen Namen hat und direkt im Code definiert wird.
//        System.out.println("Beispiel 4: `var` mit anonymen Klassen");
//        var anonymousClass = new Object() {//  erstellt eine anonyme Klasse, die von der Klasse Object erbt und zusätzliche Methoden und Attribute enthält.
//            public void show() {
//                System.out.println("Dies ist eine anonyme Klasse!");
//            }
//
//            public int value = 100;
//        };
//        anonymousClass.show();
//        System.out.println("Wert von `value`: " + anonymousClass.value);
//        System.out.println();
//
//        // 5. Beispiel: Einschränkungen bei der Verwendung von `var`
//        System.out.println("Beispiel 5: Einschränkungen bei `var`");
//        // var uninitializedVar; // Fehler: `var`-Variablen müssen sofort initialisiert werden
//        // var conditionalVar = (number > 10) ? "Groß" : 100; // Fehler: Der Typ ist nicht eindeutig
//        // var var = 50; // Ist erlaubt, `var` kann als Variablenname verwendet werden (verwirrend, aber legal)
//        var value = 50;
//        System.out.println("Wert der Variable `value`: " + value); // Ausgabe: 50
//
//        // 6. Beispiel: `var` mit finalen Variablen
//        System.out.println("Beispiel 6: `var` mit finalen Variablen");
//        final var constantValue = 99; // `constantValue` wird als `int` definiert und ist final
//        System.out.println("Konstante: " + constantValue);
//        // constantValue = 100; // Fehler: Eine finale Variable kann nicht geändert werden
//    }
//}










//
//
//
//
//
//
//
//

// File klasse in java:
// eine abstrakt präsentation eines Dateies oder einer Pfad.

//import java.io.File;
//
//public class App {
//    public static void main(String[] args) {// hier werde ich einen txt Datei in meinen Pfad hinzufügen und versuche es zu prüfen ob ich diese Datei habe.
//        File file = new File("src/secret_message.txt");
//
//        if (file.exists()){
//            System.out.println("That file exists !");
//        }else {
//            System.out.println("That file doesn't exist! :O");
//        }
//    }}// aber wie wäre es wenn das Datei irgendwo anders ist außerhalb unserer Pfad ! in diesem Fall müssen wir das ganze path hinzufügen wie "C:/Users/Abdelrahman/Desktop/secret_message.txt"


//import java.io.File;
//
//public class App {
//    public static void main(String[] args) {// hier werde ich einen txt Datei in meinen Pfad hinzufügen und versuche es zu prüfen ob ich diese Datei habe.
//        File file = new File("src/secret_message.txt");
//
//        if (file.exists()){
//            System.out.println("That file exists !");
//            System.out.println(file.getPath());// das gibt aus src/secret_message.txt
//            System.out.println(file.getAbsolutePath());// das gibt aus die lage unseres Dateies in unserem Gerät.
//            System.out.println(file.isFile());// das gibt true falls unsere Datei ist ein Datei.
//            file.delete(); // das wird unsere Datei löschen
//        }else {
//            System.out.println("That file doesn't exist! :O");
//        }}}
//
//













//
//// File Writer:
//
//
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class App {
//    public static void main(String[] args) {
////        FileWriter writer = new FileWriter("poem.txt");// aber mit filewriter müssen wir try und catch methode verwenden.
//        try {
//            FileWriter writer = new FileWriter("poem.txt");
//            writer.write("Roses are red \n Violets are blue");// das wird ein neues Datei erstellen.
//            writer.append("\n A poem by me");// das wird eine neue Zeile schreiben.
//            writer.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);// das wird automatisch generiert.
//        }
//    }
//    }







//
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//
//// FileReader:
//// diese methode liest den inhalt eines Dateies als characters, eins für eins, und read() gibt ein int Wert zurück welches ein byte Wert enthält, wenn read() ein -1 zurückgibt bedeutet das dass es keine Daten mehr gibt.
//
//// für dieses beispiel werde ich einen text vom ASCII Art.com verwenden:
////___________                        _________                      __  .__    .__
////\__    ___/__.__.______   ____    /   _____/ ____   _____   _____/  |_|  |__ |__| ____    ____
////  |    | <   |  |\____ \_/ __ \   \_____  \ /  _ \ /     \_/ __ \   __\  |  \|  |/    \  / ___\
////        |    |  \___  ||  |_> >  ___/   /        (  <_> )  Y Y  \  ___/|  | |   Y  \  |   |  \/ /_/  >
////        |____|  / ____||   __/ \___  > /_______  /\____/|__|_|  /\___  >__| |___|  /__|___|  /\___  /
////        \/     |__|        \/          \/             \/     \/          \/        \//_____/



//public class App {
//    public static void main(String[] args) {
//
//        try {
//            FileReader reader = new FileReader("poem.txt");
//            int data = reader.read();// das gibt uns ein integer das die byte Wert speichert.
//            while(data != -1){
//                System.out.print((char)data);// wir wollen es weiter lesen sobald unsere filereader methode kein -1 gibt, da sonst bedeutet das das keine daten mehr gibt, wir müssen auch sicherstellen dass es einen print und nicht println ist.
//                data = reader.read();
//            }
//            reader.close();
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {// wir wollen auch irgendwelche ioexceptions behandlen.
//            throw new RuntimeException(e);
//        }
//
//    }
//    }












//// Audio player in java:
//// mit unsere package können wir nur wav sounds verwenden, deswegen können wir einen wav sound von pixabay.com herunterladen.
//
//import javax.sound.sampled.*;
//import java.io.File;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class App {
//    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
//        File file = new File("src/ocean-waves-112906.wav");
//        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);// wir müssen das mit try und catch methode umgeben, oder ein Throw deklaration zur unsere main klasse hinzufügen.
//        Clip clip = AudioSystem.getClip();
//        clip.open(audioStream);
//
////        clip.start();
////        // jzt unsere program brecht ab, warum !
////        // was passiert ist das unsere code wurde schon ausgeführt und abgebrochen vor das Audio gespielt wurde, deswegen haben wir hier zwei lösungen:
////        // 1 einen GUI system anzufangen
////        // 2 einen scanner input hinzufügen damit er auf eine Eingabe wartet.
////
//        Scanner scanner = new Scanner(System.in);
////        String response = scanner.next();
////        // lass uns aber einen audio spieler in unsere konsole aufbauen:
//
//        String response = "";
//
//        while (!response.equals("Q")){
//            System.out.println("P = play, S = stop, R = reset, Q = quit");
//            System.out.println("Enter your choice!");
//
//            response = scanner.next();
//            response = response.toUpperCase(); // vllt jemand gibt es klein geschrieben rein.
//
//            switch (response){
//                case("P"): clip.start();// es wird jzt gespielt
//                break;
//                case("S"): clip.stop();
//                break;
//                case("R"): clip.setMicrosecondPosition(0);
//                break;
//                case("Q"): clip.close();
//                break;
//                default:
//                    System.out.println("Not a valid response");
//            }
//        }
//        clip.start();
//    }
//}

















//
//// JFrame:
//// ein GUI Fenster um inhalte hinzuzufügen.
//
//import package2.C;
//
//import javax.swing.*;
//import java.awt.*;
//
//public class App {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame(); // das erstellt ein frame
//        frame.setVisible(true);// um das frame sichtlich zu machen.
//        frame.setTitle("JFrame title goes here");
//        frame.setSize(420,420);// x und y dimensionen unseres Frames.
//
//        // wenn wir aber den x clicken sehen wir das unsere prozess im Terminal noch nicht abgebrochen ist, deswegen müssen wir folgendes machen:
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// normalweise ist er HIDE_ON_CLOSE !, wir können aber auch DO_NOTHING_ON_CLOSE option damit der user das fenster nicht zumachen kann.
//        frame.setResizable(true);// damit wir die Änderung der Größe des Fensters verhindern können.
//
//        // wir können auch den logo unseres fensters ändern:
//        ImageIcon image = new ImageIcon("src/NikeLogo.png");
//        frame.setIconImage(image.getImage());
//
//
////         oder wir können das wie wir wollen machen :
//        frame.getContentPane().setBackground(new Color(123,50,250));
//// red,green,blue, or just like that:
//        frame.getContentPane().setBackground(new Color(1*45456));
//
//////        (2) lass uns hier einen Instanz für myFrame erstellen:
////        MyFrame myFrame = new MyFrame();
////        // wir können auch einfach sagen "new MyFrame();"
//    }
//    }
////    (2)
//// lass uns aber eine sub-klasse, oder eine child klasse vom JFrame erstellen:
//class MyFrame extends JFrame{
//    MyFrame(){//Hier erstelle  wir einen Kostruktur mit dem neuen MyFrame, aber mit der gleiche Einstellungen vom JFrame:
//
//
////        MyFrame myFrame = new MyFrame(); das brauchen wir nicht mehr.
//        this.setVisible(true);
//        this.setTitle("JFrame title goes here");
//        this.setSize(420,420);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setResizable(true);
//        ImageIcon image = new ImageIcon("NikeLogo.png");
//        this.setIconImage(image.getImage());
//        this.getContentPane().setBackground(new Color(123,50,250));
//    }
//}








//
//// Label:
//
//import javax.swing.*;
//import javax.swing.border.Border;
//import java.awt.*;
//
//public class App {
//    public static void main(String[] args) {
//
//
//        JFrame frame = new JFrame();
//        frame.setVisible(true);
//        frame.setTitle("Label");
//        frame.setSize(900,1000);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setResizable(true);
//
//
//        JLabel label = new JLabel();// erstellt ein label
//        label.setText("Hello Yellow!");// text
//
//        // wir müssen aber nicht vergessen den label zu unserem Frame hinzuzufügen.
//        frame.add(label);
//
//        ImageIcon image = new ImageIcon("src/Black-background-skitterphoto.jpg");
//        label.setIcon(image);
//
//        // hier können wir unseren text relative zu unserer image einstellen:
//        label.setHorizontalTextPosition(JLabel.CENTER);
////        label.setHorizontalTextPosition(JLabel.LEFT);
////        label.setHorizontalTextPosition(JLabel.RIGHT);
//
//        label.setVerticalTextPosition(JLabel.TOP);
////        label.setVerticalTextPosition(JLabel.CENTER);
////        label.setVerticalTextPosition(JLabel.BOTTOM);
//
//        // wie können wir aber die font color und size unserer label gestalten:
//        label.setForeground(Color.green);
//        label.setForeground(Color.yellow);
//        label.setFont(new Font("MV Boli", Font.BOLD, 20));
//
//        label.setIconTextGap(100);
////        label.setIconTextGap(-25);
//
//        label.setBackground(Color.black);
//        label.setOpaque(true);// das zeigt unser hintergrund farbe.
//
//        Border border = BorderFactory.createLineBorder(Color.yellow, 3);
//        label.setBorder(border);
//
//        label.setVerticalAlignment(JLabel.CENTER);// das wird die icon und text elemente genau innerhalb der Label zentrieren.
//        label.setHorizontalAlignment(JLabel.CENTER);
//
////        label.setBounds(x, y, width, height); // das kontrolliert die position unserer Inhalte (icon und text).
//
//        frame.pack();// diese funktion wird alle unsere inhalte innerhalb unseres Fensters genau anpassen, auch wenn wir kein size einstellen. wir müssen aber sicherstellen das alle unsere Komponente vor dem pack() funktion sind und nicht nachher.
//    }
//    }
//







//
//import javax.swing.*;
//import java.awt.event.WindowEvent;
//import java.awt.event.WindowListener;
//
//// 1. Definition des DefaultWindowListener-Interfaces
//interface DefaultWindowListener extends WindowListener {
//    @Override
//    default void windowOpened(WindowEvent e) {
//        // Leere Implementierung
//    }
//
//    @Override
//    default void windowClosing(WindowEvent e) {
//        // Leere Implementierung
//    }
//
//    @Override
//    default void windowClosed(WindowEvent e) {
//        // Leere Implementierung
//    }
//
//    @Override
//    default void windowIconified(WindowEvent e) {
//        // Leere Implementierung
//    }
//
//    @Override
//    default void windowDeiconified(WindowEvent e) {
//        // Leere Implementierung
//    }
//
//    @Override
//    default void windowActivated(WindowEvent e) {
//        // Leere Implementierung
//    }
//
//    @Override
//    default void windowDeactivated(WindowEvent e) {
//        // Leere Implementierung
//    }
//}
//
//// 2. MyFrame-Klasse, die JFrame erweitert und DefaultWindowListener implementiert
//public class App extends JFrame implements DefaultWindowListener {
//
//    public App() {
//        // JFrame-Einstellungen
//        this.setTitle("Default Window Listener Example");
//        this.setSize(400, 300);
//        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//
//        // Fenster als WindowListener hinzufügen
//        this.addWindowListener(this);
//
//        // JFrame sichtbar machen
//        this.setVisible(true);
//    }
//
//    @Override
//    public void windowOpened(WindowEvent e) {
//        System.out.println("Fenster geöffnet.");
//    }
//
//    @Override
//    public void windowClosing(WindowEvent e) {
//        // Benutzerdefinierte Logik beim Schließen des Fensters
//        int response = JOptionPane.showConfirmDialog(this,
//                "Möchten Sie die Anwendung wirklich schließen?",
//                "Bestätigung",
//                JOptionPane.YES_NO_OPTION);
//
//        if (response == JOptionPane.YES_OPTION) {
//            System.out.println("Fenster wird geschlossen...");
//            this.dispose();  // Fenster schließen
//        } else {
//            System.out.println("Schließen abgebrochen.");
//        }
//    }
//
//    @Override
//    public void windowClosed(WindowEvent e) {
//        System.out.println("Fenster geschlossen.");
//    }
//
//    @Override
//    public void windowIconified(WindowEvent e) {
//        System.out.println("Fenster minimiert.");
//    }
//
//    @Override
//    public void windowDeiconified(WindowEvent e) {
//        System.out.println("Fenster aus minimiertem Zustand wiederhergestellt.");
//    }
//
//    @Override
//    public void windowActivated(WindowEvent e) {
//        System.out.println("Fenster ist nun aktiv.");
//    }
//
//    @Override
//    public void windowDeactivated(WindowEvent e) {
//        System.out.println("Fenster ist nun inaktiv.");
//    }
//
//    // Hauptmethode, um das Programm zu starten
//    public static void main(String[] args) {
//        new App();  // Erstellt eine Instanz von MyFrame (App) und zeigt das Fenster an
//    }
//}
//

























//
//// Panels:
//// Jpanel ist ein GUI komponent das als container funktioniert um andere Komponente zu behalten.
//
//
//import javax.swing.*;
//import java.awt.*;
//
//public class App {
//    public static void main(String[] args) {
//
//        JFrame frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLayout(null);
//        frame.setSize(1000,1000);
//        frame.setVisible(true);
//
//
//        JPanel redPanel = new JPanel();
//        redPanel.setBackground(Color.red);
////        redPanel.setBounds(x, y, width, height);// wir können x und y auf 0 einstellen weil wir es auf der top linke seite des Fensters wollen, und dann width und height auf 250 damit wir es Eckig gestalten.
//        redPanel.setBounds(0, 0, 500, 500);
//        // und wir müssen nicht vergessen dieses panel zum Frame hinzuzufügen.
//        frame.add(redPanel);
////        lass uns jzt andere komponente auch hinzufügen!
//
//        JPanel bluePanel = new JPanel();
//        bluePanel.setBackground(Color.blue);
//        bluePanel.setBounds(500, 0, 500, 500);
//        frame.add(bluePanel);
//
//        JPanel greenPanel = new JPanel();
//        greenPanel.setBackground(Color.green);
//        greenPanel.setBounds(0, 500, 500, 500);
//        frame.add(greenPanel);
//
//        JPanel yellowPanel = new JPanel();
//        yellowPanel.setBackground(Color.yellow);
//        yellowPanel.setBounds(500, 500, 500, 500);
//        frame.add(yellowPanel);
//
//        // lass uns ein label hinzufügen:
//        JLabel label = new JLabel();
//        label.setText("Hi");
//
//        ImageIcon icon = new ImageIcon("src/sign-check-icon.png");
//        label.setIcon(icon);// lass uns dieses logo jzt zum red panel hinzufügen!
////        redPanel.add(label);
////        bluePanel.add(label);
////        yellowPanel.add(label);
//        greenPanel.add(label);
//
//        // Frame neu zeichnen, um die Änderungen anzuzeigen
//        frame.revalidate();
//        frame.repaint();
//
//
//    }
//    }
//
















// JButton:

//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class App {
//    public static void main(String[] args) {
//
//        MyFrame frame = new MyFrame();
//
//    }
//    }
////    class MyFrame extends JFrame {
//
////    MyFrame(){
////
////        JButton button = new JButton();
////        button.setBounds(200, 100, 100, 50);
////
////        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        this.setLayout(null);
////        this.setSize(500,500);
////        this.setVisible(true);
////        this.add(button);
////
////        // jzt müssen wir ein Aktion listener interface hinzufügen um auf die click zu reagieren.
////    }
////    }
//
//    class MyFrame extends JFrame implements ActionListener{
//
////     (2)
//    JButton button;
//
//
//    MyFrame(){
//
//        button = new JButton();
//        button.setBounds(200, 100, 100, 50);
//        button.addActionListener(this);
//
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setLayout(null);
//        this.setSize(500,500);
//        this.setVisible(true);
//        this.add(button);
//
//    }
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//        if (e.getSource()==button){// jzt müssen wir unsere button außerhalb unsere MyFrame methode instanzieren damit wir darauf zugreifen können !
//            System.out.println("poo");
//        }
//        }
//    }




//    // Jzt können wir das mit eine neue abkürzung anstatt action performed method probieren, und zwar mit lambda expression!
//
//
//public class App {
//    public static void main(String[] args) {
//
//        MyFrame frame = new MyFrame();
//
//    }
//}
//
//class MyFrame extends JFrame implements ActionListener{ // wir brauchen jzt unsere action performed listener nicht mehr
//    JButton button;
//
//    MyFrame(){
//
//        button = new JButton();
//        button.setBounds(200, 100, 100, 50);
//        button.addActionListener(this);
////        und das können wir mit unsere lambda ausdruck ersetzen:
////        button.addActionListener(e -> System.out.println("Poo")); dann brauchen wir unsere ganze action performed listener nicht mehr! aber das werden wir später tiefer durchgehen.
//
////        button.setText("I'm a button!"); falls wir einen text im Button hinzugügen wollen
//
//        button.setFocusable(false);// damit wir den focus vom button rausnehmen.
//
//        // Bild laden und skalieren
//        ImageIcon icon = new ImageIcon("src/NikeLogo.png");
//        Image img = icon.getImage(); // Originalbild abrufen
//        Image scaledImg = img.getScaledInstance(button.getWidth(), button.getHeight() - 20, Image.SCALE_SMOOTH); // Bildgröße anpassen
//        ImageIcon scaledIcon = new ImageIcon(scaledImg); // Skaliertes Icon erstellen
//
//        // Skaliertes Icon setzen
//        button.setIcon(scaledIcon);
//        button.setHorizontalTextPosition(JButton.CENTER);
//        button.setVerticalTextPosition(JButton.BOTTOM); // Text zentrieren
//        button.setFont(new Font("Comic Sans", Font.BOLD, 10));
//        button.setForeground(Color.CYAN); // Textfarbe verändern
////        button.setBorder(BorderFactory.createLoweredSoftBevelBorder());
//
//
//
//
////        button.setEnabled(false); das wird unsere button zusperren.
//
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setLayout(null);
//        this.setSize(500,500);
//        this.setVisible(true);
//        this.add(button);
//
//
//    }
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource()==button){
//            System.out.println("poo");
//        }
//    }
//}





//
//// Lass uns sagen wir wollen einen objekt in unserem fenster zeigen, wenn wir aufm button clicken !
//// lass uns unsere objekt zuerst außerhalb unserer funktion deklarieren, damit die actionperformed method zugriff darauf hat !
//
//public class App {
//    public static void main(String[] args) {
//        MyFrame frame = new MyFrame();
//    }
//}
//class MyFrame extends JFrame implements ActionListener{
//    JButton button;
//    JLabel label; // JLabel-Deklaration.*********************
//
//    MyFrame(){
//
//        button = new JButton();
//        button.setBounds(200, 100, 100, 50);
//        button.addActionListener(this);
//        button.setFocusable(false);
//
//        // Bild laden und skalieren
//        ImageIcon icon = new ImageIcon("src/NikeLogo.png");
//        Image img = icon.getImage(); // Originalbild abrufen
//        Image scaledImg = img.getScaledInstance(button.getWidth(), button.getHeight() - 20, Image.SCALE_SMOOTH); // Bildgröße anpassen
//        ImageIcon scaledIcon = new ImageIcon(scaledImg); // Skaliertes Icon erstellen
//
//        // Skaliertes Icon setzen
//        button.setIcon(scaledIcon);
//        button.setHorizontalTextPosition(JButton.CENTER);
//        button.setVerticalTextPosition(JButton.BOTTOM); // Text zentrieren
//        button.setFont(new Font("Comic Sans", Font.BOLD, 10));
//        button.setForeground(Color.CYAN);
//
//
//        // erstellen wir jetzt unserer zweiten icon:***********************************
//        label = new JLabel(); // Initialisiere das JLabel hier
//        ImageIcon icon2 = new ImageIcon("src/emoji.png");
//        label.setIcon(icon2);
//        label.setBounds(150, 200, 250,250);
//        label.setVisible(false);
//        // dann müssen wir this.add(label); zu unserem frame hinzufügen.
//
//
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setLayout(null);
//        this.setSize(500,500);
//        this.setVisible(true);
//        this.add(button);
//        this.add(label);//*****************
//
//
//    }
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource()==button){
////            System.out.println("poo");
//            label.setVisible(true);//******************
//        }
//    }
//}
//
//
//
//




























//// Generic methoden und klassen.;

//Generics (parametrisierte Typen) erlauben es, Klassen, Interfaces und Methoden zu definieren, die mit verschiedenen Datentypen arbeiten können, ohne den Code für jeden Datentyp neu schreiben zu müssen. Der generische Typ wird dabei als Parameter angegeben, typischerweise in spitzen Klammern (<T>), und später bei der Verwendung festgelegt.
//// das eliminiert die Notwendigkeit, mehrere methoden oder klassen zu erstellen.
//
//public class App {
//    public static void main(String[] args) {
//        Integer[] intArray = {1, 2, 3, 4, 5};
//        Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
//        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
//        String[] stringArray = {"B", "Y", "E"};
//
//        // wie wäre es wenn wir alles was in jeden Array anzeigen möchten ! normalweise müssen wir eine methode erstellen, die alle diese unterschiedliche Datentypen behandelt.:
//
////        (2)
//        displayArray(intArray);
//        displayArray(doubleArray);
//        displayArray(charArray);
//        displayArray(stringArray);
//
//    }
//    public static void displayArray(Integer[] array){
//        for (Integer x : array){
//            System.out.print(x + " ");
//        }
//        System.out.println();
//    } // diese methode aber behandelt nur die integer datentyp, aber wie wäre es wenn wir zb die strings array behandlen müssen, dann müssen wir eine neue methode für die string definieren:
//    public static void displayArray(String[] array){
//        for (String x : array){
//            System.out.print(x + " ");
//        }
//        System.out.println();
//    }// und das gleiche auch für character und Double !
//    public static void displayArray(Double[] array){
//        for (Double x : array){
//            System.out.print(x + " ");
//        }
//        System.out.println();
//    }
//    public static void displayArray(Character[] array){
//        for (Character x : array){
//            System.out.print(x + " ");
//        }
//        System.out.println();
//    }
//}

//
//// Wie wäre es aber wenn wir eine version davon erstellen die das alles auf einmal behandlt !
//// wir werden zuerst die generic methods umsetzen, und dafür brauchen wir nur eine der vier klassen
//
//public class App {
//    public static void main(String[] args) {
//        Integer[] intArray = {1, 2, 3, 4, 5};
//        Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
//        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
//        String[] stringArray = {"B", "Y", "E"};
//
//        // wie wäre es wenn wir alles was in jeden Array anzeigen möchten ! normalweise müssen wir eine methode erstellen, die alle diese unterschiedliche Datentypen behandelt.:
//
//        displayArray(intArray);
//        displayArray(doubleArray);
//        displayArray(charArray);
//        displayArray(stringArray);
//
////        (2)
//        System.out.println(getFirst(intArray));
//        System.out.println(getFirst(doubleArray));
//        System.out.println(getFirst(charArray));
//        System.out.println(getFirst(stringArray));
//        // dann bekommen wir unsere zweite methode ausgeführt.
//
//
//    }
//    public static <Thing>void displayArray(Thing[] array){ // normalweise schreibt man T innerhalb diese zwei klammern also das ist der common practice, aber ich wird hier ein Thing schreiben, damit ich weiß dass das generic item ist.
//        for (Thing x : array){
//            System.out.print(x + " ");
//        }
//        System.out.println();
//    }// wenn wir das jzt ausführen, sehen wir dass wir das gleiche bekommen haben wie in mit der vier klassen die wir erstellt haben.
//
////    (2)
//    // lass uns jzt eine andere methode auch schreiben:
//    public static <Thing> Thing getFirst(Thing[] array){
//        return array[0];
//    }
//}





//
//// lass uns sagen wir bauen einen ComputerSpiel auf, und müssen verschiedene game sprites methoden erstellen für verschiedene funktionen, dann anstatt dass wir für jedes objekt eine eigene methode oder klasse erstellen müssen können wir einfach unsere generic methode verwenden.
//
//public class App {
//    public static void main(String[] args) {
//
//        Player player = new Player();
//        Enemy enemy = new Enemy();
//        Item item = new Item();
//        Tree tree = new Tree();
//
//        draw(player);
//        draw(enemy);
//        draw(item);
//        draw(tree);
//
//    }
//    public static <Thing> void draw(Thing x){
//        x.draw();
//    }
//    }






//// Generic Klassen :
//public class App {
//    public static void main(String[] args) {
//
//        MyIntegerClass myInt = new MyIntegerClass(1);// dann geben wir einen 1 in unserem Konstruktur ein.
//        MyDoubleClass myDouble = new MyDoubleClass(3.14);
//        MyCharacterClass myChar = new MyCharacterClass('@');
//        MyStringClass myString = new MyStringClass("Hello");
//
//// Normalweise erstellen wir diese klassen wie folgendes:
//
////        (2)
//        // dann wenn wir diese Werte auszeigen wollen machen wir wie folgendes:
//        System.out.println(myInt.getValue());
//        System.out.println(myDouble.getValue());
//        System.out.println(myChar.getValue());
//        System.out.println(myString.getValue());
//
//    }
//    }
//     class MyIntegerClass{
//        Integer x;
//
//        MyIntegerClass(Integer x){
//            this.x = x;
//        }
//        public Integer getValue(){
//            return x;
//        }
//    }
//     class MyDoubleClass{
//         Double x;
//
//         MyDoubleClass(Double x){
//             this.x = x;
//         }
//         public Double getValue(){
//             return x;
//         }
//    }
//     class MyCharacterClass{
//         Character x;
//
//         MyCharacterClass(Character x){
//             this.x = x;
//         }
//         public Character getValue(){
//             return x;
//         }
//    }
//     class MyStringClass{
//         String x;
//
//         MyStringClass(String x){
//             this.x = x;
//         }
//         public String getValue(){
//             return x;
//         }
//    }

//    // lass uns das aber mit einem einzigen generic klasse erstellen :
//
//
//public class App {
//    public static void main(String[] args) {
//
//        MyGenericClass<Integer> myInt = new MyGenericClass<>(1);
//        MyGenericClass<Double> myDouble = new MyGenericClass<>(3.14);
//        MyGenericClass<Character> myChar = new MyGenericClass<>('@');
//        MyGenericClass<String> myString = new MyGenericClass<>("Hello");
//// wir müssen hier aber der Datentyp den wir zu unserem generic klasse schicken eingeben, damit er weißt welche Datentyp das ist, und einfach leeren klammern nachdem new Datentyp.
//
//
//        System.out.println(myInt.getValue());
//        System.out.println(myDouble.getValue());
//        System.out.println(myChar.getValue());
//        System.out.println(myString.getValue());
//
//    }
//    }
//// jzt anstatt das alles zu erstellen, können wir einfach nur einen Datentyp erstellen :
//class MyGenericClass <Thing> {// ein common practice ist <T> zu schreiben.
//
//    Thing x;
//
//    MyGenericClass(Thing x){
//        this.x = x;
//    }
//    public Thing getValue(){
//        return x;
//    }
//    // Dann wechseln wie unsere klassen name auf unsere generic klasse name.
//}
//
//








//
//
//
//
//
//// Bounded Types:
//// du kannst generic objekte erstellen von einer klasse um Daten von spezifische abgeleitete Daten zu haben.
//
//// In unserem Beispiel, lass uns sagen wir wollen nur nummern haben, integers und doubles, aber characters und strings nicht.
//
//public class App {
//    public static void main(String[] args) {
//
//        MyGenericClass<Integer> myInt = new MyGenericClass<>(1);
//        MyGenericClass<Double> myDouble = new MyGenericClass<>(3.14);
////        MyGenericClass<Character> myChar = new MyGenericClass<>('@');
////        MyGenericClass<String> myString = new MyGenericClass<>("Hello");
//
//
//
//        System.out.println(myInt.getValue());
//        System.out.println(myDouble.getValue());
////        System.out.println(myChar.getValue());
////        System.out.println(myString.getValue());
//
//    }
//    }
//
//class MyGenericClass <Thing extends Number> {// Wir können hier das ändern, und damit können wir keine Characters oder Strings
//
//    Thing x;
//
//    MyGenericClass(Thing x){
//        this.x = x;
//    }
//    public Thing getValue(){
//        return x;
//    }
//}





//
//// 2. Kovarianz und Kontravarianz mit Generics

//Kovarianz (extends):
//Ein generischer Typ List<? extends Number> bedeutet, dass die Liste jedes Objekt akzeptieren kann, das Number oder eine Unterklasse von Number ist (z.B. Integer, Double).
//<? extends Number> heißt, dass wir auf die Liste zugreifen können, aber nichts hinzufügen dürfen. Dies dient dazu, Typensicherheit zu gewährleisten, da wir den genauen Typ zur Laufzeit nicht kennen.

//Kontravarianz (super):
//Ein generischer Typ List<? super Integer> akzeptiert Integer und alle seine Oberklassen (Number, Object).
//<? super Integer> bedeutet, dass wir Integer-Objekte sicher in diese Liste hinzufügen können, aber beim Zugriff nur eine Oberklasse vom Typ Object zurückerhalten (da Integer in eine Number oder Object umgewandelt wird).

//import java.util.List;
//import java.util.ArrayList;
//
//public class App {
//    public static void main(String[] args) {
//        // Kovarianz mit `extends` (Obergrenze): List von Number akzeptiert Integer und Double
//        List<? extends Number> numberList = new ArrayList<>();
//        // Kein Hinzufügen möglich, da Typenunsicherheit besteht (Compiler-Fehler)
//
//        // Kontravarianz mit `super` (Untergrenze): List akzeptiert alle Typen, die Integer oder Oberklasse davon sind (number, object)
//        List<? super Integer> integerList = new ArrayList<>();
//        integerList.add(10); // Funktioniert, weil `10` ein Integer ist
//        // integerList.add("Hello");  // Compiler-Fehler, da String keine Unterklasse von Integer ist
//
//        // Veranschaulichung der Kompatibilität
//        List<Number> numList = new ArrayList<>();
//        numList.add(3.14);
//        numList.add(42);
//
//        // Kovarianz: numList ist kompatibel mit `List<? extends Number>`
//        processNumbers(numList); // Funktioniert
//    }
//
//    // Kovarianz: Diese Methode kann mit jeder Liste arbeiten, die Untertypen von `Number` enthält
//    public static void processNumbers(List<? extends Number> list) {
//        for (Number n : list) {
//            System.out.println(n);
//        }
//    }
//}
//




















// Serialization:
// Ein prozess welche ein objekt auf einen byte stream konvertiert, und speichert die Status des objekts nachdem programm existiert, diese byte stream könnte als Datei gespeichert werden oder über einen Netzwerk gesendet werden oder sogar zu einen anderen Machine.
// byte stream könnte als .ser Datei gespeichert, welche platform abhängig ist.
// Deserialization: das gegenteil davon wo man diedie byte stream auf einem objekt konvertiert.

//Hier erstellen wir ein neues projekt "Serializer" und "Deserializer"



























// Timer Task:
//import java.util.Calendar;
//import java.util.Timer;
//import java.util.TimerTask;

//public class App {
//    public static void main(String[] args) {
//
//        Timer timer = new Timer();
//
//        TimerTask task = new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println("Task is complete");
////            }};
//        // wir müssen jzt unsere Task mit unserem Timer verlinken:
////        timer.schedule(task, 0); //(task, time)
////        timer.schedule(task, 3000);// wartungszeit bis 3 sekunden.
//
//        Calendar date = Calendar.getInstance();
//        date.set(Calendar.YEAR,2024);
//        date.set(Calendar.MONTH,Calendar.SEPTEMBER);
//        date.set(Calendar.DAY_OF_MONTH,28);
//        date.set(Calendar.HOUR_OF_DAY,11);
//        date.set(Calendar.MINUTE,47);
//        date.set(Calendar.SECOND,20);
//        date.set(Calendar.MILLISECOND,0);
//
//        timer.schedule(task, date.getTime());
//        // es wird dann in die gleiche eingegebene Zeitraum ausgeführt
//    }
//}




//
////        (2)
//public class App {
//    public static void main(String[] args) {
//
//        Timer timer = new Timer();
//
//        TimerTask task = new TimerTask() {
//
//            int counter = 10;
//            @Override
//            public void run() {
//
//                if(counter>0){
//                    System.out.println(counter + "seconds");
//                    counter--;
//                }
//                else{
//                    System.out.println("Happy New Year");
//                    timer.cancel();
//                }
//            }
//        };
//
////        // timer.scheduleAtFixedRate(task, firstTime, period); das führt unsere task für ein erste mal mit dem zweiten parameter und jeder periode parameter
////        timer.scheduleAtFixedRate(task, 0, 1000);
//
//        // wir können das so machen das der counter fängt in einer bestimmte zeit an, zb 10 sekunden vor dem new year, wir können das machen indem wir die getTime() als firstTime parameter reingeben.
//
//        Calendar date = Calendar.getInstance();
//        date.set(Calendar.YEAR,2024);
//        date.set(Calendar.MONTH,Calendar.DECEMBER);
//        date.set(Calendar.DAY_OF_MONTH,31);
//        date.set(Calendar.HOUR_OF_DAY,23);
//        date.set(Calendar.MINUTE,59);
//        date.set(Calendar.SECOND,50);
//        date.set(Calendar.MILLISECOND,0);
//
//        timer.scheduleAtFixedRate(task, date.getTime(), 1000); // und das wird jzt durchgeführt abhängig von der Zeit unserer Machine, also wir können die Zeit unserer machine ändern dann sehen wir das das ausgeführt wird.
//
//
//    }}




















//
//// packages:
//
////ein Paket ist ein Bündel zusammengehöriger Dateien, die wir in unseren Programmen verwenden können, genau so was wir machen wenn wir irgendwelche package importieren:
////import java.util.Calendar;
////import java.util.Timer;
////import java.util.TimerTask;
//// import javax.swing.Icon; und was wir hier gemacht haben ist dass wir eine package von unsere JRE system library importiert haben.
//
//// lass uns hier einen neuen package "Tools" in unserem src pfad erstellen, und was wir hier mit diesem package machen können, ist dass wir neue klassen hier erstellen können.
//// zb klasse "Toolbox", dann sehen wir am anfang der Datei dass wir einen package Tool; satz haben, wenn wir aber diese Satz löschen, java wir uns anschreien da es eine erwartete package gibt.
//
////import Tools.Toolbox;
//
//public class App {
//    public static void main(String[] args) {
//
//        Toolbox toolbox = new Toolbox(); // dann sehen wir einen Fehler sobald wir die import Tools.Toolbox; satz nicht geschrieben haben, und hier können wir entweder alles vom package importieren mit import Tools.*; oder eine bestimmte Datei wie import Tools.Toolbox;
//    }
//    }




















// Compilierung mit command prompt:

// wir müssen einen JDK "Java Development Kit" installiert (in C drive)
// wir können auch java programm in notepad oder irgendwelche text editor erstellen, ein IDE hilft uns nur den code einfacher zu schreiben, aber kopellierung könnte mit einem text editor auch ausgeführt.
// und dann im Command prompt oder Terminal in Mac:

// javac App.java , "java compile" und danach:

//java App














// Wie kann mann Java Datei auf einem Executable programm machen.


// file -> project structure -> Artifacts -> Add -> JAR -> from modules with dependencies -> dann müssen wir die hauptklasse eingeben, üblicherweise "main" -> ok -> extract to the target jar -> ok , wir können auch die output directory ändern zum Desktop zb.
// letzte schritt ist :
// build -> build Artifacts -> build







































//
//// statischen und nicht-statischen inneren Klassen :
//
//
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//// Beispiel für statische und nicht-statische innere Klassen
//public class App extends JFrame {
//
//    // ** Statische innere Klasse ** (Innerhalb der äußeren Klasse als "static" deklariert)
//    static class StaticButtonPlusAdapter implements ActionListener //Deklaration mit dem Schlüsselwort static.
//    {
//        private final App calculatorFrame;
//
//        // Konstruktor erwartet Referenz zur äußeren Klasse
//        public StaticButtonPlusAdapter(App frame) //Benötigt eine explizite Referenz, um auf Methoden und Felder der äußeren Klasse zuzugreifen.
//        {
//            this.calculatorFrame = frame;
//        }
//
//        // Zugriff auf Methode der äußeren Klasse über die Referenz
//        public void actionPerformed(ActionEvent e) {
//            calculatorFrame.onPlus();
//        }
//    }
//
//    // ** Nicht-statische innere Klasse ** (Kein "static"-Schlüsselwort)
//    private class NonStaticButtonMinusAdapter implements ActionListener {
//
//        // Kein Konstruktor erforderlich, da Referenz automatisch vorhanden, also er hat Direkter Zugriff auf Instanzmethoden und -variablen der äußeren Klasse.
//        public void actionPerformed(ActionEvent e) {
//            // Direkter Zugriff auf Methode der äußeren Klasse
//            onMinus();
//        }
//    }
//    //non statisch ist Ideal, wenn die innere Klasse stark von der äußeren Instanz abhängig ist.
//
//    // Beispiel für GUI-Komponenten
//    private final JButton buttonPlus = new JButton("Plus");
//    private final JButton buttonMinus = new JButton("Minus");
//
//    public App() {
//        // GUI-Einstellungen
//        this.setLayout(null);
//        this.setSize(200, 200);
//
//        buttonPlus.setBounds(30, 30, 80, 30);
//        buttonMinus.setBounds(30, 70, 80, 30);
//        this.add(buttonPlus);
//        this.add(buttonMinus);
//
//        // ** Verwendung der beiden inneren Klassen **
//        buttonPlus.addActionListener(new StaticButtonPlusAdapter(this)); // Übergabe der äußeren Klassen-Referenz erforderlich
//        buttonMinus.addActionListener(new NonStaticButtonMinusAdapter()); // Direkter Aufruf ohne Übergabe, da Referenz automatisch vorhanden
//
//        this.setVisible(true);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//
//    // Beispielmethoden für Plus und Minus
//    private void onPlus() {
//        System.out.println("Plus Button geklickt!");
//    }
//
//    private void onMinus() {
//        System.out.println("Minus Button geklickt!");
//    }
//
//    public static void main(String[] args) {
//        new App();
//    }
//}












//
//
//// lokale Klassen und anonyme Klassen in Java :
//
////Lokale Klassen sind Klassen, die innerhalb einer Methode definiert werden, statt als Teil der äußeren Klasse. Sie sind nur in dem Block oder der Methode sichtbar, in der sie definiert werden.
//
//// Eine anonyme Klasse ist eine Klasse ohne Namen, die direkt als Instanz in einer Methode definiert wird. Sie werden verwendet, wenn eine Klasse nur an einer Stelle verwendet wird.
//
//
////Unterschied zwischen lokalen und anonymen Klassen:
////Lokale Klassen haben einen Namen und können mehrfach instanziiert werden.
////Anonyme Klassen haben keinen Namen und sind oft nur für eine einmalige Instanziierung gedacht.
//
//
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class App extends JFrame {
//
//    private final JButton buttonPlus = new JButton("Plus");
//    private final JButton buttonMinus = new JButton("Minus");
//
//    public App() {
//        this.setLayout(null);
//        this.setSize(200, 200);
//
//        buttonPlus.setBounds(30, 30, 80, 30);
//        buttonMinus.setBounds(30, 70, 80, 30);
//        this.add(buttonPlus);
//        this.add(buttonMinus);
//
//        // ** Lokale Klasse in der Methode registerListeners() definiert **
//        registerListeners();
//
//        this.setVisible(true);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//
//    private void registerListeners() {
//        // Lokale Klasse für den Plus-Button
//        class LocalButtonPlusAdapter implements ActionListener //Wird in der Methode registerListeners(), Hat einen eindeutigen Namen (LocalButtonPlusAdapter) und kann bei Bedarf mehrfach verwendet werden.
////definiert. Wird dem buttonPlus-Button zugewiesen.
//
//        {
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Plus Button geklickt! (Lokale Klasse)");
//            }
//        }
//
//        // Hinzufügen der lokalen Klasse als Listener
//        buttonPlus.addActionListener(new LocalButtonPlusAdapter());
//
//
//// Anonyme Klasse wurde aber direkt in der addActionListener-Methode Definiert. Hat keinen Namen und kann nicht erneut instanziiert werden.
//        // Anonyme Klasse für den Minus-Button
//        buttonMinus.addActionListener(new ActionListener()
//                // Wird dem buttonMinus-Button zugewiesen.
//
//        {
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Minus Button geklickt! (Anonyme Klasse)");
//            }
//        });
//    }
//
//    public static void main(String[] args) {
//        new App();
//    }
//}

























// Lambda-Ausdrücken:
// jzt lass uns ein Calculator program erstellen, um den konzept vom lambda-Ausdrücken in Java zu verstehen :


//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//// Hauptklasse mit der main-Methode
//public class App {
//    public static void main(String[] args) {
//        new MathFrame(); // Startet das GUI-Programm
//    }
//}
//
//// GUI-Klasse für den Rechner
//class MathFrame extends JFrame {
//    private final JTextField textFieldX = new JTextField(10);
//    private final JTextField textFieldY = new JTextField(10);
//    private final JTextField textFieldResult = new JTextField(10);
//    private final JButton buttonPlus = new JButton("Plus");
//    private final JButton buttonMinus = new JButton("Minus");
//
//    public MathFrame() {
//        // Layout der GUI einstellen
//        this.setLayout(new FlowLayout());
//        this.add(textFieldX);
//        this.add(textFieldY);
//        this.add(buttonPlus);
//        this.add(buttonMinus);
//        this.add(textFieldResult);
////        Der Konstruktor der MathFrame-Klasse konfiguriert das Layout der GUI.
////                setLayout(new FlowLayout()) stellt sicher, dass die Komponenten nacheinander horizontal angeordnet werden.
//
//        // ActionListener registrieren (mit Top-Level-Klassen)
//        // Hier erstellen wir zwei neue Actionlistner klassen.
//        this.buttonPlus.addActionListener(new ButtonPlusAdapter(this));
//        this.buttonMinus.addActionListener(new ButtonMinusAdapter(this));
//
//        // JFrame-Eigenschaften setzen
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.pack();
//        this.setVisible(true);
//    }
//
//    // Methoden für die Addition
//    public void onPlus() {
//        try {
//            int x = Integer.parseInt(this.textFieldX.getText());
//        textFieldY.getText() holt den Text aus dem textFieldY.
//        Integer.parseInt(...) wandelt diesen Text in einen int um.
//        Der resultierende int-Wert wird in der Variable y gespeichert.
//            int y = Integer.parseInt(this.textFieldY.getText());
//            int result = x + y;
//            this.textFieldResult.setText(String.valueOf(result));
//        } catch (NumberFormatException e) {
//            this.textFieldResult.setText("Illegal input");
//        }
//    }
////    Diese Methode wird ausgeführt, wenn der Plus-Button gedrückt wird.
////    Sie liest die Werte aus textFieldX und textFieldY, konvertiert sie in int-Werte und addiert sie.
////    Das Ergebnis wird im textFieldResult angezeigt.
////    Falls der Benutzer ungültige Eingaben (z.B. Buchstaben) eingibt, wird eine Fehlermeldung (Illegal input) im Ergebnisfeld angezeigt.
//
//    // Methoden für die Subtraktion
//    public void onMinus() {
//        try {
//            int x = Integer.parseInt(this.textFieldX.getText());
//            int y = Integer.parseInt(this.textFieldY.getText());
//            int result = x - y;
//            this.textFieldResult.setText(String.valueOf(result));
//        } catch (NumberFormatException e) {
//            this.textFieldResult.setText("Illegal input");
//        }
//    }
//}
//
//// Separate Top-Level-Klasse für den "Plus"-Button
//class ButtonPlusAdapter implements ActionListener {
//    final MathFrame mathFrame;//Instanzvariable, die eine Referenz auf das MathFrame-Objekt speichert.
//
//    public ButtonPlusAdapter(MathFrame mathFrame) {
//        this.mathFrame = mathFrame;
//    }
////    Der Konstruktor nimmt ein MathFrame-Objekt als Parameter (MathFrame mathFrame) entgegen.
////            this.mathFrame = mathFrame; weist dieses übergebene Objekt der Instanzvariablen mathFrame zu.
////    Dadurch "kennt" das ButtonMinusAdapter-Objekt das MathFrame-Objekt, auf das es zugreifen muss.
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        this.mathFrame.onPlus(); // Ruft die onPlus-Methode der MathFrame-Klasse auf
//    }
//}
////Der ButtonMinusAdapter benötigt Zugriff auf die Methode onMinus() der MathFrame-Klasse, um die Subtraktionslogik auszuführen.
////Da ButtonMinusAdapter nur ein ActionListener ist, enthält er selbst keine GUI-Logik. Die GUI-Logik wird in MathFrame behandelt.
//
//
//
//// Separate Top-Level-Klasse für den "Minus"-Button
//class ButtonMinusAdapter implements ActionListener {
//    final MathFrame mathFrame;
//
//    public ButtonMinusAdapter(MathFrame mathFrame) {
//        this.mathFrame = mathFrame;
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        this.mathFrame.onMinus(); // Ruft die onMinus-Methode der MathFrame-Klasse auf
//    }
//}
//











//
//Vor Java 8 war es notwendig, für jede anonyme Klasse eine konkrete Implementierung zu erstellen. Beispiel:
//java
//Copy code
//this.buttonPlus.addActionListener(new ActionListener() {
//    @Override
//    public void actionPerformed(ActionEvent event) {
//        MathFrame.this.onPlus();
//    }
//});
//Hier wird ein ActionListener-Objekt erstellt und die actionPerformed Methode überschrieben.
//2. Funktionale Interfaces:
//
//Java 8 führte das Konzept der "funktionalen Interfaces" ein. Ein funktionales Interface enthält genau eine abstrakte Methode (z. B. ActionListener mit der Methode actionPerformed). Da nur eine Methode implementiert werden muss, kann diese mittels Lambda-Ausdrücken ersetzt werden.
//3. Verwendung von Lambda-Ausdrücken:
//
//Lambda-Ausdrücke sind eine kompaktere Art, funktionale Interfaces zu implementieren. Der Compiler kann viele Informationen selbst ableiten, was den Code kürzer und lesbarer macht:
//java
//Copy code
//this.buttonPlus.addActionListener((ActionEvent event) -> {
//MathFrame.this.onPlus();
//});q
//Dieser Ausdruck ist gleichwertig zu der anonymen Klasse oben, aber kürzer. Es folgt eine weitere Vereinfachung:
//

//Typen weglassen: Da der Compiler den Typ ActionEvent bereits kennt, kann dieser weggelassen werden:
//java
//Copy code
//this.buttonPlus.addActionListener((event) -> {
//MathFrame.this.onPlus();
//});

//Runde Klammern weglassen: Wenn die Parameterliste nur einen Parameter enthält, können auch die runden Klammern um den Parameter entfallen:
//java
//Copy code
//this.buttonPlus.addActionListener(event -> {
//MathFrame.this.onPlus();
//});

//Geschweifte Klammern und return weglassen: Besteht der Ausdruck nur aus einer Anweisung, kann man auch die geschweiften Klammern weglassen:
//java
//Copy code
//this.buttonPlus.addActionListener(event -> MathFrame.this.onPlus());

//Noch kürzer: Da this im inneren Kontext der Klasse implizit ist, kann auch MathFrame.this weggelassen werden:
//java
//Copy code
//this.buttonPlus.addActionListener(event -> onPlus());
//
//












//
//// Die gleiche implementierung mit Lambda Ausdrücken:
//
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//
//public class App extends JFrame {
//    private final JTextField textFieldX = new JTextField(10);
//    private final JTextField textFieldY = new JTextField(10);
//    private final JTextField textFieldResult = new JTextField(10);
//    private final JButton buttonPlus = new JButton("Plus");
//    private final JButton buttonMinus = new JButton("Minus");
//
//    public App() {
//        // GUI Layout einstellen
//        this.setLayout(new FlowLayout());
//        this.add(textFieldX);
//        this.add(textFieldY);
//        this.add(buttonPlus);
//        this.add(buttonMinus);
//        this.add(textFieldResult);
//
//        // Listener mit Lambdas anstelle von Top-Level-Klassen registrieren
//        buttonPlus.addActionListener(e -> onOperation('+'));
//        buttonMinus.addActionListener(e -> onOperation('-'));
////        e: Der Parameter e ist eine Referenz auf das ActionEvent-Objekt. Jedes Mal, wenn die Schaltfläche buttonMinus gedrückt wird, wird ein neues ActionEvent-Objekt erzeugt und an den Lambda-Ausdruck übergeben. In diesem speziellen Beispiel wird e jedoch nicht verwendet.
////->: Der ->-Operator trennt den Parameter (e) vom Methodenrumpf.
//
//        // JFrame-Eigenschaften
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.pack();
//        this.setVisible(true);
//    }
//
//    // Methode für Operationen
//    private void onOperation(char operation) {
////    Diese Methode fasst die Logik für die Addition und Subtraktion zusammen.
//
//        try {
//            int x = Integer.parseInt(textFieldX.getText());
//            int y = Integer.parseInt(textFieldY.getText());
//            int result = (operation == '+') ? (x + y) : (x - y);
//            textFieldResult.setText(String.valueOf(result));
//        } catch (NumberFormatException e) {
//            textFieldResult.setText("Illegal input");
//        }
//    }
//
//    public static void main(String[] args) {
//        new App(); // Erzeugt das GUI-Fenster
//    }
//}
////Mit dieser Lambda-basierten Lösung vermeiden wir die duplizierten Adapter-Klassen ButtonPlusAdapter und ButtonMinusAdapter.
////Der Code ist lesbarer und wartungsfreundlicher.
//
//













//
////Nachfolgend ein einfaches Java-Beispiel, das die Konzepte verdeutlicht:
//
//import java.util.function.Function;
//
//////Die Annotation @FunctionalInterface wird verwendet, um funktionale Interfaces zu kennzeichnen. Ein funktionales Interface hat nur eine abstrakte Methode.
////Dies kennzeichnet das Speaker-Interface als funktionales Interface.
//@FunctionalInterface
//interface Speaker {
//    void speak();
//}
//
//public class App {
//
//    public static void main(String[] args) {
//        // 1. Verwendung von Target Typing bei Lambda-Zuweisungen, lass uns hier zwei methoden erstellen
//        Runnable r = () -> System.out.println("Hello from Runnable");
//        Speaker s = () -> System.out.println("Hello from Speaker");
////Lambda-Ausdrücke haben keinen eigenen Typ, sondern der Typ wird vom Compiler anhand der Zielzuweisung ermittelt. Das bedeutet, dass der Typ des Lambda-Ausdrucks davon abhängt, wo er verwendet wird.
//        //r ist ein Runnable, weil es einer Runnable-Variable zugewiesen wurde.
////s ist ein Speaker, weil es einer Speaker-Variable zugewiesen wurde.
////Das Interface Runnable und das selbst definierte Interface Speaker enthalten jeweils genau eine abstrakte Methode ohne Parameter (run() bzw. speak()). Daher kann das gleiche Lambda-Ausdrucksmuster für beide verwendet werden.
//
//
//        // 2. Übergabe der Lambda-Ausdrücke an Methoden
//        workWithRunnable(r);
//        workWithSpeaker(s);
//
//        // 4. Direktes Übergeben eines Lambda-Ausdrucks als Methodenargument
//        workWithRunnable(() -> System.out.println("Another Hello from Runnable"));
//        workWithSpeaker(() -> System.out.println("Another Hello from Speaker"));
//
//        // 5. Lambda-Ausdruck als Rückgabewert einer Methode
//        Speaker speaker = createSpeaker();
//        speaker.speak();
//    }
//
//    // 4. Verwendung in Methoden:
////
////Methoden können so gestaltet werden, dass sie funktionale Interfaces als Parameter akzeptieren:
//    // Methode zur Verarbeitung eines Runnable
//    static void workWithRunnable(Runnable r) {
//        r.run();
//    }
//
//    // Methode zur Verarbeitung eines Speakers
//    static void workWithSpeaker(Speaker s) {
//        s.speak();
//    }
////    Hier kann ein Lambda-Ausdruck direkt als Argument übergeben werden, weil der Compiler den Typ des Lambda-Ausdrucks aus dem Methodensignaturkontext ermittelt:
////workWithRunnable(() -> System.out.println("Hello"));
////workWithSpeaker(() -> System.out.println("World"));
//
//
//
//    //5. Beispiel mit createSpeaker():
////Ein Lambda-Ausdruck kann auch als Rückgabewert einer Methode verwendet werden:
//    // Methode zur Rückgabe eines Speakers als Lambda
//    static Speaker createSpeaker() {
//        return () -> System.out.println("Hello from createSpeaker");
//    }
//}
////Hier gibt die Methode createSpeaker() einen Speaker zurück, weil der Rückgabewert des Lambda-Ausdrucks in das funktionale Interface Speaker passt (eine Methode speak() ohne Parameter und Rückgabewert void).








//
//
////Anonyme Klassen vs. Lambda-Ausdrücke:
////
////Eine anonyme Klasse, die ein Interface wie Runnable implementiert, kann eigene Attribute und Methoden besitzen, auf die innerhalb dieser Klasse zugegriffen werden kann. Ein Objekt einer solchen Klasse ist daher mehr als nur eine Methode – es hat eine eigene Struktur.
//
//Runnable runnable = new Runnable() {
//    private int x = 42;
//
//    private void helper() {
//        System.out.println("Inner helper");
//    }
//
//    @Override
//    public void run() {
//        System.out.println(this); // Referenziert die anonyme Klasse
//        helper();                 // Greift auf die Methode der anonymen Klasse zu
//    }
//};
//runnable.run();
//
////Ein Lambda-Ausdruck implementiert nur die Methode des zugewiesenen funktionalen Interfaces. Lambda-Ausdrücke haben keine eigene Struktur und können keine eigenen Attribute oder zusätzlichen Methoden besitzen.
//
//Runnable runnable = () -> System.out.println("Hello from Lambda");
//runnable.run();
//
////this-Zeiger in anonymen Klassen:
//// lass uns sagen wir haben aber zwei klassen, eine anonyme klasse und eine äußeren klasse.
////In einer anonymen Klasse bezieht sich this auf das aktuelle Objekt der anonymen Klasse selbst. Innerhalb der anonymen Klasse kann man auf ihre eigenen Attribute und Methoden mit this zugreifen.
////Wenn jedoch von der äußeren Klasse auf this zugegriffen werden muss, verwendet man OuterClassName.this.
//
//class Foo {
//    int x = 77;
//
//    void demo() {
//        Runnable r = new Runnable() {
//            int x = 42;
//
//            @Override
//            public void run() {
//                System.out.println(this.x);          // Zugriff auf x der anonymen Klasse (42)
//                System.out.println(Foo.this.x);      // Zugriff auf x der äußeren Klasse Foo (77)
//            }
//        };
//        r.run();
//    }
//}



//
//
//
////Serializierung von lambda Ausdrücke:
//
////Standardmäßig sind Lambda-Ausdrücke in Java nicht serialisierbar. Dies liegt daran, dass sie als innere Klassen ohne eindeutige Identität implementiert sind. Serialisierung ist jedoch erforderlich, wenn man Lambda-Ausdrücke in einer Datei speichern und später wieder einlesen möchte, z. B. in verteilten Systemen oder für die dauerhafte Speicherung von Konfigurationen.
//
//
//
//import java.io.*;
//
//// 1. Funktionales Interface, das sowohl Consumer als auch Serializable ist
//@FunctionalInterface
//interface SerializableConsumer<T> extends Consumer<T>, Serializable {} // (2)
//
//// 2. Einfaches Consumer Interface für Vergleichszwecke
//// hier Consumer-Interface ist ein einfaches funktionales Interface mit einer abstrakten Methode accept, die einen Parameter vom generischen Typ T akzeptiert:
//@FunctionalInterface
//interface Consumer<T> {
//    void accept(T value);
//}
//
//public class App {
//
//    public static void main(String[] args) {
//        demo1();  // Demo mit Type-Casting für Serializable
//        demo2();  // Demo mit direkt serialisierbarem Interface
//    }
//
//    // 3. Serialisierung mit Type-Casting (Consumer<String> & Serializable)
//    //Nicht serialisierbare Lambda-Ausdrücke:
////Wenn man versucht, einen normalen Lambda-Ausdruck, der das Consumer-Interface implementiert, zu serialisieren, wird eine NotSerializableException ausgelöst:
////java
////Copy code
////static void demo1() {
////    final Consumer<String> c = s -> System.out.println(s);
////    try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("zzz.dat"))) {
////        out.writeObject(c);  // Fehler: NotSerializableException
////    } catch (Exception e) {
////        System.out.println(e);
////    }
////}
////Diese Fehlermeldung zeigt, dass das Consumer-Interface und damit die Lambda-Implementierung nicht serialisierbar sind.
////    Man kann den Lambda-Ausdruck so umgestalten, dass er serialisierbar wird, indem man ihn auf eine Kombination von Consumer und Serializable castet:
//    static void demo1() {
//        System.out.println("Demo 1: Serialisierung mit Type-Casting");
//        final Consumer<String> c = (Consumer<String> & Serializable) s -> System.out.println(s);
//        // Hier wird durch den Type-Cast (Consumer<String> & Serializable) dem Compiler signalisiert, dass dieser Lambda-Ausdruck beide Interfaces implementiert.
//        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("zzz1.dat"))) {
//            out.writeObject(c);
//        } catch (Exception e) {
//            System.out.println("Fehler beim Schreiben: " + e);
//        }
//
//        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("zzz1.dat"))) {
//            Consumer<String> cc = (Consumer<String>) in.readObject();
//            cc.accept("Hello from Type-Casted Lambda");
//        } catch (Exception e) {
//            System.out.println("Fehler beim Lesen: " + e);
//        }
//    }//Hier wird c als Lambda-Ausdruck in die Datei zzz.dat geschrieben, und beim erneuten Einlesen wird der gleiche Lambda-Ausdruck wieder aufgerufen, um "Hello from Type-Casted Lambda" auszugeben.
//
//    // 4. Serialisierung mit dem direkt implementierten Serializable Interface
//    static void demo2() {
//        System.out.println("\nDemo 2: Serialisierung mit SerializableConsumer Interface");
//        //anstatt einen Trick mit Type-Casting zu verwenden, kann man ein neues Interface definieren, das sowohl Consumer als auch Serializable erweitert: (2)
//        // Durch die Verwendung dieses neuen SerializableConsumer-Interfaces wird die Serialisierbarkeit direkt in das Interface integriert, was den Code eleganter und sauberer macht.
//        //Der gleiche Serialisierungsprozess wird durch das neue SerializableConsumer-Interface vereinfacht:
//        final SerializableConsumer<String> c = s -> System.out.println(s);
//        // Hier entfällt der Cast (Consumer<String> & Serializable), da das Interface SerializableConsumer von Haus aus Serializable ist.
//        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("zzz2.dat"))) {
//            out.writeObject(c);
//        } catch (Exception e) {
//            System.out.println("Fehler beim Schreiben: " + e);
//        }
//
//        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("zzz2.dat"))) {
//            Consumer<String> cc = (Consumer<String>) in.readObject();
//            cc.accept("Hello from SerializableConsumer");
//        } catch (Exception e) {
//            System.out.println("Fehler beim Lesen: " + e);
//        }
//    }
//}

//
//
//
//
//











//Verwendungen von lambda-Ausdrücke:


////Predicate<T>:
////        Ein Predicate ist eine Funktion, die einen Wert akzeptiert und einen Boolean-Wert zurückgibt (z.B. für Filter).
//import java.util.function.Predicate;
//
//public class App {
//    public static void main(String[] args) {
//        Predicate<String> isLongerThan5 = s -> s.length() > 5;
//        System.out.println(isLongerThan5.test("Hello"));  // Ausgabe: false
//        System.out.println(isLongerThan5.test("Hello, World!"));  // Ausgabe: true
//    }
//}
//

//
////Consumer<T>:
////Ein Consumer akzeptiert einen Eingabewert und führt darauf eine Operation aus, ohne einen Wert zurückzugeben (z.B. forEach).
//
//import java.util.function.Consumer;
//import java.util.Arrays;
//import java.util.List;
//
//public class App {
//    public static void main(String[] args) {
//        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
//        Consumer<String> printName = name -> System.out.println(name);
//        names.forEach(printName);  // Ausgabe: Alice, Bob, Charlie
//    }
//}




////Function<T, R>:
////        Ein Function akzeptiert einen Eingabewert vom Typ T und gibt einen Wert vom Typ R zurück (z.B. Transformation).
//T = String: Der Typ des Eingabewertes ist ein String.
//        R = Integer: Der Typ des Rückgabewertes ist ein Integer.
//Die Funktion wandelt den String "123" in die Ganzzahl 123 um.

//import java.util.function.Function;
//
//public class App {
//    public static void main(String[] args) {
//        Function<Integer, String> intToString = num -> "Number: " + num;
//        System.out.println(intToString.apply(5));  // Ausgabe: Number: 5
//    }
//}




////Supplier<T>:
////Ein Supplier gibt einen Wert des Typs T zurück, ohne eine Eingabe zu akzeptieren (z.B. für Factory-Methoden).
//
//import java.util.function.Supplier;
//
//public class App {
//    public static void main(String[] args) {
//        Supplier<String> greetingSupplier = () -> "Hello, World!";
//        System.out.println(greetingSupplier.get());  // Ausgabe: Hello, World!
//    }
//}



////BinaryOperator<T> und UnaryOperator<T>:
////        BinaryOperator: Führt eine Operation auf zwei Werten des gleichen Typs durch und gibt einen Wert des gleichen Typs zurück.
////        UnaryOperator: Führt eine Operation auf einem Wert durch und gibt einen Wert des gleichen Typs zurück.
//
//import java.util.function.BinaryOperator;
//
//public class App {
//    public static void main(String[] args) {
//        BinaryOperator<Integer> sum = (a, b) -> a + b;
//        System.out.println(sum.apply(5, 3));  // Ausgabe: 8
//    }
//}





////Stream-API
////        Die Stream-API verwendet Lambdas häufig für Operationen wie Filtern, Sortieren und Sammeln von Daten.
//
//import java.util.Arrays;
//import java.util.List;
//
//public class App {
//    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
//
//        // Filter, map und sammeln mit Lambdas
//        List<Integer> evenNumbers = numbers.stream()
//                .filter(n -> n % 2 == 0)  // Nur gerade Zahlen
//                .map(n -> n * n)          // Quadrieren
//                .toList();                // In eine Liste sammeln
//
//        System.out.println(evenNumbers);  // Ausgabe: [4, 16, 36]
//    }
//}



////Comparator für benutzerdefinierte Sortierungen
////        Lambda-Ausdrücke vereinfachen die Implementierung von Comparator, z.B. für die Sortierung von Objekten.
//
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.List;
//
//public class App {
//    public static void main(String[] args) {
//        List<String> names = Arrays.asList("John", "Alice", "Bob");
//
//        // Sortiere die Liste mit einem Lambda-basierten Comparator
//        names.sort((s1, s2) -> s1.length() - s2.length());  // Nach Länge sortieren
//        // umgekehrt können wir das wie folgendes machen :
//        //names.sort((s1, s2) -> s2.length() - s1.length());
//        System.out.println(names);  // Ausgabe: [Bob, John, Alice]
//    }
//}
//



//
////Verwendung in GUI-Anwendungen
////
////        Lambdas vereinfachen den Umgang mit Event-Handling in Swing oder JavaFX-Anwendungen, z.B. für ActionListener.
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import java.awt.FlowLayout;
//
//public class App {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Lambda Beispiel");
//        JButton button = new JButton("Klick mich");
//
//        // Event-Handling mit Lambda-Ausdruck
//        button.addActionListener(e -> System.out.println("Button wurde geklickt!"));
//
//        frame.setLayout(new FlowLayout());
//        frame.add(button);
//        frame.setSize(300, 200);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//    }
//}







////Verwendung als Runnable
////
////Lambda-Ausdrücke können verwendet werden, um Runnable-Objekte zu erzeugen und Threads zu starten.
//
//public class App {
//    public static void main(String[] args) {
//        Runnable task = () -> System.out.println("Läuft in einem separaten Thread.");
//        new Thread(task).start();  // Startet den Thread
//    }
//}



////Verwendung für Callbacks
////
////Lambda-Ausdrücke sind ideal für asynchrone Programmierung und Callbacks.
//
//import java.util.concurrent.CompletableFuture;
//
//public class App {
//    public static void main(String[] args) {
//        CompletableFuture.supplyAsync(() -> "Async-Operation abgeschlossen.")
//                .thenAccept(result -> System.out.println(result));
//    }
//}


//
////Erstellung von benutzerdefinierten Funktionalen Interfaces
////
////Lambdas können auch für benutzerdefinierte Funktionale Interfaces verwendet werden.
//
//@FunctionalInterface
//interface MathOperation {
//    int operate(int a, int b);
//}
//
//public class App {
//    public static void main(String[] args) {
//        MathOperation addition = (a, b) -> a + b;
//        MathOperation multiplication = (a, b) -> a * b;
//
//        System.out.println(addition.operate(5, 3));  // Ausgabe: 8
//        System.out.println(multiplication.operate(5, 3));  // Ausgabe: 15
//    }
//}
//

//Zusammenfassung:
//
//Lambdas vereinfachen den Code für:
//
//Funktionale Programmierung
//Streams und Collection-Verarbeitung
//GUI-Event-Handling
//Vergleichsoperationen (Comparator)
//Asynchrone Operationen
//Threading (Runnable)









//
//
//
//
//
//
//// Closures:
////
////Ein Closure (oder auch Lexical Closure) ist eine Funktion, die auf Variablen aus ihrem umgebenden Kontext zugreifen kann, auch nachdem dieser Kontext nicht mehr existiert. In Java werden Closures in Form von Lambdas und anonymen Klassen verwendet. Closures ermöglichen die Erzeugung von inneren Klassen, die auf Variablen aus der Methode oder dem Scope zugreifen können, in dem sie definiert wurden.
//
////Beispiel: Einfache Closure mit Lambda
//
//
//public class App {
//    public static void main(String[] args) {
//        int number = 10;
//
//        // Lambda-Ausdruck, der auf die äußere Variable `number` zugreift
//        Runnable runnable = () -> System.out.println("Value: " + number);
//
//        // Ausführen des Lambdas
//        runnable.run(); // Ausgabe: Value: 10
//    }
//}
////Hier wird der Wert der äußeren Variablen number auch innerhalb des Lambdas verwendet, obwohl number keine direkte lokale Variable des Lambdas ist. Solche Konstrukte sind typische Beispiele für Closures.



//
////2. Das final-Problem
////Eine der Besonderheiten bei der Verwendung von Closures in Java ist, dass die Variablen, auf die innerhalb einer Lambda-Funktion zugegriffen wird, effektiv final sein müssen. Das bedeutet, dass der Wert dieser Variablen nach ihrer Initialisierung nicht mehr verändert werden darf.
//
//public class App {
//    public static void main(String[] args) {
//        int number = 10; // Effektiv final, da der Wert nicht verändert wird.
//
//        Runnable runnable = () -> {
//            // Zugriff auf `number` innerhalb des Closures
//            System.out.println("Value: " + number);
//        };
//
//        number = 20; // Compilerfehler: Variable in Lambda muss final oder effektiv final sein
//        // Wenn du versuchen würdest, die Variable number nach der Definition des Lambdas zu ändern, würde dies zu einem Kompilierfehler führen:
//
//        runnable.run(); // Ausgabe: Value: 10
//    }
//}

//
//
////Verwendung von andThen mit Closures
////Closures können mithilfe der andThen-Methode kombiniert werden. Diese Methode ist besonders nützlich, wenn man mehrere Operationen miteinander verketten möchte. Sie wird häufig in der funktionalen Programmierung verwendet.
//import java.util.function.Consumer;
//
//public class App {
//    public static void main(String[] args) {
//        // Zwei Konsumenten, die einfache Ausgaben tätigen
//        Consumer<String> printUpper = s -> System.out.println(s.toUpperCase());
//        Consumer<String> printLower = s -> System.out.println(s.toLowerCase());
//
//        // Verkettung der beiden Closures mit `andThen`
//        Consumer<String> combinedConsumer = printUpper.andThen(printLower);
//
//        // Ausführung des verketteten Consumers
//        combinedConsumer.accept("Hello World");
//        // Ausgabe:
//        // HELLO WORLD
//        // hello world
//    }
//}




//
////4. Beispiele: Implementierung mit Closures
//
//
//public class App {
//    public static void main(String[] args) {
//        int number = 5;
//
//        // Definition eines Closures als Runnable
//        Runnable closure = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Number from closure: " + number);
//            }
//        };
//
//        closure.run(); // Ausgabe: Number from closure: 5
//    }
//}



////5. Beispiel: Closure mit Operator
//import java.util.function.Function;
//
//public class App {
//    public static void main(String[] args) {
//        int multiplier = 3;
//
//        // Closure als Funktion, die den Wert multipliziert
//        Function<Integer, Integer> multiply = (value) -> value * multiplier;
//
//        // Verwendung der Closure
//        System.out.println("Result: " + multiply.apply(5)); // Ausgabe: Result: 15
//    }
//}
////Hier greifen wir auf die äußere Variable multiplier zu, die für das Closure zugänglich ist.
//


////
////6. Weitere Verwendung: andThen in Methoden
////Die andThen-Methode wird in Java verwendet, um zwei Closures oder Funktionen miteinander zu kombinieren. Die Methode ist besonders nützlich, wenn du eine Pipeline von Operationen erstellen möchtest.
////
//import java.util.function.Function;
//
//public class App {
//    public static void main(String[] args) {
//        // Erstes Closure: Zahl verdoppeln
//        Function<Integer, Integer> multiplyByTwo = x -> x * 2;
//
//        // Zweites Closure: Zahl quadrieren
//        Function<Integer, Integer> square = x -> x * x;
//
//        // Verkettung der Funktionen: Erst multiplizieren, dann quadrieren
//        Function<Integer, Integer> multiplyAndSquare = multiplyByTwo.andThen(square);
//
//        // Ergebnis der verketteten Funktionen
//        System.out.println("Result: " + multiplyAndSquare.apply(3)); // Ausgabe: Result: 36
//    }
//}




//
////Verkettung mit compose
////Neben andThen gibt es auch die Methode compose, die Funktionen in umgekehrter Reihenfolge verknüpft. Mit compose wird die zweite Funktion zuerst aufgerufen und das Ergebnis wird an die erste Funktion übergeben.
////
////        Beispiel: Verwendung von compose
//
//import java.util.function.Function;
//
//public class App {
//    public static void main(String[] args) {
//        Function<Integer, Integer> addFive = x -> x + 5;
//        Function<Integer, Integer> multiplyByTwo = x -> x * 2;
//
//        // Verkettung der Funktionen: Erst addieren, dann multiplizieren
//        Function<Integer, Integer> combinedFunction = multiplyByTwo.compose(addFive);
//
//        // Ergebnis der verketteten Funktionen
//        System.out.println("Result: " + combinedFunction.apply(3)); // Ausgabe: Result: 16
//    }
//}
//
































//
//
////Funktionale Programmierung:
//
//
//import java.util.*;
//import java.util.stream.*;
//
// public class App {
//
//    // Eine einfache Klasse "Person" mit Name und Alter
//    static class Person {
//        String name;
//        int age;
//
//        Person(String name, int age) {
//            this.name = name;
//            this.age = age;
//        }
//
//        @Override
//        public String toString() {
//            return name + " (" + age + ")";
//        }
//    }
//
//    public static void main(String[] args) {
//        // Eine Liste von Personen erstellen
//        List<Person> persons = Arrays.asList(
//                new Person("Alice", 23),
//                new Person("Bob", 35),
//                new Person("Charlie", 25),
//                new Person("David", 29),
//                new Person("Eve", 30),
//                new Person("Frank", 28)
//        );
//
//        System.out.println("Ursprüngliche Liste der Personen:");
//        persons.forEach(System.out::println);
//
//
//        // 1. forEach
//        //Die forEach-Methode führt eine gegebene Aktion (Lambda-Ausdruck oder Method-Referenz) für jedes Element des Streams aus. Sie ist ideal, um Operationen wie das Drucken von Elementen durchzuführen, hat aber den Nachteil, dass sie den Stream nur konsumiert und keine weiteren Transformationen erlaubt.
//        // 1. forEach: Alle Personen ausdrucken
//        System.out.println("\nforEach-Beispiel: Namen in Großbuchstaben:");
//        persons.stream()
//                .map(person -> person.name.toUpperCase())
//                .forEach(System.out::println);
//
////        2. filter
////        Die filter-Methode nimmt ein Predicate (eine Bedingung) als Argument und gibt einen neuen Stream zurück, der nur die Elemente enthält, die diese Bedingung erfüllen. Sie wird häufig verwendet, um bestimmte Elemente basierend auf Eigenschaften (z.B. alter > 30) herauszufiltern.
//        // 2. filter: Personen herausfiltern, die jünger als 30 sind
//        System.out.println("\nfilter-Beispiel: Personen unter 30 Jahren:");
//        List<Person> youngPersons = persons.stream()
//                .filter(person -> person.age < 30)
//                .collect(Collectors.toList());
//        youngPersons.forEach(System.out::println);
//
//
//// 3. map
////Die map-Methode transformiert jedes Element eines Streams mittels einer angegebenen Funktion und gibt einen neuen Stream zurück, der die transformierten Elemente enthält. Sie wird verwendet, um Elemente zu modifizieren, z.B. um ein Person-Objekt in den Namen oder eine Zeichenkette in Großbuchstaben umzuwandeln.
//        // 3. map: Liste der Namen von Personen erstellen
//        System.out.println("\nmap-Beispiel: Liste der Namen:");
//        List<String> names = persons.stream()
//                .map(person -> person.name)
//                .collect(Collectors.toList());
//        System.out.println(names);
//
//
//// 4. reduce
////Die reduce-Methode kombiniert alle Elemente eines Streams zu einem einzelnen Wert, indem sie eine Akkumulationsfunktion verwendet. Sie ist nützlich für Aggregationsoperationen wie Summen, Produktergebnisse oder das Verketten von Zeichenketten.
//        // 4. reduce: Summe aller Alterswerte berechnen
//        System.out.println("\nreduce-Beispiel: Summe des Alters aller Personen:");
//        int totalAge = persons.stream()
//                .map(person -> person.age)
//                .reduce(0, Integer::sum);
//        System.out.println("Gesamtes Alter: " + totalAge);
//        // andere verwendung von reduce
//        // int product = Arrays.asList(1, 2, 3, 4)
//        //                    .stream()
//        //                    .reduce(1, (a, b) -> a * b);
//        // Multipliziert alle Zahlen in der Liste und gibt 24 zurück.
//
//
//// 5. collect
////Die collect-Methode sammelt die Elemente eines Streams und wandelt sie in eine andere Datenstruktur um, wie z.B. eine List, Set oder Map. Sie ist das Äquivalent zum „Ergebnis sammeln“ nach einer Folge von Stream-Operationen und wird oft mit Collectors kombiniert, um das Ergebnis zu definieren.
//        // 5. collect: Namen in eine einzelne Zeichenkette zusammenfügen
//        System.out.println("\ncollect-Beispiel: Alle Namen als eine Zeichenkette:");
//        String allNames = persons.stream()
//                .map(person -> person.name)
//                .collect(Collectors.joining(", "));
//        System.out.println("Namen: " + allNames);
//
//
//// 6. find
////Die find-Methoden (findFirst und findAny) durchsuchen den Stream und geben das erste gefundene Element zurück, das den Filterbedingungen entspricht. Sie liefern ein Optional, um mit potenziell fehlenden Werten sicher umzugehen.
//        // 6. find: Finde eine Person, die älter als 30 Jahre ist
//        System.out.println("\nfind-Beispiel: Erste Person über 30 Jahre:");
//        Optional<Person> personOver30 = persons.stream()
//                .filter(person -> person.age < 30)
//                .findFirst();
//        personOver30.ifPresent(System.out::println);
//
//
//// 7. match
////Die match-Methoden (anyMatch, allMatch, noneMatch) überprüfen, ob mindestens ein, alle oder kein Element des Streams eine bestimmte Bedingung erfüllt. Sie geben einen boolean-Wert zurück, der das Ergebnis dieser Prüfung angibt.
//        // 7. match: Überprüfen, ob alle Personen älter als 20 Jahre sind
//        System.out.println("\nmatch-Beispiel: Sind alle Personen älter als 20 Jahre?");
//        boolean allOlderThan20 = persons.stream()
//                .allMatch(person -> person.age > 20);
//        System.out.println("Alle Personen sind älter als 20: " + allOlderThan20);
//
//
//
//        // Kombination von Operationen: Personen unter 30 in Großbuchstaben
//        System.out.println("\nKombination von Operationen: Personen unter 30 in Großbuchstaben:");
//        List<String> youngNamesUpperCase = persons.stream()
//                .filter(person -> person.age < 30)
//                .map(person -> person.name.toUpperCase())
//                .collect(Collectors.toList());
//        System.out.println(youngNamesUpperCase);
//    }
//}
//












//// Set and HashSet in Java:
//
////Set ist eine möglichket, eine ganze Reihe ähnlicher objekte zu gruppieren, und als eine Einheit zu behandeln. sodass sie bsw. elemente zu einem set hinzufügen und löschen können usw.
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class App App{
//    public static void main(String[] args) {
//
//        Set<String> names = new Set(); // dann geben wir zu, welche elemente möchten wir reingeben.Strings, Integers usw.
//
//        // dann sehen wir einen error das set nicht instanziert werden könnte, und der grund dafür ist dass set einen interface ist und kein class, und wir können interfaces nicht instanzieren. hier kommt die rolle von hashSet:
//        Set<String> names = new HashSet<>();
//        // wenn wir hier auf command + click gehen, sehen wir dass HashSet Set implementiert.
//    }
//}
//// Hashset wird 99% verwendet jedes mal wenn du einen set verwenden möchtest.


//// Implementierung von Hashsets:
//
//import java.sql.Array;
//import java.util.*;
//
//public class App {
//    public static void main(String[] args) {
//
//
////        Set<String> names = new HashSet<>();
////
////        names.add("Alice");
////        names.add("Tomi");
////        names.add("Jessi");
////        names.add("Mike");
//
////        System.out.println(names);
////// was wir hier sehen können ist dass die Reihenfolge der namen verändert wurde, und das ist eine der Eigenschaften von Hashsets und einen klaren unterschied zwischen hashsets und klassische sets.
////        // eine andere eigenschaft ist dass set erlaubt kein duplikate speichert,
////        names.add("Tomi");
////        System.out.println(names);
////        // dann sehen wir dass tomi nur einmal ausgedrückt wurde.
//
//////        names.remove("Alice");// wir können einen element vom hashset so löschen, aber nicht mit index:
////        names.remove(0);
////        System.out.println(names);
////        // und das ist ja logisch da hashset keine reihenfolge hat aufjedenfall, deswegen können wir nicht vorhersagen welche der Elemente wird gelöscht mit index 0.
////
////
////        System.out.println(names.size());
////        System.out.println(names.contains("Alice"));
////        System.out.println(names.isEmpty());
////        names.clear();// um alle elemente zu löschen.
//
////        // wie wäre es wenn wir wollen einen aktion auf alle unsere set elemente anwenden wollen ! durch elemente iterieren, in einem datei schreiben usw..
////        // Enhanced for-loop;
////        for (String name : names){
////            System.out.println(name);
////        }
////
//        // forEach:
////        names.forEach(System.out::println);
//
//////      // While:
////        Iterator<String> namesIterator = names.iterator();
////        while(namesIterator.hasNext()){
////            System.out.println(namesIterator.next());
////        }
//
//        // wann sind die hashsets aber besonders nützlich !
//        // die einfache Antwort darauf ist wir eine collection oder sammlung von elementen möchten, und wir möchten keine duplikate in dieser Sammlung haben, und die Reihenfolge ist auch uns egal.
//
//        List<Integer> numberList = new ArrayList<>();
//        numberList.add(1);
//        numberList.add(2);
//        numberList.add(3);
//        numberList.add(2);
//        numberList.add(1);
//        System.out.println(numberList);
////
////        Set<Integer> numberSet = new HashSet<>();
////        numberSet.addAll(numberList);
////        System.out.println(numberSet);// jzt haben wir alle unser  duplikate mit dem HashSet entfernt.
//
////        // was dieser warnung in addAll uns sagt, ist dass wir das auch vereinfachen können, in dem wir die name unseres list als parameter im Hashset reingeben :
////        Set<Integer> numberSet = new HashSet<>(numberList);
////        System.out.println(numberSet);
//
//
////        // eine andere implementierung ist auch TreeSet:
////        Set<Integer> numberSet = new TreeSet<>(numberList);
////        System.out.println(numberSet);
////        // das ist die gleiche methode wie HashSet mit den gleichen Eigenschaften, aber der einzige Unterschied ist, dass die elemente in TreeSet werden mit der natürlichen Reihenfolge geordnet. also nummern werden von klein zu größ ausgedruckt, und Strings werden mit der alphabetischen Reihenfolge eingefügt.
//
//        // eine letzte methode ist die LinkedHashSet:
//        Set<String> names = new LinkedHashSet<>();
//
//        names.add("Alice");
//        names.add("Tomi");
//        names.add("Jessi");
//        names.add("Mike");
//        System.out.println(names);
//        // dann sehen wir, dass die elemente genauso ausgedruckt wie mit der genaue reihenfolge die ich geschrieben habe.
//    }
//}






























//
//// Streams:
//
//import java.util.*;
//import java.util.stream.*;
//
//public class App {
//    public static void main(String[] args) {
//        // Beispiel 1: Stream von Strings und Verwendung von map, filter und reduce
//        List<String> colors = Arrays.asList("red", "green", "blue", "yellow", "purple");
//
//        // Erstellen eines Streams und Anwendung der Operationen
//        System.out.println("Beispiel 1: Farben verarbeiten");
//        int totalLength = colors.stream()
//                .filter(color -> color.length() >= 4)     // filter: Behalte nur Strings mit Länge >= 4
//                .map(String::length)                      // map: Transformiere die Strings in ihre Längen
//                .peek(len -> System.out.println("Länge: " + len))  // peek: Zeige die Länge nach map
//                .reduce(0, Integer::sum);                 // reduce: Summiere alle Längen
//
//        System.out.println("Gesamtlänge der ausgewählten Strings: " + totalLength);
////        colors.stream(): Erzeugt einen Stream aus der Liste colors.
////                filter(color -> color.length() >= 4): Behalte nur Farben, deren Länge mindestens 4 Zeichen beträgt.
////        Eingabedaten: [red, green, blue, yellow, purple]
////        Nach filter: [green, blue, yellow, purple] (red wird entfernt, weil die Länge < 4 ist).
////        map(String::length): Transformiert die Farben (String) in ihre jeweilige Länge (int).
////        Eingabedaten: [green, blue, yellow, purple]
////        Nach map: [5, 4, 6, 6] (die Längen der Wörter werden berechnet).
////        peek(len -> System.out.println("Länge: " + len)): Gibt die Längen nach der map-Operation aus, um den aktuellen Stand der Verarbeitung zu überprüfen.
//
//        // Beispiel 2: Stream von Zahlen und Verwendung von map, filter, und reduce
//        List<Integer> numbers = Arrays.asList(10, 11, 12, 13);
//
//        System.out.println("\nBeispiel 2: Zahlen verarbeiten");
//        int sum = numbers.stream()
//                .map(n -> n * 3)                                 // map: Multipliziere jede Zahl mit 3
//                .peek(n -> System.out.println("Nach map: " + n)) // peek: Zeige die Zahl nach map
//                .filter(n -> n % 2 == 0)                         // filter: Behalte nur gerade Zahlen
//                .peek(n -> System.out.println("Nach filter: " + n)) // peek: Zeige die Zahl nach filter
//                .reduce(0, (x, y) -> x + y);                     // reduce: Summe aller ausgewählten Zahlen
//
//        System.out.println("Gesamtsumme der ausgewählten Zahlen: " + sum);
//
//        // Beispiel 3: Verwendung von findFirst und match
//        System.out.println("\nBeispiel 3: findFirst und match");
//        Optional<String> firstLongColor = colors.stream()
//                .filter(color -> color.length() > 4)  // filter: Behalte Farben mit Länge > 4
//                .findFirst();                         // findFirst: Finde die erste passende Farbe
//        firstLongColor.ifPresent(color -> System.out.println("Erste Farbe mit Länge > 4: " + color));
//
//        boolean allStartWithR = colors.stream()
//                .allMatch(color -> color.startsWith("r"));      // allMatch: Prüfe, ob alle Farben mit "r" beginnen
//        System.out.println("Beginnen alle Farben mit 'r'? " + allStartWithR);
//
//        // Beispiel 4: Verwendung der collect-Methode
//        System.out.println("\nBeispiel 4: Verwendung von collect");
//        List<String> upperCaseColors = colors.stream()
//                .map(String::toUpperCase)                // map: Transformiere in Großbuchstaben
//                .collect(Collectors.toList());           // collect: Sammle die Ergebnisse in einer Liste
//        System.out.println("Farben in Großbuchstaben: " + upperCaseColors);
//
//        // Beispiel 5: Verwendung von peek zur Zwischenausgabe
//        //Verwenden wir peek mehrmals, um den aktuellen Zustand in jeder Phase der Verarbeitung auszugeben.
//        System.out.println("\nBeispiel 5: Verwendung von peek zur Beobachtung");
//        List<String> processedColors = colors.stream()
//                .peek(color -> System.out.println("Originalfarbe: " + color))  // peek: Zeige die Originalfarben
//                .filter(color -> color.length() > 3)                            // filter: Behalte nur Farben mit Länge > 3
//                .peek(color -> System.out.println("Nach Filter: " + color))     // peek: Zeige die Farben nach Filter
//                .map(String::toUpperCase)                                       // map: Transformiere in Großbuchstaben
//                .peek(color -> System.out.println("Nach Map: " + color))        // peek: Zeige die Farben nach Map
//                .collect(Collectors.toList());                                  // collect: Sammle die Ergebnisse in einer Liste
//        System.out.println("Verarbeitete Farben: " + processedColors);
//    }
//}
















////1. Grundlegendes Enum-Konzept:
//Enums (kurz für enumeration) repräsentieren eine Sammlung von konstanten Werten, die in Java als spezielle Klassen behandelt werden.

//Enums sind eine Alternative zur Verwendung von final static Konstanten und bieten zusätzliche Funktionalitäten wie Typensicherheit und bessere Unterstützung in IDEs.

//Ein Enum in Java definiert eine Gruppe von Konstanten. Früher wurden Enums häufig als einfache Konstanten verwendet, z.B.:

//enum Color {
//    RED, GREEN, BLUE;
//}
//
//public class App {
//    public static void main(String[] args) {
//        Color color = Color.RED;
//        System.out.println("Selected color: " + color); // Ausgabe: Selected color: RED
//    }
//}

//Diese Definition erzeugt drei Konstanten RED, GREEN und BLUE. Die Darstellung von Color.RED ist intern einfach eine Instanz der Enum-Klasse Color.



//2. Erweiterte Enum-Implementierung
//Im modernen Java können Enums wie Klassen erweitert werden, indem man Attribute, Konstruktoren und Methoden hinzufügt. Dies macht Enums vielseitiger und ermöglicht eine komplexere Funktionalität.

//// Separate Klasse App.java
//public class App {
//    public static void main(String[] args) {
//        // Nutzung des Enums `Color`
//        for (Color color : Color.values()) {
//            System.out.println(color + " hat die Anzeige: " + color.getDisplayName());
//        }
//    }
//}
//
//enum Color {
//    RED("Rot"), GREEN("Grün"), BLUE("Blau");
//
//    private final String displayName;
//
//    // Konstruktor
//    private Color(String displayName) {
//        this.displayName = displayName;
//    }
//
//    // Getter für das displayName-Attribut
//    public String getDisplayName() {
//        return displayName;
//    }
//}

//
//Jeder Enum-Wert (RED, GREEN, BLUE) hat ein Attribut displayName, das seinen deutschen Namen speichert.
//Der Konstruktor private Color(String displayName) erlaubt es, jedem Enum-Wert eine eigene Zeichenkette zuzuordnen.
//Mit der Methode getDisplayName() wird der Wert zurückgegeben.









//// 3. Enum als Klasse mit Methoden
////Enums können Methoden enthalten, genauso wie normale Klassen. Dies ermöglicht eine strukturiertere und komplexere Logik innerhalb der Enums.
//
//public class App {
//    public static void main(String[] args) {
//        double x = 4;
//        double y = 2;
//        for (Operation op : Operation.values()) {
//            System.out.println(op + ": " + op.apply(x, y));
//        }
//    }
//}
//enum Operation {
//    ADDITION {
//        @Override
//        public double apply(double x, double y) {
//            return x + y;
//        }
//    },
//    SUBTRACTION {
//        @Override
//        public double apply(double x, double y) {
//            return x - y;
//        }
//    },
//    MULTIPLICATION {
//        @Override
//        public double apply(double x, double y) {
//            return x * y;
//        }
//    },
//    DIVISION {
//        @Override
//        public double apply(double x, double y) {
//            return x / y;
//        }
//    };
//
//    // Abstrakte Methode, die in jedem Enum-Wert implementiert wird
//    public abstract double apply(double x, double y);
//
//}
////// Hier definieren die Enum-Konstanten (ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION) jeweils eine eigene Implementierung der abstrakten Methode apply.
//////Jede Konstante verhält sich wie eine anonyme Klasse mit einer spezifischen Implementierung
////







//
////4. Verwendung von Enum mit Schnittstellen
////Enums können auch Schnittstellen (Interfaces) implementieren, um einheitliches Verhalten für unterschiedliche Enum-Konstanten zu garantieren.
////
//public class App {
//    public static void main(String[] args) {
//        for (Planet p : Planet.values()) {
//            System.out.println(p.getDescription());
//        }
//    }
//}
//interface Describable {
//    String getDescription();
//}
//
//enum Planet implements Describable {
//    MERCURY(3.303e+23, 2.4397e6),
//    VENUS(4.869e+24, 6.0518e6),
//    EARTH(5.976e+24, 6.37814e6);
//
//    private final double mass;   // Masse in Kilogramm
//    private final double radius; // Radius in Metern
//
//    // Konstruktor
//    Planet(double mass, double radius) {
//        this.mass = mass;
//        this.radius = radius;
//    }
//
//    @Override
//    public String getDescription() {
//        return String.format("%s hat eine Masse von %e kg und einen Radius von %e m", this.name(), mass, radius);
//    }
//}
//// Das Enum Planet implementiert das Interface Describable.
////Jede Konstante (MERCURY, VENUS, EARTH) hat spezifische Parameter (mass, radius) und eine eigene Implementierung der Methode getDescription.
//








//
////5. Enum mit EnumMap
////Die Klasse EnumMap ist eine spezielle Implementierung der Map-Schnittstelle für Enums. Sie speichert die Werte effizienter als normale Maps und ist speziell für den Einsatz mit Enums optimiert.
//
//import java.util.EnumMap;
//
//enum Color {
//    RED, GREEN, BLUE;
//}
//
//public class App {
//    public static void main(String[] args) {
//        // Erstellung einer EnumMap mit Color als Schlüssel und String als Wert
//        EnumMap<Color, String> colorMap = new EnumMap<>(Color.class);
//        colorMap.put(Color.RED, "Rot");
//        colorMap.put(Color.GREEN, "Grün");
//        colorMap.put(Color.BLUE, "Blau");
//
//        // Ausgabe der Inhalte der EnumMap
//        for (Color color : Color.values()) {
//            System.out.println(color + ": " + colorMap.get(color));
//        }
//    }
//}
//// Eine EnumMap speichert Schlüssel-Wert-Paare, wobei die Schlüssel immer Enums sein müssen.
////Sie ist besonders effizient, da sie auf die natürliche Ordnung der Enums basiert.
//







//////
////6. Serialisierung von Enums
////Enums sind serialisierbar, da die Basisklasse Enum das Interface Serializable implementiert. Dabei wird sichergestellt, dass bei der Deserialisierung keine neuen Instanzen entstehen, sondern die Original-Instanzen wiederverwendet werden.
//
//
//import java.io.*;
//
//enum Color {
//    RED, GREEN, BLUE;
//}
//
//public class App {
//    public static void main(String[] args) {
//        try {
//            // Serialisierung
//            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("color.ser"));
//            oos.writeObject(Color.GREEN);
//            oos.close();
//
//            // Deserialisierung
//            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("color.ser"));
//            Color color = (Color) ois.readObject();
//            ois.close();
//
//            // Vergleich der Referenzen
//            System.out.println(color == Color.GREEN); // Ausgabe: true
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//}
//// Beim Serialisieren und Deserialisieren bleibt die Enum-Instanz dieselbe (true beim Referenzvergleich), was zeigt, dass keine neuen Objekte erzeugt werden.
//
//




//
////7. Enum mit zusätzlichen Methoden und abstrakten Methoden
////
////Enums können auch abstrakte Methoden haben, die für jeden Enum-Wert separat implementiert werden müssen.
////
//
// enum Shape {
//    CIRCLE {
//        public double area(double dimension) {
//            return Math.PI * dimension * dimension;
//        }
//    },
//    SQUARE {
//        public double area(double dimension) {
//            return dimension * dimension;
//        }
//    };
//
//    // Abstrakte Methode, die jeder Enum-Wert implementieren muss
//    public abstract double area(double dimension);
//}
////Verwendung:
//
//public class App {
//    public static void main(String[] args) {
//        double radius = 5;
//        double side = 4;
//
//        System.out.println("Area of Circle: " + Shape.CIRCLE.area(radius)); // Ausgabe: 78.54
//        System.out.println("Area of Square: " + Shape.SQUARE.area(side));   // Ausgabe: 16.0
//    }
//}

















//
//
////Reflection - Erweiterungen :
//
////Im Kontext von Reflection können wir Klassen-, Methoden- und Feldinformationen zur Laufzeit abrufen und manipulieren, was insbesondere bei der Entwicklung von Frameworks und Bibliotheken nützlich ist.
//
////1. Introspektion: Klassen- und Methodendetails
////Introspektion ist der Prozess des dynamischen Abrufens von Informationen über die Struktur von Klassen, wie z.B. ihre Methoden, Felder und Konstruktoren.
//
//import java.lang.reflect.Method;
//import java.lang.reflect.Field;
//import java.lang.reflect.Constructor;
//
//public class App {
//    public static void main(String[] args) {
//        try {
//            // Introspektion der Klasse
//            Class<?> clazz = ReflectionExample.class;

////ReflectionExample.class gibt ein Class-Objekt zurück, das Informationen über die Klasse ReflectionExample enthält.
//Das Class<?>-Objekt clazz wird verwendet, um die Konstruktoren, Felder und Methoden dieser Klasse abzurufen.

////
//            // Konstruktoren anzeigen
//            Constructor<?>[] constructors = clazz.getConstructors();
//            System.out.println("Konstruktoren:");
//            for (Constructor<?> constructor : constructors) {
//                System.out.println("  " + constructor);
//            }
////getConstructors(): Diese Methode gibt alle öffentlichen Konstruktoren der Klasse ReflectionExample zurück.
//Constructor<?>[] ist ein Array von Konstruktoren.
//Der for-Loop iteriert durch jeden Konstruktor und gibt ihn auf der Konsole aus.

//            // Felder anzeigen
//            Field[] fields = clazz.getDeclaredFields();
//            System.out.println("\nFelder:");
//            for (Field field : fields) {
//                System.out.println("  " + field);
//            }
//// getDeclaredFields(): Diese Methode gibt alle Felder (private, öffentliche, geschützte und package-private) der Klasse ReflectionExample zurück.
//Der for-Loop iteriert durch jedes Feld und gibt es auf der Konsole aus.

//            // Methoden anzeigen
//            Method[] methods = clazz.getDeclaredMethods();
//            System.out.println("\nMethoden:");
//            for (Method method : methods) {
//                System.out.println("  " + method);
//            }
////getDeclaredMethods(): Diese Methode gibt alle Methoden der Klasse ReflectionExample zurück (einschließlich privater Methoden).
//Der for-Loop gibt die Signatur jeder Methode auf der Konsole aus.

//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//    }
//
//class ReflectionExample {
//    private int number;
//    public String text;
//
//    public ReflectionExample() {}
//    public ReflectionExample(int number, String text) {
//        this.number = number;
//        this.text = text;
//    }
//
//    public void printDetails() {
//        System.out.println("Number: " + number + ", Text: " + text);
//    }
//}


//Zusammenfassung der Reflection-Methoden
//Methode	Beschreibung
//getConstructors()	Gibt alle öffentlichen Konstruktoren der Klasse zurück.
//getDeclaredConstructors()	Gibt alle Konstruktoren zurück, unabhängig von deren Sichtbarkeit.
//getFields()	Gibt alle öffentlichen Felder zurück.
//getDeclaredFields()	Gibt alle Felder der Klasse zurück (unabhängig von ihrer Sichtbarkeit).
//getMethods()	Gibt alle öffentlichen Methoden (inklusive geerbter Methoden) zurück.
//getDeclaredMethods()	Gibt alle Methoden der Klasse zurück (einschließlich privater)




//
//// 2. Setzen und Abrufen von Werten mit Reflection
////Reflection erlaubt den Zugriff auf private Felder und Methoden, die normalerweise außerhalb des Klassenkontextes nicht zugänglich wären.
//import java.lang.reflect.Field;
//
//public class App {
//    public static void main(String[] args) {
//        try {
//            ReflectionFieldExample example = new ReflectionFieldExample();
//// Hier wird eine Instanz der Klasse ReflectionInvokeExample erstellt. Diese Instanz wird später als Ziel verwendet, um die Methode hello dynamisch aufzurufen.
//            Class<?> clazz = example.getClass();
////Mit example.getClass() erhältst du ein Class-Objekt, das die Struktur der Klasse ReflectionInvokeExample zur Laufzeit repräsentiert.
////Das Class<?>-Objekt clazz enthält alle Informationen über die Klasse, z.B. Methoden, Felder und Konstruktoren.
//
//
//            // Zugriff auf das private Feld "hiddenValue"
//            Field hiddenField = clazz.getDeclaredField("hiddenValue");
//            hiddenField.setAccessible(true);  // Zugriff auf private Felder erlauben
//
//            // Den Wert des privaten Feldes abrufen
//            String value = (String) hiddenField.get(example);
//            System.out.println("Ursprünglicher Wert: " + value);
//
//            // Den Wert des privaten Feldes ändern
//            hiddenField.set(example, "Neuer geheimer Text");
//            System.out.println("Geänderter Wert: " + hiddenField.get(example));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }}
//    }
//class ReflectionFieldExample {
//    private String hiddenValue = "Geheimer Text";
//}
//// Der Code zeigt, wie man auf private Felder zugreifen und ihre Werte ändern kann.
////setAccessible(true) ist notwendig, um den Zugriff auf private Felder zu erlauben.
//







//
//// 3. Methodenaufruf mit Method.invoke()
////Reflection erlaubt auch das dynamische Aufrufen von Methoden, selbst wenn die Methode nicht zur Compilezeit bekannt ist.
//
//import java.lang.reflect.Method;
//
//public class App {
//    public static void main(String[] args) {
//        try {
//            ReflectionInvokeExample example = new ReflectionInvokeExample();
//// Hier wird eine Instanz der Klasse ReflectionInvokeExample erstellt. Diese Instanz wird später als Ziel verwendet, um die Methode hello dynamisch aufzurufen.
//            Class<?> clazz = example.getClass();
//// Mit example.getClass() erhältst du ein Class-Objekt, das die Struktur der Klasse ReflectionInvokeExample zur Laufzeit repräsentiert.
//Das Class<?>-Objekt clazz enthält alle Informationen über die Klasse, z.B. Methoden, Felder und Konstruktoren.
//            // Die Methode "hello" finden
//            Method helloMethod = clazz.getDeclaredMethod("hello", String.class);
////Die Methode getDeclaredMethod(String name, Class<?>... parameterTypes) sucht nach einer Methode in der Klasse ReflectionInvokeExample mit dem Namen hello und dem angegebenen Parameter (String.class).
//Die Signatur bedeutet: "hello" ist der Methodenname und String.class ist der erwartete Parameter-Typ.
//In diesem Fall wird die Methode public void hello(String name) gefunden.
//
//            // Die Methode aufrufen
//            helloMethod.invoke(example, "Welt");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }}
//    }
////invoke(Object obj, Object... args) führt die Methode hello auf dem Objekt example aus und übergibt "Welt" als Argument.
//Intern wird dies wie ein normaler Methodenaufruf betrachtet: example.hello("Welt");.
//Das Ergebnis ist, dass die Methode hello ausgeführt wird und "Hallo, Welt!" auf der Konsole ausgegeben wird.
// class ReflectionInvokeExample {
//    public void hello(String name) {
//        System.out.println("Hallo, " + name + "!");
//    }
//}
//// Die Methode hello wird mittels Method.invoke() dynamisch aufgerufen.
////Dies ist nützlich, wenn Methodenaufrufe abhängig von Benutzereingaben oder zur Laufzeit ermittelten Informationen sind.
//

//
//
////
////4. Zugriff auf private Konstruktoren
////Manchmal ist es notwendig, Objekte von Klassen zu erstellen, deren Konstruktoren privat sind.
//
//import java.lang.reflect.Constructor;
//import java.lang.reflect.Method;
//
//public class App {
//    public static void main(String[] args) {
//        try {
//            Class<?> clazz = ReflectionConstructorExample.class;
//
//            // Privaten Konstruktor finden und aufrufen
//            Constructor<?> constructor = clazz.getDeclaredConstructor(String.class);
//            constructor.setAccessible(true);
//            ReflectionConstructorExample example = (ReflectionConstructorExample) constructor.newInstance("Geheime Nachricht");
//
//            // Methode aufrufen
//            example.printMessage();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }}
//    }
// class ReflectionConstructorExample {
//    private String message;
//
//    // Privater Konstruktor
//    private ReflectionConstructorExample(String message) {
//        this.message = message;
//    }
//
//    public void printMessage() {
//        System.out.println(message);
//    }
//}
//// Hier wird ein privater Konstruktor mittels setAccessible(true) zugänglich gemacht und anschließend zur Instanziierung eines Objekts verwendet.


////
////5. Zugriff auf private Methoden
////Neben Feldern und Konstruktoren können auch private Methoden aufgerufen werden.
//
//import java.lang.reflect.Method;
//
//public class App {
//    public static void main(String[] args) {
//        try {
//            ReflectionPrivateMethodExample example = new ReflectionPrivateMethodExample();
//            Class<?> clazz = example.getClass();
//
//            // Zugriff auf die private Methode
//            Method secretMethod = clazz.getDeclaredMethod("secretMethod");
//            secretMethod.setAccessible(true);  // Zugriff auf private Methode erlauben
//
//            // Die Methode aufrufen
//            secretMethod.invoke(example);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }}
//    }
// class ReflectionPrivateMethodExample {
//    private void secretMethod() {
//        System.out.println("Dies ist eine geheime Methode.");
//    }
//}
//// Hier wird die private Methode secretMethod aufgerufen.
////setAccessible(true) wird verwendet, um den Zugriff auf private Methoden zu ermöglichen.



// Reflection wird typischerweise in folgenden Szenarien eingesetzt:
//
//Framework-Entwicklung: Frameworks wie Spring oder Hibernate nutzen Reflection, um zur Laufzeit Klassen zu analysieren und Instanzen dynamisch zu erzeugen oder Methoden aufzurufen.
//Plugin-Systeme: Dynamische Plugins können Methodenaufrufe basierend auf Konfigurationsdateien ausführen.
//Test-Frameworks: Test-Frameworks wie JUnit verwenden Reflection, um Testmethoden zu finden und dynamisch auszuführen.











//
//
////
//////1. Reflection und Generics:
//////
//////Bei Generics sind die generischen Typen zur Compile-Zeit bekannt, aber sie werden zur Laufzeit durch Typ-Parameter ersetzt, was als Type Erasure bekannt ist. Reflection kann in begrenztem Maße trotzdem Informationen zu generischen Typen auslesen.
////
////Parametrisierte Typen von Feldern und Methoden:
//
////hier wird erläutert, wie man den genauen Typ von Feldern und Methoden ermitteln kann, die generische Typen enthalten.
////Mit Hilfe von java.lang.reflect.ParameterizedType und java.lang.reflect.Type lassen sich die tatsächlichen Typen-Parameter von Feldern und Methoden herausfinden.
////
//
//
//import java.lang.reflect.*;
//import java.util.*;
//
//public class App {
//// hier wird die Klasse ExampleClass definiert, die ein generisches Feld (exampleField) und eine Methode (exampleMethod) enthält.
//
//    // Beispielklasse mit generischen Typen
//    public static class ExampleClass {
//        public Set<Long> exampleField = new HashSet<>(); // stellt sicher, dass nur Long-Objekte in diesem Set enthalten sein können. Set ist eine Schnittstelle (Interface) und HashSet ist eine konkrete Implementierung dieser Schnittstelle.
//        public Map<Integer, Double> exampleMethod(List<String> list) {
//            return null;
//        }//
//    }
//    // Map<Integer, Double> ist eine interface, die eine Zuordnung von Integer-Schlüsseln (Schlüsseldatentyp) zu Double-Werten (Wertdatentyp) definiert. Eine Map ermöglicht das Speichern von Schlüssel-Wert-Paaren. Der Rückgabetyp Map<Integer, Double> gibt an, dass die Methode eine Map zurückgibt, die Ganzzahlen mit Gleitkommazahlen verknüpft.
//
//    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {
//        // Reflection auf einem Feld mit generischem Typ
//        Field field = ExampleClass.class.getField("exampleField");
//        System.out.println("Field 'exampleField' Typ: " + field.getGenericType());
// // gibt java.util.Set<java.lang.Long> zurück, was bedeutet, dass das Feld exampleField ein Set von Long-Elementen ist.
//
//        // Reflection auf einer Methode mit generischen Typen
//        Method method = ExampleClass.class.getMethod("exampleMethod", List.class);
//        System.out.println("Methode 'exampleMethod' Rückgabewert: " + method.getGenericReturnType());
// // gibt java.util.Map<java.lang.Integer, java.lang.Double> zurück, was zeigt, dass die Methode exampleMethod eine Map zurückgibt, die Integer-Schlüssel mit Double-Werten verknüpft.
//    }
//}
//
//// hier wird gezeigt, wie die Typen von Feldern und Methoden mithilfe von Reflection ermittelt werden können.
//






////2. Generische Basisklassen und Interfaces
//
//// Generische Basisklassen verwenden Typ-Parameter, die in den abgeleiteten Klassen spezifiziert werden.
//
//
//import java.util.List;
//
//// Generische Basisklasse
//abstract class BaseClass<R, S> {
//    public abstract void process(R request, S response);
//}
//// Die Klasse BaseClass ist eine generische Klasse, was bedeutet, dass sie mit Platzhaltern für Typen (R und S) definiert ist. Diese Platzhaltertypen werden beim Erstellen einer abgeleiteten Klasse oder eines Objekts durch konkrete Datentypen ersetzt.
////R und S sind Typparameter, die später durch bestimmte Typen wie String, Integer, List, etc. ersetzt werden.
////Die Methode process akzeptiert zwei Parameter: request vom Typ R und response vom Typ S. Diese Typparameter müssen von jeder abgeleiteten Klasse implementiert werden.
////        abstract bedeutet, dass diese Methode keine Implementierung in der Basisklasse hat, sondern von einer Unterklasse überschrieben werden muss.
////        Zweck der generischen Basisklasse:
////        Diese abstrakte Klasse dient als Vorlage, die generisch bleibt, bis eine abgeleitete Klasse die Platzhaltertypen mit konkreten Datentypen füllt.
//
//// Generische abgeleitete Klasse
//class DerivedClass extends BaseClass<String, Integer> {
//    @Override
//    public void process(String request, Integer response) {
//        System.out.println("Verarbeitung mit String: " + request + " und Integer: " + response);
//    }
//}
//// Die Klasse DerivedClass erbt von BaseClass und gibt für die Typparameter R und S die konkreten Typen String und Integer an: Damit ist DerivedClass keine generische Klasse mehr, sondern eine konkrete Klasse mit der Signatur BaseClass<String, Integer>. Das bedeutet:
////R wird zu String und
////S wird zu Integer.
//
//public class App {
//    public static void main(String[] args) {
//        DerivedClass derived = new DerivedClass();
//        derived.process("Anfrage", 100);
//    }
//}
//// erstellt ein konkretes Objekt, das die Methode process für die Typen String und Integer definiert.
////Aufruf der process-Methode:
////Die process-Methode wird mit den konkreten Argumenten "Anfrage" und 100 aufgerufen:
//
//
////
//
//







//
////3. Iteration über generische Listen
//
//import java.util.List;
//import java.util.function.Consumer;
//
//public class App {
//
//    // Generische Methode zur Iteration
//    static <T> void iterate(List<? super T> list, Class<T> type, Consumer<? super T> consumer) {
//        for (Object element : list) {
//            if (type.isAssignableFrom(element.getClass())) {
//                consumer.accept((T) element);
//                // Wenn das Element den Typ T hat, wird es mit consumer.accept weiterverarbeitet.
//                //(T) element ist ein Cast (Typumwandlung), um das Object-Element in den Typ T zu konvertieren, bevor es an den Consumer übergeben wird.
//            }
//        }
//    }
//    // Die Methode iterate ist als generische Methode deklariert, die den Typparameter <T> verwendet.
//    //Die generische Deklaration <T> wird vor dem Rückgabewert void angegeben, was bedeutet, dass T in dieser Methode für einen bestimmten Typ steht, der zur Laufzeit festgelegt wird.
//    // List<? super T> list:
//    //Dies bedeutet, dass die Methode eine Liste (list) als Parameter akzeptiert, die Elemente vom Typ T oder von einem seiner Supertypen enthalten kann.
//    //? super T ist ein Lower-Bound Wildcard, der sich auf eine Liste bezieht, die Elemente vom Typ T oder Oberklassen von T speichern kann. Dadurch können wir sicherstellen, dass die Methode flexibel mit einer Liste arbeitet, die Object als Elementtyp hat, während sie nur Elemente vom Typ T weiterverarbeitet.
//    // Class<T> type:
//    //Dies ist eine Class-Referenz auf den Typ T. Mit Class<T> können Sie zur Laufzeit auf den Typ T zugreifen und Methoden wie isAssignableFrom verwenden, um den Typ der Elemente zu überprüfen.
//    // Der Typ Class<T> ermöglicht die Überprüfung, ob ein Element der Liste list tatsächlich vom Typ T ist.
//// Consumer<? super T> consumer:
////Ein Consumer ist eine funktionale Schnittstelle (Interface), die eine Methode accept(T t) definiert. Diese Methode akzeptiert ein Element t vom Typ T und führt eine Operation darauf aus.
////Hier bedeutet ? super T, dass der Consumer jedes Element akzeptiert, das vom Typ T oder von einem seiner Supertypen ist, was zusätzliche Flexibilität bietet.
//
//    public static void main(String[] args) {
//        List<Object> items = List.of("Wein", 123, "Bier", 45.6);
//        System.out.println("Nur Strings in der Liste:");
//        iterate(items, Integer.class, s -> System.out.println("Element: " + s));
//        // Die iterate-Methode wird aufgerufen mit:
//        //items als Liste, die durchlaufen werden soll.
//        //String.class als Typreferenz für T, was bedeutet, dass nur Elemente des Typs String verarbeitet werden.
//        //Ein Consumer<String> (s -> System.out.println("Element: " + s)), der jedes gefundene String-Element in der Liste ausgibt, wir können Integer.class verwenden um nur Integers aus zugeben.
//    }
//}








//
//
//
//////4. Utility-Klasse zur Ermittlung der tatsächlichen Typ-Parameter
////
//////        Diese Klasse bietet Methoden, um die tatsächlichen Typ-Parameter von generischen Interfaces zu ermitteln.
//////        Besonders hilfreich, wenn Lambdas verwendet werden, da der Typ durch die Lambda-Ausdrücke verloren gehen kann.
//
//
//
//import java.lang.reflect.ParameterizedType;
//import java.lang.reflect.Type;
//import java.util.ArrayList;
//import java.util.List;
//
//// Base generic class with a type parameter
//class BaseClass<T> {
//}
//// Der genaue Typ für T wird erst festgelegt, wenn eine konkrete Klasse davon abgeleitet wird oder ein Objekt von BaseClass erstellt wird.
//
//// Derived class that specifies the generic type parameter of the base class
//class DerivedClass extends BaseClass<String> {
//}
//// DerivedClass erbt von BaseClass und legt für den generischen Typ T den konkreten Typ String fest:
//public class App {
//
//    public static List<Class<?>> of(Object object){
//    // Die Methode of akzeptiert ein Object als Eingabeparameter: Dies ist das Objekt, dessen Basisklassentyp ermittelt werden soll (z.B. DerivedClass).{
//        List<Class<?>> types = new ArrayList<>();//erstellung einer Arraylist um die gefundenen Typen zu speichern
//        Type superClass = object.getClass().getGenericSuperclass();
//        // Die Methode verwendet object.getClass().getGenericSuperclass(), um den generischen Typ der direkten Basisklasse zu ermitteln, superClass ist ein Type-Objekt, das Informationen über den generischen Typ der Basisklasse (BaseClass<String>) enthält.
//        if (superClass instanceof ParameterizedType)
//        // Der Typ superClass wird daraufhin überprüft, ob es sich um ein ParameterizedType handelt: ParameterizedType ist eine spezielle Unterklasse von Type, die Informationen über die konkreten generischen Typen (String in BaseClass<String>) enthält.
//        {
//            ParameterizedType paramType = (ParameterizedType) superClass;
//            for (Type type : paramType.getActualTypeArguments())
//// Wenn superClass ein ParameterizedType ist, werden die konkreten Typparameter mit getActualTypeArguments() extrahiert: paramType.getActualTypeArguments() gibt ein Type-Array zurück, das die konkreten Typen für die Typparameter von BaseClass enthält, in unserem Fall String.
//            {
//                types.add((Class<?>) type);
//                // Jeder Typ wird in die types-Liste eingefügt, nachdem er in einen Class-Typ konvertiert wurde: type wird als Class<?> interpretiert, um die konkrete Klasse (String in diesem Fall) zur Laufzeit zu identifizieren.
//            }
//        }
//        return types;
//    }
//
//
//    public static void main(String[] args) {
//        DerivedClass instance = new DerivedClass();
//        System.out.println("Type parameters of the base class:");
//        for (Class<?> clazz : of(instance))
//        // Die of-Methode wird mit instance aufgerufen, um die generischen Typen der Basisklasse (BaseClass<String>) zu ermitteln.
////Die Rückgabewerte der of-Methode sind String als konkreter Typ der generischen Basisklasse.
//        {
//            System.out.println("Type: " + clazz.getName());
//        }
//    }
//}
////        Dies zeigt, dass der generische Typparameter T der Basisklasse BaseClass in der abgeleiteten Klasse DerivedClass durch den Typ String festgelegt wurde.
//

























//
//
//
////5. Traversierung eines GUI-Baumes
//
////  wie Generics und Reflection zur Laufzeit verwendet werden können, um durch eine hierarchische Struktur zu traversieren.
////Dies ist besonders hilfreich bei der Erstellung von UI-Frameworks
//
//import javax.swing.*;
//import java.awt.*;
//import java.util.List;
//import java.util.ArrayList;
//
//public class App {
//
//    public static List<Component> getAllComponents(Container container) {
//        // Der Parameter container ist ein Objekt vom Typ Container. Ein Container ist eine Oberklasse in Swing, die es ermöglicht, mehrere Component-Objekte wie Buttons, Panels und Labels zu enthalten.
//        Component[] components = container.getComponents();
////        container.getComponents() gibt ein Array aller direkt in container enthaltenen Komponenten zurück. Diese Komponenten können einfache GUI-Elemente (JButton, JLabel) oder wiederum Container (JPanel, JFrame) sein.
//        List<Component> componentList = new ArrayList<>();
////        Die Liste componentList wird verwendet, um die gefundenen Komponenten zu speichern. Jede gefundene Component wird dieser Liste hinzugefügt.
//        for (Component comp : components) {
//            componentList.add(comp);// iterieren wir über die components im components array, Jede Component wird unter der Referenz comp verarbeitet.
//            if (comp instanceof Container) {
//                componentList.addAll(getAllComponents((Container) comp));
//                // Wenn comp selbst ein Container ist, wird die Methode getAllComponents rekursiv aufgerufen, um alle verschachtelten Komponenten in comp zu durchlaufen.
//                //Dadurch wird die gesamte hierarchische Struktur des GUI-Baumes durchsucht.
//            }
//        }
//        return componentList;
//    }
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Test Frame");
//        JPanel panel = new JPanel();
//        panel.add(new JButton("Button 1"));
//        panel.add(new JLabel("Label 1"));
//        frame.add(panel);
//        frame.setSize(300, 200);
//        frame.setVisible(true);
//
//                System.out.println("Traversierung des GUI-Baumes:");
//                List<Component> components = getAllComponents(frame);
////        getAllComponents wird auf dem frame-Objekt aufgerufen, um alle enthaltenen Komponenten (einschließlich verschachtelter Komponenten) zu sammeln.
////        Die Methode durchsucht die gesamte hierarchische Struktur:
////        JFrame (enthält JPanel)
////        JPanel (enthält JButton und JLabel)
//                for (Component comp : components) {
//                    System.out.println(comp.getClass().getName());
//                }
//            }
//        }
////Diese Technik der rekursiven GUI-Traversierung kann für die Analyse und Manipulation von Swing-Anwendungen nützlich sein, z.B. um:
////
////Alle Komponenten eines bestimmten Typs zu finden (z. B. alle JButton in einer Anwendung).
////Layout- oder Stiländerungen auf eine gesamte GUI-Hierarchie anzuwenden.
////GUI-Komponenten für Tests zu durchsuchen oder zu verifizieren.
//










//
////6. Restful-Beispiel mit Generics
////
////        Hier wird gezeigt, wie Generics und Reflection zur Laufzeit verwendet werden können, um RESTful-APIs dynamisch zu verarbeiten.
////        Dabei kann zur Laufzeit der genaue Typ des Rückgabeobjekts bestimmt und verarbeitet werden.
//
//
//import java.lang.reflect.*;
//        import java.util.*;
//
//        public class App {
//
//            // Beispiel-Methode, die ein generisches Objekt zurückliefert
//            public static <T> T createResponse(Class<T> clazz) throws IllegalAccessException, InstantiationException
//            // Die Methode akzeptiert einen Parameter vom Typ Class<T>, der eine Class-Referenz auf den Typ T ist:, das ist eine Möglichkeit, zur Laufzeit auf den generischen Typ zuzugreifen. Der Class-Typ ermöglicht den Zugriff auf Metainformationen über Klassen, die zur Reflektion verwendet werden.
//            {
//                return clazz.newInstance();
//            }
//            // clazz.newInstance() verwendet den Class-Parameter clazz, um ein neues Objekt der Klasse T zu erstellen.
//
//
//            //Die Methode createResponse ist generisch und verwendet den Typparameter <T>.
//            //Wie gesagt, Die Syntax <T> vor dem Rückgabetyp T bedeutet, dass T ein Platzhalter für einen bestimmten Datentyp ist, der zur Kompilierungszeit festgelegt wird
//
//            public static void main(String[] args) throws Exception {
//                List<String> stringList = createResponse(ArrayList.class); // wenn wir unsere methode ausführen, createResponse(ArrayList.class) wird aufgerufen und ArrayList.class als Parameter übergeben. ArrayList.class ist die Class-Referenz auf die ArrayList-Klasse.
////                Der generische Typparameter T wird für diese Methode zur Kompilierungszeit durch den Typ ArrayList festgelegt.
////Die Rückgabe von createResponse ist ein neues Objekt vom Typ ArrayList, das als List<String> deklariert wird.
//                stringList.add("Eintrag 1");
//                stringList.add("Eintrag 2");
//
////Es werden zwei Zeichenfolgen ("Eintrag 1" und "Eintrag 2") zur stringList-Liste hinzugefügt.
////Da die Liste als List<String> deklariert ist, wird sichergestellt, dass nur String-Objekte hinzugefügt werden können.
//
//                System.out.println("Restful-Response:");
//                for (String item : stringList) {
//                    System.out.println("Item: " + item);
//                }
//            }
//        }
//

























////// Annotations:
////
////1. Objekt-Relationales Mapping (OR-Mapping):
////Annotationen werden hier vorgestellt, um das Problem der Abbildung von Java-Objekten auf relationale Datenbanken zu lösen. Es wird gezeigt, wie Klassen mit Annotationen versehen werden, um eine entsprechende Zuordnung zwischen Objekten und Datenbankstrukturen zu schaffen.
////
////@Entity: Markiert eine Klasse als persistent, also als eine Klasse, deren Objekte in einer Datenbank gespeichert werden können.
////@Table: Gibt den Tabellennamen an, in dem die Objekte gespeichert werden.
////@Id: Markiert die Property, die als Primärschlüssel verwendet wird.
////@Basic: Weist darauf hin, dass es sich um ein einfaches, persistierbares Attribut handelt.
////@Column: Definiert den Namen der Datenbankspalte, auf die das jeweilige Attribut gemappt wird.
//
//
//
//import javax.persistence.*;
//// Dieser Import ermöglicht den Zugriff auf Anmerkungen wie @Entity, @Table, @Id, @Column usw., die von der Java Persistence API (JPA) zur Verfügung gestellt werden.
//
//@Entity // Diese Annotation kennzeichnet die Klasse Book als eine Entität. Dies bedeutet, dass die Klasse in der Datenbank als Tabelle dargestellt wird. Jede Instanz der Klasse Book repräsentiert eine Zeile in der Tabelle.
//@Table(name = "BUCH")// Mit dieser Annotation wird der Name der zugeordneten Tabelle explizit angegeben. In diesem Fall wird die Tabelle in der Datenbank den Namen BUCH tragen. Fehlt diese Annotation, wird standardmäßig der Klassenname (Book) als Tabellenname verwendet.
//public class Book {
//    @Id  // Diese Annotation kennzeichnet das id-Attribut als Primärschlüssel der Tabelle. Ein Primärschlüssel ist ein eindeutiger Bezeichner für jede Zeile in einer Tabelle..
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//    // Diese Annotation gibt an, dass der Wert des Primärschlüssels automatisch generiert wird. In diesem Fall wird die Generierungsstrategie AUTO verwendet, bei der die Datenbank oder JPA-Provider selbst entscheidet, wie die ID generiert wird (z.B. durch eine Sequenz oder eine Identität).
//
//
//    @Column(name = "title")
//    private String title;
//    // // Diese Annotation gibt an, dass das Attribut title der Spalte title in der Datenbanktabelle zugeordnet wird. Wenn die Annotation weggelassen wird, wird der Standardwert (title) verwendet.
//
//    @Column(name = "author")
//    private String author;
//    // Ähnlich wie das Attribut title.
//
//    // Getter und Setter
//    // Die Getter- und Setter-Methoden werden verwendet, um auf die privaten Felder id, title und author zuzugreifen und diese zu ändern:
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//    // getId() / setId(Long id): Diese Methoden ermöglichen den Zugriff und die Modifikation des Primärschlüsselwerts.
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//    // um den Titel des Buches zu erhalten bzw. zu setzen.
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//    // Diese Methoden ermöglichen den Zugriff auf den Autor des Buches und die Modifikation des Werts.
//}
//
//
//// Zusammenfassung der Annotations im Überblick
////@Entity: Markiert die Klasse als Entität, die mit einer Tabelle in der Datenbank korrespondiert.
////@Table(name = "BUCH"): Gibt explizit den Tabellennamen an (optional).
////@Id: Definiert das Primärschlüssel-Feld.
////@GeneratedValue(strategy = GenerationType.AUTO): Automatische Generierung der ID.
////@Column(name = "title") und @Column(name = "author"): Definiert die Zuordnung von Attributen zu Spalten.
//










////
////2. Erstellung eigener Annotationen:
////wie man benutzerdefinierte Annotationen erstellt und mit Meta-Annotationen versieht:
////
////@Retention: Gibt an, wie lange die Annotation im Code verbleiben soll (z.B. RUNTIME für Laufzeitzugriff).
////@Target: Bestimmt, an welchen Stellen die Annotation eingesetzt werden kann (z.B. Methoden oder Felder).
//
//
//import java.lang.annotation.Retention;//  Spezifiziert, wie lange die Annotation verfügbar sein soll.
//import java.lang.annotation.RetentionPolicy;// Definiert die möglichen Speicherorte für Annotationen (SOURCE, CLASS, RUNTIME).
//import java.lang.annotation.Target;// Gibt an, wo die Annotation angewendet werden kann (z.B. auf Methoden, Feldern, Klassen).
//import java.lang.annotation.ElementType;//  Definiert die Zieltypen der Annotation (z.B. FIELD, METHOD).
//
//// Definition der Annotation
//@Retention(RetentionPolicy.RUNTIME)// Diese Meta-Annotation gibt an, dass die Annotation @Bar zur Laufzeit (RUNTIME) verfügbar bleibt. Das bedeutet, dass die Annotation während der Ausführung des Programms ausgelesen werden kann. Dies ist wichtig, wenn man mittels Reflexion zur Laufzeit auf die Annotation zugreifen möchte.
//@Target(ElementType.FIELD)// iese Meta-Annotation gibt an, dass @Bar nur auf Felder (FIELD) angewendet werden darf. Versucht man, @Bar an anderen Stellen (wie Methoden oder Klassen) zu verwenden, wird dies zu einem Fehler führen.
//public @interface Bar {// Definiert eine benutzerdefinierte Annotation namens @Bar. Annotationen in Java werden durch das Schlüsselwort @interface definiert.
//    int magic() default 42;  // Standardwert für das Attribut "magic", Dies definiert ein Attribut magic innerhalb der Annotation, Der Standardwert (default) beträgt 42. Das bedeutet, wenn der Anwender keinen expliziten Wert angibt, wird 42 verwendet.
//}
//
//// Anwendung der Annotation in einer Klasse
//public class MagicBox {
//    @Bar(magic = 77)
//    private String magicString;
//    // Hier wird die @Bar-Annotation auf das Feld magicString angewendet.
//    //Die magic-Attribut der Annotation wird auf 77 gesetzt. Das bedeutet, dass der Wert der Annotation magic für magicString explizit auf 77 geändert wird, anstatt den Standardwert 42 zu verwenden.
//
//    public static void main(String[] args) {
//        MagicBox box = new MagicBox();
//        System.out.println("Magische Nummer: " + box.getMagic());
//    }
//    //  erstellt eine Instanz von MagicBox und gibt die magische Nummer aus, die aus der @Bar-Annotation extrahiert wird.
//
//    // Zugriff auf die Annotation zur Laufzeit
//    public int getMagic() {
//        // this.getClass().getDeclaredField("magicString"): Diese Zeile ruft das Feld magicString der MagicBox-Klasse mithilfe von Reflexion ab. Das getDeclaredField-Methode sucht nach einem Feld mit dem Namen "magicString".
//        //.getAnnotation(Bar.class): Diese Methode wird verwendet, um die Annotation @Bar auf dem abgerufenen Feld zu holen. Wenn das Feld magicString mit der @Bar-Annotation versehen ist, gibt es ein Bar-Objekt zurück, das Informationen über die Annotation enthält.
//        //bar.magic(): Liest das magic-Attribut der Annotation @Bar aus und gibt dessen Wert zurück. In diesem Fall ist der Wert 77.
//        try {
//            Bar bar = this.getClass().getDeclaredField("magicString").getAnnotation(Bar.class);
//            return bar.magic();
//        } catch (NoSuchFieldException e) {
//            e.printStackTrace();
//        }
//        return -1;
//    }
//}
//// 5. Zusammenfassung
////@Bar ist eine benutzerdefinierte Annotation mit einem Attribut magic.
////@Retention(RetentionPolicy.RUNTIME) sorgt dafür, dass die Annotation zur Laufzeit verfügbar bleibt.
////@Target(ElementType.FIELD) gibt an, dass @Bar nur auf Feldern verwendet werden darf.
////Der Zugriff auf @Bar erfolgt über die getMagic()-Methode mittels Reflexion, um den magic-Wert zu extrahieren.














//
////3. Verwendung von Annotationen zur Dokumentation:
////Eine interessante Anwendung ist das Annotations-basierte Dokumentations-Tool wie @Doc und @MethodDoc,die verwendet werden,  um Methoden und Klassen zu beschreiben:
////
////@Doc: Dokumentiert Klassen mit einer Beschreibung.
////@MethodDoc: Dokumentiert Methoden mit Beschreibung, Rückgabewert und Parametern.
////@Parameter: Beschreibt Parameter von Methoden.
//
//
//import java.lang.annotation.*;
//
//@Retention(RetentionPolicy.RUNTIME)// Gibt an, dass diese Annotation zur Laufzeit verfügbar bleibt. Das bedeutet, dass die Annotation über Reflexion ausgelesen werden kann.
//@Target(ElementType.TYPE)// Gibt an, dass diese Annotation auf Klassen, Interfaces oder Enums angewendet werden kann (ElementType.TYPE).
//@interface Doc {// Definiert die benutzerdefinierte Annotation @Doc.
//    String value();
//}// Definiert ein Attribut value vom Typ String. Dies wird verwendet, um eine Beschreibung der Klasse bereitzustellen. Wenn die Annotation angewendet wird, wird value genutzt, um einen Textstring (Beschreibung der Klasse) anzugeben
//
//@Retention(RetentionPolicy.RUNTIME)// Auch hier bleibt die Annotation zur Laufzeit verfügbar.
//@Target(ElementType.METHOD)// Diese Annotation ist nur auf Methoden anwendbar (ElementType.METHOD).
//@interface MethodDoc {
//    String description();//Beschreibt, was die Methode macht.
//    String returnType();// Gibt den Rückgabetyp der Methode an (z.B. int, String).
//    String[] parameters() default {};// Ein Array von Strings, das die Parameter der Methode beschreibt. Es hat einen Standardwert (default {}), was bedeutet, dass es optional ist. Wenn es nicht angegeben wird, bleibt das Array leer.
//}
//
//// Beispielklasse mit Annotationen
//@Doc("A simple Math Service for demonstration purposes")
//public class MathService { // Die Klasse MathService wird mit @Doc versehen, was sie als dokumentierte Klasse markiert. Die Annotation enthält eine Beschreibung: „A simple Math Service for demonstration purposes“. Dies ist nützlich für Entwickler, die eine schnelle Beschreibung der Klasse erhalten möchten.
//
//    @MethodDoc(description = "Calculates the sum of two integers", returnType = "int", parameters = {"int x", "int y"})// ie Methode add wird mit @MethodDoc annotiert. Diese Annotation gibt folgende Informationen über die Methode an:
////    Beschreibung: „Calculates the sum of two integers“.
////    Rückgabewert: „int“ (die Methode gibt einen int zurück).
////    Parameter: „int x, int y“ (es werden zwei int-Parameter erwartet).
//    public int add(int x, int y) {
//        return x + y;
//    }
//
//    @MethodDoc(description = "Calculates the product of two integers", returnType = "int", parameters = {"int x", "int y"})
//    public int multiply(int x, int y) {
//        return x * y;
//    }
//}
//// 3. Mögliche Nutzungsszenarien
////Mit diesen Annotationen kann ein Tool zur Laufzeit oder ein automatisches Dokumentationswerkzeug die Beschreibungen und Parameter von Klassen und Methoden auslesen und z.B. eine automatisch generierte Dokumentation erzeugen. In einer größeren Anwendung könnte man z.B. mittels Reflexion eine Liste aller dokumentierten Klassen und Methoden erzeugen und diese als HTML-Dokumentation darstellen.
//










////4. Annotationen als wiederholbare Annotationen:
//
////Wiederholbare Annotationen sind nützlich, wenn Sie dieselbe Annotation mehrfach auf ein Element anwenden möchten:
//
//import java.lang.annotation.*;
//
//@Repeatable(Bars.class)
//@interface Bar {
//    int magic();
//}// Diese Annotation macht die @Bar-Annotation wiederholbar. Das bedeutet, dass @Bar mehrfach auf dasselbe Element angewendet werden kann. Der Parameter Bars.class gibt an, dass die Container-Annotation für @Bar die @Bars-Annotation ist. Jede wiederholbare Annotation benötigt eine Container-Annotation, um die mehrfachen Vorkommen zu bündeln.
//// @interface Bar: Definiert die benutzerdefinierte Annotation @Bar.
////int magic();: Ein Attribut magic vom Typ int. Da hier kein Standardwert (default) definiert ist, muss bei jeder Verwendung von @Bar ein Wert für magic angegeben werden.
//
//@Retention(RetentionPolicy.RUNTIME)// Die @Bars-Annotation bleibt zur Laufzeit verfügbar, damit sie durch Reflexion ausgelesen werden kann.
//@Target(ElementType.FIELD)//  Die @Bars-Annotation darf nur auf Felder angewendet werden
//@interface Bars {
//    Bar[] value();
//}// Definiert ein Array von Bar-Annotationen. Das bedeutet, @Bars dient als Container, der mehrere @Bar-Annotationen auf einem Element zusammenfasst. Die value()-Methode gibt das Array von @Bar-Annotationen zurück.
//
//// Anwendung wiederholbarer Annotationen
//public class MagicBox {
//    @Bar(magic = 42)
//    @Bar(magic = 77)
//    private String magicString;
//    // Hier wird @Bar zweimal auf das Feld magicString angewendet:
//    // da @Bar mit @Repeatable(Bars.class) als wiederholbar definiert ist, werden beide @Bar-Annotationen automatisch durch die Container-Annotation @Bars gebündelt
//
//
//    public static void main(String[] args) {
//        Bar[] bars = MagicBox.class.getDeclaredFields()[0]//
//        // Ruft alle deklarierten Felder der Klasse MagicBox ab.
//                //getDeclaredFields() gibt ein Array von Field-Objekten zurück.
//                //In diesem Fall gibt es nur ein Feld (magicString), das an der Position 0 im Array liegt
//         .getAnnotationsByType(Bar.class);
//        for (Bar bar : bars) {
//            // // Diese Methode durchsucht das Feld magicString nach allen @Bar-Annotationen.
//            ////    Da @Bar als wiederholbare Annotation definiert ist, gibt getAnnotationsByType(Bar.class) ein Array von Bar-Annotationen (Bar[]) zurück.
//            System.out.println("Magic: " + bar.magic());
//        }
//    }}
////    Ausgabe der magic-Werte:
////    Mit einer for-Schleife wird über das Array von Bar-Annotationen iteriert.
////    Für jede @Bar-Annotation wird der Wert des magic-Attributs ausgegeben:
//
//
//
//// @Repeatable: Macht eine Annotation wiederholbar. Hier wird @Bar als wiederholbare Annotation definiert, indem es mit @Repeatable(Bars.class) annotiert wird.
////Container-Annotation @Bars: Dient als Container für mehrere @Bar-Annotationen. Sie sammelt alle @Bar-Annotationen auf einem Element in einem Bar[]-Array.
//
//













//
////5. Vererbung von Annotationen:
////Annotationen werden standardmäßig nicht vererbt. Mithilfe von @Inherited kann jedoch festgelegt werden, dass eine Annotation auch in abgeleiteten Klassen verfügbar ist.
//
//
//import java.lang.annotation.*;
//
//@Inherited // Diese Meta-Annotation bestimmt, dass die Annotation @Bar1 auf abgeleitete Klassen vererbt wird. Das bedeutet, wenn eine Klasse mit @Bar1 annotiert ist, dann haben auch alle Unterklassen diese Annotation, ohne dass sie explizit erneut definiert werden muss.
//@Retention(RetentionPolicy.RUNTIME)// Diese Annotation bleibt zur Laufzeit verfügbar und kann durch Reflexion ausgelesen werden.
//@Target(ElementType.TYPE)// @Bar1 kann nur auf Typen angewendet werden, d.h. auf Klassen, Interfaces oder Enums.
//@interface Bar1 {}
//// Zusammengefasst: @Bar1 ist eine Annotation, die vererbt wird und auf Klassen (Typen) angewendet werden kann.
//
//
//@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.TYPE)
//@interface Bar2 {}
//// Ohne @Inherited: @Bar2 ist eine normale Annotation, die nicht vererbt wird. Das bedeutet, selbst wenn eine Superklasse mit @Bar2 annotiert ist, wird diese Annotation nicht automatisch auf die Unterklasse übertragen.
//
//@Bar1
//class ParentClass {}
//// Die Klasse ParentClass ist mit @Bar1 annotiert. Da @Bar1 mit @Inherited versehen ist, wird diese Annotation an alle Klassen vererbt, die von ParentClass erben.
//
//@Bar2
//class ChildClass extends ParentClass {}
//// ChildClass ist eine Unterklasse von ParentClass.
////Die Klasse ChildClass ist explizit mit @Bar2 annotiert.
////Da @Bar1 vererbt wird, sollte ChildClass auch automatisch die @Bar1-Annotation von ParentClass erben. @Bar2 hingegen wird nicht vererbt, da sie nicht mit @Inherited versehen ist.
//
//
//public class InheritanceExample {
//    public static void main(String[] args) {
//        System.out.println("ChildClass inherits Bar1: " +
//                ChildClass.class.isAnnotationPresent(Bar1.class));  // true
//        // isAnnotationPresent(Bar1.class)
//        //
//        //ChildClass.class.isAnnotationPresent(Bar1.class) prüft, ob ChildClass die Annotation @Bar1 besitzt.
//        System.out.println("ChildClass inherits Bar2: " +
//                ChildClass.class.isAnnotationPresent(Bar2.class));  // false
//        // da @Bar2 nicht vererbt wird, selbst wenn sie auf ParentClass angewendet wäre).
//    }
//}
//// In diesem Beispiel zeigt @Bar1 das Verhalten von @Inherited, während @Bar2 standardmäßig nicht vererbt wird.
//
//// Die @Inherited-Meta-Annotation ermöglicht die Vererbung von Annotationen an abgeleitete Klassen.
////Sie funktioniert nur für Klassenannotation (d.h. Annotationen, die auf ElementType.TYPE angewendet werden).
////@Inherited beeinflusst nur Klassenhierarchien und nicht andere Anwendungsbereiche wie Methoden oder Felder.
//
//

















////6. Reflections-basierter Zugriff:
////Der Zugriff auf Annotationen zur Laufzeit wird durch das Java Reflection API ermöglicht. Methoden wie getAnnotation, getAnnotations und getDeclaredAnnotations werden verwendet, um Annotations zu extrahieren. Beispiele:
////
////Prüfen, ob eine Klasse mit @Entity annotiert ist.
////Extrahieren der @Column-Annotation und Abrufen des name-Attributs.
//
//import java.lang.annotation.*;
//import java.lang.reflect.*;
//
//// Definition der Annotation
//@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.METHOD)// @Bar darf nur auf Methoden angewendet werden (ElementType.METHOD).
//@interface Bar {
//    String info();
//}// Definiert ein Attribut info vom Typ String. Das Attribut info ist obligatorisch (es hat keinen Standardwert default), weshalb man beim Anwenden der Annotation @Bar immer einen Wert für info angeben muss.
//
//// Anwendung der Annotation
//class AnnotatedClass {
//    @Bar(info = "This is a test method")
//    public void testMethod() {
//        System.out.println("Test method executed");
//    }
//}// Die @Bar-Annotation wird auf die Methode testMethod der Klasse AnnotatedClass angewendet.
//// Das info-Attribut der Annotation hat den Wert "This is a test method".
//
//
//public class ReflectionExample {
//    public static void main(String[] args) {
//        try {
//            Method method = AnnotatedClass.class.getMethod("testMethod");
//            // AnnotatedClass.class: Repräsentiert die Klasse AnnotatedClass.
//            // getMethod("testMethod"): Sucht in der Klasse AnnotatedClass nach einer Methode mit dem Namen "testMethod". Wenn die Methode gefunden wird, wird sie als Method-Objekt zurückgegeben.
//            if (method.isAnnotationPresent(Bar.class))
//            // method.isAnnotationPresent(Bar.class): Überprüft, ob die Methode method mit der @Bar-Annotation versehen ist.
//            //Rückgabewert: true, wenn die @Bar-Annotation auf der Methode vorhanden ist, sonst false.
//            {
//                Bar bar = method.getAnnotation(Bar.class);
//                // Diese Methode gibt die @Bar-Annotation der Methode method zurück, sofern sie vorhanden ist. Bar bar: Enthält das Bar-Annotation-Objekt, das die info-Informationen enthält.
//                System.out.println("Annotation info: " + bar.info());
//            }
//
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        }
//    }
//}
//// 5. Verwendung des Reflection API in Java
////Das Java Reflection API ist nützlich, wenn man zur Laufzeit auf Klassen, Methoden und Annotationen zugreifen muss, insbesondere in :
////
////Frameworks und Bibliotheken
////Automatische Dokumentation
////Unit-Testing:
//









//
//// 7. Ein Annotation-basiertes Dokumentations-Tool
//
//import java.lang.annotation.*;
//import java.lang.reflect.*;
//
//// Annotation zur Dokumentation
//@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.TYPE)
//@interface Doc {
//    String description();
//}
//
//@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.METHOD)
//@interface MethodDoc {// Die Annotation @MethodDoc beschreibt eine Methode, die zwei Ganzzahlen addiert.
//
//
//    String description();// um eine Beschreibung der annotierten Klasse oder des Interfaces bereitzustellen.
//}
//
//// Dokumentiertes Interface
//@Doc(description = "A simple calculator service")// Diese Annotation beschreibt das Interface CalculatorService als „A simple calculator service“. Sie wird auf dem Interface selbst angewendet.
//interface CalculatorService {
//    @MethodDoc(description = "Adds two integers")// Diese Annotation wird auf die Methode add angewendet und gibt an, dass die Methode zwei Ganzzahlen addiert.
//    int add(int x, int y);
//
//    @MethodDoc(description = "Subtracts two integers")// Diese Annotation wird auf die Methode subtract angewendet und beschreibt die Methode als eine, die zwei Ganzzahlen subtrahiert.
//    int subtract(int x, int y);
//}
//
//// Tool zur Dokumentation
//public class DocTool {
//    public static void main(String[] args) {
//        printDocumentation(CalculatorService.class);
//    }
//    // Die main-Methode ruft die Methode printDocumentation auf, um die Dokumentation des CalculatorService-Interfaces auszugeben.
//
//    static void printDocumentation(Class<?> clazz) // Diese Methode erhält eine Class<?>-Referenz (CalculatorService.class) und gibt die Dokumentationsinformationen der Klasse und ihrer Methoden aus.
//
//
//    {
//        if (clazz.isAnnotationPresent(Doc.class))
//        // Überprüft, ob die übergebene Klasse (hier CalculatorService) mit @Doc annotiert ist.
//        {
//            Doc doc = clazz.getAnnotation(Doc.class);
//            System.out.println("Class: " + clazz.getSimpleName());
//            System.out.println("Description: " + doc.description());
//        }// Wenn die Annotation vorhanden ist, wird sie mittels getAnnotation(Doc.class) abgerufen und die Beschreibung (doc.description()) ausgegeben.
//
//        for (Method method : clazz.getDeclaredMethods()) {
//            if (method.isAnnotationPresent(MethodDoc.class)) {
//                MethodDoc methodDoc = method.getAnnotation(MethodDoc.class);
//                System.out.println("Method: " + method.getName());
//                System.out.println("Description: " + methodDoc.description());
//            }
//            // clazz.getDeclaredMethods(): Gibt ein Array aller in der Klasse deklarierten Methoden zurück.
////            Die Schleife iteriert über alle Methoden der Klasse und prüft, ob eine Methode mit @MethodDoc annotiert ist.
////                    Wenn die Annotation vorhanden ist, wird sie abgerufen und die Beschreibung (methodDoc.description()) ausgegeben.
//        }
//    }
//}
//
//
//
//














//
//// Serialisierung :
//
////Serialisierung von Objektwolken (Object Graphs):
////Beim Serialisieren werden nicht nur die Instanzvariablen eines Objekts gespeichert, sondern auch alle Referenzen, die in diesen Variablen enthalten sind.
////Dies wird als Serialisierung von Objektwolken bezeichnet, weil eine vernetzte Struktur aus verschiedenen Objekten entsteht, die als Ganzes gespeichert wird.
////Probleme können auftreten, wenn zyklische Referenzen vorhanden sind. Der Standard-Mechanismus von Java berücksichtigt dies, um Endlosschleifen beim Serialisieren zu verhindern.
////
//
//import java.io.*;
//
//// Klasse, die serialisiert werden soll, muss Serializable implementieren
//class Person implements Serializable { // Diese Klasse repräsentiert ein Objekt, das serialisiert werden soll.
////    Sie implementiert das Serializable Interface, was bedeutet, dass Objekte dieser Klasse serialisiert und deserialisiert werden können.
//    private static final long serialVersionUID = 1L; // Diese Konstante ist eine eindeutige ID für die Version der Klasse. Sie wird verwendet, um sicherzustellen, dass eine deserialisierte Klasse mit der serialisierten Version übereinstimmt.
//
//    String name;
//    int age;
//// Die Klasse Person hat zwei Instanzvariablen: name (String) und age (int).
//    Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }// Der Konstruktor initialisiert die beiden Variablen mit den angegebenen Werten.
//
//    @Override
//    public String toString() {
//        return "Person{name='" + name + "', age=" + age + "}";
//    }
//}// Diese Methode gibt eine benutzerfreundliche Darstellung des Person Objekts zurück. Sie wird verwendet, um das Objekt einfach als Zeichenkette darzustellen, wenn es ausgegeben wird.
//
//public class App {
//    public static void main(String[] args) {
//        Person person = new Person("John", 25);
//// Ein neues Person-Objekt mit dem Namen John und dem Alter 25 wird erstellt und in der Variablen person gespeichert.
//
//        // Serialisierung in eine Datei
//        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"))) {// um das Objekt in eine Datei zu schreiben.
//            out.writeObject(person);
//            // Das Person-Objekt wird serialisiert (in eine Byte-Darstellung umgewandelt) und in die Datei person.ser geschrieben.
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//// Dieser Block verwendet try-with-resources, um automatisch alle Ressourcen (wie Dateien oder Streams) zu schließen, nachdem sie verwendet wurden.
//
//        // Deserialisierung aus der Datei
//        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"))) {// um das serialisierte Objekt aus einer Datei zu lesen.
//
//            Person deserializedPerson = (Person) in.readObject();
//            // Das readObject() liest das Objekt aus der Datei person.ser und wandelt es zurück in ein Person-Objekt.
//            //Da readObject() ein Object zurückgibt, muss das Ergebnis in ein Person-Objekt gecastet werden: (Person) in.readObject().
//            System.out.println("Deserialized: " + deserializedPerson);
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//}
//







//
//
////2. Vererbung in der Serialisierung:
////Wenn eine Klasse serialisiert werden kann, bedeutet das nicht automatisch, dass alle ihre Unterklassen ebenfalls serialisierbar sind.
////Es müssen alle relevanten Klassen, die Attribute enthalten, ebenfalls das Serializable-Interface implementieren.
////Bei Vererbung wird auch der Konstruktor der Superklasse aufgerufen, was beim Deserialisieren berücksichtigt werden muss, insbesondere wenn Felder als transient oder static deklariert sind.
//
//import java.io.*;
//
//// Oberklasse, die serialisiert werden soll
//class Animal implements Serializable {
//    private static final long serialVersionUID = 1L;
//    String species;
//    int age;
//
//    // Klasse Animal ist eine Oberklasse, die das Serializable Interface implementiert, um serialisierbar zu sein.
//    //serialVersionUID: Eine eindeutige Kennung für die Version dieser Klasse. Sie hilft dabei sicherzustellen, dass die serialisierte und deserialisierte Klasse dieselbe Version haben.species (Art) und age (Alter) sind Instanzvariablen der Klasse Animal.
//
//    public Animal(String species, int age) {
//        this.species = species;
//        this.age = age;
//    }// Initialisiert die beiden Variablen species und age mit den übergebenen Werten.
//
//    @Override
//    public String toString() {
//        return "Animal{species='" + species + "', age=" + age + "}";
//    }// Gibt eine String-Darstellung des Animal-Objekts zurück, z.B. "Animal{species='Rabbit', age=5}".
//}
//
//// Unterklasse, die erbt und ebenfalls serialisiert wird
//class Dog extends Animal {// Die Klasse Dog erbt von der Klasse Animal und ist ebenfalls Serializable.
//
//    private static final long serialVersionUID = 1L;//  eindeutige Kennung für die Dog-Klasse,
//    String breed;// breed (Rasse) ist eine Instanzvariable, die nur in der Dog-Klasse definiert ist.
//
//    public Dog(String species, int age, String breed) {
//        super(species, age); // Aufruf des Konstruktors der Oberklasse
//        this.breed = breed;
//    }// Ruft den Konstruktor der Oberklasse (super) auf, um die species und age-Variablen zu initialisieren.
////    Initialisiert das zusätzliche breed-Attribut.
//
//    // Custom writeObject-Methode
//    private void writeObject(ObjectOutputStream out) throws IOException {// Diese Methode passt den Standard-Serialisierungsprozess für die Dog-Klasse an.
//
//        out.defaultWriteObject(); // Standard-Serialisierung für Dog-Klasse, und zwar sie Führt die Standard-Serialisierung der Dog-Klasse durch, d.h., das breed-Feld wird serialisiert.
//        out.writeObject(species); // Speichert das `species`-Feld der Oberklasse manuell
//        out.writeInt(age);        // Speichert das `age`-Feld der Oberklasse manuell
//    }// Da diese Felder zur Oberklasse gehören, speichert die Methode sie explizit.
//
//
//    // Custom readObject-Methode
//    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {// Diese Methode passt den Deserialisierungsprozess für die Dog-Klasse an.
//
//        in.defaultReadObject(); // Standard-Deserialisierung für Dog-Klasse , sie Führt die Standard-Deserialisierung für die Dog-Klasse durch (d.h. liest das breed-Feld).
//        species = (String) in.readObject(); // Liest das `species`-Feld der Oberklasse manuell
//        age = in.readInt();                 // Liest das `age`-Feld der Oberklasse manuell
//    }// Da diese Felder auch manuell gespeichert wurden, müssen sie auch manuell wiederhergestellt werden.
//
//    @Override
//    public String toString() {
//        return "Dog{species='" + species + "', age=" + age + ", breed='" + breed + "'}";
//    }// Gibt eine String-Darstellung des Dog-Objekts zurück
//}
//
//public class App {
//    public static void main(String[] args) {
//        Dog dog = new Dog("Canine", 5, "Golden Retriever");
//        // Ein Dog-Objekt mit den Eigenschaften "Canine", 5 und "Golden Retriever" wird erstellt und in der Variablen dog gespeichert.
//
//        // Serialisierung des Dog-Objekts in eine Datei
//        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("dog.ser"))) { // Ein ObjectOutputStream wird erstellt, um das Dog-Objekt in eine Datei namens dog.ser zu schreiben.
//            out.writeObject(dog);
//            // Das Dog-Objekt wird serialisiert und in die Datei dog.ser geschrieben.
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // Deserialisierung des Dog-Objekts aus der Datei
//        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("dog.ser"))) {
//            Dog deserializedDog = (Dog) in.readObject();
//            // Das Dog-Objekt wird aus der Datei gelesen und zurück in ein Dog-Objekt umgewandelt.
//            System.out.println("Deserialized: " + deserializedDog);
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//// Bei der Serialisierung in einer Vererbungshierarchie müssen alle Klassen (Ober- und Unterklassen) Serializable implementieren.










//
////        3. Statische und transiente Attribute:
////Statische (static) und transiente (transient) Attribute werden nicht serialisiert.
////transient-Attribute müssen nach der Deserialisierung manuell wieder initialisiert werden.
////static-Attribute gehören zur Klasse selbst und werden nicht Teil der serialisierten Daten.
//
//
// import java.io.*;
//
//class User implements Serializable {
//    private static final long serialVersionUID = 1L;
//    String username;//  Ein reguläres String-Attribut, das serialisiert wird.
////    transient String password; bedeutet, dass das Attribut nicht serialisiert wird. Das password-Feld wird also nicht in die Datei geschrieben.
//    static String role = "User"; // static bedeutet, dass dieses Attribut zur Klasse selbst gehört und nicht zur Instanz (User-Objekt). Statische Felder werden nicht serialisiert, da sie keinen Teil des Objektzustands darstellen.
//
//    User(String username, String password) {
//        this.username = username;
//        this.password = password;
//        // Initialisiert die username- und password-Felder mit den übergebenen Werten.
//    }
//
//    @Override
//    public String toString() {
//        return "User{username='" + username + "', password='" + password + "', role='" + role + "'}";
//    }
//}// password und role werden ebenfalls ausgegeben , um die Unterschiede vor und nach der Serialisierung zu sehen.
//
//public class App {
//    public static void main(String[] args) {
//        User user = new User("john_doe", "secret123");// Zu diesem Zeitpunkt ist User.role = "User", weil es die Standardzuweisung in der Klasse ist.
//
//
//        // Serialisierung
//        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user.ser"))) {
//            out.writeObject(user);
//            // Das User-Objekt wird serialisiert und in die Datei user.ser geschrieben.
//            //Da das password-Attribut transient ist, wird es nicht gespeichert.
//            //Das role-Attribut wird ebenfalls nicht gespeichert, da es static ist.
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // Statische Variable ändern
//        User.role = "Admin";
//// Da role ein static-Attribut ist, gehört es zur Klasse selbst, nicht zur Instanz. Diese Änderung wirkt sich auf alle User-Objekte aus, unabhängig davon, ob sie serialisiert sind oder nicht.
//        // Deserialisierung
//        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("user.ser"))) {
//            User deserializedUser = (User) in.readObject();
//            System.out.println("Deserialized: " + deserializedUser);
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//}
//// transient-Attribute:
////Diese Felder werden nicht serialisiert.
////Nach der Deserialisierung sind sie null (für Objekte) oder haben den Standardwert (0 für primitive Datentypen).
////static-Attribute:
////Diese Felder gehören zur Klasse, nicht zum Objekt.
////Sie werden nicht serialisiert und haben den Wert, der zur Laufzeit aktuell ist.
////Auswirkung auf die Deserialisierung:
////Das transient-Attribut password ist nach der Deserialisierung null.
////Das static-Attribut role hat den zuletzt gesetzten Wert "Admin" und nicht den ursprünglichen Wert "User".
//








//
////        4. writeObject() und readObject() Methoden:
////Diese Methoden bieten die Möglichkeit, die Serialisierung und Deserialisierung individuell anzupassen.
////writeObject(ObjectOutputStream out):
////Diese Methode wird vom Standard-Serialisierungsmechanismus aufgerufen, um die Daten des Objekts zu speichern.
////Sie ermöglicht es, zusätzliche Schritte durchzuführen oder Daten in einem bestimmten Format zu speichern.
////readObject(ObjectInputStream in):
////Diese Methode wird verwendet, um das Objekt aus den gespeicherten Daten wiederherzustellen.
////Hier kann man ebenfalls zusätzliche Operationen durchführen, wie z.B. die Initialisierung von transienten Attributen.
//
//
//import java.io.*;
//
//class Account implements Serializable {
//    private static final long serialVersionUID = 1L;
//    String username;
//    transient String password; // password soll nicht direkt serialisiert werden
//
//    Account(String username, String password) {
//        this.username = username;
//        this.password = password;
//    }
//
//    // Custom writeObject-Methode
//    private void writeObject(ObjectOutputStream out) throws IOException {// Diese Methode überschreibt den Standard-Serialisierungsmechanismus, um zusätzliche Schritte während der Serialisierung durchzuführen.
//        out.defaultWriteObject();
//        // Ruft die Standard-Serialisierung für alle non-transient und non-static Felder auf. Dies bedeutet, dass das username-Feld normal serialisiert wird.
//        out.writeObject(password != null ? password : ""); // Password verschlüsselt speichern
//    }// Diese Anweisung serialisiert das password-Feld manuell.
////    Obwohl das password-Feld transient ist und normalerweise nicht serialisiert würde, speichert diese Anweisung das Passwort manuell in die Datei.
//
//
//    // Custom readObject-Methode
//    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {// Diese Methode passt den Deserialisierungsmechanismus an, um zusätzliche Schritte nach dem Lesen der Daten durchzuführen.
//        in.defaultReadObject();
//        // Führt die Standard-Deserialisierung für alle non-transient Felder durch (in diesem Fall nur username).
//        password = (String) in.readObject(); // Passwort zurücklesen
//    }// Liest das password-Feld manuell aus dem Stream, das in writeObject() gespeichert wurde.
////    Damit wird das zuvor gespeicherte Passwort wiederhergestellt.
//
//
//    @Override
//    public String toString() {
//        return "Account{username='" + username + "', password='" + password + "'}";
//    }
//}
//
//public class App {
//    public static void main(String[] args) {
//        Account account = new Account("john_doe", "mypassword");
//
//        // Serialisierung
//        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("account.ser"))) {
//            out.writeObject(account);
//            // // Das Account-Objekt wird serialisiert und in die Datei account.ser geschrieben.
//            //Die benutzerdefinierte writeObject()-Methode wird aufgerufen.
//            //Da das password-Feld transient ist, wird es durch die benutzerdefinierte Logik in writeObject() gespeichert.
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // Deserialisierung
//        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("account.ser"))) {
//            Account deserializedAccount = (Account) in.readObject();
//            // Das Account-Objekt wird aus der Datei gelesen und in ein Account-Objekt umgewandelt (deserialisiert).
//            //Die benutzerdefinierte readObject()-Methode wird aufgerufen.
//            //Das password-Feld wird explizit wiederhergestellt.
//            System.out.println("Deserialized: " + deserializedAccount);
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//// Die Methoden writeObject(ObjectOutputStream out) und readObject(ObjectInputStream in) bieten die Möglichkeit, die Standard-Serialisierung anzupassen.
//// Man kann zusätzliche Felder manuell speichern und wiederherstellen (z.B. password).
//










//
////5. readResolve() Methode:
////Wird nach der Deserialisierung aufgerufen, um ein Objekt zu ersetzen.
////        Beispiel: Bei Singleton-Klassen kann man sicherstellen, dass nach der Deserialisierung immer nur eine Instanz existiert.
////readResolve() gibt das finale Objekt zurück, das als Resultat der Deserialisierung verwendet werden soll.
//
//import java.io.*;
//
//class Singleton implements Serializable {
//    private static final long serialVersionUID = 1L;
//    private static final Singleton instance = new Singleton();// ist die einzige Instanz der Klasse Singleton. Die Klasse hat eine statische Instanz, die während der Klasseninitialisierung erstellt wird. Das Attribut ist private, sodass keine anderen Klassen darauf zugreifen können. und Es ist final, um sicherzustellen, dass es nach seiner Initialisierung nicht mehr geändert werden kann.
//
//    private Singleton() {
//    }
//    // // Der Konstruktor ist private, damit keine neuen Instanzen dieser Klasse außerhalb der Klasse selbst erstellt werden können.
//    ////    Dadurch wird sichergestellt, dass die einzige Möglichkeit, eine Instanz zu erhalten, die Verwendung der getInstance()-Methode ist.
//
//    public static Singleton getInstance() {
//        return instance;
//    }// Diese Methode gibt die einzige Instanz (instance) der Singleton-Klasse zurück.
////    Sie ist public, um externen Klassen Zugriff auf die Singleton-Instanz zu gewähren.
//
//    // Diese Methode wird nach der Deserialisierung aufgerufen
//    private Object readResolve() {
//        return instance; //
//    }
//    // Diese Methode wird nach der Deserialisierung des Objekts aufgerufen.
//    //Zweck: Das readResolve()-Muster verhindert, dass durch die Deserialisierung eine neue Instanz der Singleton-Klasse erstellt wird.Stellt sicher, dass nur eine Instanz zurückgegeben wird
//
//    @Override
//    public String toString() {
//        return "Singleton instance";
//    }// Gibt eine Darstellung der Singleton instanz zurück.
//}
//
//public class App {
//    public static void main(String[] args) {
//        Singleton singleton = Singleton.getInstance();
//// Das singleton-Objekt wird durch die getInstance()-Methode erstellt.
//
//        // Serialisierung
//        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"))) {
//            out.writeObject(singleton);
//            // Das singleton-Objekt wird serialisiert und in die Datei singleton.ser geschrieben.
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // Deserialisierung
//        Singleton deserializedSingleton = null;
//        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"))) {
//            deserializedSingleton = (Singleton) in.readObject();
//            // Während der Deserialisierung wird die readResolve() Methode aufgerufen, um sicherzustellen, dass nur die existierende Instanz (instance) zurückgegeben wird.
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        // Überprüfe, ob die Instanz die gleiche ist
//        System.out.println("Sind beide Instanzen gleich? " + (singleton == deserializedSingleton));
//    }// Diese Anweisung überprüft, ob das singleton-Objekt und das deserializedSingleton-Objekt die gleiche Instanz sind.
//}
//
//// Das Singleton-Muster stellt sicher, dass es nur eine Instanz einer Klasse gibt.
////Bei der Serialisierung kann jedoch eine neue Instanz erstellt werden, wenn readResolve() nicht verwendet wird.
//// Ohne readResolve() würde jede Deserialisierung eine neue Instanz erstellen.
//// Mit readResolve() zeigt deserializedSingleton auf die gleiche Instanz wie singleton.
//









//
////        6. writeReplace() Methode:
////Diese Methode wird vor der Serialisierung aufgerufen und ermöglicht es, das zu serialisierende Objekt durch ein anderes Objekt zu ersetzen.
////        Beispiel: Man kann anstelle des aktuellen Objekts eine modifizierte Version oder einen Platzhalter serialisieren.
//
//
//import java.io.*;
//
//class Original implements Serializable {
//    private static final long serialVersionUID = 1L;
//    String data;
//
//    Original(String data) {
//        this.data = data;
//    }// Das Attribut data speichert sensible Informationen.
////    Dieses Attribut wird im Konstruktor mit den übergebenen Werten initialisiert.
//
//    // Ersetzt das Original-Objekt durch einen anderen Datentyp während der Serialisierung
//    private Object writeReplace() {// Diese Methode wird vor der Serialisierung des Objekts aufgerufen.
////Der Rückgabewert dieser Methode bestimmt das Objekt, das anstelle des aktuellen Objekts (Original) serialisiert wird.
//        return new Replacement(data);
//    }
//}
//
//class Replacement implements Serializable {// Diese Klasse dient als Ersatzklasse für Original während der Serialisierung.
//
//    private static final long serialVersionUID = 1L;
//    String replacedData;
//// replacedData speichert die Daten, die vom Original-Objekt übertragen wurden.
//
//    Replacement(String replacedData) {
//        this.replacedData = replacedData;
//    }// Dieser Konstruktor initialisiert replacedData mit den Werten aus dem Original-Objekt.
//
//    @Override
//    public String toString() {
//        return "Replacement{replacedData='" + replacedData + "'}";
//    }
//}
//
//public class App {
//    public static void main(String[] args) {
//        Original original = new Original("Sensitive Data");
//// Dieses Objekt enthält die sensitiven Informationen, die wir später durch die Replacement-Klasse ersetzen wollen.
//
//        // Serialisierung
//        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("original.ser"))) {
//            out.writeObject(original);
//            // or der Serialisierung wird die Methode writeReplace() aufgerufen, die das Original-Objekt durch ein Replacement-Objekt ersetzt.
//            //Daher wird anstelle des Original-Objekts das Replacement-Objekt in die Datei geschrieben.
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // Deserialisierung
//        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("original.ser"))) {
//            Object deserialized = in.readObject();
//            // Da in der writeReplace()-Methode ein Replacement-Objekt zurückgegeben wurde, ist das deserialisierte Objekt vom Typ Replacement.
//            System.out.println("Deserialized: " + deserialized);
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//}
//// writeReplace() Methode wird vor der Serialisierung aufgerufen und kann verwendet werden, um das Objekt durch ein anderes Objekt zu ersetzen.








//Klasseninformationen, Feldnamen und Methoden werden während der Serialisierung gespeichert, um sicherzustellen, dass die Struktur des Objekts beim Deserialisieren erhalten bleibt.
//Dies schließt Konstruktoren und Felder ein, die möglicherweise private oder geschützte Sichtbarkeit besitzen.
//Serialisierung von Objekten mit privaten Feldern erfordert, dass die Klasse weiterhin zugänglich ist und die Sicherheitsmanager-Richtlinien dies erlauben.








//
//Aufgabenstellung:
//
//Implementiere eine Klasse Department, die aus den folgenden Attributen besteht:
//departmentName (String)
//manager (Employee-Objekt)
//employees (Liste von Employee-Objekten)
//Die Employee-Klasse hat die folgenden Eigenschaften:
//name (String)
//employeeId (int)
//salary (double)
//password (transient String)
//address (Address-Objekt)
//Die Address-Klasse enthält:
//street (String)
//city (String)
//country (String)
//Die Klasse Department sollte eine benutzerdefinierte Serialisierung (writeObject und readObject) implementieren, um sicherzustellen, dass:
//Die Liste der Mitarbeiter in der richtigen Reihenfolge bleibt.
//Passwörter der Mitarbeiter nicht gespeichert werden.
//Implementiere writeReplace und readResolve, um nach der Deserialisierung den Status der Objekte zu überprüfen und ggf. Anpassungen vorzunehmen.
//Sonderanforderung:
//Implementiere die Klasse Department zusätzlich mit dem Interface Externalizable und schreibe eine eigene writeExternal- und readExternal-Methode, um zu zeigen, wie man diese statt der Standard-Serialisierung nutzt.
//Schreibe ein Hauptprogramm, das:
//Ein Department-Objekt erstellt.
//Das Department-Objekt serialisiert.
//Das Department-Objekt wieder deserialisiert.
//        Überprüft, ob die Liste der Employee-Objekte korrekt wiederhergestellt wurde und keine Passwörter enthält.
//
//

//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
//class Address implements Serializable {
//    private static final long serialVersionUID = 1L;
//    String street;
//    String city;
//    String country;
//
//    public Address(String street, String city, String country) {
//        this.street = street;
//        this.city = city;
//        this.country = country;
//    }
//
//    @Override
//    public String toString() {
//        return street + ", " + city + ", " + country;
//    }
//}
//
//class Employee implements Serializable {
//    private static final long serialVersionUID = 1L;
//    String name;
//    int employeeId;
//    double salary;
//    transient String password;  // Password should not be serialized
//    Address address;
//
//    public Employee(String name, int employeeId, double salary, String password, Address address) {
//        this.name = name;
//        this.employeeId = employeeId;
//        this.salary = salary;
//        this.password = password;
//        this.address = address;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{name='" + name + "', employeeId=" + employeeId + ", salary=" + salary + ", address=" + address + ", password='" + password + "'}";
//    }
//}
//
//class Department implements Externalizable {
//    private static final long serialVersionUID = 1L;
//    String departmentName;
//    Employee manager;
//    List<Employee> employees;
//
//    // Required for Externalizable
//    public Department() {}
//
//    public Department(String departmentName, Employee manager) {
//        this.departmentName = departmentName;
//        this.manager = manager;
//        this.employees = new ArrayList<>();
//    }
//
//    public void addEmployee(Employee emp) {
//        employees.add(emp);
//    }
//
//    @Override
//    public void writeExternal(ObjectOutput out) throws IOException {
//        out.writeObject(departmentName);
//        out.writeObject(manager);
//        out.writeInt(employees.size());
//        for (Employee e : employees) {
//            out.writeObject(e);
//        }
//    }
//
//    @Override
//    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
//        departmentName = (String) in.readObject();
//        manager = (Employee) in.readObject();
//        int employeeCount = in.readInt();
//        employees = new ArrayList<>();
//        for (int i = 0; i < employeeCount; i++) {
//            employees.add((Employee) in.readObject());
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "Department{name='" + departmentName + "', manager=" + manager + ", employees=" + employees + "}";
//    }
//}
//
//public class App {
//    public static void main(String[] args) {
//        // Create Address Objects
//        Address address1 = new Address("Main Street", "New York", "USA");
//        Address address2 = new Address("High Street", "San Francisco", "USA");
//
//        // Create Employee Objects
//        Employee manager = new Employee("John Doe", 1001, 80000, "managerPass", address1);
//        Employee employee1 = new Employee("Jane Smith", 1002, 50000, "emp1Pass", address2);
//        Employee employee2 = new Employee("Bob Johnson", 1003, 55000, "emp2Pass", address1);
//
//        // Create Department and add Employees
//        Department department = new Department("IT", manager);
//        department.addEmployee(employee1);
//        department.addEmployee(employee2);
//
//        // Serialize Department Object
//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("department.ser"))) {
//            oos.writeObject(department);
//            System.out.println("Serialisiert: " + department);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // Deserialize Department Object
//        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("department.ser"))) {
//            Department deserializedDepartment = (Department) ois.readObject();
//            System.out.println("Deserialisiert: " + deserializedDepartment);
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//}

























//
//// Java Garbage Collection:
//// wie es gesagt wurde, Java ist eine sogenannte Garbage-Collected-Sprache, das bedeutet dass es viele Aspekte der Speicherverwaltung gibt, die java einfach für uns erledigt, ohne dass wir uns darum kümmern müssen. und zwar Garbage aus dem Speicher zu löschen, die das programm nicht mehr benötigt. und ohne dieses Mechanismus wird unser programm immer mehr objekte akkumulieren. und im laufe der Zeit der Speicher geht aus. und das programm wird zusammenbrechen. aber wie findet Java heraus, welche objekte im speicher unser programm nicht mehr benötigt !
//
//public class App {
//
//    public static void main(String[] args) {
//        doCatStuff();
//        System.out.println("I'm done doing cat stuff");
//    }
//
//    public static void doCatStuff() {
//        Cat myCat = new Cat();
//        myCat.meow();
//    }
//}
//// in diese methode von do doCatStuff, nachdem wir unser methode im main aufrufen, wird der myCat welche im speicherplatz schon referenziert wurde und einen platz belegt, nicht mehr benötigt, und jzt nachdem wir die methode schon aufgerufen haben, wird diese myCat objekt nicht mehr referenziert, und es wird vom javas Garbage collector gesucht wird, ebenfalls alle objekte die für unser programm keinen zweck mehr erfüllen.
//
//
//
//// wie funktioniert aber garbage collector :
//// lass uns sagen wir haben einen speicherplatz jzt, der katzen objekte im speicher erstellt, Noten von Studenten berechnet und kosten von big mac in Frankfurt, alle diese neu erstellte objekte gehen in den sogenannten young-generation-heap, das enthält alle objekte die neu erstellt wurden. und dann irgendwann wird dieses heap mit objekte belegt, an diesem punkt, führt java einen sogenannten Mark-and-sweep prozess, die alle objekte die nicht mehr referenziert wurden entfernt. wodurch mehr speicherplatz für die zufünftige Erstellung zusätzlicher objekte frei wird.
//// auch die elemente die noch referenziert sind, aber für eine langezeit da sind, werden zum sogenannten old-generation-heap verschiebt.
//// und das ist der Grund warum es empfehlt wurde, dass wir variablen im kleinsten Umfang zu erstellen, in dem sie benötigt werden, denn sobald wir sie nicht mehr benötigen, kann sie vom garbage collector bereinigt werden, und etwas speicherplatz freigeben.
//



























//
//                Garbage Collection
//        Einführung Reflection und Introspection
//        Das Factory Design Pattern
//        Lambda-Ausdrücke
//        Static Imports
//        Modulsystem
//                Records
//
//        Algorithmen und Datenstrukturen by Oliver Kohl
//        Oliver Kohl
//09:56
//        Translate
//        Algorithmen und Datenstrukturen
//        Iteratoren Enums Das Collection-Framework: ... by Oliver Kohl
//        Oliver Kohl
//09:56
//        Iteratoren
//                Enums
//        Das Collection-Framework: Collection, List, Set, Map, Queue
//        Generische Datentypen
//        Sortieren und Suchen
//        Einführung in Streams
//
//        Threading by Oliver Kohl
//        Oliver Kohl
//09:56
//        Threading
//        Java I/= by Oliver Kohl
//        Oliver Kohl
//09:56
//        Java I/=
//        wenig SQL und DBs by Oliver Kohl
//        Oliver Kohl
//09:57
//        wenig SQL und DBs
//        SAM (Single Abstract Method), Functions Int... by Oliver Kohl
//        Oliver Kohl
//09:57
//        SAM (Single Abstract Method), Functions Interfaces
//        Lambda, Methodenreferenzen by Oliver Kohl
//        Oliver Kohl
//09:57
//        Lambda, Methodenreferenzen
//        Unsere Agenda by Oliver Kohl
//        Oliver Kohl
//10:00
//        Unsere Agenda
//        JDBC-Vertiefung: Template-Klassen Benutzung... by Oliver Kohl
//        Oliver Kohl
//10:00
//        JDBC-Vertiefung:
//        Template-Klassen
//        Benutzung von Metadaten
//        OR-Mapping
//        DataSource und Connection-Pools
//        Reflection und Java-Beans:
//        Die Klasse Class
//        Members: Fields, Methods und Constructors
//        Beans und Properties
//        Annotations
//        Proxies:
//        Trennung von Fachlogik und Aspekten
//        Das Proxy-Pattern
//        InvocationHandler und Dynamic Proxies
//        Benutzung der CGLib
//        XML:
//        JAXP
//        SAX-Parser
//        DOM- und JDOM-Parser
//        XMXL-Serialisierung
//        Beaninfos und PersistenceDelegates
//        Serialisierung - Vertiefung:
//        Benutzerdefinierte Seralisierung
//        readResolve und writeReplace
//        XML-Serialisierung
//        BeanInfos und PersistenceDelegates
//        Client Server und RMI:
//        ServerSockets und Sockets
//        Serialsierung von Methodenaufrufen
//        RMI-Grundlagen
//        Die RMI-Registry
//        Stateless und Stateful Objects
//        Factories
//                Listeners
//        Multithreading - Vertiefung:
//        Threads und Runnables
//        Synchronized
//        Granularität von Sperren
//        wait, notify, notifyAll
//        ThreadLocal
//        Das Concurrent-Package:
//        SingleTrack
//                SimpleQueue
//        ArrayBlockingQueue
//        Thread-Pooling
//        Semaphore
//        Verschiedenes:
//        Logging
//        Schwache Referenzen
//        Class-Loading
//        Shutdown-Hooks
//
//        Wo habe ich Probleme bei Access Modifieres ... by Oliver Kohl
//        Oliver Kohl
//10:08
//        Translate
//        Wo habe ich Probleme bei Access Modifieres (Sichtbarkeiten), wo habe ich Optimierungspotential (final, static, Initilaisierung)
//        Last read
//        Kibana, LogStash, ELK, ElasticSearch, ... by Oliver Kohl
//        Oliver Kohl
//10:13
//        Kibana, LogStash, ELK, ElasticSearch, ...
//        has context menu
//
//
//        has context menu
























//
////Dynamic proxies:
////
//// 1. Grundlagen der Dynamic Proxies
////Dynamic Proxies ermöglichen die Erzeugung von Proxy-Objekten zur Laufzeit, die dasselbe Interface wie die "echte" Klasse implementieren. Sie werden eingesetzt, um zusätzliche Aspekte wie Logging, Transaktionsmanagement oder Sicherheitsprüfungen hinzuzufügen, ohne den Quellcode der eigentlichen Klasse zu verändern.
//
//// 2. Das Problem mit statischen Proxies
////Bei einer großen Anzahl von Klassen und Aspekten (z.B. 100 Service-Klassen und 5 Aspekte) wäre es notwendig, 500 statische Proxy-Klassen zu erstellen, was sehr aufwändig ist. Dynamic Proxies lösen dieses Problem, indem sie zur Laufzeit generiert werden.
//
//// 3. Das Interface InvocationHandler
////Dynamic Proxies in Java basieren auf dem Interface InvocationHandler, welches die Methode invoke definiert. Diese Methode wird aufgerufen, wenn eine Methode auf dem Proxy-Objekt ausgeführt wird. Sie enthält drei Parameter:
////
////Object proxy: das Proxy-Objekt.
////Method method: das Method-Objekt, das aufgerufen werden soll.
////Object[] args: die Argumente der Methode.
//
////Der InvocationHandler ermöglicht es, die Methode dynamisch abzufangen und entweder weiterzuleiten, zusätzliche Logik einzuführen oder das Resultat zu modifizieren.
//
////um einen Proxy zur Laufzeit zu erzeugen. Die Methode Proxy.newProxyInstance wird verwendet und Sie benötigt drei Parameter:
////
////ClassLoader: Der ClassLoader, der die Proxy-Klasse laden soll.
////Interfaces: Die Interfaces, die das Proxy-Objekt implementieren soll.
////InvocationHandler: Die Logik, die aufgerufen wird, wenn Methoden auf dem Proxy-Objekt ausgeführt werden.

//import java.lang.reflect.Proxy;
//
//public class App {
//    public static void main(String[] args) {
//        // Schritt 1: Erstelle eine Instanz des realen Objekts
//        HelloService realService = new HelloServiceImpl();
//klasse "HelloServiceImpl" und interface "HelloService"


//        // Schritt 2: Erstelle einen LoggingHandler, der das reale Objekt umhüllt
//        LoggingHandler handler = new LoggingHandler(realService);
// Klasse "LoggingHandler"
//        // Schritt 3: Erstelle ein Proxy-Objekt für das HelloService-Interface
//        HelloService proxyInstance = (HelloService) Proxy.newProxyInstance(// Proxy.newProxyInstance erzeugt ein neues Proxy-Objekt zur Laufzeit. Es implementiert das HelloService-Interface und verwendet LoggingHandler, um Methodenaufrufe zu überwachen.
//
////Diese Methode benötigt drei Parameter:
////
////ClassLoader: Der ClassLoader, der die Proxy-Klasse laden soll.
////Interfaces: Die Interfaces, die das Proxy-Objekt implementieren soll.
////InvocationHandler: Die Logik, die aufgerufen wird, wenn Methoden auf dem Proxy-Objekt ausgeführt werden.
//
//
//                HelloService.class.getClassLoader(),
//                // ClassLoader
//                new Class[] { HelloService.class },
//                // Interface, das der Proxy implementieren soll
//                handler
//                // Der Handler, der die Methode aufruft
//        );

//
//        // Schritt 4: Verwende das Proxy-Objekt und beobachte die Protokollausgabe
//        String greeting = proxyInstance.sayHello("John");
//        System.out.println("Ergebnis: " + greeting);
//    }
//}//Wenn du sayHello auf dem Proxy-Objekt aufrufst, wird zuerst der LoggingHandler aufgerufen, der den Aufruf protokolliert.
//
////
////Erklärung des Ablaufs:
////Der Aufruf proxyInstance.sayHello("John") wird an den Proxy übergeben.
////Der LoggingHandler fängt den Aufruf ab und führt den Prolog (Vor dem Aufruf der Methode) aus.
////Die tatsächliche sayHello-Methode wird auf realService aufgerufen.
////Der LoggingHandler gibt den Epilog (Nach dem Aufruf der Methode) aus.
////Das Ergebnis wird zurückgegeben und im main-Programm ausgegeben.
















//
////Beispiel 2
////
//import java.lang.reflect.InvocationHandler;
//import java.lang.reflect.Method;
//import java.lang.reflect.Proxy;
//
//public class App {
//    public static void main(String[] args) {
//        // Erzeuge eine Instanz der realen Implementierung
//        MathService mathService = new MathServiceImpl();
//
//        // Erstelle einen Proxy für die MathService-Instanz
//        MathService proxyInstance = (MathService) Proxy.newProxyInstance(// ein Proxy-Objekt. wird erzeugt.
//                MathService.class.getClassLoader(),  // ClassLoader
//                new Class[] { MathService.class },    // Interfaces
//                new LoggingHandler(mathService)       // InvocationHandler
//        );
//        // Der ClassLoader für das Proxy-Objekt.
//        //Die Liste der Interfaces, die das Proxy-Objekt implementieren soll.
//        //Der InvocationHandler, der die Logik des Proxys definiert.
//
//        // Verwende das Proxy-Objekt
//        int sum = proxyInstance.add(10, 5);
//        System.out.println("Ergebnis der Addition: " + sum);
//
//        int difference = proxyInstance.subtract(20, 7);
//        System.out.println("Ergebnis der Subtraktion: " + difference);
//    }
//}
//// Methoden wie add und subtract werden auf dem Proxy-Objekt proxyInstance aufgerufen.
////Der LoggingHandler wird automatisch ausgeführt und protokolliert die Aufrufe.
//
//// wir können unser proxy aber auch noch erweitern, in dem wir sicherheits-Check klasse hinzufügen:
//
////SecurityHandler.java










//
// // Threads:
// //Ein Thread ist ein Ausführungsstrang innerhalb eines Programms, vergleichbar mit einer virtuellen CPU.
//
// // Die Java Virtual Machine (JVM) ermöglicht es, mehrere Threads gleichzeitig in einer Anwendung auszuführen. Dies bedeutet, dass verschiedene Teile des Codes parallel zur Hauptausführung ablaufen können.
//
// // Jeder Thread hat eine Priorität: Die JVM entscheidet, welche Threads wann ausgeführt werden, basierend auf diesen Prioritäten.
// // Threads mit höherer Priorität werden bevorzugt gegenüber Threads mit niedrigerer Priorität ausgeführt.
//
// // Die JVM führt Threads so lange aus, bis eines der folgenden Ereignisse eintritt:
//
// // Die exit-Methode der Klasse Runtime wird aufgerufen (beendet die Anwendung).
// // Alle Benutzer-Threads sind beendet.
//
// // main(String[] args) das ist unsere hauptthread das unsere main methode abruft wenn die JVM startet.
//
// //
//
// public class App {
//    public static void main(String[] args) throws InterruptedException {
//
//        Thread.activeCount();// Das gibt aus wie viele threads sind schon aktiv.
//        System.out.println(Thread.activeCount());
//
//        Thread.currentThread().getName();// das gibt aus die name der Main thread.
//        System.out.println(Thread.currentThread().getName());
//
//        Thread.currentThread().setName("MAINNNN");// das ändert die name unserer Hauptthread.
//        System.out.println(Thread.currentThread().getName());
//        Thread.currentThread().getPriority();// das gibt uns die Priorität unserer Main thread.
//        System.out.println(Thread.currentThread().getPriority());// das ist eine Evaluierung in eine Skala von 1 bis 10, je größer der Zahl, umso größer ist die priorität dieser Thread.
//
//        Thread.currentThread().setPriority(10);// wir können damit die Priorität unserer Thread ändern.
//        System.out.println(Thread.currentThread().getPriority());
//
//        Thread.currentThread().isAlive();// das prüft ob unserer Thread noch am Leben ist .
//        System.out.println(Thread.currentThread().isAlive());
//
//     //    wir können unsere Thread.sleep verwenden um für eine bestimmte zeit zu schlafen und danach einen Befehl ausführen.
//        for(int i = 3; i>0; i--){
//            System.out.println(i);
//            Thread.sleep(1000);// lass uns hier einfach throws deklaration hinzufügen damit wir diesen Fehler wegnehmen.
//        }
//        System.out.println("You are done!");
//
//
//
//     //    (2)
//        MyThread thread2 = new MyThread();
//        System.out.println(thread2.isAlive());// das gibt uns false jzt, weil wenn wir einen neuen Thread erstellen, müssen wir diesen Thread zuerst starten!
//        thread2.start();
//        System.out.println(thread2.isAlive());
//
//        System.out.println(thread2.getName());
//
//        // wir können die name dieses Threads ändern:
//        thread2.setName("2nd Thread");
//        System.out.println(thread2.getName());
//
//     //    System.out.println(thread2.getPriority);
//     //    der neuer Thread vererbt die priorität unseres Hauptthreads.wir können das aber auch ändern:
//     //    System.out.println(thread2.setPriority(1));
//
//    }
//    }
//
//
////(2)
//    // um ein neuen thread zu erstellen, machen wir wie folgendes:
//    class MyThread extends Thread{
//    @Override
//    public void run(){
//        System.out.println("This thread is running");
//    }
//    }// und dann in unserer hauptthread fügen wir folgendes hinzu:
// //MyThread thread2 = new MyThread();
//
//
//
//
//
//// Daemon Threads:
//// es gibt zwei Arten von Threads, user threads und Daemon Threads, welche im hintergrund durchgeführt wurde, um bestimmte Aufgaben auszuführen wie garbage collection und JVM terminiert sich selbst wenn alle user threads also non-daemon threads fertig sind.
//
//// wir können überprüfen ob unsere thread ein daemon thread oder nicht in dem wir folgendes machen :
////        System.out.println(thread2.isDaemon());
//// wir können es aber auf Daemon Thread ändern:
////        thread2.setDaemon(true);
//












//
//// Multithreading:
//// Prozess der gleichzeitigen Ausführung mehrerer Threads, diese prozess hilft bei der maximalen Auslastung der CPU, Threads sind unabhängig, sie beeinflussen die Ausführung anderer Threads nicht. eine Ausnahme in einem Thread unterbricht andere Threads nicht, nützlich für die Bedienung mehrerer Clients, Multiplayer-Spiele oder andere voneinander unabhängige Aufgaben.
//
//
//
//public class App {
//    public static void main(String[] args) {
//        // lass uns zwei verschidene Zählern erstellen, wo an der eine zahlen wir von 0 bis 10, und in die zweite machen wir das gleiche umgekehrt.
//
//        // Wir erstellen das erste Thread-Objekt
//        MyThread thread1 = new MyThread();
//        // wenn wir dieses Thread starten, es führt unsere run() funktion, lass uns jzt einen for loop in unsere run funktion erstellen.
//        // Wir starten den Thread
//        thread1.start(); // Diese Zeile startet den Thread und führt die run()-Methode aus
//
//        // Wir erstellen ein zweites Thread-Objekt, das von 0 bis 10 zählt.
//        MyReverseThread thread2 = new MyReverseThread();
//        thread2.start(); // Startet das zweite Thread
//    }
//}
//
//// Subklasse für das erste Thread, das von 10 bis 1 zählt
//class MyThread extends Thread {
//    @Override
//    public void run() {
//        for (int i = 10; i > 0; i--) {
//            System.out.println("Thread #1 : " + i);
//            try {
//                Thread.sleep(1000); // Wartet 1 Sekunde zwischen den Ausgaben
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        System.out.println("Thread #1 is finished!");
//    }
//}
//
//// Subklasse für das zweite Thread, das von 0 bis 10 zählt
//class MyReverseThread extends Thread {
//    @Override
//    public void run() {
//        for (int i = 0; i <= 10; i++) {
//            System.out.println("Thread #2 : " + i);
//            try {
//                Thread.sleep(1000); // Wartet 1 Sekunde zwischen den Ausgaben
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        System.out.println("Thread #2 is finished!");
//    }
//}
//













//
//// es gibt aber eine andere methode mit dem man thread erstellen kann, und zwar das wir einen Instanz erstellen die die ausführung eine klasse die unsere interface startet, dann geben wir diese instanz in unsere thread objekt rein.:
//
//public class App {
//    public static void main(String[] args) {
//
//        MyRunnable runnable1 = new MyRunnable();// instanzieren wir die runnable
//
//        Thread thread2 = new Thread(runnable1);// geben wir unsere instanz und geben es als parameter rein.
//
//    }
//}
//
//class MyRunnable implements Runnable{// eine subklasse die Runnable interface implementiert
//    @Override
//    public void run(){
//
//    }
//}







//
//// jzt lass uns unsere programm mit dem runnable interface weiter implementieren :
//
//public class App {
//    public static void main(String[] args) {
//
//        MyThread thread1 = new MyThread();
//
//        MyRunnable runnable1 = new MyRunnable();
//        Thread thread2 = new Thread(runnable1);
//
//        //(2)
//        thread1.start();
//        thread2.start();
//        // dann sehen wir dass die beide run funktionen gleichzeitig ausgeführt werden
//    }
//}
//
////    class MyThread extends Thread{
////    @Override
////        public void run(){
////
////            for(int i= i=10; i>0; i--){
////                System.out.println("Thread #1 : " + i);
////                try {
////                    Thread.sleep(1000);
////                } catch (InterruptedException e) {
////                    throw new RuntimeException(e);
////                }
////            }
////        System.out.println("Thread #1 is finished!");
////
////
////        }
////    }
//class MyRunnable implements Runnable{// eine subklasse die Runnable interface implementiert
//    @Override
//    public void run(){
//        for(int i= i=0; i<10; i++){
//            System.out.println("Thread #2 : " + i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        System.out.println("Thread #2 is finished!");
//    }
//}
//
//
//
//
////
////
//// das beste mit multithreading, ist das wenn wir einen Fehler mit einem Thread haben, der andere Thread wird trotzdem weiter einwandfrei ausgeführt, lass uns zb absichtlich einen fehler hinzufügen indem wir hier ein 1/0 sout hinzufügen:
//
//class MyThread extends Thread{
//    @Override
//    public void run(){
//
//        for(int i= i=10; i>0; i--){
//            System.out.println("Thread #1 : " + i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(1/0);
//        }
//        System.out.println("Thread #1 is finished!");
//
//
//    }
//}// dann sehen wir das der andere thread weiter ausgeführt wurde.












//
//
//
////
////// lass uns aber sagen wir wollen dass thread 2 genau nachdem thread1 ausgeführt wird ausführen , dann können wir unsere join() methode verwenden.
////
//
//public class App {
//    public static void main(String[] args) throws InterruptedException {
//
//        MyThread thread1 = new MyThread();
//
//        MyRunnable runnable1 = new MyRunnable();
//        Thread thread2 = new Thread(runnable1);
//
//        thread1.start();
//        thread1.join(3000);// hier können wir unsere throws deklaration verwenden, und dann sehen wir dass thread 2 ausgeführt wurde erst wenn thread 1 fertig ist, wir können auch unsere millisekunden als parameter reingeben, damit es eine Wartezeit dazwischen gibt. thread1.join(3000), also hier fängt thread1 zuerst dann thread2 wartet 3 sekunden und wird danach auch gleichzeitig ausgeführt.
//        thread2.start();
//    }
//}
//
//class MyThread extends Thread{
//    @Override
//    public void run(){
//
//        for(int i= i=10; i>0; i--){
//            System.out.println("Thread #1 : " + i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        System.out.println("Thread #1 is finished!");
//
//
//    }
//}
//class MyRunnable implements Runnable{// eine subklasse die Runnable interface implementiert
//    @Override
//    public void run(){
//        for(int i= i=0; i<10; i++){
//            System.out.println("Thread #2 : " + i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        System.out.println("Thread #2 is finished!");
//    }
//}



















//
//
//////1. Synchronized
////
//
//
//public class App {
//    private int count = 0;
//
//    // Synchronisierte Methode
//    public synchronized void increment() {
//        count++;
//    }// increment ist eine Methode, die den Wert von count um eins erhöht.
//// Das synchronized-Schlüsselwort vor der Methode bedeutet, dass immer nur ein Thread gleichzeitig diese Methode aufrufen kann, selbst wenn mehrere Threads gleichzeitig darauf zugreifen möchten.
//
//    //Warum Synchronisierung? Ohne synchronized könnten zwei oder mehr Threads versuchen, die Methode gleichzeitig auszuführen, was zu einem sogenannten Race Condition führen würde. Dabei könnte der Wert von count nicht korrekt erhöht werden. In einer solchen Situation könnten beide Threads gleichzeitig count lesen, inkrementieren und wieder speichern, was zu einem falschen Endwert führt.
//
//
//    public static void main(String[] args) throws InterruptedException {
//        App example = new App();// Zuerst wird ein App-Objekt example erstellt, das die Variable count enthält und die Methode increment definiert
//
//// dann erstellen wir zwei threads, wobei beide die increment-methode von example ausführen sollen
//        Thread t1 = new Thread(example::increment);
//        Thread t2 = new Thread(example::increment);
//
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();
//        // warten darauf, dass beide Threads ihre Ausführung beendet haben, bevor die Hauptmethode weiterläuft. Dies stellt sicher, dass der Wert von count erst nach der vollständigen Ausführung beider Threads ausgegeben wird.
//
//        System.out.println("Synchronized - Final count: " + example.count); // Ausgabe: 2
//    }
//}
//// Da die Methode increment synchronisiert ist, können die beiden Threads t1 und t2 nicht gleichzeitig auf die Methode zugreifen. Sobald ein Thread (t1 oder t2) die Methode aufruft, sperrt er den Zugriff für den anderen.
//
//// Das Ergebnis ist, dass count korrekt auf den Wert 2 gesetzt wird (weil jeder Thread genau einmal count erhöht).
////Würde das synchronized-Schlüsselwort fehlen, könnte der Wert am Ende weniger als 2 sein, weil beide Threads möglicherweise gleichzeitig auf count zugreifen und den Wert inkorrekt ändern könnten.
//
//





//
////2. Lock Splitting
//
//// das Konzept namens Lock Splitting (auch als Lock Trennung bekannt) wird verwendet, um die Performance zu verbessern, indem man separate Sperren für unterschiedliche Datenstrukturen oder Variablen verwendet, sodass verschiedene Threads unabhängig voneinander arbeiten können
//public class App {
//    private int count1 = 0;
//    private int count2 = 0;
//    // count1 und count2 sind zwei separate Zähler-Variablen , Sie sollen unabhängig voneinander geändert werden, daher ist es sinnvoll, für jeden Zähler eine separate Sperre (Lock) zu verwenden.
//
//    // Zwei verschiedene Object-Instanzen als Sperrobjekte für die unterschiedliche Variablen
//    private final Object lock1 = new Object();
//    private final Object lock2 = new Object();
//
//    // Anstatt die gesamte App-Instanz (this) als Monitor-Objekt zu verwenden, wie es bei der Methode synchronized üblich ist, synchronisieren wir den Zugriff auf zwei verschiedene Bereiche unabhängig voneinander.
//    //Das ermöglicht es, dass zwei Threads parallel auf unterschiedliche kritische Abschnitte zugreifen können, ohne sich gegenseitig zu blockieren.
//
//    public void incrementCount1() {// verwendet synchronized auf dem Sperrobjekt lock1. Dies bedeutet, dass nur ein Thread gleichzeitig in diesen kritischen Abschnitt eintreten kann, wenn er lock1 verwendet.
//        synchronized (lock1) {
//            count1++;
//            // Hier wird der Wert von count1 um eins erhöht, sobald der Zugriff auf das Sperrobjekt lock1 erfolgt ist.
//        }
//    }
//
//    public void incrementCount2() {
//        synchronized (lock2) {
//            count2++;
//        }
//    }// // Da lock2 eine andere Sperre als lock1 ist, kann ein anderer Thread gleichzeitig incrementCount2 ausführen, selbst wenn ein Thread gerade incrementCount1 ausführt.
//// Hier wird count2 unabhängig von count1 inkrementiert.
//
//    public static void main(String[] args) throws InterruptedException {
//        App example = new App();
//
//        Thread t1 = new Thread(example::incrementCount1);
//        Thread t2 = new Thread(example::incrementCount2);
//        // t1 führt die Methode incrementCount1 aus, was count1 inkrementiert.
//        //t2 führt die Methode incrementCount2 aus, was count2 inkrementiert.
//
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();
//        // sorgen dafür, dass die Hauptmethode wartet, bis beide Threads vollständig ausgeführt sind, bevor sie die Ergebnisse ausgibt.
//
//        System.out.println("Lock Splitting - Final count1: " + example.count1 + ", Final count2: " + example.count2);
//    }
//}
//
//// Da beide Threads unterschiedliche Sperrobjekte verwenden (lock1 und lock2), können sie tatsächlich gleichzeitig ausgeführt werden, ohne sich gegenseitig zu blockieren.
////Das bedeutet, dass die Synchronisierung auf die einzelnen Variablen (count1 und count2) beschränkt ist.
//
//
//// Da beide Threads unterschiedliche Sperrobjekte verwenden (lock1 und lock2), können sie tatsächlich gleichzeitig ausgeführt werden, ohne sich gegenseitig zu blockieren.
////Das bedeutet, dass die Synchronisierung auf die einzelnen Variablen (count1 und count2) beschränkt ist.
//
//







//
////3. Deadlock
//
//// Ein Deadlock tritt auf, wenn zwei oder mehr Threads sich gegenseitig blockieren, weil jeder auf eine Ressource wartet, die der andere besitzt. lass uns zwei task methoden erstellen:
//
//public class App {
//    private final Object lock1 = new Object();
//    private final Object lock2 = new Object();
//    // Es gibt zwei Sperrobjekte (lock1 und lock2), die als Monitore verwendet werden.
////    Diese Sperrobjekte steuern den Zugriff auf bestimmte kritische Abschnitte innerhalb der Methoden task1 und task2.
//    // Da lock1 und lock2 als final deklariert sind, können sie nicht geändert werden, was bedeutet, dass diese Sperrobjekte während der gesamten Lebensdauer der App-Instanz gleich bleiben.
//
//    public void task1() {
//        synchronized (lock1) {
//            System.out.println("Task 1: Lock 1 acquired");
//            try { Thread.sleep(100); } catch (InterruptedException e) { }
//
//            synchronized (lock2) {
//                System.out.println("Task 1: Lock 2 acquired");
//            }
//        }
//    }// Die Methode task1 versucht, zuerst lock1 zu sperren (synchronized (lock1)) und gibt eine Meldung aus (Task 1: Lock 1 acquired).
////    Dann pausiert der Thread für 100 Millisekunden (Thread.sleep(100)), um sicherzustellen, dass während dieser Zeit der zweite Thread (task2) aktiv werden kann.
////    Danach versucht task1, innerhalb von lock1 auch lock2 zu sperren (synchronized (lock2)), was zu einer verschachtelten Sperre führt.
//
//    public void task2() {
//        synchronized (lock2) {
//            System.out.println("Task 2: Lock 2 acquired");
//            try { Thread.sleep(100); } catch (InterruptedException e) { }
//
//            synchronized (lock1) {
//                System.out.println("Task 2: Lock 1 acquired");
//            }
//        }
//    }// glecihfalls Die Methode task2 versucht, zuerst lock2 zu sperren (synchronized (lock2)) und gibt eine Meldung aus (Task 2: Lock 2 acquired).Danach pausiert task2 ebenfalls für 100 Millisekunden.
////    Anschließend versucht task2, innerhalb von lock2 auch lock1 zu sperren (synchronized (lock1)).
//
//    public static void main(String[] args) {
//        App example = new App();
//
//        Thread t1 = new Thread(example::task1);
//        Thread t2 = new Thread(example::task2);
//
//        t1.start();
//        t2.start();
//    }
//}
//// Der kritische Teil ist, wie task1 und task2 miteinander interagieren:
////
////Thread t1 (task1) sperrt lock1 und versucht dann, lock2 zu sperren.
////Thread t2 (task2) sperrt lock2 und versucht dann, lock1 zu sperren.
////Wenn beide Threads gleichzeitig starten und wie folgt ausgeführt werden:
////
////t1 sperrt lock1 und wartet auf lock2.
////t2 sperrt lock2 und wartet auf lock1.
////Das führt zu einem Deadlock, weil beide Threads aufeinander warten und keiner von ihnen fortfahren kann. Keiner gibt seinen aktuellen Lock frei, sodass beide für immer in diesem Zustand verharren.
//
//
////t1 gibt die Nachricht Task 1: Lock 1 acquired aus und schläft für 100 Millisekunden.
////Gleichzeitig gibt t2 die Nachricht Task 2: Lock 2 acquired aus und schläft ebenfalls.
////        Nach 100 Millisekunden:
////t1 versucht lock2 zu sperren, was blockiert, weil t2 diesen Lock hält.
////t2 versucht lock1 zu sperren, was blockiert, weil t1 diesen Lock hält.
////Keiner der Threads kann weiterlaufen, was die typische Deadlock-Situation ist.
//
//// Es gibt mehrere Möglichkeiten, Deadlocks zu vermeiden:
//
//
//
//
////1. Lösung mit Lock Ordering:
//
//
//public class App {
//    private final Object lock1 = new Object();
//    private final Object lock2 = new Object();
//
//
//    public void task1() {
//        synchronized (lock1) {  // Zuerst lock1, dann lock2
//            System.out.println("Task 1: Lock 1 acquired");
//            try { Thread.sleep(100); } catch (InterruptedException e) { }
//
//            synchronized (lock2) {
//                System.out.println("Task 1: Lock 2 acquired");
//            }
//        }
//    }
//
//    public void task2() {
//        synchronized (lock1) {  // Zuerst lock1, dann lock2 (gleiche Reihenfolge)
//            System.out.println("Task 2: Lock 1 acquired");
//            try { Thread.sleep(100); } catch (InterruptedException e) { }
//
//            synchronized (lock2) {
//                System.out.println("Task 2: Lock 2 acquired");
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        App example = new App();
//
//        Thread t1 = new Thread(example::task1);
//        Thread t2 = new Thread(example::task2);
//
//        t1.start();
//        t2.start();
//    }
//}
//// Lock Ordering ist eine Technik, bei der alle Threads immer in derselben Reihenfolge auf die Sperrobjekte zugreifen. Dadurch wird garantiert, dass keine gegenseitige Blockierung entsteht.
//// Durch diese feste Sperrreihenfolge wird garantiert, dass ein Deadlock nicht auftreten kann.
////
////
////
//
//// 2. Lösung: Verwendung von ReentrantLock mit tryLock
//
//import java.util.concurrent.locks.ReentrantLock;
//
//public class App {
//    private final ReentrantLock lock1 = new ReentrantLock();
//    private final ReentrantLock lock2 = new ReentrantLock();
//
//    // Hier wird ReentrantLock anstelle von synchronized verwendet. ReentrantLock bietet die Methode tryLock, die versucht, die Sperre zu erwerben, und false zurückgibt, wenn sie nicht verfügbar ist.
//    public void task1() {
//        try {
//            if (lock1.tryLock()) {  // Versucht lock1 zu erwerben
//                System.out.println("Task 1: Lock 1 acquired");
//                // tryLock() gibt true zurück, wenn die Sperre erfolgreich erworben wurde, und false, wenn nicht.
//                try { Thread.sleep(50); } catch (InterruptedException e) { }
//
//                if (lock2.tryLock()) {  // Versucht lock2 zu erwerben
//                    try {
//                        System.out.println("Task 1: Lock 2 acquired");
//                    } finally {
//                        lock2.unlock();  // Gibt lock2 frei
//                    }
//                } else {
//                    System.out.println("Task 1: Couldn't acquire Lock 2, releasing Lock 1");
//                }
//            }
//        } finally {
//            if (lock1.isHeldByCurrentThread()) {
//                // isHeldByCurrentThread() wird verwendet, um sicherzustellen, dass ein Thread nur seine eigenen Sperren freigibt.
//                lock1.unlock();  // Gibt lock1 frei, falls es gehalten wird
//            }
//        }
//    }// Durch die Verwendung der try-finally-Blöcke wird sichergestellt, dass die Sperren immer korrekt freigegeben werden, auch wenn eine Ausnahme auftritt.
//
//
//    public void task2() {
//        try {
//            if (lock2.tryLock()) {  // Versucht lock2 zu erwerben
//                System.out.println("Task 2: Lock 2 acquired");
//
//                try { Thread.sleep(50); } catch (InterruptedException e) { }
//
//                if (lock1.tryLock()) {  // Versucht lock1 zu erwerben
//                    try {
//                        System.out.println("Task 2: Lock 1 acquired");
//                    } finally {
//                        lock1.unlock();  // Gibt lock1 frei
//                    }
//                } else {
//                    System.out.println("Task 2: Couldn't acquire Lock 1, releasing Lock 2");
//                }
//            }
//        } finally {
//            if (lock2.isHeldByCurrentThread()) {
//                lock2.unlock();  // Gibt lock2 frei, falls es gehalten wird
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        App example = new App();
//
//        Thread t1 = new Thread(example::task1);
//        Thread t2 = new Thread(example::task2);
//
//        t1.start();
//        t2.start();
//    }
//}
////     // In task1 und task2 versuchen die Threads, beide Sperren (lock1 und lock2) mit tryLock zu erwerben.
////    //Wenn ein Thread beide Sperren bekommt, führt er seinen kritischen Abschnitt aus.
////    //Wenn ein Thread jedoch die zweite Sperre nicht erwerben kann, gibt er die erste Sperre wieder frei und gibt eine Meldung aus.
////    //Dadurch werden Deadlocks vermieden, weil kein Thread in einem Wartezustand bleibt, falls er die Sperren nicht in der gewünschten Reihenfolge bekommt.
//
//
//
//
////Verwende tryLock mit ReentrantLock, wenn du nicht blockieren möchtest und eine Timeout-Option haben willst.
////Diese Methode ist nützlich, wenn ein Deadlock potenziell auftreten kann und du den Versuch, die Sperre zu erwerben, nach einem bestimmten Zeitraum abbrechen möchtest.












//
//
//// eine weitere Aspekt zur multiThreading:
//
////4. Volatile:
//
//public class App {
//    private volatile boolean running = true;
//    // Das Schlüsselwort volatile bedeutet, dass Änderungen an dieser Variable sofort für alle Threads sichtbar sind, die auf diese Variable zugreifen.
//    //Normalerweise könnten Threads auf eine nicht-volatile-Variable in ihrem eigenen CPU-Cache zugreifen, was zu einer Inkosistenz führt. volatile stellt sicher, dass "running" nicht zwischengespeichert wird und jeder Thread immer die aktuellste Version direkt aus dem Hauptspeicher liest.
//
//    public void run() {
//        while (running) {// eine while-Schleife, die läuft, solange running den Wert true hat.
//            System.out.println("Thread läuft...");
//        }
//        System.out.println("Thread gestoppt");
//    }// Hier spielt volatile eine entscheidende Rolle: Es stellt sicher, dass der Thread, der die Methode run ausführt, immer die aktuellste Version von running sieht.
//
//
//    public static void main(String[] args) throws InterruptedException {
//        App example = new App();
//
//        // Ein neuer Thread t1 wird erstellt, der die run-Methode von example ausführt.
//        Thread t1 = new Thread(example::run);
//        t1.start();
//
//        Thread.sleep(1000);// pausiert für 1000 Millisekunden (Thread.sleep(1000);), sodass t1 Zeit hat, die Schleife auszuführen und die Nachricht Thread läuft... auszugeben.
//        example.running = false;  // Stoppt den Thread
//        // Danach setzt der main-Thread running auf false, um die Schleife in t1 zu beenden.
//    }
//}
//// Warum volatile in diesem Fall notwendig ist:
////Wenn die Variable "running" nicht als volatile deklariert wäre, könnte folgendes passieren:
////Der t1-Thread könnte die Variable running in seinen eigenen Cache laden und den Wert dort zwischenspeichern.
////Änderungen an running im main-Thread (z. B. example.running = false;) könnten nicht sofort für t1 sichtbar sein, da t1 immer noch den alten zwischengespeicherten Wert (true) liest.
////Dies führt dazu, dass der t1-Thread endlos in der Schleife bleibt, selbst nachdem running im main-Thread auf false gesetzt wurde.
////Mit volatile wird sichergestellt, dass:
////Alle Lese- und Schreiboperationen an running direkt im Hauptspeicher erfolgen.
////Der t1-Thread liest immer die aktuellste Version von running und sieht sofort, wenn running auf false geändert wird.
//
//
//// volatile stellt zwei Dinge sicher:
////Sichtbarkeit: Änderungen an einer volatile-Variable sind sofort für alle Threads sichtbar.
////Speicherbarrieren: Es verhindert, dass der Compiler oder die CPU die Reihenfolge der Lese- und Schreibzugriffe optimiert oder umordnet. Dadurch bleibt die Reihenfolge der Zugriffe konsistent.












//
////5. wait / notify:
//
////wait() und notify() werden in Java verwendet, um eine Synchronisation zwischen Threads zu erreichen. Diese Methoden ermöglichen eine Form der Thread-Kommunikation, bei der ein Thread wartet, bis ein anderer ihn benachrichtigt, dass er fortfahren kann
//
//public class App {
//    private final Object lock = new Object();
//    private boolean taskCompleted = false;
//    // Ein boolean-Wert, der den Status einer Aufgabe anzeigt. Wenn taskCompleted false ist, bedeutet es, dass die Aufgabe noch nicht abgeschlossen ist. Sobald taskCompleted auf true gesetzt wird, ist die Aufgabe beendet.
//
//    public void doWait() {
//        synchronized (lock) {// Diese Methode synchronisiert sich auf das lock-Objekt. Das bedeutet, dass nur ein Thread gleichzeitig in den synchronisierten Block eintreten kann.
//            while (!taskCompleted) {//Solange taskCompleted false ist, bleibt der Thread in dieser Schleife und führt die wait()-Methode aus.
//                try {
//                    System.out.println("Warten auf Aufgabe...");
//                    lock.wait();// Diese Methode hat zwei wichtige Effekte: Der aktuelle Thread gibt das lock-Objekt frei, sodass andere Threads darauf zugreifen können.
////                    Der Thread wird in den Wartestand versetzt, bis ein                       anderer Thread ihn mit lock.notify() weckt.
//                    // Sobald ein anderer Thread notify() auf diesem Sperrobjekt (lock) aufruft, wacht der doWait-Thread auf, erwirbt das lock-Objekt erneut und setzt die Schleife fort.
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//            System.out.println("Aufgabe abgeschlossen, Fortsetzung der Arbeit.");// Wenn taskCompleted true ist, verlässt er die Schleife und gibt diese Meldung .
//
//        }
//    }
//
//    public void doNotify() {
//        synchronized (lock) {
//            taskCompleted = true;// Setzt den Zustand der Aufgabe auf true. Das bedeutet, dass die Aufgabe nun als abgeschlossen betrachtet wird.
//            System.out.println("Benachrichtige, dass Aufgabe abgeschlossen ist.");
//            lock.notify();// Weckt einen wartenden Thread auf, der wait() auf diesem lock-Objekt aufgerufen hat. Der wartende Thread (doWait) wird von wait() zurückkehren und die Schleife verlassen, weil taskCompleted jetzt true ist.
//
//        }
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        App example = new App();
//
//        Thread t1 = new Thread(example::doWait);
//        t1.start();
//
//        Thread.sleep(2000);  //  pausiert für 2 Sekunden, um die Situation zu simulieren
//
//        Thread t2 = new Thread(example::doNotify);
//        t2.start();
//    }
//}
//// Ablauf der Programmausführung:
////t1 startet und ruft doWait() auf:
////Der Thread betritt den synchronized-Block und gibt die Meldung Warten auf Aufgabe... aus.
////Danach ruft t1 wait() auf, wodurch er in den Wartestand geht und das Sperrobjekt lock freigibt.
////Der main-Thread schläft für 2 Sekunden (Thread.sleep(2000);).
////Während dieser Zeit wartet t1 weiterhin auf das lock-Objekt.
////t2 startet und ruft doNotify() auf:
////Der Thread betritt den synchronized-Block und setzt taskCompleted auf true.
////Danach ruft t2 lock.notify() auf, wodurch t1 aufgeweckt wird.
////t1 wird geweckt und kehrt aus wait() zurück:
////Da taskCompleted jetzt true ist, verlässt t1 die while-Schleife.
////Der Thread gibt die Meldung Aufgabe abgeschlossen, Fortsetzung der Arbeit. aus und beendet die doWait-Methode.
//
//
//
//// Wichtige Punkte zu wait() und notify():
////wait():
////wait() und notify() müssen innerhalb eines synchronized-Blocks aufgerufen werden, der das entsprechende Sperrobjekt (lock) verwendet.
//
////notifyAll():
////Wenn mehrere Threads auf demselben Sperrobjekt warten, weckt notifyAll() alle wartenden Threads auf.
////Nur einer der aufgeweckten Threads wird das Sperrobjekt tatsächlich wieder erwerben können.















//
//
////BlockingQueue:
//
//// Eine BlockingQueue ist eine spezielle Art von Queue (Warteschlange), die aus dem Paket java.util.concurrent stammt.
////Sie ist dafür ausgelegt, mehrere Threads sicher zu unterstützen. Das bedeutet:
////Wenn die Queue voll ist und ein Produzent einen neuen Wert hinzufügen möchte, wird dieser blockiert, bis Platz frei wird.
////Wenn die Queue leer ist und ein Konsument versucht, einen Wert zu entnehmen, wird dieser ebenfalls blockiert, bis ein neuer Wert verfügbar ist.
////Dadurch wird die Synchronisation zwischen Produzenten und Konsumenten vereinfacht, ohne dass man manuell wait() und notify() verwenden muss.
//
//import java.util.concurrent.ArrayBlockingQueue;
//import java.util.concurrent.BlockingQueue;
//
//public class App {
//    public static void main(String[] args) {
//        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
//// Hier wird eine BlockingQueue vom Typ Integer erstellt, und implementiert der BlockingQueue interface. und hat eine Kapazität von 5. Das bedeutet, die Queue kann maximal 5 Integer-Werte speichern
//
//        Thread producer = new Thread(() -> {
////        der producer thread verwendet lambda funktion als Runnable
//            try {
//                for (int i = 1; i <= 5; i++) {// eine Schleife von 1 bis 5
//                    System.out.println("Produziert: " + i);
//                    queue.put(i);// Fügt den Wert i in die Queue ein.
//                    // Die Methode put() ist eine spezielle Methode der BlockingQueue, die blockiert, wenn die Queue voll ist.
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });// In diesem Beispiel hat die Queue eine Kapazität von 5, sodass sie genau 5 Elemente aufnehmen kann.
//
//        // Erstellung des consumer-Threads:
//        Thread consumer = new Thread(() -> {
//            try {
//                for (int i = 1; i <= 5; i++) {
//                    Integer value = queue.take();// Entnimmt den nächsten Wert aus der Queue.
//                    // Die Methode take() blockiert, wenn die Queue leer ist, bis ein neues Element vom Produzenten eingefügt wird.
//                    System.out.println("Konsumiert: " + value);
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//
//        producer.start();// startet den Produzenten-Thread, der mit der Produktion der Werte beginnt.
//        consumer.start();// startet den Konsumenten-Thread, der mit dem Entnehmen und Verarbeiten der Werte beginnt.
//    }
//}
//// Wie funktioniert die Synchronisation?
////Die BlockingQueue übernimmt die gesamte Synchronisation zwischen den Threads:
////Wenn der producer versucht, ein neues Element in die Queue zu legen, und die Queue ist voll, wartet put(), bis ein Konsument ein Element entnimmt und Platz frei wird.
////Wenn der consumer versucht, ein Element aus der Queue zu entnehmen, und die Queue ist leer, wartet take(), bis ein Produzent ein neues Element einfügt.
//
////  Was wäre ohne BlockingQueue notwendig?
////Ohne BlockingQueue müsstest du manuell sicherstellen, dass die Threads korrekt aufeinander warten, was sehr fehleranfällig sein kann.
////Hier müsste man synchronized, wait(), notify() und eventuell weitere Kontrollmechanismen einbauen, um das gleiche Verhalten zu erreichen.
//











////7. ThreadPool mit Callables
//
////  ExecutorService zusammen mit Callable und Future sind verwendet, um parallele Aufgaben in Java zu verwalten und deren Ergebnisse abzurufen.
//
//// Was ist ein ExecutorService?
////Ein ExecutorService ist ein Framework, das das Management von Threads in Java vereinfacht.
////Anstatt manuell Threads zu erstellen und zu verwalten, kannst du Aufgaben (Runnable oder Callable) an einen ExecutorService übergeben, der die Threads für dich startet, verwaltet und überwacht.
//
//
//// Was ist Callable?
////Callable ist eine Schnittstelle in Java, die sich von Runnable unterscheidet.
////Runnable hat die Methode run() und gibt kein Ergebnis zurück.
////Callable hat die Methode call() und gibt ein Ergebnis zurück (Generischer Typ <T>).
////Callable kann auch Ausnahmen werfen, was Runnable nicht erlaubt.
//
//
//// Was ist Future?
////Future ist eine Schnittstelle, die das Ergebnis einer asynchronen Berechnung darstellt.
////Mit einem Future-Objekt kannst du:
////Auf das Ergebnis einer Berechnung warten.
////Überprüfen, ob die Berechnung abgeschlossen ist.
////Die Berechnung abbrechen.
////Das Ergebnis abrufen (mit get()).
//
//import java.util.concurrent.Callable;
//import java.util.concurrent.ExecutionException;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.Future;
//
//public class App {
//    public static void main(String[] args) {
//        ExecutorService executor = Executors.newFixedThreadPool(3);
//// Ein ExecutorService wird mit einer festen Thread-Pool-Größe von 3 Threads erstellt. bedeutet, dass maximal 3 Threads gleichzeitig in diesem Thread-Pool aktiv sein können.
//        Callable<Integer> task1 = () -> {
//            System.out.println("Task 1 wird ausgeführt");
//            Thread.sleep(500);
//            return 10;
//        };// task1 ist eine Callable-Instanz, die einen Integer-Wert zurückgibt (Callable<Integer>).
////        Sie gibt die Nachricht Task 1 wird ausgeführt aus und pausiert (Thread.sleep(500)) für 500 Millisekunden, um eine zeitaufwendige Berechnung zu simulieren.
////                Danach gibt task1 das Ergebnis 10 zurück
//
//        Callable<Integer> task2 = () -> {// ebenfalls eine Callable-Instanz, die Integer zurückgibt.
//            System.out.println("Task 2 wird ausgeführt");
//            Thread.sleep(500);
//            return 20;
//        };
//
//        Future<Integer> future1 = executor.submit(task1);
//        Future<Integer> future2 = executor.submit(task2);
//        // Der submit()-Aufruf gibt ein Future-Objekt zurück, das das Ergebnis der Callable-Ausführung repräsentiert.
//        // submit() führt die Aufgabe (task1 und task2) in einem der verfügbaren Threads des ExecutorService aus.
//        // Da task1 und task2 parallel ausgeführt werden, werden sie gleichzeitig gestartet, sofern genügend Threads im Pool verfügbar sind.
//
//        try {
//            System.out.println("Ergebnis von Task 1: " + future1.get());
//            System.out.println("Ergebnis von Task 2: " + future2.get());
//            // future1.get() und future2.get() warten darauf, dass die jeweiligen Callable-Aufgaben abgeschlossen sind, und geben das Ergebnis zurück. Wenn future1.get() aufgerufen wird und task1 noch nicht abgeschlossen ist, wartet get() so lange, bis das Ergebnis verfügbar ist.
//        } catch (InterruptedException | ExecutionException e) {
//            e.printStackTrace();
//        }
//
//        executor.shutdown();
//        // weist den ExecutorService an, keine neuen Aufgaben mehr zu akzeptieren und die vorhandenen Aufgaben abzuschließen. Nach dem Aufruf von shutdown() werden alle gestarteten Aufgaben zu Ende gebracht, aber keine neuen Aufgaben werden angenommen.
//    }
//}
//
//// 5. Ablauf der Programmausführung:
//// Der ExecutorService wird mit 3 Threads erstellt.
////Die beiden Aufgaben task1 und task2 werden an den ExecutorService übergeben.
////Beide Aufgaben beginnen gleichzeitig, da newFixedThreadPool(3) bis zu 3 Threads gleichzeitig starten kann.
////task1 gibt Task 1 wird ausgeführt aus und pausiert für 500 Millisekunden, dann gibt es 10 zurück.
////task2 gibt Task 2 wird ausgeführt aus und pausiert ebenfalls für 500 Millisekunden, dann gibt es 20 zurück.
////future1.get() und future2.get() warten auf die jeweiligen Ergebnisse und geben sie aus:
////Ergebnis von Task 1: 10
////Ergebnis von Task 2: 20
////executor.shutdown() beendet den ExecutorService und gibt die Ressourcen frei.
























////Thread-Status "Zustände";
//
//// In Java kann ein Thread verschiedene Zustände durchlaufen, die durch die Methode getState() abgerufen werden können. Diese Zustände helfen, den aktuellen Status eines Threads zu verstehen
//
////die möglichen Zustände eines Threads :
////
////NEW: Der Thread ist erstellt, aber noch nicht gestartet.
//
////RUNNABLE: Der Thread wird ausgeführt oder ist bereit zur Ausführung.
//
////BLOCKED: Der Thread wartet auf die Freigabe einer Sperre (tritt auf, wenn mehrere Threads synchronisiert auf dieselbe Ressource zugreifen).
//
////WAITING: Der Thread wartet auf eine andere Aktion (z. B. auf wait(), join() oder Lock).
//
////TIMED_WAITING: Der Thread wartet für eine bestimmte Zeit (z. B. Thread.sleep() oder join(long millis)).
//
////TERMINATED: Der Thread hat seine Ausführung beendet.
//
//
//public class App {
//    public static void main(String[] args) throws InterruptedException {
//        Thread thread = new Thread(() -> {// ein Runnable block der enthält den Code, der ausgeführt werden soll, wenn der Thread gestartet wird.
//            try {
//                Thread.sleep(2000);
//                System.out.println("Thread ist RUNNABLE");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//
//        System.out.println("Zustand vor dem Start: " + thread.getState());
//        // Der Zustand wird vor dem Start des Threads abgefragt:
//        //Der Thread befindet sich im Zustand NEW, weil er erstellt wurde, aber noch nicht gestartet ist.
//
//        thread.start();
//        System.out.println("Zustand nach dem Start: " + thread.getState());
//// Der Thread befindet sich jetzt entweder im Zustand RUNNABLE oder RUNNING.
////Die Ausgabe zeigt möglicherweise RUNNABLE an, da RUNNABLE sowohl Threads einschließt, die gerade ausgeführt werden, als auch solche, die bereit zur Ausführung sind, aber vom Scheduler noch nicht ausgewählt wurden.
//
//        Thread.sleep(500);
//        System.out.println("Zustand während Sleep: " + thread.getState());
//// Der main-Thread pausiert für 500 Millisekunden.
////Während dieser Zeit befindet sich der thread-Thread im Zustand TIMED_WAITING, weil Thread.sleep(2000) aufgerufen wurde.
////TIMED_WAITING ist der Zustand, wenn ein Thread für eine bestimmte Zeit schläft oder auf eine andere Aktion für eine feste Zeitdauer wartet.
//
//
//        thread.join();
//        System.out.println("Zustand nach Beendigung: " + thread.getState());
//        // thread.join() sorgt dafür, dass der main-Thread auf den Abschluss des thread-Threads wartet.
//        //Der main-Thread bleibt in join() blockiert, bis thread seine Ausführung beendet hat.
//        //Nachdem thread die System.out.println("Thread ist RUNNABLE")-Anweisung ausgegeben hat und seine Arbeit beendet, wechselt thread in den Zustand TERMINATED.
//        //Die letzte Ausgabe zeigt TERMINATED an, was bedeutet, dass der Thread vollständig abgeschlossen ist.
//    }
//}
















//
//
//// Enumerate:
//
//// Was ist Thread.enumerate()?
////Die statische Methode Thread.enumerate(Thread[] tarray) füllt ein Array von Thread-Objekten (tarray) mit den Referenzen auf alle derzeit aktiven Threads, die zum aktuellen Thread-Gruppenbaum gehören.
////Die Methode gibt die Anzahl der aktiven Threads zurück, die in das übergebene Array eingefügt wurden.
////Diese Methode ist nützlich, um alle laufenden Threads in einem bestimmten Bereich aufzulisten und Informationen über sie abzurufen (z. B. Thread-Name, ID, Status).
//
//public class App {
//    public static void main(String[] args) throws InterruptedException {
//        // Erstellen und Starten des ersten Threads
//        Thread first = new Thread(() -> { // Ein Thread namens first
//            try {
//                Thread.sleep(1000);  // Simuliere eine kurze Pause, Während dieser Zeit ist der Thread im Zustand TIMED_WAITING.
//
//                System.out.println("First Thread läuft");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//        first.setName("first");// Der Name des Threads wird mit first.setName("first"); auf "first" gesetzt.
//        first.start();
//        // first.start(); startet den Thread. Dadurch wechselt er von NEW in den Zustand RUNNABLE und wartet darauf, von der JVM geplant zu werden.
//
//        // Erstellen und Starten des zweiten Threads
//        Thread second = new Thread(() -> {// Ein Thread namens second
//            try {
//                Thread.sleep(1000);  // Simuliere eine kurze Pause
//                System.out.println("Second Thread läuft");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//        second.setName("second");// Der Name des Threads wird auf "second" gesetzt.
//        second.start();
//        // second.start(); startet den Thread. Jetzt sind beide Threads (first und second) parallel aktiv.
//
//        // Kurze Wartezeit, um sicherzustellen, dass die Threads aktiv sind
//        Thread.sleep(100);
//        // Der main-Thread pausiert kurz (Thread.sleep(100);), um sicherzustellen, dass die beiden Threads (first und second) tatsächlich gestartet sind und sich im Zustand TIMED_WAITING befinden, bevor Thread.enumerate() aufgerufen wird.
//
//        // Array zur Speicherung der Thread-Referenzen
//        Thread[] threads = new Thread[64];
//        // Ein Array threads mit einer Kapazität von 64 wird erstellt, um die aktiven Thread-Objekte zu speichern.
//
//        // Alle aktiven Threads ermitteln
//        int n = Thread.enumerate(threads);// Das Array wird als Parameter an Thread.enumerate() übergeben, um die aktiven Threads aufzufüllen. Thread.enumerate(threads) füllt das threads-Array mit den derzeit aktiven Thread-Objekten, die zum aktuellen Thread-Gruppenbaum gehören. Die Methode gibt die Anzahl der gefüllten Elemente zurück, die in der Variable n gespeichert wird.
//// n repräsentiert die Anzahl der aktiven Threads, die sich zum Zeitpunkt des Aufrufs in der Thread-Gruppe des Haupt-Threads befinden.
//
//
//
//        // Ausgabe aller aktiven Threads
//        System.out.println("Anzahl der aktiven Threads: " + n);
//        for (int i = 0; i < n; i++) {
//            Thread thread = threads[i];// threads[i] referenziert jeden aktiven Thread, der von Thread.enumerate() zurückgegeben wurde.
//
//            System.out.println("Thread-ID: " + thread.getId() + " Name: " + thread.getName());
//        }
//    }
//}
//// Für jeden Thread werden die folgenden Eigenschaften ausgegeben:
////Thread-ID (thread.getId()): Gibt die eindeutige ID des Threads zurück.
////Thread-Name (thread.getName()): Gibt den Namen des Threads zurück, den wir zuvor auf "first" und "second" gesetzt haben.
//
//
//
//
//
//// Verwendung im Debugging:
////Thread.enumerate() wird häufig für Debugging und Thread-Überwachung verwendet, um eine Übersicht über alle laufenden Threads zu erhalten.


























//
//// Das concurrent packages:
////
////Im folgenden werden einige wichtige Klassen des Pakets java.util.concurrent beschrieben.
////
////Was Nebenläufigkeit angeht, begnügte sich Java vor 1.5 mit dem Interface Runnable, der Klasse Thread und einigen wenigen Synchronisations-Mechanismen: mit volatile, synchronized und den Object-Methoden wait, notify und notifyAll. Es handelte sich hier also um ein sehr elegantes, flexibel nutzbares und schlankes Konzept.
////
////Concurrent Programming hieß daher aber immer auch, dass man eigene Klassen für wiederkehrende Aufgaben schreiben musste – Queue-Klassen für den Austausch von Produkten, Klassen zum Poolen von Threads etc.
////
////Das concurrent-Paket definiert nun eine Reihe von Standardklassen, die für solche Aufgaben verwendet werden können. Vieles von dem, was wir bislang selbst implementieren mussten, kommt also in Form fertiger Bibliotheks-Klassen daher.
//
//
//
//
//
//// 1. Atomic-Klassen (Seite 321)
////Beschreibung: Atomare Klassen ermöglichen es, Operationen auf Variablen atomar durchzuführen, ohne synchronized-Blöcke verwenden zu müssen.
////Klassenbeispiele: AtomicInteger, AtomicLong, AtomicBoolean.
//
//import java.util.concurrent.atomic.AtomicInteger;
//// AtomicInteger ist eine spezielle Klasse, die zur Behandlung von Ganzzahlen in einem Mehrthreadszenario verwendet wird, um atomare Operationen durchzuführen. Eine "atomare" Operation bedeutet, dass sie unteilbar ist und es keine Zwischenzustände gibt, auf die andere Threads zugreifen können.
//
//public class App {
//    private static AtomicInteger counter = new AtomicInteger(0);// Hier wird ein statisches (static) AtomicInteger namens counter initialisiert, mit dem Startwert 0. Da es statisch ist, teilen sich alle Instanzen der Klasse denselben Zähler.
//
//    public static void main(String[] args) {// der Einstiegspunkt des Programms
//        Runnable incrementTask = () -> {// Hier wird eine anonyme Klasse Runnable erstellt, die eine Aufgabe definiert, die von mehreren Threads ausgeführt wird.
//            for (int i = 0; i < 1000; i++) {// 1000 mal durchführung der Schleife, und in jeder Iteration wird der Wert des counter um 1 erhöht.
//                counter.incrementAndGet(); // Die Methode incrementAndGet() erhöht den Wert des AtomicInteger atomar, was bedeutet, dass auch bei paralleler Ausführung durch mehrere Threads keine race conditions auftreten.Die Methode incrementAndGet() erhöht den Wert des AtomicInteger atomar, was bedeutet, dass auch bei paralleler Ausführung durch mehrere Threads keine race conditions auftreten.
//            }
//        };
//// Zwei Threads (thread1 und thread2) werden erstellt, beide mit derselben Aufgabe (incrementTask), die jeweils den counter 1000 Mal erhöhen soll.
//        Thread thread1 = new Thread(incrementTask);
//        Thread thread2 = new Thread(incrementTask);
//        thread1.start();
//        thread2.start();// startet die Threads und sie beginnen, ihre Aufgaben auszuführen
//
//        try {// join() sorgt dafür, dass der Hauptthread (der die main Methode ausführt) wartet, bis thread1 und thread2 ihre Arbeit abgeschlossen haben.
////Ohne das join()-Kommando würde der Hauptthread möglicherweise weiterlaufen und den Zähler ausgeben, bevor die Threads ihre Arbeit beendet haben.
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Finaler Counter-Wert: " + counter.get());
//    }// Da beide Threads den Zähler jeweils 1000 Mal erhöhen, sollte der Endwert 2000 sein.
//
//}
//
//// Ablauf des Programms:
////Zwei Threads werden gestartet, die beide gleichzeitig die gleiche Aufgabe (Zählererhöhung) ausführen.
////Dank der Verwendung von AtomicInteger sind die Erhöhungen atomar, sodass es keine Probleme mit der Datenkonsistenz gibt, selbst wenn die Threads parallel arbeiten.
////Der Hauptthread wartet, bis beide Threads ihre Aufgaben erledigt haben, bevor er den Endwert des Zählers ausgibt.
////Das Ergebnis sollte 2000 sein, da beide Threads je 1000 Mal den Zähler erhöhen (1000 + 1000 = 2000).
//











//// 2. ConcurrentHashMap (Seite 323)
////Beschreibung: Eine threadsichere Variante der HashMap, die mehrere Threads gleichzeitig lesen und schreiben lässt, ohne die Map zu blockieren.
////Vorteil: Bietet bessere Leistung als eine vollständig synchronisierte HashMap, da sie feinkörnige Sperren auf Bucket-Ebene verwendet.
//
//
//
//import java.util.concurrent.ConcurrentHashMap;
//// ConcurrentHashMap ist eine spezielle, threadsichere Version der HashMap, die für gleichzeitige Lese- und Schreibzugriffe durch mehrere Threads optimiert ist.
//
//public class App {
//    private static ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();// Hier wird eine statische (static) ConcurrentHashMap mit dem Namen map erstellt.
////    Die Map speichert Schlüssel-Wert-Paare vom Typ String (Schlüssel) und Integer (Werte).
//
//
//    public static void main(String[] args) {
//        map.put("A", 1);
//        map.put("B", 2);// Die Map wird mit zwei Schlüssel-Wert-Paaren initialisiert: "A" -> 1 und "B" -> 2.
////        Diese Einträge werden in die ConcurrentHashMap eingefügt, bevor die Threads gestartet werden.
//
//        Runnable task = () -> {// eine anonyme Klasse Runnable erstellt die eine Aufgabe definiert, die von mehreren Threads ausgeführt wird.
//            map.putIfAbsent("C", 3);// Fügt das Schlüssel-Wert-Paar "C" -> 3 in die Map ein, aber nur, wenn der Schlüssel "C" nicht bereits vorhanden ist.
//            map.computeIfPresent("A", (key, value) -> value + 1);
//        };// Aktualisiert den Wert des Schlüssels "A" nur, wenn der Schlüssel bereits vorhanden ist. Der neue Wert wird berechnet, indem der aktuelle Wert um 1 erhöht wird (value + 1).
//
//        Thread thread1 = new Thread(task);
//        Thread thread2 = new Thread(task);
//        thread1.start();
//        thread2.start();
//        // Beide Threads werden gestartet und führen die Aufgabe parallel aus.
//
//        try {
//            thread1.join();
//            thread2.join();
//            // join() sorgt dafür, dass der Hauptthread (der die main Methode ausführt) wartet, bis thread1 und thread2 ihre Arbeit abgeschlossen haben.
//            //Ohne join() könnte es passieren, dass die main-Methode die Map ausgibt, bevor die Threads ihre Aufgaben beendet haben.
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Finale Map: " + map);
//    }// Da beide Threads dieselben Operationen ausführen, könnte der Inhalt der Map je nach Ausführungsreihenfolge leicht variieren.
//}
//
//// Ablauf des Programms:
////Die Map wird initial mit zwei Einträgen erstellt: "A" -> 1 und "B" -> 2.
////Zwei Threads werden gestartet, die dieselbe Aufgabe ausführen:
////Füge das Paar "C" -> 3 hinzu, wenn "C" noch nicht in der Map ist.
////Erhöhe den Wert von "A" um 1, falls "A" bereits vorhanden ist.
////Dank der Verwendung der ConcurrentHashMap sind alle Operationen threadsicher und atomar.
////Der Hauptthread wartet, bis beide Threads ihre Aufgaben abgeschlossen haben.
////Die finale Map wird ausgegeben.
//








//
//
//
//
//
////3. CopyOnWriteArrayList (Seite 324)
////Beschreibung: Eine spezielle Liste, die bei jeder Modifikation eine Kopie des internen Arrays erstellt.
////Verwendung: Ideal für Situationen, in denen Leseoperationen überwiegen und seltene Änderungen toleriert werden können, wie z.B. Listener-Registrierungen.
////        Nachteil: Erhöhte Kosten bei Schreiboperationen.
//
//
//import java.util.List;
//import java.util.concurrent.CopyOnWriteArrayList;
//// CopyOnWriteArrayList ist eine spezielle Liste, die eine Kopie des internen Arrays bei jeder Schreiboperation (z. B. Hinzufügen oder Entfernen eines Elements) erstellt.
////Diese Implementierung ist threadsicher und ideal für Szenarien, in denen Leseoperationen häufiger als Schreiboperationen sind, da die Leseoperationen keinen Lock benötigen.
//
//public class App {
//    private static List<String> list = new CopyOnWriteArrayList<>();
//    // Die Liste speichert String-Werte und ist threadsicher.
//
//    public static void main(String[] args) {
//        list.add("A");
//        list.add("B");
//        // Die Liste wird mit zwei Elementen initialisiert: "A" und "B".
//        //Diese Einträge werden in die CopyOnWriteArrayList eingefügt, bevor die Threads gestartet werden.
//
//        Runnable writeTask = () -> {// eine anonyme Klasse Runnable erstellt, die eine Schreibaufgabe (writeTask) definiert, die von einem Thread ausgeführt wird.
//            list.add("C");
//            list.add("D");
//        };// die Aufgabe fügt zwei neue Elemente zur Liste hinzu: "C" und "D".
////        Bei jeder dieser Schreiboperationen erstellt die CopyOnWriteArrayList eine neue Kopie der Liste, um sicherzustellen, dass Leseoperationen währenddessen nicht beeinträchtigt werden.
//
//
//                Runnable readTask = () -> {
//            for (String s : list) {
//                System.out.println("Gelesen: " + s);
//            }
//        };
//                // Hier wird eine anonyme Klasse Runnable erstellt, die eine Leseaufgabe (readTask) definiert, die von einem anderen Thread ausgeführt wird.
//        //Die Aufgabe durchläuft die Liste und gibt jedes Element aus.
//        //Die Verwendung der CopyOnWriteArrayList stellt sicher, dass die Iteration über die Liste auch dann korrekt funktioniert, wenn parallel eine Schreiboperation stattfindet.
//
//        // 8. Erstellen und Starten von zwei Threads:
//        Thread thread1 = new Thread(writeTask);
//        Thread thread2 = new Thread(readTask);
//        thread1.start();
//        thread2.start();
//
//        // 9. Warten auf die Fertigstellung der Threads:
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Finale Liste: " + list);
//    }
//}// Da die CopyOnWriteArrayList bei jeder Schreiboperation eine neue Kopie erstellt, sind alle Leseoperationen, die währenddessen stattfinden, konsistent und threadsicher.
//
//
////Ablauf des Programms:
////Die Liste wird initial mit zwei Einträgen erstellt: "A" und "B".
////Zwei Threads werden gestartet:
////Der erste Thread (writeTask) fügt zwei neue Elemente ("C" und "D") zur Liste hinzu.
////Der zweite Thread (readTask) liest die Liste und gibt jedes Element aus.
////Da CopyOnWriteArrayList bei jeder Modifikation eine Kopie der Liste erstellt, kann der Lesevorgang während des Hinzufügens von Elementen sicher ausgeführt werden.
////Der Hauptthread wartet, bis beide Threads ihre Aufgaben beendet haben.
////Die finale Liste wird ausgegeben.
////

// Besonderheiten von CopyOnWriteArrayList:
////Leseoperationen sind schnell: Da die Liste nicht gesperrt wird, sind Lesevorgänge schnell und ungestört.
//Hohe Kosten bei Schreiboperationen: Da bei jeder Modifikation eine neue Kopie erstellt wird, sind Schreiboperationen teuer und nicht ideal für häufige Änderungen.
////
////









//
//// 4. ReentrantLock (Seite 327)
////Beschreibung: Ein explizites Sperrobjekt, das mehr Kontrolle über Sperren bietet als die synchronized-Schlüsselwörter.
////Methoden: lock(), unlock(), tryLock().
////Vorteil: Kann rekursiv vom selben Thread mehrfach gesperrt werden, ohne in einen Deadlock zu geraten.
//
//
//
//import java.util.concurrent.locks.ReentrantLock;
//// ReentrantLock ist eine explizite Sperre (Lock), die als Alternative zum synchronized-Schlüsselwort verwendet wird und mehr Kontrolle über die Sperrung bietet.
////Diese Art von Sperre erlaubt einem Thread, sie mehrfach zu erwerben, ohne in einen Deadlock zu geraten. Das bedeutet, derselbe Thread kann die Sperre wiederholt sperren und entsperren, solange es ausgeglichen ist (jede lock() muss durch ein unlock() ausgeglichen werden).
//
//public class App {
//    private static ReentrantLock lock = new ReentrantLock();
//    // Hier wird ein statisches (static) ReentrantLock namens lock erstellt. Dieses Lock-Objekt wird verwendet, um den Zugriff auf die Ressource counter zu steuern.
//    private static int counter = 0;// Der statische counter ist ein Ganzzahlenzähler, der von mehreren Threads sicher verändert werden soll.
//
//
//    public static void main(String[] args) {
//        Runnable task = () -> {//  eine anonyme Klasse Runnable erstellt
//            lock.lock();//  Sperrt das lock, bevor die kritische Operation (Erhöhung des Zählers) ausgeführt wird. Nur ein Thread kann das lock gleichzeitig erwerben.
//            try {// Der try-Block enthält die kritische Operation (counter++). Dies stellt sicher, dass die Sperre auch dann freigegeben wird, wenn eine Ausnahme auftritt.
//                counter++;// Der counter wird um 1 erhöht. Da das lock erworben wurde, kann kein anderer Thread diese Operation gleichzeitig ausführen.
//                System.out.println("Counter erhöht: " + counter);
//            } finally {
//                lock.unlock();//  Gibt die Sperre im finally-Block frei. Der finally-Block stellt sicher, dass die Sperre auch dann freigegeben wird, wenn ein Fehler im try-Block auftritt.
//            }
//        };// Innerhalb der Aufgabe wird nach der Erhöhung des Zählers der aktuelle Zählerwert ausgegeben. Diese Ausgabe erfolgt für jeden Thread, der die Erhöhung durchführt.
////        Da das lock verwendet wird, wird sichergestellt, dass es keine race conditions gibt und der Zähler korrekt erhöht wird.
//
//// 6. Erstellen und Starten von zwei Threads:
//        Thread thread1 = new Thread(task);
//        Thread thread2 = new Thread(task);
//        thread1.start();
//        thread2.start();
//    }
//}// Da die Erhöhung des Zählers in einen lock-Block eingebettet ist, wird garantiert, dass nur ein Thread die Erhöhung gleichzeitig ausführen kann.
//
////
////
////Ablauf des Programms:
////Ein statischer Zähler (counter = 0) und eine ReentrantLock-Instanz (lock) werden erstellt.
////Zwei Threads werden gestartet, die dieselbe Aufgabe ausführen: den counter um 1 zu erhöhen.
////Beide Threads versuchen, den Zähler zu erhöhen. Bevor sie dies tun, sperrt jeder Thread das lock mit lock.lock().
////Nur der Thread, der das lock erfolgreich sperrt, kann die Erhöhung ausführen und den Wert des Zählers ändern.
////Nach der Erhöhung gibt der Thread das lock mit lock.unlock() wieder frei.
////Der zweite Thread erhält dann das lock und führt die gleiche Operation aus.
////Beide Threads geben nacheinander den aktuellen Zählerwert aus.


// Besonderheiten von ReentrantLock:
//Explizite Sperre: ReentrantLock bietet mehr Kontrolle über Sperren als das synchronized-Schlüsselwort. Sie können explizit Sperren mit lock.lock() und lock.unlock() erwerben und freigeben.
//Mit ReentrantLock können wir Methoden wie tryLock() verwenden, um zu prüfen, ob eine Sperre verfügbar ist, ohne blockierend zu warten.
//Derselbe Thread kann die Sperre mehrfach erwerben, solange er sie korrekt mit unlock() freigibt. Dies wird "reentrant" genannt.
//ReentrantLock bietet bessere Leistung als synchronized, wenn die Threads häufig in die kritische Region eintreten und sie wieder verlassen müssen.





//
//
//
//
//
//// 5. ReentrantReadWriteLock (Seite 330)
//// Beschreibung: Bietet getrennte Sperren für Lese- und Schreiboperationen.
////Verwendung: Ermöglicht mehreren Threads gleichzeitig lesenden Zugriff, blockiert aber alle anderen Zugriffe, wenn ein Thread schreibend zugreift.
//
//
//import java.util.concurrent.locks.ReentrantReadWriteLock;
//// Der ReentrantReadWriteLock unterscheidet sich vom ReentrantLock dadurch, dass er zwei verschiedene Sperren bereitstellt:
////readLock() für Lesezugriffe (kann von mehreren Threads gleichzeitig erworben werden).
////writeLock() für Schreibzugriffe (kann nur von einem Thread gleichzeitig erworben werden und blockiert alle Lese- und Schreibzugriffe).
//
//public class App {
//    private static ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
//    private static String message = "Hello";// Zusätzlich gibt es eine statische Zeichenkette (message), die die gemeinsam genutzte Ressource darstellt, auf die mehrere Threads zugreifen werden.
//
//    public static void main(String[] args) {
//        Runnable writeTask = () -> {// eine anonyme Klasse Runnable erstellt, die eine Schreibaufgabe (writeTask) definiert, die von einem Thread ausgeführt wird.
//            lock.writeLock().lock();// Sperrt die Schreibsperre, bevor die Änderung durchgeführt wird. Dies blockiert alle anderen Lese- und Schreibzugriffe.
//
//            try {
//                message = message.concat(" World");
//                System.out.println("Geschrieben: " + message);
//                // Der try-Block enthält die Änderung der Nachricht (message = message.concat(" World")). Dies stellt sicher, dass die Sperre auch dann freigegeben wird, wenn eine Ausnahme auftritt.
//            } finally {
//                lock.writeLock().unlock();
//            }// Gibt die Schreibsperre im finally-Block frei. Dadurch können andere Threads (Leser oder Schreiber) auf die Nachricht zugreifen.
//        };
//
//        Runnable readTask = () -> {// eine anonyme Klasse Runnable erstellt, die eine Leseaufgabe (readTask) definiert
//            lock.readLock().lock();// Sperrt die Lesesperre, bevor die Nachricht gelesen wird. Mehrere Threads können die Lesesperre gleichzeitig erwerben, solange kein Schreibzugriff aktiv ist.
//            try {
//                System.out.println("Gelesen: " + message);
//            } finally {
//                lock.readLock().unlock();// Gibt die Lesesperre im finally-Block frei.
//            }
//        };// Wichtig: Immer lock.readLock().unlock() im finally-Block aufrufen, um sicherzustellen, dass die Sperre freigegeben wird, auch wenn eine Ausnahme auftritt.
//
//// 7. Erstellen und Starten von zwei Threads:
//        Thread thread1 = new Thread(writeTask);
//        Thread thread2 = new Thread(readTask);
//        thread1.start();
//        thread2.start();
//    }
//}
//
////Erklärung der Ausgabe:
////Der Schreibthread (thread1) erwirbt das writeLock, modifiziert die message von "Hello" zu "Hello World" und gibt die Änderung aus.
////Der Lesethread (thread2) wartet, bis die Schreiboperation abgeschlossen ist, und erwirbt danach das readLock.
////thread2 liest die aktuelle Nachricht ("Hello World") und gibt diese aus.
//
//


//
//
////
//
//// 6. Conditions (Seite 332)
//// Beschreibung: Eine Condition ermöglicht es, komplexere Signalisierungsmechanismen zu implementieren, wie z.B. await(), signal(), signalAll().
////Verwendung: Eine Condition wird typischerweise in Kombination mit einem Lock-Objekt verwendet.
//
//
//
//
//import java.util.concurrent.locks.Condition;// ermöglicht es, komplexere Signalisierungsmechanismen zu implementieren, wie z. B. das Warten (await()) auf eine Bedingung und das Aufwecken (signal() und signalAll()) von wartenden Threads.
//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;
//
//public class App {
//
//    private static final int BUFFER_SIZE = 10; // Dies ist die maximale Anzahl an Elementen, die der Puffer (Buffer) speichern kann. Der Wert ist hier auf 10 festgelegt.
//    private int count = 0; // Anzahl der Elemente im Buffer
//    private final Lock lock = new ReentrantLock(); // Ein ReentrantLock-Objekt, das die Sperre für die Methoden produce() und consume() bereitstellt.
//    private final Condition bufferNotFull = lock.newCondition(); // Eine Condition, die signalisiert, dass der Puffer nicht mehr voll ist, und darauf wartet, dass der Produzent Elemente hinzufügen kann.
//    private final Condition bufferNotEmpty = lock.newCondition(); // Eine Condition, die signalisiert, dass der Puffer nicht leer ist, und darauf wartet, dass der Konsument Elemente entnehmen kann.
//
//    public static void main(String[] args) {
//        App example = new App();// eine Instanz unserer Klasse
//
//        // Producer-Thread
//        Thread producer = new Thread(() -> {
//            for (int i = 0; i < 20; i++) { // Produziert 20 Elemente
//                example.produce();
//            }
//        }, "Producer");// Ein Thread, der 20 Elemente produziert
//
//        // Consumer-Thread
//        Thread consumer = new Thread(() -> {
//            for (int i = 0; i < 20; i++) { // Konsumiert 20 Elemente
//                example.consume();
//            }
//        }, "Consumer");// Ein Thread, der 20 Elemente konsumiert
//
//        // 6. Starten der Threads:
//        producer.start();
//        consumer.start();
//
//        try {// 7. Warten auf die Fertigstellung der Threads:
//            producer.join();
//            consumer.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    // Methode zum Produzieren von Elementen
//    public void produce() {// Diese Methode fügt ein Element in den Puffer ein:
//
//        lock.lock();// Sperrt das lock, bevor die kritische Operation (Hinzufügen eines Elements) ausgeführt wird.
//        try {
//            while (count == BUFFER_SIZE) { // Überprüft, ob der Puffer voll ist. Wenn ja, muss der Produzent warten, bis ein Konsument ein Element entfernt.
//                System.out.println("Buffer voll. " + Thread.currentThread().getName() + " wartet...");
//                bufferNotFull.await(); // Der Produzent wartet, bis die Condition bufferNotFull signalisiert wird (d. h., der Puffer ist nicht mehr voll).
//            }
//            count++; // Ein Element wird produziert
//            System.out.println(Thread.currentThread().getName() + " produziert ein Element. Aktueller Buffer: " + count);
//            bufferNotEmpty.signal(); // Signalisiert der bufferNotEmpty-Condition, dass der Puffer nicht mehr leer ist, sodass der Konsument weitermachen kann.
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//        } finally {
//            lock.unlock();// Gibt die Sperre frei.
//        }
//    }
//
//    // Methode zum Konsumieren von Elementen
//    public void consume() {// Diese Methode entfernt ein Element aus dem Puffer:
//        lock.lock();// Sperrt das lock, bevor die kritische Operation (Entfernen eines Elements) ausgeführt wird.
//        try {
//            while (count == 0) { // Überprüft, ob der Puffer leer ist. Wenn ja, muss der Konsument warten, bis der Produzent ein neues Element hinzufügt.
//                System.out.println("Buffer leer. " + Thread.currentThread().getName() + " wartet...");
//                bufferNotEmpty.await(); // Der Konsument wartet, bis die Condition bufferNotEmpty signalisiert wird (d. h., der Puffer ist nicht mehr leer).
//            }
//            count--; // Ein Element wird konsumiert
//            System.out.println(Thread.currentThread().getName() + " konsumiert ein Element. Aktueller Buffer: " + count);
//            bufferNotFull.signal(); // Signalisiert der bufferNotFull-Condition, dass der Puffer nicht mehr voll ist, sodass der Produzent weitermachen kann.
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//        } finally {
//            lock.unlock();// Gibt die Sperre frei.
//        }
//    }
//}
////Ablauf des Programms:
////Zwei Threads werden gestartet: ein Produzent und ein Konsument.
////Der Produzent fügt Elemente zum Puffer hinzu, wenn dieser nicht voll ist, und signalisiert dem Konsumenten, wenn der Puffer nicht mehr leer ist.
////Der Konsument entfernt Elemente aus dem Puffer, wenn dieser nicht leer ist, und signalisiert dem Produzenten, wenn der Puffer nicht mehr voll ist.
////Die Synchronisation wird durch die Condition-Objekte bufferNotFull und bufferNotEmpty gesteuert.
////
//
//
////






//
//// 7. ArrayBlockingQueue (Seite 336)
////Beschreibung: Eine thread-sichere, feste Größe umfassende Warteschlange, die darauf wartet, dass Elemente hinzugefügt oder entfernt werden.
////Verwendung: Häufig in Producer-Consumer-Mustern verwendet.
////Methoden: put(), take() – blockieren den Aufrufer, wenn die Warteschlange voll bzw. leer ist.
//
//
//import java.util.concurrent.BlockingQueue;
//// BlockingQueue ist ein Interface, das eine threadsichere Warteschlange definiert, die Elemente blockierend hinzufügen und entnehmen kann.
//import java.util.concurrent.ArrayBlockingQueue;
//// ArrayBlockingQueue ist eine Implementierung von BlockingQueue, die eine wartende Warteschlange mit einer festen Kapazität bietet.
//
//public class App {
//    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);// Hier wird eine statische ArrayBlockingQueue mit einer festen Kapazität von 10 Elementen erstellt. Die Warteschlange (queue) speichert Integer-Werte und ist threadsicher.Die Größe ist festgelegt, sodass die Warteschlange maximal 10 Elemente aufnehmen kann. Sobald sie voll ist, blockieren put()-Aufrufe, bis Platz frei wird.
//
//    public static void main(String[] args) {
//        Runnable producer = () -> {// eine anonyme Klasse Runnable erstellt
//            for (int i = 0; i < 5; i++) {// Konsumiert exakt 5 Elemente
//                try {
//                    queue.put(i);// Fügt das Element i in die Warteschlange ein. Wenn die Warteschlange voll ist (10 Elemente), blockiert der Aufruf, bis Platz frei wird.
//                    System.out.println("Produziert: " + i);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        };
//
//        Runnable consumer = () -> {// eine anonyme Klasse Runnable erstellt, Die Aufgabe entnimmt kontinuierlich Elemente aus der Warteschlange und verarbeitet sie:
//
//            while (true) {// Endlosschleife
//                try {
//                    Integer value = queue.take();// Nimmt ein Element aus der Warteschlange. Wenn die Warteschlange leer ist, blockiert der Aufruf, bis ein Element verfügbar ist.
//                    System.out.println("Konsumiert: " + value);// Gibt die Nummer des gerade konsumierten Elements aus.
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        };// (while (true)): Da der Konsument in einer Endlosschleife arbeitet, wird er immer auf neue Elemente warten und diese konsumieren, solange das Programm läuft.
//
//        Thread producerThread = new Thread(producer);
//        Thread consumerThread = new Thread(consumer);
//        producerThread.start();
//        consumerThread.start();
//    }
//}
//
////
////Erklärung der Ausgabe:
////Der Produzent (producerThread) fügt die Zahlen 0 bis 4 in die Warteschlange ein, während der Konsument (consumerThread) diese Zahlen nacheinander entnimmt.
////Da die Konsumationsrate und die Produktionsrate in diesem Fall gleich sind, wird jedes produzierte Element direkt vom Konsumenten aufgenommen.
//
//











////8. Executor mit Runnables (Seite 338)
////Beschreibung: Ein Executor-Dienst bietet eine Möglichkeit, Aufgaben in einem Thread-Pool auszuführen.
////Methoden: execute(Runnable) – führt die übergebene Aufgabe in einem separaten Thread aus.
//
//
//
//
//import java.util.concurrent.ExecutorService;
//// ist ein Interface, das die Ausführung von Aufgaben in einem Thread-Pool steuert. Es bietet Methoden zum Starten, Überwachen und Beenden von Threads.
//import java.util.concurrent.Executors;// Executors ist eine Hilfsklasse, die statische Methoden zur Erstellung von ExecutorService-Instanzen bereitstellt.
//
//
//public class App {
//    public static void main(String[] args) {
//        ExecutorService executor = Executors.newFixedThreadPool(2);// Hier wird ein ExecutorService erstellt, der eine feste Anzahl von Threads verwendet (hier 2). newFixedThreadPool(2) erstellt einen ExecutorService mit genau 2 Threads.
//        // Thread-Pool: Ein Thread-Pool ist eine Gruppe von Threads, die wiederverwendet werden, um mehrere Aufgaben auszuführen, anstatt für jede Aufgabe einen neuen Thread zu erstellen.
//        // Warum 2?: Die Anzahl 2 bedeutet, dass maximal zwei Aufgaben gleichzeitig ausgeführt werden können. Zusätzliche Aufgaben müssen warten, bis ein Thread im Pool verfügbar ist.
//
//        Runnable task1 = () -> System.out.println("Task 1 läuft");
//        Runnable task2 = () -> System.out.println("Task 2 läuft");
//
//        executor.execute(task1);
//        executor.execute(task2);
//        // Diese Methode übergibt task1 und 2 an den ExecutorService, der dann die Aufgabe in einem der Threads im Pool ausführt. Da der Thread-Pool 2 Threads enthält, können task1 und task2 gleichzeitig ausgeführt werden.
//        // Wäre der Thread-Pool kleiner (z. B. newFixedThreadPool(1)), müsste eine der beiden Aufgaben warten, bis der erste Thread frei wird.
//
//
//        executor.shutdown();// weist den ExecutorService an, keine neuen Aufgaben mehr anzunehmen. Es ist wichtig, shutdown() aufzurufen, um sicherzustellen, dass der ExecutorService nach dem Abschluss aller Aufgaben beendet wird und keine Ressourcen verschwendet werden. Ohne shutdown() würde das Programm möglicherweise weiterlaufen, da der ExecutorService weiterhin auf neue Aufgaben warten könnte.
//
//    }
//}
////
////Da die Nachrichten sehr einfach sind, ist es unwahrscheinlich, dass eine Aufgabe vor der anderen beendet wird. Die genaue Reihenfolge kann jedoch variieren, z. B.:

////Ablauf des Programms:
////Ein ExecutorService mit 2 Threads wird erstellt.
////Zwei Runnable-Aufgaben (task1 und task2) werden definiert, die einfache Nachrichten ausgeben.
////Beide Aufgaben werden an den ExecutorService übergeben.
////Der ExecutorService führt beide Aufgaben gleichzeitig aus (da er zwei Threads hat).
////Der ExecutorService wird mit shutdown() beendet, nachdem alle eingereichten Aufgaben ausgeführt wurden.
//














////9. Executor mit Callables (Seite 340)
////Beschreibung: Callable ähnelt Runnable, aber es kann einen Wert zurückgeben und eine Exception werfen.
////Verwendung: Wird in Kombination mit Future verwendet, um asynchrone Aufgaben zu behandeln.
//
//
//import java.util.concurrent.*;
//// Hier werden Klassen aus dem Paket java.util.concurrent importiert, darunter:
////ExecutorService: Ein Interface zur Verwaltung von Threads.
////Executors: Eine Hilfsklasse zur Erstellung von ExecutorService-Instanzen.
////Callable: Ein Interface ähnlich zu Runnable, das jedoch einen Rückgabewert liefern und eine Ausnahme werfen kann.
////Future: Ein Interface, das das Ergebnis einer asynchronen Aufgabe (z. B. Callable) repräsentiert.
////TimeUnit: Eine Klasse zur Handhabung von Zeit- und Verzögerungsoperationen (z. B. TimeUnit.SECONDS.sleep()).
//
//public class App {
//    public static void main(String[] args) {
//        ExecutorService executor = Executors.newSingleThreadExecutor();// Hier wird ein ExecutorService mit einem einzigen Thread erstellt. newSingleThreadExecutor() erstellt einen ExecutorService, der immer nur einen Thread gleichzeitig ausführt. Dies bedeutet, dass alle Aufgaben nacheinander in einem einzigen Thread ausgeführt werden, was nützlich ist, wenn Aufgaben in einer bestimmten Reihenfolge verarbeitet werden sollen.
//        // Alternative Thread-Pools: Neben newSingleThreadExecutor() gibt es andere Optionen wie newFixedThreadPool() (mit mehreren Threads) oder newCachedThreadPool() (mit dynamisch erstellten Threads).
//
//
//        Callable<Integer> task = () -> {
//            TimeUnit.SECONDS.sleep(1);// Die Aufgabe schläft für 1 Sekunde
//            return 123;// Danach gibt die Aufgabe den Wert 123 zurück
//        };
//        // Callable ist eine funktionale Schnittstelle, ähnlich wie Runnable, aber mit einigen Unterschieden:
//        // Rückgabewert: Callable liefert einen Rückgabewert vom Typ Integer.
//        // Kann eine Ausnahme werfen
//
//        // Warum Callable verwenden?
//        //Callable ist nützlich, wenn die Aufgabe ein Ergebnis zurückgeben soll oder die Möglichkeit bestehen muss, Ausnahmen zu behandeln.
//        //Bei Runnable-Aufgaben gibt es keine Rückgabewerte und keine Unterstützung für geprüfte Ausnahmen.
//
//        Future<Integer> future = executor.submit(task);
//        System.out.println("Task submitted");
//        // Die Methode submit(task) übergibt die Callable-Aufgabe (task) an den ExecutorService zur Ausführung.
////Sie gibt ein Future-Objekt zurück, das das Ergebnis der asynchronen Berechnung repräsentiert.
////Future<Integer> future speichert das Ergebnis der Callable-Aufgabe.
////submit() startet die Aufgabe in einem separaten Thread und gibt sofort ein Future zurück, mit dem der Aufrufer auf das Ergebnis warten kann.
//
//        try {
//            System.out.println("Ergebnis: " + future.get());// future.get(): Wartet (blockierend), bis das Ergebnis der Callable-Aufgabe verfügbar ist.
//
//        } catch (InterruptedException | ExecutionException e) {
//            e.printStackTrace();
//        }
//
//        executor.shutdown();
//    }
//}
////Was ist ein Future?
////Future bietet Methoden zum Abrufen (get()), Abbrechen (cancel()), und Prüfen (isDone()) der Aufgabe.
////In diesem Fall verwenden wir get(), um das Ergebnis abzurufen, nachdem die Aufgabe beendet ist.
//
////
////
////6. Ausgabe: "Task submitted"
////Diese Zeile wird sofort nach dem Start der Callable-Aufgabe ausgegeben.
////Da die Callable-Aufgabe asynchron (parallel) ausgeführt wird, läuft die Hauptmethode (main) weiter, während die Callable-Aufgabe auf die Fertigstellung wartet.
////Das bedeutet, dass die Nachricht "Task submitted" ausgegeben wird, bevor die Callable-Aufgabe abgeschlossen ist.
//
//
//// Ablauf des Programms:
////Ein ExecutorService mit einem einzigen Thread wird erstellt.
////Eine Callable-Aufgabe (task) wird definiert, die 1 Sekunde schläft und danach 123 zurückgibt.
////Die Callable-Aufgabe wird an den ExecutorService übergeben (executor.submit()).
////Die Nachricht "Task submitted" wird sofort ausgegeben.
////future.get() wird aufgerufen und wartet, bis das Ergebnis der Aufgabe verfügbar ist (123).
////Das Ergebnis (123) wird ausgegeben.
////Der ExecutorService wird mit shutdown() beendet.
//



////
//
////10. Fork-Join Framework (Seite 342)
//
////- **Beschreibung:** Ein Framework, das das "Teile-und-Herrsche"-Prinzip verwendet, um große Aufgaben in kleinere aufzuspalten und in parallelen Threads auszuführen.
////- **Verwendung:** Geeignet für rekursive Aufgaben wie das Sortieren von Arrays.
//
////fork(): Teilt eine Aufgabe in kleinere Teilaufgaben auf und führt sie parallel aus.
////join(): Wartet, bis die Teilaufgaben abgeschlossen sind, und kombiniert deren Ergebnisse.
//
//import java.util.concurrent.RecursiveTask;// Eine abstrakte Klasse, die von Aufgaben verwendet wird, die einen Rückgabewert liefern. Sie wird verwendet, um die Logik der Teilung (fork()) und Zusammenführung (join()) zu definieren.
//import java.util.concurrent.ForkJoinPool;// Ein spezieller Thread-Pool, der für das Fork-Join-Framework entwickelt wurde. Er verwaltet die Threads, die die rekursiven Aufgaben ausführen.
//
//public class App extends RecursiveTask<Integer> {
//    // diese klasse ist eine klasse die von RecursiveTask<Integer> erbt.
//    // RecursiveTask wird verwendet, wenn eine Aufgabe einen Rückgabewert benötigt.
//    //Es gibt auch RecursiveAction, die verwendet wird, wenn keine Rückgabe benötigt wird (ähnlich wie Runnable).
//    //Der Rückgabewert ist vom Typ Integer, weil diese Aufgabe eine Summe berechnet und diese als Ergebnis zurückgibt.
//
//    private int start, end;
////    start und end definieren den Bereich der Zahlen, die diese Instanz verarbeiten soll.
////    Beispiel: Wenn start = 1 und end = 20, berechnet diese Aufgabe die Summe aller Zahlen von 1 bis 20.
//
//    // 4. Konstruktor der Klasse:
//    public App(int start, int end) {
//        this.start = start;
//        this.end = end;
//    }// initialisiert den Bereich (start und end) für die Aufgabe.
//
//    @Override
//    protected Integer compute() {// die Methode, die von RecursiveTask überschrieben wird. Hier wird die Logik für das Aufteilen und Zusammenführen der Aufgaben implementiert.
//        if (end - start <= 5) {
//            int sum = 0;
//            for (int i = start; i <= end; i++) {
//                sum += i;
//            }
//            return sum;
//            // Wenn der Bereich (end - start) kleiner oder gleich 5 ist, wird die Summe direkt berechnet.
//            //Ein Bereich von 5 oder weniger ist klein genug, um die Berechnung ohne weiteres Aufteilen durchzuführen.
//            //sum: Summiert die Zahlen von start bis end und gibt die Summe zurück.
//
//            // Aufteilen der Aufgabe (else):
//        } else {
//            int mid = (start + end) / 2;
//            App leftTask = new App(start, mid);
//            App rightTask = new App(mid + 1, end);
//            leftTask.fork();
//            return rightTask.compute() + leftTask.join();
//        }
//    }
//    // Wenn der Bereich größer als 5 ist, wird die Aufgabe weiter unterteilt:
//    // Berechnung des Mittelpunkts (mid): mid = (start + end) / 2.
//    //Aufteilen der Aufgabe in zwei Teilaufgaben:
//    //App leftTask = new App(start, mid);
//    //App rightTask = new App(mid + 1, end);
//    //leftTask.fork(): Startet die linke Teilaufgabe (leftTask) parallel.
//    //rightTask.compute(): Führt die rechte Teilaufgabe rekursiv aus.
//    //Zusammenführen der Ergebnisse: return rightTask.compute() + leftTask.join();
//    //Die Methode leftTask.join() wartet, bis die linke Teilaufgabe abgeschlossen ist, und gibt deren Ergebnis zurück.
//    //Die Summe der beiden Teilaufgaben (leftTask und rightTask) wird zurückgegeben.
//
//    public static void main(String[] args) {
//        ForkJoinPool pool = new ForkJoinPool();// Erstellt einen ForkJoinPool, der für die Verwaltung und Ausführung der Fork-Join-Aufgaben zuständig ist. Der ForkJoinPool erstellt intern eine optimale Anzahl von Threads basierend auf der Anzahl der verfügbaren Prozessoren.
//        App task = new App(1, 20);// Erstellt eine App-Aufgabe mit dem Bereich 1 bis 20. Diese Aufgabe wird in kleinere Teilaufgaben unterteilt, bis der Bereich klein genug ist (end - start <= 5), um die Summe direkt zu berechnen.
//
//        System.out.println("Ergebnis: " + pool.invoke(task));
//        // pool.invoke(task);:
//        //Führt die App-Aufgabe aus und wartet, bis die gesamte Berechnung abgeschlossen ist.
//        //invoke() kombiniert die Methoden fork() und join(), sodass die Aufgabe gestartet und das Endergebnis zurückgegeben wird.
//    }
//}
////Ergebnis: 210, Die Summe der Zahlen von 1 bis 20 wird berechnet:
//
////1+2+3+…+20=210
////
////
////
////
////Zusammenfassung des Ablaufs:
////Aufgabe erstellt: App task = new App(1, 20);
////Aufgabe in den Pool übergeben: pool.invoke(task);
////Aufteilen der Aufgabe: Die Aufgabe wird in kleinere Teilaufgaben (leftTask und rightTask) zerlegt, bis der Bereich kleiner oder gleich 5 ist.
////Summe berechnen: Die Basisaufgaben berechnen die Summe für kleine Bereiche.
////Zusammenführen der Ergebnisse: Die Ergebnisse der Teilaufgaben werden durch join() zusammengeführt.
////Ergebnis anzeigen: Die Gesamtberechnung wird ausgegeben (Ergebnis: 210).
//












//
////11. CompletableFuture (Seite 345)
//
////Was ist CompletableFuture?
////CompletableFuture ist eine erweiterte API, die Teil des java.util.concurrent Pakets ist und für die Verwaltung von asynchronen Berechnungen verwendet wird. Es bietet eine Vielzahl von Methoden, um asynchrone Aufgaben zu erstellen, zu kombinieren und zu überwachen. Mit CompletableFuture können Entwickler komplexe Task-Chains (Aufgabenketten) definieren, bei denen das Ergebnis einer Aufgabe als Eingabe für die nächste Aufgabe dient.
//
//
//
//
//import java.util.concurrent.CompletableFuture;// CompletableFuture bietet Methoden zur Erstellung und Verwaltung asynchroner Aufgaben und ist sehr flexibel für die Kombination und das Zusammenspiel mehrerer abhängiger Aufgaben.
//
//public class App {
//    public static void main(String[] args) {
//        CompletableFuture.supplyAsync(() -> "Hello")
//
//// supplyAsync(): Erstellt eine asynchrone Berechnung, die in einem separaten Thread ausgeführt wird und einen Wert zurückliefert.
//
//// () -> "Hello": Das ist ein Lambda-Ausdruck, der als Aufgabe definiert ist und den String "Hello" zurückgibt.
//
////supplyAsync() verwendet den Standard-Thread-Pool (ForkJoinPool.commonPool()) für die Ausführung.
//
////Die Berechnung (() -> "Hello") wird asynchron ausgeführt, während der Hauptthread weiterläuft.
//
////supplyAsync() gibt ein CompletableFuture-Objekt zurück, das den Wert "Hello" enthält, sobald die Berechnung abgeschlossen ist.
//
//                .thenApply(s -> s + " World")
//
////thenApply(): Wird ausgeführt, wenn die vorherige CompletableFuture-Berechnung abgeschlossen ist und deren Ergebnis verfügbar ist.
////Es akzeptiert eine Funktion als Eingabe, die das Ergebnis der vorherigen Berechnung verarbeitet und ein neues Ergebnis zurückgibt.
////In diesem Fall ist s der Rückgabewert der vorherigen Berechnung ("Hello").
////Lambda-Ausdruck s -> s + " World":
////Der String "Hello" wird um " World" erweitert, was den neuen Wert "Hello World" ergibt.
////Das Ergebnis ist eine neue CompletableFuture-Instanz mit dem Wert "Hello World".
//
//                .thenAccept(System.out::println);
//    }
//}
//// thenAccept(): Wird ausgeführt, wenn die vorherige CompletableFuture-Berechnung abgeschlossen ist und deren Ergebnis verfügbar ist.
////Anstelle einer Transformation des Ergebnisses (thenApply()), verarbeitet thenAccept() das Ergebnis, ohne es weiterzugeben.
////Es akzeptiert eine Consumer-Funktion als Eingabe, die das Ergebnis der vorherigen Berechnung verbraucht, aber keinen Rückgabewert liefert.
////Lambda-Ausdruck System.out::println: gibt den finalen Wert "Hello World" auf der Konsole aus.
////Das Ergebnis ist ein CompletableFuture-Objekt ohne Rückgabewert (Void), da thenAccept() keine weiteren Berechnungen anstößt.
//
//
//
//// ablauf des Programms:
////Eine asynchrone Berechnung (supplyAsync()) wird gestartet, die "Hello" zurückgibt.
////Sobald die Berechnung abgeschlossen ist, wird thenApply() ausgeführt, um den String "Hello" in "Hello World" zu transformieren.
////Nachdem die Transformation abgeschlossen ist, wird thenAccept() ausgeführt, um das Ergebnis "Hello World" auf der Konsole auszugeben.
//
//
//






















//RMI "Remote Method Invocation" ;
// dafür lass uns eine neue Package erstellen :
// RMI package
// RMI2 package
// RMIListeners













//// Grundlagen des Class Loading (Seiten 383-391)
////Was ist Class Loading?
////Class Loading bezeichnet den Prozess, bei dem der Java Virtual Machine (JVM) die Klassen-Dateien (Bytecode) lädt, initialisiert und in den Speicher bringt, um sie zur Laufzeit auszuführen.
//

//
//
//
//
//// Einfache Anwendung eines benutzerdefinierten ClassLoaders
//
//// wir können eine Beispielklasse namens MyClass erstellen, die wir verwenden können, um den benutzerdefinierten ClassLoader zu testen. Diese Klasse enthält eine einfache Methode namens sayHello
//
//// public class MyClass {
////    public void sayHello() {
////        System.out.println("Hello from MyClass loaded by the custom class loader!");
////    }
////}
//
//// dann kompilieren wir diese Klasse mit dem befehl:
////javac MyClass.java
//
////CustomClassLoader loader = new CustomClassLoader("src/MyClass.class"); dann fügen wir unsere kompilierten MyClass.class Datei hinzu.
//
//
//
//import java.io.*;
//
//public class App {
//    public static void main(String[] args) {
//        try {
//            // Erzeuge eine Instanz unseres benutzerdefinierten ClassLoaders
//            CustomClassLoader loader = new CustomClassLoader("src/MyClass.class");
//
//            // Lade die Klasse 'MyClass' mit unserem ClassLoader
//            Class<?> myClass = loader.loadClass("MyClass");
//            // Die Methode loadClass wird auf dem benutzerdefinierten ClassLoader (loader) aufgerufen, um die Klasse MyClass zu laden. Dies geschieht dynamisch zur Laufzeit. Wenn die Klasse nicht gefunden wird, wird eine ClassNotFoundException ausgelöst.
//
//            // Erzeuge eine Instanz der geladenen Klasse
//            Object obj = myClass.getDeclaredConstructor().newInstance();
//            // Mit myClass.getDeclaredConstructor().newInstance() wird eine neue Instanz der dynamisch geladenen Klasse MyClass erzeugt. Es wird der Standardkonstruktor (MyClass()) verwendet.
//
//            // Rufe eine Methode der geladenen Klasse auf
//            myClass.getMethod("sayHello").invoke(obj);
//            // Die sayHello-Methode der MyClass wird auf der erzeugten Instanz (obj) aufgerufen. Dies geschieht mit der Reflexions-API (getMethod("sayHello").invoke(obj)).
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
//// Die CustomClassLoader Klasse erweitert ClassLoader und überschreibt die findClass Methode, um benutzerdefinierte Klassen aus einer Datei zu laden.
//class CustomClassLoader extends ClassLoader {
//    private String classesDir;// Der classesDir String speichert den Pfad zu dem Ordner, in dem die .class-Dateien abgelegt sind.
//
//    public CustomClassLoader(String classesDir) {
//        this.classesDir = classesDir;
//    }// Der Konstruktor CustomClassLoader(String classesDir) akzeptiert den Pfad als Parameter und speichert ihn.
//
//    @Override
//    protected Class<?> findClass(String name) throws ClassNotFoundException {// findClass(String name) ist die zentrale Methode des benutzerdefinierten ClassLoaders. Sie lädt die Klasse basierend auf ihrem Namen (name).
//        byte[] classData = loadClassData(name);
//        // Die Methode loadClassData(name) wird aufgerufen, um die Byte-Daten der .class-Datei als byte[] zu laden.
//        if (classData == null) {
//            throw new ClassNotFoundException();
//        }//  Wenn die Datei nicht gefunden wird (classData == null), wird eine ClassNotFoundException ausgelöst.
//        return defineClass(name, classData, 0, classData.length);
//    }// Die Methode defineClass definiert die Klasse aus den Byte-Daten (classData).
//
//    // dann erstellen wir eine loadClassData-Methode die eigentliche Lade-Logik für die .class-Datei implementiert.
//    private byte[] loadClassData(String className) {
//        try {
//            String fileName = classesDir + className.replace('.', '/') + ".class";
//            // // Die Methode baut den vollständigen Dateipfad zur .class-Datei zusammen.
//            InputStream inputStream = new FileInputStream(fileName);
//            //  Ein FileInputStream wird verwendet, um die .class-Datei zu öffnen.
//            ByteArrayOutputStream buffer = new ByteArrayOutputStream();// Ein ByteArrayOutputStream wird erstellt. Dies ist eine spezielle Art von OutputStream, die die geschriebenen Daten in einem internen Byte-Array speichert. Der ByteArrayOutputStream ist praktisch, weil er alle geschriebenen Daten im Speicher hält, bis du das gesamte Array benötigst, dann kannst du ihm abrufen mit (buffer.toByteArray()).
//            int data = inputStream.read();// liest ein Byte aus der Datei und gibt dieses als int zurück.Wenn das Ende der Datei erreicht ist, gibt read() den Wert -1 zurück.Der Rückgabewert int wird in der Variable data gespeichert. Hier wird read() initial einmal aufgerufen, um die Schleife zu starten.
//            while (data != -1) {//
//                buffer.write(data);// Diese Zeile schreibt das gelesene Byte (data) in den ByteArrayOutputStream (buffer).Da data ein int ist, wird der Wert als Byte interpretiert und in das interne Array des ByteArrayOutputStream eingefügt.
//
//                data = inputStream.read();
//            }// Die while-Schleife wird so lange ausgeführt, bis data den Wert -1 hat, was bedeutet, dass das Ende der Datei erreicht wurde.Solange data != -1 ist, befindet sich noch mehr Daten in der Datei, die gelesen werden müssen.
//            inputStream.close();// Nachdem alle Daten gelesen wurden, wird der inputStream geschlossen. Dies ist wichtig, um die Systemressourcen freizugeben und die Datei nicht länger offen zu halten.
//
//            return buffer.toByteArray();// gibt das gesamte Byte-Array zurück, das alle gelesenen Daten enthält.Dieses Byte-Array wird verwendet, um die Klasse mit defineClass zu definieren.
//        } catch (IOException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//}
//// Zusammengefasst:
////Der Code öffnet einen InputStream, um die .class-Datei zu lesen.
////Er liest die Datei byteweise, speichert jedes gelesene Byte im ByteArrayOutputStream (buffer).
////Die while-Schleife läuft, bis das Ende der Datei (-1) erreicht ist.
////Nach dem Lesen werden die Byte-Daten als Byte-Array (buffer.toByteArray()) zurückgegeben.
////Diese Byte-Daten werden dann in der findClass-Methode verwendet, um die Klasse zu definieren.
//
//

















//
////2. URLClassLoader ist ein spezieller ClassLoader, der es ermöglicht, Klassen aus einem Verzeichnis oder einer JAR-Datei zu laden, die an einer bestimmten URL liegen. Dies ist besonders nützlich, wenn du Klassen zur Laufzeit aus einem externen Speicherort (z.B. Verzeichnis oder JAR-Datei) laden möchtest.
//
//
//
//// aber dafür brauchen wir einen URL KlassDatei, und dafür verwende ich das gleiche MyClass.class Datei wie das vorherige beispiel.
//
//
//
//import java.net.*;
//import java.lang.reflect.Method;
//
//public class App {
//    public static void main(String[] args) {
//        try {
//            // Erstelle eine URL, die zu einem Verzeichnis oder JAR führt
//            URL[] urls = {new URL("file:///Users/a.ramadan/Desktop/Java/MyFirstJava/src/")};
//            //Hier erstellst du ein Array mit URLs, die auf das Verzeichnis oder die JAR-Datei zeigen, aus der die Klasse geladen werden soll. Der file:// URL-Schema wird verwendet, um auf ein lokales Verzeichnis oder eine Datei auf deinem System zuzugreifen. aber Der file-URL muss drei Schrägstriche /// haben: file:///Pfad/zum/Verzeichnis/ für absolute Pfade.
//
//            // Erzeuge einen URLClassLoader mit den angegebenen URLs
//            URLClassLoader loader = new URLClassLoader(urls);
//            // Ein URLClassLoader wird mit den angegebenen URLs erstellt. Dies bedeutet, dass dieser ClassLoader versucht, Klassen aus den angegebenen Verzeichnissen oder JAR-Dateien zu laden.
//
//            // Lade die Klasse 'MyClass' aus der angegebenen URL
//            Class<?> clazz = loader.loadClass("MyClass");
//            // Hier wird versucht, die Klasse mit dem Namen MyClass zu laden. Der ClassLoader sucht diese Klasse entweder im angegebenen Verzeichnis oder in der JAR-Datei.
//
//            // Erzeuge eine Instanz der geladenen Klasse und rufe eine Methode auf
//            Object obj = clazz.getDeclaredConstructor().newInstance();// // Eine Instanz der geladenen Klasse wird mit dem Standardkonstruktor erstellt.
//            //Dies funktioniert nur, wenn die geladene Klasse einen Standardkonstruktor hat (also einen Konstruktor ohne Parameter).
//            Method method = clazz.getMethod("sayHello");
//            method.invoke(obj);// Die Methode sayHello wird dynamisch aus der geladenen Klasse abgerufen. Dies funktioniert nur, wenn die Klasse MyURLClass eine Methode mit genau diesem Namen und ohne Parameter definiert hat.
//            // Die Methode sayHello wird auf der erstellten Instanz (obj) aufgerufen.Dadurch wird die Funktionalität der printMessage-Methode ausgeführt.
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
////Beschreibung: Dieses Beispiel verwendet den URLClassLoader, um eine Klasse aus einem angegebenen URL-Pfad (z.B. einem Verzeichnis oder einer JAR-Datei) zu laden und deren Methode printMessage auszuführen.
//
////Wenn du eine JAR-Datei laden möchtest, sollte die URL auf die JAR-Datei verweisen:
//
////URL[] urls = {new URL("jar:file:///path/to/jarfile.jar!/")};
//






//
//. Überblick über die ClassLoader-Hierarchie in Java:
//Java verwendet eine ClassLoader-Hierarchie zur Verwaltung, wie Klassen zur Laufzeit geladen werden. Diese Hierarchie besteht aus verschiedenen ClassLoadern, die jeweils für das Laden bestimmter Klassen verantwortlich sind. Die wichtigsten ClassLoader sind:
//
//Bootstrap ClassLoader:
//Dies ist der oberste ClassLoader in der Hierarchie und wird direkt von der JVM implementiert.
//Er ist für das Laden der Java-Kernbibliotheken verantwortlich (z.B. Klassen in java.lang, java.util).
//Er wird von keiner Java-Klasse repräsentiert und gibt deshalb null zurück, wenn wir auf ihn zugreifen.
//        Extension ClassLoader (auch Platform ClassLoader genannt):
//Er wird verwendet, um Klassen zu laden, die sich in den Extensions-Verzeichnissen befinden (lib/ext).
//Lädt erweiterte Klassenbibliotheken (z.B. Klassen, die von Java-Programmierern zur JVM hinzugefügt werden).
//Er ist der Parent des System ClassLoaders.
//        System ClassLoader (auch Application ClassLoader genannt):
//Der Standard-ClassLoader für die meisten Anwendungen.
//Er lädt Klassen von Orten wie dem Classpath, d.h., den Pfaden und JAR-Dateien, die beim Starten der Anwendung angegeben werden.
//Lädt die meisten benutzerdefinierten und Drittanbieter-Klassen.








//
//
////3. ClassLoader-Hierarchie: Überprüfen der Parent-Delegation
//
//public class App {
//    public static void main(String[] args) {
//        // Zeigt die Hierarchie der Standard-ClassLoader an
//        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();// // Dies ruft den System ClassLoader (auch Application ClassLoader genannt) ab.Dieser ClassLoader ist derjenige, der in der Regel alle Klassen lädt, die auf dem Standard-Classpath der Anwendung liegen, z.B. Klassen aus deinem src-Verzeichnis oder JAR-Dateien, die du im Classpath angibst.
//        //Er ist der unterste ClassLoader in der Java-Hierarchie und lädt alle benutzerdefinierten Klassen.
//        System.out.println("System ClassLoader: " + systemClassLoader);// Gibt den System ClassLoader aus. Dieser gibt den Namen des ClassLoaders und den Pfad zurück, aus dem Klassen geladen werden.
//
//
//        ClassLoader extClassLoader = systemClassLoader.getParent();
//        // Hier wird der Parent des System ClassLoader abgerufen, der normalerweise der Extension ClassLoader ist.
//        //Dieser ClassLoader lädt Klassen aus dem lib/ext-Verzeichnis oder einem anderen Plattformverzeichnis, in dem Erweiterungen gespeichert werden.
//        //Die Ausgabe zeigt, dass der Parent extClassLoader für die meisten Anwendungen auf die Erweiterungen von Java verweist.
//        System.out.println("Extension ClassLoader: " + extClassLoader);
//        // Gibt den Extension ClassLoader aus. Die Ausgabe könnte null sein, falls der extClassLoader nicht definiert ist (kommt auf die JVM-Implementierung an).
//
//        ClassLoader bootstrapClassLoader = extClassLoader.getParent();// Der Parent des Extension ClassLoader ist der Bootstrap ClassLoader. Der Bootstrap ClassLoader ist der oberste ClassLoader und wird direkt von der JVM implementiert. Er ist für das Laden der grundlegenden Java-Klassen (java.lang.*, java.util.*, etc.) verantwortlich. Da der Bootstrap ClassLoader in reinem Java nicht als Objekt repräsentiert wird, gibt diese Abfrage null zurück.
//        System.out.println("Bootstrap ClassLoader: " + bootstrapClassLoader);
//        // Gibt null zurück, da der Bootstrap ClassLoader kein ClassLoader-Objekt darstellt, sondern auf einer niedrigeren Ebene von der JVM verwaltet wird.
//
//    }
//}
//
//// Was bedeutet die Ausgabe?
////
////System ClassLoader: Dies ist der AppClassLoader oder SystemClassLoader, der alle Klassen lädt, die im Klassenpfad (-cp) angegeben sind.
////Extension ClassLoader: Dieser ist für das Laden von Erweiterungen verantwortlich. In modernen JVMs wird dieser auch als PlatformClassLoader bezeichnet.
////Bootstrap ClassLoader: Gibt null zurück, da der Bootstrap ClassLoader nicht als Java-Objekt verfügbar ist.
//
//
//
////4. Das Parent-Delegation-Modell:
////Das Parent-Delegation-Modell ist eine Methode, mit der ClassLoader in Java Klassen laden. Es funktioniert wie folgt:
////
////Wenn ein ClassLoader eine Klasse laden muss, fragt er zuerst seinen Parent-ClassLoader, ob dieser die Klasse bereits kennt.
////Der Prozess geht die ClassLoader-Hierarchie nach oben, bis er den Bootstrap ClassLoader erreicht.
////Wenn einer der übergeordneten ClassLoader die Klasse bereits geladen hat, wird diese zurückgegeben.
////Nur wenn kein Parent die Klasse kennt, lädt der aktuelle ClassLoader sie selbst.
//



















//
//// Hot Deployment:
////Hot Deployment bedeutet, dass Klassen zur Laufzeit neu geladen werden können, sodass Änderungen im Quellcode sofort wirksam werden.
////In Java werden Klassen normalerweise nur einmal vom ClassLoader geladen. Einmal geladene Klassen können von demselben ClassLoader nicht erneut geladen werden.
////Um dieses Problem zu umgehen, wird bei jeder Anforderung ein neuer benutzerdefinierter ClassLoader (HotDeploymentClassLoader) erstellt. Dadurch kann die Klasse MyDynamicClass bei jeder Iteration neu geladen werden.
//
////Der Code besteht aus zwei Klassen:
////
////        HotDeploymentDemo (Hauptklasse mit dem main-Einstiegspunkt).
////        HotDeploymentClassLoader (benutzerdefinierter ClassLoader, der die Klasse bei jedem Aufruf neu lädt).
//
//import java.io.File;
//import java.util.Scanner;
//
//public class App {
//    public static void main(String[] args) {
//        try {
//            while (true) {// Endlosschleife wartet darauf, dass der Benutzer die Eingabetaste drückt
//                System.out.println("Press Enter to reload the class...");
//                Scanner scanner = new Scanner(System.in);
//                scanner.nextLine();  // Warte, bis der Benutzer die Eingabetaste drückt, Bei jedem Drücken der Eingabetaste wird die Klasse neu geladen und ihre Methode sayHello aufgerufen.
//
//                // 1. Verwende einen neuen ClassLoader, um die Klasse bei jedem Durchlauf neu zu laden
//                HotDeploymentClassLoader loader = new HotDeploymentClassLoader("src/MyClass.class");// Jedes Mal, wenn ein neuer ClassLoader erstellt wird, kann er die Klasse erneut laden, auch wenn sie bereits in der JVM vorhanden ist.
//
//                // 2. Lade die Klasse 'MyClass' neu
//                Class<?> clazz = loader.loadClass("MyClass");
//                // Diese Klasse muss in dem angegebenen Verzeichnis als MyClass.class vorhanden sein.
//                //Der HotDeploymentClassLoader sucht die .class-Datei und lädt sie als neue Klasse in die JVM.
//
//                // 3. Erzeuge eine Instanz der geladenen Klasse
//                Object instance = clazz.getDeclaredConstructor().newInstance();
//
//                // 4. Rufe die Methode 'sayHello' der neu geladenen Klasse auf
//                clazz.getMethod("sayHello").invoke(instance);
//                // Dadurch werden die Änderungen sichtbar, die seit dem letzten Laden der Klasse vorgenommen wurden.
//
//                System.out.println("Class reloaded successfully.");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//
//class HotDeploymentClassLoader extends ClassLoader {
//    private String classesDir;  // Pfad zu dem Verzeichnis, in dem die .class-Dateien liegen
//
//    public HotDeploymentClassLoader(String classesDir) {
//        this.classesDir = classesDir;
//    }
//
//    @Override
//    protected Class<?> findClass(String name)// Diese Methode ist das Herzstück des ClassLoader.
//    throws ClassNotFoundException {
//        try {
//            // Lade die Byte-Daten der Klasse
//            byte[] classData = loadClassData(name);
//            // hier wird die Methode loadClassData verwendet, um die Byte-Daten der .class-Datei zu laden und die Klasse zu definieren.
//            return defineClass(name, classData, 0, classData.length);// Die defineClass-Methode verwendet die gelesenen Byte-Daten, um die Klasse zur Laufzeit in die JVM zu laden.
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new ClassNotFoundException("Cannot find class " + name);
//        }
//    }
//
//    // Lese die .class-Datei und gebe die Byte-Daten zurück
//    private byte[] loadClassData(String className)// Diese Methode liest die .class-Datei von der Festplatte als byte[].
//    throws Exception {
//        String fileName = classesDir + className.replace('.', File.separatorChar) + ".class";// Diese Zeile erstellt den vollständigen Dateipfad für die .class-Datei.
//        return java.nio.file.Files.readAllBytes(new File(fileName).toPath());// Files.readAllBytes(...) lädt die Byte-Daten der .class-Datei vollständig in den Speicher.
//    }
//}

// // Dieses Beispiel zeigt, wie man Klassen zur Laufzeit neu laden kann. Jedes Mal, wenn der Benutzer die Eingabetaste drückt, wird die Klasse MyDynamicClass neu geladen, sodass Änderungen am Bytecode sofort übernommen werden.



























 // 5. Deserialisierung mit einem benutzerdefinierten ClassLoader

 //1. Grundlegendes zur Deserialisierung:
 //        Serialisierung bedeutet, ein Objekt in eine Folge von Bytes zu konvertieren, um es z.B. in einer Datei zu speichern oder über das Netzwerk zu übertragen.
 //Deserialisierung ist der umgekehrte Prozess: Ein gespeichertes Byte-Array wird wieder in ein lebendiges Objekt umgewandelt.
 //Bei der Deserialisierung muss die JVM die Klasseninformationen des gespeicherten Objekts laden. Standardmäßig verwendet sie dabei den System ClassLoader.
 //In manchen Fällen möchtest du jedoch einen benutzerdefinierten ClassLoader verwenden, um sicherzustellen, dass die Klassen aus einem bestimmten Verzeichnis oder einer JAR-Datei geladen werden.



 //Hier habe ich eine Anwendungs klasse erstellt "TestClass.java"  und eine "DeserializationExample.java" und "SerializationExample.java" und "DeserializationExample.java"
// um einen .ser datei zu erstellen, und mit der kompilierung auch einen ClassLoaderDeserialised.class.
//



//Verzeichnisstruktur
//
//
//MyProject/
//        ├── src/
//        │   ├── CustomClassLoaderExample.java
//│   ├── SerializationExample.java
//│   ├── DeserializationExample.java
//│   └── myclasses/
//        │       └── TestClass.java
//└── serialized_object.ser


//Schritt 1: Erstelle das Hauptverzeichnis
//Gehe in dein Projektverzeichnis (z.B., MyFirstJava) und erstelle ein neues Verzeichnis MyProject:
//

//mkdir MyProject
//cd MyProject
//mkdir src
//mkdir src/myclasses

//Schritt 2: Lege die Java-Dateien an
//Erstelle die vier Java-Dateien entsprechend ihrer Verzeichnisse:
//
//TestClass.java im src/myclasses Verzeichnis:

//und fügen wir das code dafür hinzu :

//package myclasses;
//
//import java.io.Serializable;
//
//public class TestClass implements Serializable {
//    private static final long serialVersionUID = 1L;
//    private String message;
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    public void sayHello() {
//        System.out.println(message);
//    }
//}

//
//
////CustomClassLoaderExample.java im src Verzeichnis:
//
//
////und dann fügen wir dieses code hinzu:
//import java.io.FileInputStream;
//import java.io.ObjectInputStream;
//import java.net.URL;
//import java.net.URLClassLoader;
//import java.lang.reflect.Method;
//
//public class CustomClassLoaderExample {
//
//    public static void main(String[] args) {
//        try {
//            // Pfad zur Klasse TestClass, die im Verzeichnis myclasses liegt.
//            URL classUrl = new URL("file://" + System.getProperty("user.dir") + "/src/myclasses/");
//            URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{classUrl});
//
//            // Lade die Klasse TestClass aus dem Verzeichnis myclasses.
//            Class<?> loadedClass = urlClassLoader.loadClass("myclasses.TestClass");
//
//            // Anstatt eine neue Instanz zu erstellen, deserialisieren wir das Objekt aus der Datei
//            FileInputStream fileIn = new FileInputStream("serialized_object.ser");
//            ObjectInputStream in = new ObjectInputStream(fileIn);
//            Object instance = in.readObject();
//            in.close();
//            fileIn.close();
//
//            // Finde die Methode und rufe sie auf.
//            Method method = loadedClass.getMethod("sayHello");
//            method.invoke(instance);
//
//            // ClassLoader schließen (nur notwendig ab Java 7).
//            urlClassLoader.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}



//
////SerializationExample.java im src Verzeichnis, und fügen wir dieses code hinzu:
//
//
//import myclasses.TestClass;
//
//import java.io.FileOutputStream;
//import java.io.ObjectOutputStream;
//
//public class SerializationExample {
//    public static void main(String[] args) {
//        try {
//            // TestClass muss serialisierbar sein (implementiert Serializable).
//            TestClass obj = new TestClass();
//            obj.setMessage("Hello, I am a serialized object!");
//
//            // Speichere das Objekt in einer Datei
//            FileOutputStream fileOut = new FileOutputStream("serialized_object.ser");
//            ObjectOutputStream out = new ObjectOutputStream(fileOut);
//            out.writeObject(obj);
//            out.close();
//            fileOut.close();
//            System.out.println("Objekt wurde serialisiert und in 'serialized_object.ser' gespeichert.");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}








////DeserializationExample.java im src Verzeichnis, und fügen wir dieses code hinzu:
//
//
//
//import myclasses.TestClass;
//
//import java.io.FileInputStream;
//import java.io.ObjectInputStream;
//
//public class DeserializationExample {
//    public static void main(String[] args) {
//        try {
//            // Deserialisiere das Objekt aus der Datei
//            FileInputStream fileIn = new FileInputStream("serialized_object.ser");
//            ObjectInputStream in = new ObjectInputStream(fileIn);
//
//            // Lese das Objekt und caste es in die TestClass
//            TestClass obj = (TestClass) in.readObject();
//            in.close();
//            fileIn.close();
//
//            // Rufe eine Methode des deserialisierten Objekts auf
//            obj.sayHello();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}




//Schritt 3: Kompiliere die Java-Dateien
//Gehe in das Hauptverzeichnis MyProject und führe die folgenden Befehle aus, um die Klassen zu kompilieren:
//
//bash
//Copy code
//javac -d src src/myclasses/TestClass.java

//javac -cp src -d src src/SerializationExample.java

//javac -cp src -d src src/DeserializationExample.java

//javac -cp src -d src src/CustomClassLoaderExample.java

//Dadurch werden alle .class-Dateien im src-Verzeichnis erstellt.

//Schritt 4: Führe die Serialisierung aus
//Führe das SerializationExample-Programm aus, um die Datei serialized_object.ser zu erstellen:

//Die Ausgabe sollte wie folgt aussehen:
//

//Objekt wurde serialisiert und in 'serialized_object.ser' gespeichert.
// Dadurch wird die Datei serialized_object.ser im src-Verzeichnis erstellt.



// Schritt 5: Führe die Deserialisierung aus
//Führe nun DeserializationExample aus, um das Objekt zu deserialisieren und die sayHello()-Methode aufzurufen:
//
// Die Ausgabe sollte sein:
//

//Hello, I am a serialized object!



// Schritt 6: Führe CustomClassLoaderExample aus
//Führe den CustomClassLoaderExample aus, um die Klasse TestClass dynamisch zu laden und die sayHello()-Methode aufzurufen:
//





//java -cp . CustomClassLoaderExample
//Die Ausgabe sollte sein:
//

//Hello, I am a serialized object!










