public class Casa {
    private String cor;
    private Porta porta1;
    private Porta porta2;
    private Porta porta3;
    
    public void getPinta(String s){
        this.cor = s;
        System.out.println("A porta foi pintada de " + this.cor);
    }
    
    public int setQuantasPortasEstaoAbertas(){
        int abertas = 0;  
        if(porta1.aberta == 1)abertas++;  
        if(porta2.aberta == 1 )abertas++;  
        if(porta3.aberta == 1)abertas++;
        System.out.println(abertas + " porta(s) esta(ão) abertas!");
        return abertas; 
    }

}
