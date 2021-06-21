/*
 * Geometría
 */
package geometria;

/**
 *
 * @author www.ajpdsoft.com
 */
public class Geometria 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //probar clases cálculo áreas figuras geométricas        
        Cuadrado cuadrado = new Cuadrado(10);
        cuadrado.area();
        System.out.println("Área del cuadrado de lado 10: " + 
                cuadrado.getareaCuadrado());
        
        Circulo circulo = new Circulo(200);
        circulo.area();
        System.out.println("Área del círculo de radio 200: " + 
                circulo.getAreaRadio());
        
        Rectangulo rectangulo = new Rectangulo(100, 20);
        rectangulo.area();
        System.out.println("Área del rectángulo de base 100 y altura 20: " + 
                rectangulo.getAreaRectangulo());

        Triangulo triangulo = new Triangulo(5, 10);
        triangulo.area();
        System.out.println("Área del triángulo de base 5 y altura 10: " + 
                triangulo.getareaTriangulo());        
    }    
}
