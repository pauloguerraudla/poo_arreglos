import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        DispositivoSeguro[] equipos=new DispositivoSeguro[4];

        DispositivoSeguro router=new DispositivoSeguro("router cisco",
                "10.1.1.17",5,false);

        DispositivoSeguro ap=new DispositivoSeguro("ap tplink",
                "192.168.4.5",8,true);

        equipos[0]=router;
        equipos[1]=ap;
        equipos[2]=new DispositivoSeguro("switch",
                "127.0.0.1",10,true);
        equipos[3]=router;

        System.out.println(router.setNombre("Aruba"));
        for(int i=0; i< equipos.length; i++){
            System.out.print("Equipo No "+(i+1)+": ");
            System.out.print(equipos[i].getNombre());
            System.out.println(" - "+equipos[i].getActivo());
        }
    }
}