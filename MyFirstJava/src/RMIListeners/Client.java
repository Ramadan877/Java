package RMIListeners;
import java.rmi.Naming;

// RMI-Client, der den Server aufruft und einen Listener registriert
public class Client {
    public static void main(String[] args) {
        try {
            Calculator calculator = (Calculator) Naming.lookup("rmi://localhost/CalculatorService");
            // Verbindet sich mit dem RMI-Server auf localhost und sucht nach dem CalculatorService.

            // Erstellt einen neuen Listener und registriert ihn beim Server
            CalculatorListener listener = new CalculatorListenerImpl();
            calculator.addCalculatorListener(listener);

            // Beispiel: Füge einige Werte hinzu und beobachte die Listener-Ausgabe
            calculator.add(10);  // Wert: 10 (Listener wird wieder benachrichtigt).
            calculator.add(5);   // Wert: 15 (Listener wird wieder benachrichtigt).

            System.out.println("Client hat Listener erfolgreich registriert.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

