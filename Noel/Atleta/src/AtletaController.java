import java.util.ArrayList;
import java.util.Scanner;
public class AtletaController {
    private ArrayList<Atleta> atletas;
    public AtletaController(){}

    public void setAtletas(int n_atletas){
        atletas = new ArrayList<Atleta>();
        for (int i = 0; i < n_atletas; i++) {
            Scanner scanner = new Scanner(System.in);
            Atleta a = new Atleta();
            System.out.println("Ingresa los datos del atleta #"+(i+1));
            System.out.print("Numero de atleta:");
            a.setNumero_atleta(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Nombre del atleta:");
            a.setNombre(scanner.nextLine());
            System.out.print("Tiempo de carrera:");
            a.setTiempo_carrera(scanner.nextFloat());
            atletas.add(a);
        }
    }

    public void getAtletaGanador(){
        float time_a = atletas.get(0).getTiempo_carrera();
        float time_b = 0;
        int index = 0;
        for (int i = 0; i < atletas.size(); i++) {
            time_b = atletas.get(i).getTiempo_carrera();
            if (time_b<time_a){
                time_a=time_b;
                index = i;
            }
        }
        System.out.println("El atleta ganador es:\n"+atletas.get(index).getDatosAtleta());
    }
}
