package POO;

public class Mouse  {
    public String nume = "Necunoscut";
    public int varsta;
    public double greutate;
    public Mouse(){
        System.out.println("Mouse creat");
    }


    public void cresteGreutatea (double greutatePrimita){
        greutate = greutate + greutatePrimita;
    }



}
