public class Aluno {
    private String nome;
    private String cpf;
    private Data dataDeNascimento;
   
    
    public Aluno(String n, String c){
        setNome(n);
        setCpf(c);
 }
    
    public void setNome(String n){
        this.nome=n;
    }
    
    public void setCpf(String c){
        this.cpf=c;
    }
    
    public void setData(Data d){
        this.dataDeNascimento = d;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public Data getData(){
        return this.dataDeNascimento;
    }
    
    public String getImprimir(){
       
        return this.nome + "\n" + this.cpf + "\n" + this.dataDeNascimento;
    }
}