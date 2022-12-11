
public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setColor(Color.BLANCO);
        subaru.setCilindrada(2.0);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda", "Mazda", Color.ROJO, 3.0);
    mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.leerFabricante() = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);
        nissan.setTipo(TipoAutomovil.PICKUP);
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);
        nissan2.setColor(Color.AMARILLO);
        nissan2.setTipo(TipoAutomovil.PICKUP);
        Automovil.setColorPatente(Color.AZUL);

        Automovil auto = new Automovil();

        System.out.println("\n=========== SUBARU ============\n" + subaru.verDetalle());
        System.out.println("\n=========== MAZDA ============\n" + mazda.verDetalle());
        System.out.println("\n=========== NISSAN ============\n" + nissan.verDetalle());
        System.out.println("\n=========== NISSAN2 ============\n" + nissan2.verDetalle());

        System.out.println("Automóvil.getColorPatente() = " + Automovil.getColorPatente());

        System.out.println("Kilómetros por litros = " + Automovil.calcularConsumoEstatico(300, 60));

        System.out.println("Velocidad máxima carretera: " + Automovil.VELOCIDAD_MAXIMA_CARRETERA + "km");
        System.out.println("Velocidad máxima ciudad: " + Automovil.VELOCIDAD_MAX_CIUDAD + "km");

        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("tipoSubaru = " + tipoSubaru.getNombre());
        System.out.println("tipoSubaru = " + tipoSubaru.getDescripcion());
    }
}
