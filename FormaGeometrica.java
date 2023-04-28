public interface FormaGeometrica{
     public double calculaPerimetro();
     public double calculaArea();
 }


//Circulo
public class Circulo implements FormaGeometrica{
    
    private double raio;
    

public Circulo (double raio){
    this.raio = raio;
}

public double calculaPerimetro(){
    return raio*3.14*2;
}

public double calculaArea(){
    return (raio*raio)*3.14;
  }
}


//Quadrado
public class Quadrado implements FormaGeometrica{
    private double lado;

  public Quadrado(double lado){
      this.lado = lado;
     }
  public double calculaPerimetro(){
      return(lado*4);
     }
     
   public double calculaArea() {
      return (lado*lado);
  }

}


//Quadrilatero
public abstract class Quadrilatero implements FormaGeometrica{
    
     private double lado01;
     private double lado02;
     private double lado03;
     private double lado04;
     
     public Quadrilatero(double lado01,double lado02,double lado03, double lado04){
       
         this.lado01 =lado01;
         this.lado02 =lado02;
         this.lado03 =lado03;
         this.lado04 =lado04;
     }
     
     public double calculaPerimetro(double lado01){
     return this.lado01+this.lado02+this.lado03+this.lado04;
     }
 }


//Retangulo
public class Retangulo implements FormaGeometrica{
    
    private double base;
    private double altura;
    
    
    public Retangulo(double base,double altura){
        this.base = base;
        this.altura = altura;
     }
     
     public double calculaPerimetro(){
         return (base*2)+(altura*2);
     }
     
     public double calculaArea(){
         return(base*altura);
         
     }
}
