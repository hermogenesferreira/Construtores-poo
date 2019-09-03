public class TestaPorta {
    public static void main(String[] args){
     
        Porta p1 = new Porta();
        p1.aberta = 1;
        p1.cor = "Azul";
        p1.dimensaoX = 100;
        p1.dimensaoY = 200;
        p1.dimensaoZ = 80;
       
        p1.abre();
        p1.fecha();
        p1.pinta("Amarelo");
        
        p1.estaAberta();     
    }
}
