package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MathService extends Remote {
    int add(int a, int b) throws RemoteException;
    int subtract(int a, int b) throws RemoteException;
}

// Erklärung:
//
//Ein Remote Interface definiert die Methoden, die von einem Client aufgerufen werden können.
//Es erweitert (extends) das Remote Interface.
//Jede Methode muss throws RemoteException deklarieren. Dies ist erforderlich, um potenzielle Netzwerk- oder Kommunikationsfehler zu behandeln.
//In diesem Fall hat das Interface MathService zwei Methoden: add (Addition) und subtract (Subtraktion).