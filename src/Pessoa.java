public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(String n, int i){
        setNome(n);
        setIdade(i);
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    
    public void setIdade(int i){
        this.idade = i;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setFazAniversario(){
        int aniversario = this.idade+1;
        this.idade = aniversario;
    }
    
    public void getImprimir(){
        System.out.println("Nome:" + this.nome);
        System.out.println("Idade:" + this.idade);
    }

}
