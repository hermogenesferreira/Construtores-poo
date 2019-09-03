public class Porta {
    
    int aberta;
    String cor;
    int dimensaoX;
    int dimensaoY;
    int dimensaoZ;
    
    void abre(){
        this.aberta = 1;
    }
    
    void fecha(){
        this.aberta = 0;
    }
    
    void pinta(String s){
        this.cor = s;
	System.out.println("A porta foi pintada de " + this.cor);
    }
    
    boolean estaAberta(){
        if(this.aberta == 1){
            System.out.println("A porta esta aberta!");
            return true;
        }else{
            System.out.println("A porta esta Fechada!");
            return false;
        }
    }
    
    
}
