public class Main {

    public static void main(String[] args) {

        SalaCine cine = new SalaCine();

        cine.reservarAsiento(2, 3);
        cine.reservarAsiento(2, 4);

        cine.mostrarSala();

        cine.buscarAsientosContiguos();
    }
}