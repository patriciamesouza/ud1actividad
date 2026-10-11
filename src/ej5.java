public class ej5 {
    public static void main(String[] args){
        double alcoche = 4;
        double almoto = 1;
        double alpat = 2;
        double alfurg = 1;
        double total = alcoche + almoto + alpat + alfurg;

        double coche = (alcoche / total) * 100;
        double moto = (almoto / total) * 100;
        double patinete = (alpat / total) * 100;
        double furgo = (alfurg / total) * 100;


        System.out.println("Total de veiculos: " + total);
        System.out.println("Coches: " + coche + "%");
        System.out.println("Moto: " + moto + "%");
        System.out.println("Patinete: " + patinete + "%");
        System.out.println("Furgoneta: " + furgo + "%");

    }
}
