package ejecutable;

import modelo.Coordenada;;

public class Test
{
    public static void main(String[] args)
    {
        Coordenada i = new Coordenada(20, 30);

        System.out.println("("+i.getX()+","+i.getY()+")");

        Coordenada f = new Coordenada(10, 20);

        System.out.println("\n("+f.getX()+","+f.getY()+")");

        if(i.equals(f))
        {
            System.out.println("\nLas Cordenadas son iguales");

        }
        else
        {
            System.out.println("\nLas Cordenadas son Diferentes ");
        }
       i.CalcularDistancia(f, i);
        
    }
        
}