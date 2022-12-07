
public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setColor("Blanco");
        subaru.setCilindrada(2.0);

        Automovil mazda = new Automovil("Mazda", "Mazda", "Rojo", 3.0);

        System.out.println("mazda.leerFabricante() = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);

        Automovil nissan2 = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);

        nissan2.setColor("Amarillo");
        Automovil.setColorPatente("Verde");
        Automovil auto = new Automovil();

        System.out.println("\n=========== SUBARU ============\n" + subaru.verDetalle());
        System.out.println("\n=========== MAZDA ============\n" + mazda.verDetalle());
        System.out.println("\n=========== NISSAN ============\n" + nissan.verDetalle());
        System.out.println("\n=========== NISSAN2 ============\n" + nissan2.verDetalle());

        System.out.println("Automóvil.getColorPatente() = " + Automovil.getColorPatente());

        System.out.println("Kilómetros por litros = " + Automovil.calcularConsumoEstatico(300, 60));

        System.out.println("Velocidad máxima carretera: " + Automovil.VELOCIDAD_MAXIMA_CARRETERA+"km");
        System.out.println("Velocidad máxima ciudad: " + Automovil.VELOCIDAD_MAX_CIUDAD+"km");
    }
}
