package miPrincipal;
import java.util.Scanner;
public class Punto{
    private int x,y,z;
    private String dimension;
    public Punto(){
        this.x=0;
        this.y=0;
    }
    public Punto(int coordx,int coordy,int coordz){
        this.x=coordx;
        this.y=coordy;
        this.z=coordz;
    }
    public Punto(int coordx,int coordy){
        this.x=coordx;
        this.y=coordy;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getZ(){
        return z;
    }
    public void setX(int valor){
        this.x=valor;
    }
    public void setY(int valor){
        this.y=valor;
    }
    public void setZ(int valor){
        this.z=valor;
    }
    public void leer(){
        try{
            Scanner entrada = new Scanner(System.in);
            System.out.print("Proporciona el valor de x:");
            this.x = entrada.nextInt();
            System.out.print("Proporciona el valor de y:");
            this.y = entrada.nextInt();
            
        } catch (Exception ex)
        {
            System.err.println(ex.getMessage());
        }
    }
    public void despliega(){
        System.out.println("Valor de x: "+this.x);
        System.out.println("Valor de y: "+this.y);
    }
    public double distancia(Punto p){
        double d;
        d = Math.sqrt(Math.pow(p.x-this.x,2)+Math.pow(p.y-this.y,2));
        return d;
    }

}