package package1;
import package2.*; // importieren wir alles von package 2
public class B {

    // (4)
    private String privateMessage = "This is private";// private ist aber nur zuzugreifen von der gleiche Klasse. also nur Klasse B hat zugriff darauf
    // lass uns unsere main methode zurück in unsere A klasse hinzufügen.
}
