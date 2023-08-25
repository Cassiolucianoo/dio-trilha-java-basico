public class SmartTv {
    boolean ligar=false;
    int canal=1;
    int volume = 25;

        public void desligar(){
            System.out.println("Tv Desligada");
            ligar = false;
        }
        public void ligar(){
            System.out.println("Tv ligada");
            ligar = true;
        }

        public void canal(int canal){
            this.canal = canal;
            System.out.println("canal fornecido"+ canal);
        }

        public void maisVolume(){
            System.out.println("Aumentando volume");
            volume++;
        }
        public void dimnuiVolume(){
            System.out.println("Diminuindo volume");
            volume--;
        }

}