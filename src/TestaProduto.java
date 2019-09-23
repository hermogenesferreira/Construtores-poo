public class TestaProduto {
    public static void main(String[] args){
        Produto p1 = new Produto("Mouse",100);
        
        p1.setAumenta25();
        System.out.println(p1.getPreco());
        
        p1.setDiminuir10();
        System.out.println(p1.getPreco());
    }
}
