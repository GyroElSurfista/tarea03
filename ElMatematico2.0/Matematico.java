public class Matematico
{
    private Calculadora calculadora;
    
    public Matematico(Calculadora calcu){
        calculadora = calcu;
    }
    
    public String indicarNumeros(int a, int b, int c){
        String resultado = "";
        
        if(a > b){
            if(b > c){
                resultado = "Mayor: "+ a + " Medio: "+ b + " Menor: "+ c;
            } else if(c > a){
                resultado = "Mayor: "+ c + " Medio: "+ a + " Menor: "+ b;
            } else{
                resultado = "Mayor: "+ a + " Medio: "+ c + " Menor: "+ b;
            }
        } else if(a > c){
            resultado = "Mayor: "+ b + " Medio: "+ a + " Menor: "+ c;
        } else if(c > b){
            resultado = "Mayor: "+ c + " Medio: "+ b + " Menor: "+ a;
        } else{
            resultado = "Mayor: "+ b + " Medio: "+ c + " Menor: "+ a;
        }
        return resultado;
    }
    
    public double areaCuadrado(double base, double altura){
        double area;
        
        area = base * altura;
        return area;
    }
    
    public double distanciaPuntos(Punto p1, Punto p2){
        double distancia;
        
        distancia = Math.sqrt(Math.pow((p1.getX() - p2.getX()),2) 
                    + Math.pow((p1.getY() - p2.getY()),2));
                    
        return distancia;
    }
    
    public String queCuadrante(Punto p){
        String resultado = "";
        int x;
        int y;
        
        x = p.getX();
        y = p.getY();
        if((x > 0) && (y > 0)){
            resultado = "Primer Cuadrante";
        } else if((x < 0)&&(y > 0)){
            resultado = "Segundo Cuadrante";
        } else if ((x < 0)&&(y < 0)){
            resultado = "Tercer Cuadrante";
        } else if ((x > 0)&&(y < 0)){
            resultado = "Cuarto Cuadrante";
        } else if ((x == 0)&&(y == 0)){
            resultado = "Origen";
        } else if ((x == 0)&&(y != 0)){
            resultado = "Eje Y";
        } else if ((x != 0)&&(y == 0)){
            resultado = "Eje X";
        }
        return resultado; 
    }
    
    public String ecuacionCuadratica(int a, int b, int c){
        String respuesta;
        
        respuesta = calculadora.ecuacionCuadratica(a, b, c);
        return respuesta;
    }
    
    public String hallarRecta(Punto p1, Punto p2){
        String ecuacion;
        
        ecuacion = calculadora.hallarRecta(p1, p2);
        return ecuacion;
    }
    
    public double hallarCateto(double hip, double cat1){
        double cat2;
        
        cat2 = calculadora.hallarCateto(hip, cat1);
        return cat2;
    }
}