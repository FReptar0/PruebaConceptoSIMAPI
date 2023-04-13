import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int x = 0, y = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad islas: ");
        x = sc.nextInt();

        System.out.println("Cantidad salas: ");
        y = sc.nextInt();
        sc.close();
        sorteoParaCamillas(x, y);
    }

    public static void sorteoParaCamillas(int x, int y) {
        int cantidadIslas = x; // El numero de islas sera el id ejemplo si es 5 islas el id sera 1,2,3,4,5
        int cantidadSalas = y; // El numero de salas sera el id ejemplo si es 5 salas el id sera 1,2,3,4,5
        int cantidadCamillas = y * 10;

        Camilla[] camillas = new Camilla[cantidadCamillas];
        int idCamilla = 1;
        int idSala = 1;
        int idIsla = 1;

        for (int i = 0; i < cantidadCamillas; i++) {
            camillas[i] = new Camilla(idCamilla, idSala, idIsla);
            idCamilla++;
            idSala++;
            if (idSala > cantidadSalas) {
                idSala = 1;
                idIsla++;
            }
            if (idIsla > cantidadIslas) {
                idIsla = 1;
            }
        }

        for (int i = 0; i < cantidadCamillas; i++) {
            System.out.println("Camilla: " + camillas[i].getIdCamilla() + " Sala: " + camillas[i].getIdSala()
                    + " Isla: " + camillas[i].getIdIsla());
        }

    }
}
