package RMIListeners;

import java.rmi.Remote;
import java.rmi.RemoteException;

// Das Listener Interface definiert die Callback-Methode für den Client
public interface CalculatorListener extends Remote {
    void update(int newValue) throws RemoteException;
}


// Dieses Interface definiert einen Listener, der als Callback verwendet wird.
// CalculatorListener erbt von Remote, was bedeutet, dass es über RMI (Remote Method Invocation) aufgerufen werden kann.

// Es gibt eine Methode update(int newValue), die aufgerufen wird, wenn sich der Wert im Server ändert.