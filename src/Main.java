public class Main {

    public static void main(String[] args) {

        SalaCine cine = new SalaCine();

        cine.reservarAsiento(4, 6);
        cine.reservarAsiento(5, 5);

        cine.mostrarSala();

        cine.buscarAsientosContiguos();
    }
}