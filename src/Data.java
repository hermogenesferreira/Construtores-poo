public class Data {
   
    private int dia;
    private int mes;
    private int ano;
   
    public Data(int d, int m, int a){
        setData(d,m,a);
    }
     public void setData(int d, int m, int a){
        this.dia=d;
        this.mes=m;
        this.ano=a;
    }
    
    public String imprimir(){
        return this.dia + "/" + this.mes + "/" + this.ano;   
    }
}