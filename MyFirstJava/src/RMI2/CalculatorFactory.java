package RMI2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculatorFactory extends Remote
// //Das CalculatorFactory Interface erweitert das Remote Interface, was notwendig ist, um Methoden remote aufrufbar zu machen.
{
    Calculator create() throws RemoteException;
}

//Die Methode create() ist dafür zuständig, eine neue Instanz eines Calculator zu erstellen. Sie muss RemoteException werfen, um Netzwerk- oder Kommunikationsfehler zu signalisieren.
