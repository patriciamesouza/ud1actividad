public class ej3 {
    public static void main (String[] args){
        String coche = "Montana";
        int unidades = 3;
        double precioDia = 35.42;
        double subtotal = precioDia * unidades;
        double desc = 10;
        double desctotal = (subtotal * desc) / 100;
        double res = subtotal - desctotal;

        System.out.println("Modelo de coche: " + coche);
        System.out.println("Unidades: " + unidades);
        System.out.println("Subtotal " + subtotal + "€");
        System.out.println("Descuento: " + desc + "% ");
        System.out.println("Total: " + res + "€");


    }
}
