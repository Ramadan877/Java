package RMI2;

import java.rmi.Naming;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            // Verbindung zur Factory herstellen
            CalculatorFactory factory = (CalculatorFactory) Naming.lookup("rmi://localhost:1099/CalculatorFactory");
// Der Client verbindet sich mit der RMI-Registry, um die CalculatorFactory zu finden.

            // Eigenen Calculator erstellen
            Calculator calculator = factory.create();
            // Über die Factory wird eine neue Instanz von Calculator erstellt.

            // Rechner verwenden, Der Client verwendet dann seinen eigenen Calculator, um Berechnungen durchzuführen und den Zustand lokal zu verwalten.
            calculator.add(10);
            calculator.add(5);
            System.out.println("Endwert: " + calculator.getValue());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

