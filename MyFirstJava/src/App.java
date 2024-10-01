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
//
//        // du kanst einfach name. schreiben, dann bekommst du eine liste von funktionen die du herumpropieren kannst.
//    }
//    }
//
//
//
//
//
//
//// Wrapper classes:
//// Wrapper class ist eine Methode mit dem wir die primitive Daten typ auf Referenz Daten typ umwandeln können.
//public class App {
//    public static void main(String[] args) {
//        Boolean a = true; // a. dann sehen wir verschiedene methode der boolean.
//        Character b = '@'; //b.
//        Integer c = 123; // c.
//        Double d = 3.14; // d.
//        String e = "Bro"; // e.
//
//        if(a == true){
//            System.out.println(true);// obwohl das ein Referenz Datentyp es wird sich verhalten wie ein primitive Datentyp und das ist die unboxing feature von java was bedeutet java compiler wir die Wrapper klasse auf primitive Klasse automatisch umwandeln.
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
//







//// Generic methoden und klassen.;
//// generics erlaubt Datentypen wie klassen und interfaces parameters zu sein, während der definition von klassen, interfaces und methoden.
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
















// // Threads:
// //Ein Thread ist ein Ausführungsstrang innerhalb eines Programms, vergleichbar mit einer virtuellen CPU.

// // Die Java Virtual Machine (JVM) ermöglicht es, mehrere Threads gleichzeitig in einer Anwendung auszuführen. Dies bedeutet, dass verschiedene Teile des Codes parallel zur Hauptausführung ablaufen können.

// // Jeder Thread hat eine Priorität: Die JVM entscheidet, welche Threads wann ausgeführt werden, basierend auf diesen Prioritäten.
// // Threads mit höherer Priorität werden bevorzugt gegenüber Threads mit niedrigerer Priorität ausgeführt.

// // Die JVM führt Threads so lange aus, bis eines der folgenden Ereignisse eintritt:

// // Die exit-Methode der Klasse Runtime wird aufgerufen (beendet die Anwendung).
// // Alle Benutzer-Threads sind beendet.

// // main(String[] args) das ist unsere hauptthread das unsere main methode abruft wenn die JVM startet.

// //

// public class App {
//    public static void main(String[] args) throws InterruptedException {

//        Thread.activeCount();// Das gibt aus wie viele threads sind schon aktiv.
//        System.out.println(Thread.activeCount());

//        Thread.currentThread().getName();// das gibt aus die name der Main thread.
//        System.out.println(Thread.currentThread().getName());

//        Thread.currentThread().setName("MAINNNN");// das ändert die name unserer Hauptthread.
//        System.out.println(Thread.currentThread().getName());
//        Thread.currentThread().getPriority();// das gibt uns die Priorität unserer Main thread.
//        System.out.println(Thread.currentThread().getPriority());// das ist eine Evaluierung in eine Skala von 1 bis 10, je größer der Zahl, umso größer ist die priorität dieser Thread.

//        Thread.currentThread().setPriority(10);// wir können damit die Priorität unserer Thread ändern.
//        System.out.println(Thread.currentThread().getPriority());

//        Thread.currentThread().isAlive();// das prüft ob unserer Thread noch am Leben ist .
//        System.out.println(Thread.currentThread().isAlive());

//     //    wir können unsere Thread.sleep verwenden um für eine bestimmte zeit zu schlafen und danach einen Befehl ausführen.
//        for(int i = 3; i>0; i--){
//            System.out.println(i);
//            Thread.sleep(1000);// lass uns hier einfach throws deklaration hinzufügen damit wir diesen Fehler wegnehmen.
//        }
//        System.out.println("You are done!");



//     //    (2)
//        MyThread thread2 = new MyThread();
//        System.out.println(thread2.isAlive());// das gibt uns false jzt, weil wenn wir einen neuen Thread erstellen, müssen wir diesen Thread zuerst starten!
//        thread2.start();
//        System.out.println(thread2.isAlive());

//        System.out.println(thread2.getName());

//        // wir können die name dieses Threads ändern:
//        thread2.setName("2nd Thread");
//        System.out.println(thread2.getName());

//     //    System.out.println(thread2.getPriority);
//     //    der neuer Thread vererbt die priorität unseres Hauptthreads.wir können das aber auch ändern:
//     //    System.out.println(thread2.setPriority(1));

//    }
//    }


//(2)
//    // um ein neuen thread zu erstellen, machen wir wie folgendes:
//    class MyThread extends Thread{
//    @Override
//    public void run(){
//        System.out.println("This thread is running");
//    }
//    }// und dann in unserer hauptthread fügen wir folgendes hinzu:
// //MyThread thread2 = new MyThread();





// Daemon Threads:
// es gibt zwei Arten von Threads, user threads und Daemon Threads, welche im hintergrund durchgeführt wurde, um bestimmte Aufgaben auszuführen wie garbage collection und JVM terminiert sich selbst wenn alle user threads also non-daemon threads fertig sind.

// wir können überprüfen ob unsere thread ein daemon thread oder nicht in dem wir folgendes machen :
//        System.out.println(thread2.isDaemon());
// wir können es aber auf Daemon Thread ändern:
//        thread2.setDaemon(true);









// Multithreading:
// Prozess der gleichzeitigen Ausführung mehrerer Threads, hilft bei der maximalen Auslastung der CPU, Threads sind unabhängig, sie beeinflussen die Ausführung anderer Threads nicht. eine Ausnahme in einem Thread unterbricht andere Threads nicht, nützlich für die Bedienung mehrerer Clients, Multiplayer-Spiele oder andere voneinander unabhängige Aufgaben.
//
// public class App {
//    public static void main(String[] args) {
//        // lass uns zwei verschidene Zählern erstellen, wo an der eine zahlen wir von 0 bis 10, und in die zweite machen wir das gleiche umgekehrt.
//        // lass uns jzt eine subklasse erstellen, die vom Thread vererbt.
//
//        MyThread thread1 = new MyThread();// wenn wir dieses Thread starten, es führt unsere run() funktion, lass uns jzt einen for loop in unsere run funktion erstellen.
//
//    }
//    }
//
//    class MyThread extends Thread{
//    @Override
//        public void run(){
//
//            for(int i= i=10; i>0; i--){
//                System.out.println("Thread #1 : " + i);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        System.out.println("Thread #1 is finished!");
//
//
//        }
//    }




// es gibt aber eine andere methode mit dem man thread erstellen kann, und zwar das wir einen Instanz erstellen die die ausführung eine klasse die unsere interface startet, dann geben wir diese instanz in unsere thread objekt rein.:
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






//// jzt müssen wir unsere programm weiter machen :
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
//    class MyThread extends Thread{
//    @Override
//        public void run(){
//
//            for(int i= i=10; i>0; i--){
//                System.out.println("Thread #1 : " + i);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        System.out.println("Thread #1 is finished!");
//
//
//        }
//    }
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





// das beste mit multithreading, ist das wenn wir einen Fehler mit einem Thread haben, der andere Thread wird trotzdem weiter einwandfrei ausgeführt, lass uns zb absichtlich einen fehler hinzufügen indem wir hier ein 1/0 sout hinzufügen:

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

