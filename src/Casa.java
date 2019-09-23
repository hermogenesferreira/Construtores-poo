public class Casa {
    private String cor;
    private Porta porta1;
    private Porta porta2;
    private Porta porta3;
    
    public Casa(String c){
        setCasa(c);
    }
    public void setCasa(String c){
        this.cor=c;
    }
    
    public void setPorta1(Porta p){
        this.porta1=p;
    }
    
    public void setPorta2(Porta p){
        this.porta2=p;
    }   
    
    public void setPorta3(Porta p){
        this.porta3=p;
    }
    
      public void getPinta(String s){
        this.cor = s;
        System.out.println("A porta foi pintada de " + this.cor);
    }
    
    public int getPortasAbertas(){
        int abertas = 0;  
        if(this.porta1.aberta == 1)abertas++;  
        if(this.porta2.aberta == 1)abertas++;  
        if(this.porta3.aberta == 1)abertas++;
        System.out.println(abertas + " Portas Estão Abertas!");
        return abertas;
    }
}
