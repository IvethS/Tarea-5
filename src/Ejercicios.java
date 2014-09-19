import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;


public class Ejercicios {
//Trabaje con Kevin Lanza y con la ayuda de los trabajos en clase.
	//Escribe la variable contenido al inicio de un archivo que tiene como nombre nombre_archivo
	//como lo vimos en clase escribimos el archivo, declaramos esa variable
	//hacemos que el mismo try muestre una exception si no se encuentra el archivo
	static void escribirString(String nombre_archivo, String contenido)
	{
		try
	{
		PrintWriter escritor = new PrintWriter(nombre_archivo);
		escritor.write(contenido);
		escritor.flush();
	}catch(Exception e)
	{	
		e.printStackTrace();
	}
		
	}
	
	//Escribe la variable contenido al inicio de un archivo que tiene como nombre nombre_archivo
	//en este se obtiene el contenido en este caso sera un Int
	//y se hace la exception para evitar cualquier error
	static void escribirInt(String nombre_archivo, int contenido)
	{
	
	try
	{
		PrintWriter escritor = new PrintWriter(nombre_archivo);
		escritor.write(contenido);
		escritor.flush();
	}catch(Exception e)
	{	
		e.printStackTrace();
	}
	
	}
	
	//Devuelve el primer entero contenido en el archivo con nombre nombre_archivo
	//en este lo que hace es obtener el entero por eso se declara la variable
	//cuando la obtiene lee el contenido, y se crean las respectivas exceptions.
	
	static int leerEntero(String nombre_archivo)
	{
	try
	{
		File archivo = new File("nombre_archivo");
		Scanner s = new Scanner(nombre_archivo);
		int Integer = 0;
		while(s.hasNext())
		System.out.print(Integer);
	}catch (Exception e)
	{
		e.printStackTrace();
	}
		return -1;
	}
	
	//Devuelve la primera string contenida en el archivo con nombre nombre_archivo
	//de igual forma aqui declaramos el archivo para poder leerlo
	//despues se obtiene la variable que seria letra
	// y nos muestra las respectivas exception
	static String leerString(String nombre_archivo)
	{
		try
	{
		File archivo = new File("nombre_archivo");
		Scanner s = new Scanner(nombre_archivo);
		String letra = "";
		while(s.hasNext())
		System.out.print(letra);
	}catch (Exception e)
	{
		e.printStackTrace();
	}
		return "";
	}
	
	//Devuelve el primer double contenido en el archivo con nombre nombre_archivo
	//se lee el archivo le
	static double leerDouble(String nombre_archivo)
	{
	try
	{
		File archivo = new File("nombre_archivo");
		Scanner s = new Scanner(nombre_archivo);
		Double d = 0.0;
		while(s.hasNext())
		System.out.print(d);
	}catch (Exception e)
	{
		e.printStackTrace();
	}
	}
	
	//Devuelve si el archivo con nombre nombre_archivo contiene la string buscada

	
	static boolean existe(String nombre_archivo, String buscada)
	{

		return false;
	}
	
	//Devuelve el numero menor de un archivo
	//Dado, el archivo unicamente contiene enteros
	//aqui lee el archivo luego declaramos la variable 
	//por medio de un if hacemos la comparacion y luego se muestra el menor
	//este codigo fue obtenido del ejercicio en clase
	static int getNumeroMenor(String nombre_archivo)
	{
	try
	{
		File archivo = new File("nombre_archivo");
		Scanner s = new Scanner(nombre_archivo);
		int menor = 9999;
		while(s.hasNext())
		{
			int num = s.nextInt();
			if(num<menor)
				menor = num;
			
		}
		System.out.print("El menor es: "+menor);
	}catch (Exception e)
	{
		e.printStackTrace();
	}
		return menor;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
