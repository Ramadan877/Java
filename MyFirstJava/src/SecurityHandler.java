// wir möchten hier eine methode erstellen SecurityHandler: die Prüft, ob ein Methodenaufruf erlaubt ist, basierend auf dem Methodennamen.

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//Die Klasse SecurityHandler implementiert das InvocationHandler-Interface. Das bedeutet, dass sie die Methode invoke bereitstellen muss, die aufgerufen wird, wenn eine Methode auf dem Proxy-Objekt ausgeführt wird.

public class SecurityHandler implements InvocationHandler {
    private final Object target;
// target: Das echte Objekt (z.B. MathServiceImpl), auf das die Methodenaufrufe weitergeleitet werden, nachdem die Sicherheitsprüfung durchgeführt wurde.

    public SecurityHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (!isAuthorized(method.getName())) {
            throw new SecurityException("Benutzer ist nicht berechtigt, die Methode " + method.getName() + " aufzurufen.");
        }
        return method.invoke(target, args);
    }
    // Prozess:
    //Überprüfe, ob die Methode autorisiert ist (isAuthorized(method.getName())).
    //Wenn nicht, werfe eine SecurityException.
    //Wenn autorisiert, führe die Methode auf dem target-Objekt mit method.invoke(target, args) aus.

    private boolean isAuthorized(String methodName) {// Diese Methode überprüft den Namen der Methode, die ausgeführt werden soll (method.getName()).
        // Beispiel: nur Methoden, die mit "add" beginnen, sind erlaubt
        return methodName.startsWith("add");
    }
}


//um diese Methode aber auszuführen, müssen wir einen MultiHandlerProxy in unserem main erstellen, der Kombiniert mehrere InvocationHandler und führt sie nacheinander aus.






















