package RMIListeners;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// Implementierung des CalculatorListener Interfaces
public class CalculatorListenerImpl extends UnicastRemoteObject implements CalculatorListener {// UnicastRemoteObject stellt grundlegende Funktionen für Remote-Objekte bereit, um RMI-Methodenaufrufe zu ermöglichen.
    public CalculatorListenerImpl() throws RemoteException {
        super();
    }

    @Override
    public void update(int newValue) throws RemoteException {
        System.out.println("Neuer Wert vom Server: " + newValue);
    }
}// Die Methode update(int newValue) wird vom Server aufgerufen und gibt den neuen Wert auf der Konsole aus.

