public class Produto {
   String nome;
   int preço;
   
   int diminuir10(){
    return this.preço = ((this.preço/100)*90);
   }
   
   int aumenta25(){
    return this.preço = ((this.preço/100)*115);
   }
}
