public class Esfera {
    private double raio;
    
    
    public Esfera(double r){
        setRaio(r);
    }
    public void setRaio(double r){
        this.raio=r;
    }
    
    public double getRaio(){
        return this.raio;
    }
    
    public double getVolume(){
        return this.raio = 4*(3.14159*this.raio*this.raio*this.raio)/(3);
    }
}
