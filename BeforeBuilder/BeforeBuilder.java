import java.util.*;

// Senza l'uso del pattern Builder
class Automobile {
    private String modello;

    public String getModello() {
        return modello;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnno() {
        return anno;
    }

    public String getColore() {
        return colore;
    }

    private String marca;
    private int anno;
    private String colore;

    public Automobile(String modello, String marca, int anno, String colore) {
        this.modello = modello;
        this.marca = marca;
        this.anno = anno;
        this.colore = colore;
    }


}

public class BeforeBuilder {
    public static void main(String[] args) {
        Automobile auto = new Automobile("Fiesta", "Ford", 2022, "Blu");
        System.out.println("Automobile: " + auto.getModello() + ", " + auto.getMarca() + ", " + auto.getAnno() + ", " + auto.getColore());
    }
}