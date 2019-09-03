public class TestaCasa {
    public static void main(String[] args){
        Casa c1 = new Casa();
        c1.cor = "Branco";
        
        Porta p1 = new Porta();
        Porta p2 = new Porta();
        Porta p3 = new Porta();
        
        c1.porta1 = p1;
        c1.porta2 = p2;
        c1.porta3 = p3;
        
        p1.fecha();
        p2.abre();
        p3.fecha();
        p3.abre();
        
        c1.quantasPortasEstaoAbertas();
         
    }
    
}
