public class CondicaoTernaria {
    public static void main(String[] args) throws Exception {
        double saldo = 100;
        String grana = saldo >=300 ? "tem grana" : saldo <= 0 &&  saldo <=100  ? "Zerado" : "não tem como sair com essa grana";


        System.out.println(grana);

    }
}
