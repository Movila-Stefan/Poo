package POO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Mouse mouse1 = new Mouse();
        System.out.println("Nume mouse 1: " + mouse1.nume);
        System.out.println("Varsta mounse 1: " + mouse1.varsta);
        mouse1.nume = "rex";
        System.out.println("noul nume este: " + mouse1.nume);


        Mouse mouse2 = new Mouse();
        System.out.println("Nume mouse 2: " + mouse2.nume);
        System.out.println("Varsta mounse 2: " + mouse2.varsta);
        mouse2.varsta = 5;
        System.out.println("noua varsta a mouse 2 este: " + mouse2.varsta);


        Mouse mouse3 = new Mouse();
        System.out.println("Nume mouse 3: " + mouse3.nume);
        System.out.println("Greutatea mounse 3: " + mouse3.greutate);
        mouse3.greutate = 5;
        System.out.println("Greutatea mounse 3: " + mouse3.greutate);
        mouse3.cresteGreutatea(4);
        System.out.println("noua greutate a mouse 3 este: " + mouse3.greutate);


        Dog dog1 = new Dog();
        System.out.println("culoare" + dog1.getCuloare());
        System.out.println("greutate" + dog1.getGreutate());
        System.out.println("nume" + dog1.getNume());
        System.out.println("rasa" + dog1.getRasa());
        System.out.println("varsta" + dog1.getVarsta());
        dog1.setCuloare("rosu");
        dog1.setGreutate(11);
        dog1.setRasa("german");
        dog1.setNume("fram");
        dog1.setVarsta(2);
        System.out.println("noua culoare" + dog1.getCuloare());
        System.out.println("noua greutate" + dog1.getGreutate());
        System.out.println("noua nume" + dog1.getNume());
        System.out.println("noua rasa" + dog1.getRasa());
        System.out.println("noua varsta" + dog1.getVarsta());


        Dog dog2 = new Dog("mars", 1, 2.2, "Rosu", "Redbul");
        System.out.println("noua culoare dog2" + dog2.getCuloare());
        System.out.println("noua greutate dog2" + dog2.getGreutate());
        System.out.println("noua nume dog2" + dog2.getNume());
        System.out.println("noua rasa dog2" + dog2.getRasa());
        System.out.println("noua varsta dog2" + dog2.getVarsta());

        dog2.setGreutate(22.2);


        Scanner scannerNr = new Scanner(System.in);
        Scanner scanneText = new Scanner(System.in);

        System.out.print(" cati catei vrei in ferma: ");

        int nrDeCatei = scannerNr.nextInt();
        Dog[] dogs = new Dog[nrDeCatei];

        System.out.println(" elementele cateilor: ");
        for (int i = 0; i < dogs.length; i++) {
            System.out.println(" Nume catel " + i + ":");
            String nume = scanneText.nextLine();
            System.out.println(" varsta catel " + i + ":");
            int varsta = scannerNr.nextInt();
            System.out.println(" Greutate catel " + i + ":");
            double greutate = scannerNr.nextDouble();
            System.out.println(" Culoarea catel " + i + ":");
            String culoare = scanneText.nextLine();
            System.out.println(" rasa catel " + i + ":");
            String rasa = scanneText.nextLine();

            Dog dog = new Dog(nume, varsta, greutate, culoare, rasa);
            dogs[i] = dog;
        }
        int variantaMeniuAleasa;
        do {
        afisareMeniu();
        System.out.print(" alege din meniu: ");

        variantaMeniuAleasa = scannerNr.nextInt();

        switch (variantaMeniuAleasa) {
            case 1:
                //for (int i = 0; i < dogs.length; i++) {
                //  int nr = 1;
                //  System.out.println("Nume catel " + nr + ":" + dogs[i].getNume());

                //  System.out.println("varsta catel " + nr + ":" + dogs[i].getVarsta());

                //   System.out.println("Greutate catel " + nr + ":" + dogs[i].getGreutate());

                //   System.out.println("Culoarea catel " + nr + ":" + dogs[i].getNume());

                //  System.out.println("rasa catel " + nr + ":" + dogs[i].getRasa());
                //  nr++;
        //}

                afiseazaCatei(dogs);
                break;

            case 2:
                sumaVarstelor(dogs);
               // double sumaVarstelor = 0;
               // for (int i = 0; i < dogs.length; i++) {
               //     sumaVarstelor = sumaVarstelor + dogs[i].getVarsta();
               // }
               // System.out.println("Suma varstelor tuturor cateilor este: " + sumaVarstelor);
                break;
            case 3:
               //  ---------> greutateaTotala(dogs);
                double suma = calculgreutate(dogs);
                System.out.println(" greutatea tuturor cateilor este: " + suma);
             //   double greutateTotala = 0;
             //   for (int i = 0; i < dogs.length; i++) {
             //       greutateTotala = greutateTotala + dogs[i].getGreutate();
             //   }
             //   System.out.println("greutatea tuturor cateilor este: " + greutateTotala);

                break;

            case 4:
                rasaSpecificata(dogs);
              //  System.out.println("ce rasa doresti: ");
              //  String RasaAleasa = scanneText.nextLine();
              //  for (int i = 0; i < dogs.length; i++) {

              //  }
                break;

            default:
                System.out.println(" Adios mucecios ");
                break;
        }
    }while (variantaMeniuAleasa !=5);
    }


    public static void afisareMeniu() {

        System.out.println(" 1. Afisare catei");
        System.out.println(" 2. Suma varstelor cateilor");
        System.out.println(" 3. greutatea tuturor cateilor");
        System.out.println(" 4. catei dontro anume rasa specificata de la tastatura");
        System.out.println(" 5. Exit");
    }

   static void afiseazaCatei(Dog[] array){
        System.out.println("In ferma avem: ");
    for (int i = 0 ; i < array.length; i++){
        Dog dogcurrent = array[i];
        System.out.println(" nume: "+ dogcurrent.getNume() +" varsta: "+ dogcurrent.getVarsta() +" greutate: "+ dogcurrent.getGreutate() +" culoare: "+ dogcurrent.getCuloare() +" rasa: "+ dogcurrent.getRasa());
    }

    }

    static void sumaVarstelor(Dog[] array){
        double sumaVarstelor = 0;
        for (int i = 0; i < array.length; i++) {
            Dog dogcurrent = array[i];
            sumaVarstelor = sumaVarstelor + dogcurrent.getVarsta();
        }
        System.out.println(" Suma varstelor tuturor cateilor este: " + sumaVarstelor);
    }

    static void greutateaTotala(Dog[] array){
        double greutateTotala = 0;
        for (int i = 0; i < array.length; i++) {
            Dog dogcurrent = array[i];
            greutateTotala = greutateTotala + dogcurrent.getGreutate();
        }
        System.out.println(" greutatea tuturor cateilor este: " + greutateTotala);
    }
    static double calculgreutate(Dog[] array){
        double greutatetotala = 0;
        for (int i = 0; i < array.length; i++) {
            Dog dogcurrent = array[i];
            greutatetotala += dogcurrent.getGreutate();
        }
        return greutatetotala;
    }

    static void rasaSpecificata(Dog[] array){
        Scanner scanertext = new Scanner(System.in);
        System.out.println(" ce rasa doresti: ");
        String rasaAleasa = scanertext.nextLine();
        for (int i = 0; i < array.length; i++) {
            Dog dogcurrent = array[i];
            if (array[i].getRasa().equals(rasaAleasa)){
                System.out.println(" nume: "+ dogcurrent.getNume() +" varsta: "+ dogcurrent.getVarsta() +" greutate: "+ dogcurrent.getGreutate() +" culoare: "+ dogcurrent.getCuloare() +" rasa: "+ dogcurrent.getRasa());
            }

        }
    }


}