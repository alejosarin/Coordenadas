package modelo;

public class Coordenada 
{
    private double x;
    private double y;
    
    public Coordenada()
    {

    }

    public Coordenada(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public String toString() 
    {
       
        return "";
    }
    public boolean equals(Object d)
    {
        
        Coordenada diferente = (Coordenada)d;
        return (x==diferente.getX())&&(y==diferente.getY());
    }
    public  double CalcularDistancia( Coordenada f, Coordenada i)
    {
        Double d;
        d=Math.sqrt(Math.pow((f.getY()-i.getY()), 2)+Math.pow((f.getX()-i.getX()),2));
        System.out.println("Distancia De las cordenadas es "+d);

        return d;
    }
}
    

