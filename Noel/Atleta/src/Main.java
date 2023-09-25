import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Atleta a = new Atleta(1,"Christian",2);
        ArrayList<Atleta> atletas = new ArrayList<Atleta>();

        for (int i = 0; i < 5; i++) {
            atletas.add(a);
        }
        for(Atleta atleta: atletas) {
            System.out.println(atleta.getDatosAtleta());
        }
    }
}