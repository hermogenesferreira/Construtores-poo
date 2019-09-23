public class Produto {
   private String nome;
   private int preco;
   
   public Produto(String n, int p){
       setNome(n);
       setPreco(p);
   }
   
   public void setNome(String n){
       this.nome = n;
   }
   
   public void setPreco(int p){
       this.preco = p;
   }
   
   public String getNome(){
       return this.nome;
   }
   
   public int getPreco(){
       return this.preco;
   }
   
   public int setDiminuir10(){
    return this.preco = ((this.preco/100)*90);
   }
   
   public int setAumenta25(){
    return this.preco = ((this.preco/100)*125);
   }
}
