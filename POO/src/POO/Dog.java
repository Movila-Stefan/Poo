package POO;

public class Dog {

    private String nume; // null
    private int varsta; // 0
    private double greutate; // 0.0
    private String culoare; // null
    private String rasa; // null

    public Dog (){

    }

    public Dog(String nume, int varsta, double greutate, String culoare, String rasa) {
        this.nume = nume;
        this.varsta = varsta;
        this.greutate = greutate;
        this.culoare = culoare;
        this.rasa = rasa;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public double getGreutate() {
        return greutate;
    }

    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }
}
