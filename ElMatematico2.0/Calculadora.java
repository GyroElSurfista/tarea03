public class Calculadora
{
    public String ecuacionCuadratica(int a, int b , int c){
      String respuestas = "";
      double discriminante;
     
      discriminante = (Math.pow(b,2)-(4 * a * c)); 
      if(discriminante < 0){
          double real = (-b)/(2.0 * a);
          double imag = (Math.sqrt(Math.abs(discriminante)))/ (2.0 * a);
          String resp1;
          String resp2;
          
          Complejo sol1 = new Complejo(real, imag);
          Complejo sol2 = new Complejo(real, (-imag));
          
          resp1 = sol1.mostrar();
          resp2 = sol2.mostrar();
          
          respuestas = "X1 = "+ resp1 + " X2 = " + resp2;
      } else{
          double sol1;
          double sol2;
          sol1 = (((-b)+(Math.sqrt(discriminante)))/(2.0 * a));
          sol2 = (((-b)-(Math.sqrt(discriminante)))/(2.0 * a));
          
          respuestas = "X1 = "+ sol1 + " X2 = " + sol2;
      }
      return respuestas;      
    }
    
    public String hallarRecta(Punto p1, Punto p2){
        String ecuacion = "";
        Fraccion pendiente;
        int indepen;
       
        pendiente = new Fraccion ((p1.getY()-p2.getY()),(p1.getX()-p2.getX()));
        
        int n = pendiente.getNum();
        int d = pendiente.getDen();
        int x = p1.getX();
        int y = p1.getY();
        
        if(n > 0 && d != 0){
            indepen = ((-(n * x)) + (d * y));
            if (indepen < 0){
                indepen = Math.abs(indepen);
                ecuacion = n + "x"+ " - " + d + "y " + " - " + indepen + " = 0";
            } else{
                ecuacion = n + "x"+ " - " + d + "y " + " + " + indepen + " = 0";
            }
            
        } else if(n < 0 && d != 0){
            indepen = ((n * x) - (d * y));
            if(indepen < 0){
              indepen = Math.abs(indepen);
              ecuacion = -n + "x"+ " + " + d + "y " + " - " + indepen + " = 0";  
            } else{
              ecuacion = -n + "x" + " + " + d + "y " + " + " + indepen + " = 0";
            }
            
        } else if(n == 0){
            ecuacion = "y = " + y;
        } else if (d == 0){
            ecuacion = "x = " + x;
        }
        return ecuacion;
    }
    
    public double hallarCateto(double hip, double cat1){
        double cat2;
        
        cat2 = Math.sqrt((Math.pow(hip,2.0))-(Math.pow(cat1,2.0)));
        return cat2;
    }
}
