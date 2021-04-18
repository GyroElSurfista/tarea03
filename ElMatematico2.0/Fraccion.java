public class Fraccion
{
    private int numerador;
    private int denominador;
    
    public Fraccion(int num , int den){
        numerador = num;
        denominador = den;
        signos();
    }
    
    public int getNum(){
        return numerador;
    }
    
    public int getDen(){
        return denominador;
    }
    
    public void signos(){
        if((numerador * denominador > 0)){
            numerador = Math.abs(numerador);
            denominador = Math.abs(denominador);
        } else{
            numerador = (-1)*Math.abs(numerador);
            denominador = Math.abs(denominador);
        }
    }
}
