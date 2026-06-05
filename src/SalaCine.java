public class SalaCine {

    private int[][] sala;

    public SalaCine() {
        sala = new int[8][10];
    }

    public void reservarAsiento(int fila, int col) {

        if (fila >= 0 && fila < 8 &&
            col >= 0 && col < 10) {

            if (sala[fila][col] == 0) {

                sala[fila][col] = 1;
                System.out.println("Asiento reservado");

            } else {

                System.out.println("Asiento ocupado");
            }

        } else {

            System.out.println("Posicion invalida");
        }
    }

    public void buscarAsientosContiguos() {

        for (int i = 0; i < sala.length; i++) {

            for (int j = 0; j < sala[i].length - 1; j++) {

                if (sala[i][j] == 0 &&
                    sala[i][j + 1] == 0) {

                    System.out.println(
                        "Asientos libres en fila "
                        + i +
                        " columnas "
                        + j +
                        " y "
                        + (j + 1)
                    );

                    return;
                }
            }
        }

        System.out.println("No hay asientos contiguos");
    }

    public void mostrarSala() {

        for (int i = 0; i < sala.length; i++) {

            for (int j = 0; j < sala[i].length; j++) {

                System.out.print(sala[i][j] + " ");
            }

            System.out.println();
        }
    }
}