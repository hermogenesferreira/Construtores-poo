public class TestaPorta {
    public static void main(String[] args){
     
        Porta p1 = new Porta(1,"Azul",100,200,80);
   
        p1.setAbre();
        p1.setFecha();
        p1.setPinta("Amarelo");
        
        p1.getEstaAberta();     
    }
}
