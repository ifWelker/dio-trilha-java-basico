public class SmartTv {
        boolean ligada = false;
        int canal = 1;
        int volume = 25;

        public void aumentarVolume(){
            volume++;
            System.out.println("Aumentando Volume para: " + volume);
        }

        public void diminuirVolume(){
            System.out.println("Dimuindo Volume para: " + volume);
            volume--;
        }

        public void ligar() {
            ligada = true;
        }
        public void desligar() {
            ligada = false;
        }

        public void mudarCanal (int novoCanal){
            canal = novoCanal;
            System.out.println("Novo Canal --> " + canal);
        }

        public void aumentarCanal(){
            canal++;
            System.out.println("Novo Canal --> " + canal);
        }

        public void diminuirCanal(){
            canal--;
            System.out.println("Novo Canal --> " + canal);
        }
}
