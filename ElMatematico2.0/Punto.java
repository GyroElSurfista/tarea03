public class Punto
{
    private int x;
    private int y;
    
    public Punto(int nX, int nY){
        x = nX;
        y = nY;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public void setX(int nx){
        x = nx;
    }
    
    public void setY(int ny){
        y = ny;
    }
}