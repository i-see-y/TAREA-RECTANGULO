import java.util.Scanner;
public class Rectangulo {
	
	private int ancho;

	private int alto;
	private String color;
	
	public static final float MIPI = (float)3.14;
	
public Rectangulo() {
		
		
		this.ancho = 0;
		this.alto = 0;
		this.color = "no hay color";
	}
	
	public Rectangulo(int ancho, int alto,String color) {
		
		
        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
	}
	public Rectangulo(Rectangulo otro) {
		
		this.ancho = otro.ancho;
		this.alto = otro.alto;
		this.color = otro.color;
	}

	public int getAncho() {
		return ancho;
		} 
	public void setAncho(int ancho) {
		this.ancho = ancho;
		} 
	public int getAlto() {
		return alto; 
		} 
	public void setAlto(int alto) {
		this.alto = alto;
		} 
	public String getColor() {
		return color; 
		} 
	public void setColor(String color) { 
		this.color = color;
		}
	
	public void mostrarDatos() {
		
		System.out.println("Ancho: " + ancho); 
		System.out.println("Alto: " + alto);
		System.out.println("Color: " + color);
	}
	
	public void leerDatos()
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ancho: " + ancho); 
		System.out.println("Alto: " + alto);
		System.out.println("Color: " + color);
	}
	
	public void cambiarDatos() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Introduce el  ancho: ");
		
		int ancho = in.nextInt();
		
		System.out.print("Introduce el alto ");
		int alto = in.nextInt();
		
		
	   System.out.print("Introduce el nuevo color (deja en blanco para no cambiar): ");
	   
	   String Color = in.nextLine();
	  
	   System.out.print("Introduce  coordenada X : ");
	 int  x= in.nextInt();
	   
	   System.out.print("Introduce  coordenada Y : ");
           int y = in.nextInt();

	}
	
	public String toString() {
		return "Rectangulo [ ancho=" + ancho + ", alto=" + alto + ", color=" + color + "]";
	}
}
