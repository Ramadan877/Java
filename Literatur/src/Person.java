// import java.util.Objects;

// public class App {  


//     // Klasse mit einem Konstruktor, der requireNonNull verwendet
//     static class PalindromeChecker {// Diese Klasse überprüft, ob ein String ein Palindrom ist (vorwärts und rückwärts gleich).
//         private String text;

//         // Konstruktor mit requireNonNull: Text darf nicht null sein
//         public PalindromeChecker(String text) {
//             // Überprüfung auf null und Initialisierung
//             this.text = Objects.requireNonNull(text, "Text darf nicht null sein!");
//         }

//         // Methode, um zu prüfen, ob der Text ein Palindrom ist
//         public boolean isPalindrome() {
//             String reversed = new StringBuilder(text).reverse().toString();
//             return text.equalsIgnoreCase(reversed);
//         }
//     }
  




//     // Klasse, die requireNonNullElse verwendet, um Standardwerte zu setzen
//     static class Greeting {// eine einfache begrüßungsnachricht
//         private String message;

//         // Konstruktor mit requireNonNullElse: Falls message null ist, verwende "Hallo, Welt!"
//         public Greeting(String message) {
//             this.message = Objects.requireNonNullElse(message, "Hallo, Welt!");
//         }

//         // Methode, um die Begrüßung auszugeben
//         public void printGreeting() {
//             System.out.println(message);
//         }
//     }

//     // Hauptmethode
//     public static void main(String[] args) {
//         // Beispiel 1: Verwendung von requireNonNull
//         try {
//             PalindromeChecker checker = new PalindromeChecker(null);  // Löst eine Exception aus
//         } catch (NullPointerException e) {
//             System.out.println("Fehler: " + e.getMessage());  // Gibt die benutzerdefinierte Fehlermeldung aus
//         }

//         // Korrekte Verwendung von requireNonNull
//         PalindromeChecker checker2 = new PalindromeChecker("Madam");
//         System.out.println("Ist 'Madam' ein Palindrom? " + checker2.isPalindrome());

//         // Beispiel 2: Verwendung von requireNonNullElse
//         Greeting greeting1 = new Greeting(null);  // Initialisiert mit dem Standardwert "Hallo, Welt!"
//         greeting1.printGreeting();  // Gibt "Hallo, Welt!" aus

//         // Korrekte Verwendung von requireNonNullElse
//         Greeting greeting2 = new Greeting("Willkommen bei Java!");
//         greeting2.printGreeting();  // Gibt "Willkommen bei Java!" aus
//     }
// }


