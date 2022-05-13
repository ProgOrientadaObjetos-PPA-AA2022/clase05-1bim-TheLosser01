package paquete1;
import java.util.Scanner;

public class Ejecutor2 {
        public static void main(String[] args) {
            
            Scanner entrada = new Scanner(System.in);
            
            
            System.out.println("Ingrese el nombre del barrio: ");
            String nBarrio = entrada.nextLine();
            Barrio b1 = new Barrio(nBarrio);
            
            System.out.println("Ingrese el nombre de la persona: ");
            String nPersona = entrada.nextLine();
            System.out.println("Ingrese la cedula de la persona: ");
            String cPersona = entrada.nextLine();
            
            Persona personaObjeto = new Persona(nPersona, cPersona, b1);
            
            System.out.printf("%s\n", personaObjeto);

        }
    
}
