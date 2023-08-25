public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.ligar();

        smartTv.canal(28);

        smartTv.maisVolume();
        smartTv.maisVolume();
        smartTv.maisVolume();
        smartTv.dimnuiVolume();

        System.out.println("TV Ligada ? " + smartTv.ligar);
        System.out.println("Canal selecionado:  " + smartTv.canal);
        System.out.println("Volume da TV:"+ smartTv.volume);

        smartTv.desligar();
    }
}
