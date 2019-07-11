import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
        // declaracion de variebles
        int resta, a = 0, b = 0, t = 1, t2, max = 5, h = 0, k = 0;
        int edad, aActual = 2019, aNacimiento;
        String msg = "", info = "";
        Scanner in = new Scanner(System.in);

        String r = System.getProperty("user.dir");//-- Obtener Ruta del proyecto
        String nF = r + "/salida.txt"; //--Nombre del archivo txt
        String d = "";

        //haciendo el calculo de edades
        // se recibe el año de nacimiento de la persona y se resta con el año actual
        System.out.println("Haciendo el calculo de la edad");

        System.out.println("Ingrese el año de nacimiento:");
        aNacimiento = in.nextInt();

        edad = aActual - aNacimiento;

        msg = "Su edad es:" + edad;
        System.out.println(msg);
        info +=msg+"\n";

        // haciendo la resta de dos numeros
        // se ingresan los valores de a y b respectivamente y se hace la operacion de resta 
        System.out.println("Haciendo Resta");

        System.out.println("Ingrese el valor a");
        a = in.nextInt();
        System.out.println("Ingrese el valor b");
        b = in.nextInt();

        resta = a + b;

        msg = "La resta es:" + resta;

        System.out.println(msg);
        info +=msg+"\n";
        
        // haciendo la serie de fibonaci
        // la serie de fibonaci consiste en una susecion de numero que se obtienen a partir de la sumatoria de dos numeros
        // y el resultados es el numero siguiente de dicha sucesion. La susecion de los numeros empieza con el valor 0 y 1
        System.out.println("Haciendo Serie de Fibonaci");

        msg = "";

        msg += "Serie:";

        for (int i = 0;
                i < max;
                i++) {
            t2 = h;
            h = t + h;
            t = t2;
            msg += " " + t + " ";
        }

        System.out.println(msg);
        info +=msg;
		
		// verificando si la edad es igual a 25, si es mayor de edad o si es un menor de edad
		System.out.println("Verificando si la edad es igual a 25:");
        
		if(edad==25){
			msg = "La edad " + edad+" es igual a 25";
			System.out.println(msg);
			info +=msg+"\n";
		}else if(edad>=18){
			msg = "Es mayor de edad";
			System.out.println(msg);
			info +=msg+"\n";
		}else if(edad<18 && edad>10){
			msg = "Es menor de edad";
			System.out.println(msg);
			info +=msg+"\n";
		}else{
			msg = "La edad " + edad+" no es igual a 25";
			System.out.println(msg);
			info +=msg+"\n";
		}
        
	
		
		
        //-- procedimiento para crear y escribir el archivo .txt
        final String NEXT_LINE = "\n";
        try {
            FileWriter fw = new FileWriter(nF);

            fw.append(info).
                    append(d);

            fw.flush();
            fw.close();
        } catch (IOException e) {
            // capturando el error o excepcion si no se crea el archivo
            e.printStackTrace();
        }

    }

}
