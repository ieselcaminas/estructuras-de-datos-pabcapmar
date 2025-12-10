import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> coches = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String coche;
        do{
            coche = sc.nextLine();
            if(!coche.isEmpty()) coches.add(coche);
        }while(!coche.isEmpty());

        Collections.sort(coches);

        for(String c :  coches){
            System.out.println(c);
        }
    }
}
