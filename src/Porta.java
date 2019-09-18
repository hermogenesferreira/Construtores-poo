public class Porta {
    
    public int aberta;
    private String cor;
    private int dimensaoX;
    private int dimensaoY;
    private int dimensaoZ;
    
    public void setAbre(){
        this.aberta = 1;
    }
    
    public void setFecha(){
        this.aberta = 0;
    }
    
    public void setPinta(String s){
        this.cor = s;
	System.out.println("A porta foi pintada de " + this.cor);
    }
    
    public boolean setEstaAberta(){
        if(this.aberta == 1){
            System.out.println("A porta esta aberta!");
            return true;
        }else{
            System.out.println("A porta esta Fechada!");
            return false;
        }
    }
    
    
}
