package POO;

public class Main {
    public static void main(String[] args) {


    Mouse mouse1 = new Mouse();
        System.out.println("Nume mouse 1: " +mouse1.nume);
        System.out.println("Varsta mounse 1: " +mouse1.varsta);
        mouse1.nume="rex";
        System.out.println("noul nume este: " +mouse1.nume);


        Mouse mouse2 = new Mouse();
        System.out.println("Nume mouse 2: " +mouse2.nume);
        System.out.println("Varsta mounse 2: " +mouse2.varsta);
        mouse2.varsta= 5;
        System.out.println("noua varsta a mouse 2 este: " +mouse2.varsta);


        Mouse mouse3 = new Mouse();
        System.out.println("Nume mouse 3: " +mouse3.nume);
        System.out.println("Greutatea mounse 3: " +mouse3.greutate);
        mouse3.greutate = 5;
        System.out.println("Greutatea mounse 3: " +mouse3.greutate);
        mouse3.cresteGreutatea(4);
        System.out.println("noua greutate a mouse 3 este: " +mouse3.greutate);





        Dog dog = new Dog();
        System.out.println("culoare"+dog.getCuloare());
        System.out.println("greutate"+dog.getGreutate());
        System.out.println("nume" +dog.getNume());
        System.out.println("rasa"+dog.getRasa());
        System.out.println("varsta"+dog.getVarsta());
        dog.setCuloare("rosu");
        dog.setGreutate(11);
        dog.setRasa("german");
        dog.setNume("fram");
        dog.setVarsta(2);
        System.out.println("noua culoare"+dog.getCuloare());
        System.out.println("noua greutate"+dog.getGreutate());
        System.out.println("noua nume" +dog.getNume());
        System.out.println("noua rasa"+dog.getRasa());
        System.out.println("noua varsta"+dog.getVarsta());



        Dog dog2 = new Dog("mars",1,2.2,"Rosu","Redbul");
        



    }
    }