public class Complejo
{
  private double real;
  private double imag;
  
  public Complejo(double real, double imag){
      this.real = real;
      this.imag = imag;
    }
    
  public String mostrar(){
      String mostrarComplejo;
      if(imag < 0){
          mostrarComplejo = real + " - " + (-imag) + "i";
      } else{
          mostrarComplejo = real + " + " + imag + "i";
      }
      
      return mostrarComplejo;
    }
}
