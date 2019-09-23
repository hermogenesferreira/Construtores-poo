public class TestaCasa {
    public static void main(String[] args){
        Casa c1 = new Casa("Branco");
        
        Porta p1 = new Porta(1,"Azul",100,200,80);
        Porta p2 = new Porta(1,"Amarelo",20,200,80);
        Porta p3 = new Porta(1,"Verde",80,200,80);
        
        c1.setPorta1(p1);
        c1.setPorta2(p2);
        c1.setPorta3(p3);
        
        p1.setFecha();
        p2.setAbre();
        p3.setFecha();
        p3.setAbre();
        
        c1.getPortasAbertas();
    }
}
