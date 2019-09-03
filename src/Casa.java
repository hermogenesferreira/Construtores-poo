public class Casa {
    String cor;
    Porta porta1;
    Porta porta2;
    Porta porta3;
    
    void pinta(String s){
        this.cor = s;
        System.out.println("A porta foi pintada de " + this.cor);
    }
    
    int quantasPortasEstaoAbertas(){
        int abertas = 0;  
        if(porta1.aberta == 1)abertas++;  
        if(porta2.aberta == 1 )abertas++;  
        if(porta3.aberta == 1)abertas++;
        System.out.println(abertas + " porta(s) esta(ão) abertas!");
        return abertas; 
    }

}
