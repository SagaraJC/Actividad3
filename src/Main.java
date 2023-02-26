import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Árboles");

        ArrayList <Arbol> arbolList = new ArrayList<>();

        arbolList.add(new Arbol("Abedul",20));
        arbolList.add(new Arbol("Jacaranda",12));
        arbolList.add(new Arbol("Pino",10));
        System.out.println(arbolList);


        System.out.println("*************************************");
        System.out.println("Teatro");

        HashMap<String,Asiento> sala = new HashMap<>();

        sala.put("A1",new Asiento(10,"Cuero",true));
        sala.put("A2",new Asiento(10,"Cuero",true));
        sala.put("A3",new Asiento(10,"Cuero",true));
        sala.put("A4",new Asiento(10,"Cuero",true));
        sala.put("A5",new Asiento(10,"Cuero",true));
        sala.put("A6",new Asiento(10,"Cuero",true));
        sala.put("A7",new Asiento(10,"Cuero",true));
        sala.put("A8",new Asiento(10,"Cuero",true));

        sala.put("B1",new Asiento(10,"Cuero",true));
        sala.put("B2",new Asiento(10,"Cuero",true));
        sala.put("B3",new Asiento(10,"Cuero",true));
        sala.put("B4",new Asiento(10,"Cuero",true));
        sala.put("B5",new Asiento(10,"Cuero",true));
        sala.put("B6",new Asiento(10,"Cuero",true));
        sala.put("B7",new Asiento(10,"Cuero",true));
        sala.put("B8",new Asiento(10,"Cuero",true));

        sala.put("C1",new Asiento(10,"Cuero",true));
        sala.put("C2",new Asiento(10,"Cuero",true));
        sala.put("C3",new Asiento(10,"Cuero",true));
        sala.put("C4",new Asiento(10,"Cuero",true));
        sala.put("C5",new Asiento(10,"Cuero",true));
        sala.put("C6",new Asiento(10,"Cuero",true));
        sala.put("C7",new Asiento(10,"Cuero",true));
        sala.put("C8",new Asiento(10,"Cuero",true));

        sala.put("D1",new Asiento(10,"Cuero",true));
        sala.put("D2",new Asiento(10,"Cuero",true));
        sala.put("D3",new Asiento(10,"Cuero",true));
        sala.put("D4",new Asiento(10,"Cuero",true));
        sala.put("D5",new Asiento(10,"Cuero",true));
        sala.put("D6",new Asiento(10,"Cuero",true));
        sala.put("D7",new Asiento(10,"Cuero",true));
        sala.put("D8",new Asiento(10,"Cuero",true));

        sala.put("E1",new Asiento(6,"Vinil",false));
        sala.put("E2",new Asiento(6,"Vinil",false));
        sala.put("E3",new Asiento(6,"Vinil",false));
        sala.put("E4",new Asiento(6,"Vinil",false));
        sala.put("E5",new Asiento(6,"Vinil",false));
        sala.put("E6",new Asiento(6,"Vinil",false));
        sala.put("E7",new Asiento(6,"Vinil",false));
        sala.put("E8",new Asiento(6,"Vinil",false));

        sala.put("F1",new Asiento(6,"Vinil",false));
        sala.put("F2",new Asiento(6,"Vinil",false));
        sala.put("F3",new Asiento(6,"Vinil",false));
        sala.put("F4",new Asiento(6,"Vinil",false));
        sala.put("F5",new Asiento(6,"Vinil",false));
        sala.put("F6",new Asiento(6,"Vinil",false));
        sala.put("F7",new Asiento(6,"Vinil",false));
        sala.put("F8",new Asiento(6,"Vinil",false));

        sala.put("G1",new Asiento(6,"Vinil",false));
        sala.put("G2",new Asiento(6,"Vinil",false));
        sala.put("G3",new Asiento(6,"Vinil",false));
        sala.put("G4",new Asiento(6,"Vinil",false));
        sala.put("G5",new Asiento(6,"Vinil",false));
        sala.put("G6",new Asiento(6,"Vinil",false));
        sala.put("G7",new Asiento(6,"Vinil",false));
        sala.put("G8",new Asiento(6,"Vinil",false));

        sala.put("H1",new Asiento(6,"Vinil",false));
        sala.put("H2",new Asiento(6,"Vinil",false));
        sala.put("H3",new Asiento(6,"Vinil",false));
        sala.put("H4",new Asiento(6,"Vinil",false));
        sala.put("H5",new Asiento(6,"Vinil",false));
        sala.put("H6",new Asiento(6,"Vinil",false));
        sala.put("H7",new Asiento(6,"Vinil",false));
        sala.put("H8",new Asiento(6,"Vinil",false));

        sala.put("I1",new Asiento(6,"Vinil",false));
        sala.put("I2",new Asiento(6,"Vinil",false));
        sala.put("I3",new Asiento(6,"Vinil",false));
        sala.put("I4",new Asiento(6,"Vinil",false));
        sala.put("I5",new Asiento(6,"Vinil",false));
        sala.put("I6",new Asiento(6,"Vinil",false));
        sala.put("I7",new Asiento(6,"Vinil",false));
        sala.put("I8",new Asiento(6,"Vinil",false));

        sala.put("J1",new Asiento(6,"Vinil",false));
        sala.put("J2",new Asiento(6,"Vinil",false));
        sala.put("J3",new Asiento(6,"Vinil",false));
        sala.put("J4",new Asiento(6,"Vinil",false));
        sala.put("J5",new Asiento(6,"Vinil",false));
        sala.put("J6",new Asiento(6,"Vinil",false));
        sala.put("J7",new Asiento(6,"Vinil",false));
        sala.put("J8",new Asiento(6,"Vinil",false));

        for (String i : sala.keySet()){
            System.out.println("En la Fila y Columna: "+ i + " Corresponde al " + sala.get(i));
        }
    }
}