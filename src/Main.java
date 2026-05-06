import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        DispositivoSeguro[] equipos=new DispositivoSeguro[4];


        for(int i=0;i<equipos.length;i++){
            DispositivoSeguro aux=new DispositivoSeguro();
            Scanner ingreso=new Scanner(System.in);
            System.out.println("Ingrese el nombre: ");
            String nombre=ingreso.nextLine();
            aux.setNombre(nombre);
            System.out.println("Ingrese el nivel de riesgo: ");
            int riesgo=ingreso.nextInt();
            aux.setNivelRiesgo(riesgo);
            equipos[i]=aux;
        }

        for(int i=0; i< equipos.length; i++){
            System.out.print("Equipo No "+(i+1)+": ");
            System.out.print(equipos[i].getNombre());
            System.out.println(" - "+equipos[i].getActivo());
        }

    }
}