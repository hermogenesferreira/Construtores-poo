public class Produto {
   private String nome;
   private int preço;
   
   public int setDiminuir10(){
    return this.preço = ((this.preço/100)*90);
   }
   
   public int setAumenta25(){
    return this.preço = ((this.preço/100)*115);
   }
}
