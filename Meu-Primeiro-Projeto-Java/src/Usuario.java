public class Usuario {
    public static void main(String[] arrgs) throws Exception{
        // Função chamada pelo arquiva SmatTv.java
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ?" + smartTv.ligada);
        System.out.println("Canal Atual ?" + smartTv.canal);
        System.out.println("Volume Atual ?" + smartTv.volume);

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.mudarCanal(10);
        smartTv.diminuirCanal();
        smartTv.desligar();
        
        System.out.println("TV Ligada ?" + smartTv.ligada);
        System.out.println("Canal Atual ?" + smartTv.canal);
        System.out.println("Volume Atual ?" + smartTv.volume);
    }
}
