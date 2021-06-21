/*
 * Cuadrado
 */
package geometria;

/**
 * @author www.ajpdsoft.com
 */
public class Cuadrado implements FiguraGeometrica
{
    private double lado;
    private double areaCuadrado;

    public Cuadrado(double lado) 
    {
        this.lado = lado;
    }
    
    public double getLado() 
    {
        return lado;
    }

    public void setLado(double lado) 
    {
        this.lado = lado;

    public double getareaCuadrado() 
    {
        return areaCuadrado;
    }    
    
    @Override
    public void area() 
    {
        areaCuadrado = lado * lado;
    }    
}
