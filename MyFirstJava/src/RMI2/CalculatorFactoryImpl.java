package RMI2;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class CalculatorFactoryImpl extends UnicastRemoteObject implements CalculatorFactory {//  implementiert das CalculatorFactory Interface. und erbt von UnicastRemoteObject, was sie als Remote-Objekt geeignet macht.
    public CalculatorFactoryImpl() throws RemoteException {
        super();
    }

    @Override
    public Calculator create() throws RemoteException {
        return new CalculatorImpl();
    }
}// Die create() Methode gibt eine neue Instanz von CalculatorImpl zurück, sodass jeder Client mit seinem eigenen Calculator arbeiten kann.

