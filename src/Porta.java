public class Porta {
    
    public int aberta;
    private String cor;
    private int dimensaoX;
    private int dimensaoY;
    private int dimensaoZ;
    
    public Porta(int a, String c, int x, int y, int z){
        setPorta(a, c, x, y, z);        
    }
      
    public void setPorta(int a, String c, int x, int y, int z){
        this.aberta=a;
        this.cor=c;
        this.dimensaoX=x;
        this.dimensaoY=y;
        this.dimensaoX=z;
    }
    
    public String getCor(){
        return this.cor;
    }
    public int getAberta(){
        return this.aberta;
    }
    
    public int getX(){
        return this.dimensaoX;
    }
    
    public int getY(){
        return this.dimensaoY;
    }
    
    public int getZ(){
        return this.dimensaoZ;
    }
  
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
    
    public boolean getEstaAberta(){
        if(this.aberta == 1){
            System.out.println("A porta esta aberta!");
            return true;
        }else{
            System.out.println("A porta esta Fechada!");
            return false;
        }
    }
}
