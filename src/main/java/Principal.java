
public class Principal {

    public static void main(String[] args) {

        System.out.println("LIMITES DOS TIPOS PRIMITIVOS DO JAVA");

        System.out.println("byte:");
        System.out.println("  Minimo: " + Byte.MIN_VALUE); //-128
        System.out.println("  Maximo: " + Byte.MAX_VALUE); //127

        System.out.println("\nshort:");
        System.out.println("  Minimo: " + Short.MIN_VALUE); //-32768
        System.out.println("  Maximo: " + Short.MAX_VALUE); //32767

        System.out.println("\nint:");
        System.out.println("  Minimo: " + Integer.MIN_VALUE); //-2147483648
        System.out.println("  Maximo: " + Integer.MAX_VALUE); //2147483647

        System.out.println("\nlong:");
        System.out.println("  Minimo: " + Long.MIN_VALUE); //-9223372036854775808
        System.out.println("  Maximo: " + Long.MAX_VALUE); //9223372036854775807

        System.out.println("\nfloat:");
        System.out.println("  Minimo: " + (-Float.MAX_VALUE)); //-3.4028235E38
        System.out.println("  Maximo: " + Float.MAX_VALUE); //3.4028235E38

        System.out.println("\ndouble:");
        System.out.println("  Minimo: " + (-Double.MAX_VALUE)); //-1.7976931348623157E308
        System.out.println("  Maximo: " + Double.MAX_VALUE); //1.7976931348623157E308

        System.out.println("\nchar:");
        System.out.println("  Minimo: " + (int) Character.MIN_VALUE); //0
        System.out.println("  Maximo: " + (int) Character.MAX_VALUE); //65535

        System.out.println("\nboolean:");
        System.out.println("  Valores possiveis: true e false");
    }
}
