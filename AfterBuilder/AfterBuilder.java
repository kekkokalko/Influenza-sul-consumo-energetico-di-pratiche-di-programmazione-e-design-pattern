import java.util.*;

// Con il pattern Builder
class Automobile {
    private String modello;
    private String marca;
    private int anno;
    private String colore;

    private Automobile(Builder builder) {
        this.modello = builder.modello;
        this.marca = builder.marca;
        this.anno = builder.anno;
        this.colore = builder.colore;
    }

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

    public static class Builder {
        private String modello;
        private String marca;
        private int anno;
        private String colore;

        public Builder(String modello, String marca) {
            this.modello = modello;
            this.marca = marca;
        }

        public Builder setAnno(int anno) {
            this.anno = anno;
            return this;
        }

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

        public Builder setColore(String colore) {
            this.colore = colore;
            return this;
        }

        public Automobile build() {
            return new Automobile(this);
        }
    }

    // Getters
}

public class AfterBuilder {
    public static void main(String[] args) {
        for(int i=0;i<1000000;i++){
        Automobile auto = new Automobile.Builder("Fiesta", "Ford")
                .setAnno(2022)
                .setColore("Blu")
                .build();
        System.out.println("Automobile: " + auto.getModello() + ", " + auto.getMarca() + ", " + auto.getAnno() + ", " + auto.getColore());
    }}
}
