import java.util.Scanner;


public class Punto {
Scanner in = new Scanner(System.in);
	private int x;
	private int y;
	
	public Punto ()
	{
		x = 0;
		y = 0;
	}
	
	public Punto (int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Punto (int p[])
	{
		this.x = p[0];
		this.y = p[1];
	}
	
	public Punto (Punto punto)
	{
		this.x = punto.x;
		this.y = punto.y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void leerDatos ()
	{
           System.out.printl("X :");
		x = in.nextInt
         System.out.println("");
		System.out.println("Y");
                y = in.nextInt
	}

	public void mostrarDatos ()
	{
		System.out.println("X :" + x);
		System.out.println("Y :" + y);
	}
	
	public boolean esIgual (Punto p)
	{
		boolean igual = true;
		
		if (this.x != p.x || this.y != p.y)
			igual = false;
		
		return igual;
	}

}
