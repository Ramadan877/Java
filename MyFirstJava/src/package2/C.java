package package2;
import package1.*;// hier importieren wir alles von package 1

public class C {
// (1)
    String defaultMessage= "This is the default access modifier";
    // hier will ich sehen wer kann auf diese no access modifier zugreifenj, probieren wir das in die A klasse:

    // (2)
    public String publicMessage = "this is public"; // jzt werde ich versuchen auf diese public variable zuzugreifen, aber vom A klasse welche in package 1 ist.
    // (3)
    protected String protectedMessage = "This is protected";// protected access modifier bedeutet, das wir auf diese klasse zugreifen können, auch von andere packages, sobald die klasse von dem wir darauf zugreifen eine sub-klasse ist also vererbt diese klasse. lass uns diese Zeile in die A klasse kopieren.
    // (4)
    private String privateMessage = "This is private";// lass uns das in klasse B hinzufügen.
}
