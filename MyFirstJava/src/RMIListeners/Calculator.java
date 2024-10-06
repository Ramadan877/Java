package RMIListeners;

import java.rmi.Remote;
import java.rmi.RemoteException;

// Erweiterte Calculator-Schnittstelle mit Methoden zur Registrierung von Listenern, Dieses Interface stellt die Methoden bereit, die vom Server implementiert werden.
public interface Calculator extends Remote {
    //  Fügt einen Wert zum aktuellen Wert hinzu.
    void add(int value) throws RemoteException;

    // Gibt den aktuellen Wert zurück
    int getValue() throws RemoteException;
    // Registriert einen neuen Listener (Client) am Server.
    void addCalculatorListener(CalculatorListener listener) throws RemoteException;
    //  Entfernt einen registrierten Listener.
    void removeCalculatorListener(CalculatorListener listener) throws RemoteException;
}
// Diese Methoden erlauben Client-Server-Interaktionen und müssen alle RemoteException deklarieren.

