//HelloSerice
//
//import java.lang.reflect.InvocationHandler;
//import java.lang.reflect.Method;
//
//public class LoggingHandler implements InvocationHandler {
//
//    private final Object target;
//
//    public LoggingHandler(Object target){
//        this.target = target;// Das objekt auf das der proxy zugreifen soll !
//    }
//
//    @Override
//    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//
//        System.out.println("Vor dem Aufruf der Methode: " + method.getName());
//
//        Object result = method.invoke(target, args);
//
//        System.out.println("Nach dem Aufruf der Methode: " + method.getName());
//
//
//        return result;
//    }
//}





//// MathService:
//
//
//import java.lang.reflect.InvocationHandler;
//import java.lang.reflect.Method;
//
//public class LoggingHandler implements InvocationHandler {
//
//    private final Object target;
//
//    public LoggingHandler(Object target){
//        this.target = target;// Das objekt auf das der proxy zugreifen soll !
//    }
//
//    @Override
//    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//
//        System.out.println(">> aufruf der Methode: " + method.getName() +"mit Argumenten: " + java.util.Arrays.toString(args));
//
//        Object result = method.invoke(target, args);
//
//        System.out.println("<< Ergebnis der Methode:  " + method.getName() + "ist; " + result);
//        return result;
//    }
//}















