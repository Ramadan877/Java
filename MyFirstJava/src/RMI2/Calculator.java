package RMI2;

import java.rmi.Remote;
import java.rmi.RemoteException;
// Das Calculator Interface definiert die Funktionen des Rechners.
public interface Calculator extends Remote {
    void add(int value) throws RemoteException;
    int getValue() throws RemoteException;
}
// Es bietet eine add(int value) Methode zum Hinzufügen eines Werts zum internen Zustand und eine getValue() Methode, um den aktuellen Wert abzurufen.


