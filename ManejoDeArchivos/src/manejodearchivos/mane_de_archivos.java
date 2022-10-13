/*
 * NUESTRA CLASE MANEJO DE ARCHIVOS VA A VCONTENER LOS SIGUIENTES METODOS
 *- CREAR ARCHIVOS
 *- GUARDAR INFORMACION EN UN ARCHIVO
 *- ELIMINAR INFORMACIONDE ARCHIVO
 *- ELIMINAR UN ARCHIVO 
 */
package manejodearchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EL NOVIO DE TU MAMA
 */
public class mane_de_archivos {
    
    public static void CREARARCHIVO(String nombre){
        
        File archivo = new File(nombre);
        try{
        PrintWriter salida = new PrintWriter(archivo);
        salida.close();
        }catch(FileNotFoundException ex){
               ex.printStackTrace(System.out);
        } 
    }
    public static void escribirarchivo(String nombre,String contenido){
        PrintWriter salida = null;
         File archivo = new File(nombre);
        try {//se que el fichero exixte
            salida = new PrintWriter(archivo);
            salida.println(contenido);
            System.out.println("se ha credo el archivo!!!");
        } catch (FileNotFoundException ex) {//el fichero no exixte->excep.
            ex.printStackTrace(System.out);
        } finally {//este bloque siempre se ejecuta
            salida.close();
        }
        
        
    }
    
    //este metodo agrega texto al archivo , no,lo sobreescribe
    public static void egregararchivo(String nombre,String contenido){
        PrintWriter salida = null;
          File archivo = new File(nombre);
        try {
             salida = new PrintWriter(new FileWriter(nombre,true));
             salida.println(contenido);
             System.out.println("se ha añadido el contenido nuevo");
        } catch (IOException ex) {
          
        } finally {//este bloque siempre se ejecuta
            salida.close();
        }
    }
    
    public static void leerarchivo(String nombre){
        //1.se declara el file
         BufferedReader entrada;
         File archivo = new File(nombre);
        try {
            //2.creamos el descriptor de lectura del fichero
             entrada = new BufferedReader(new FileReader(archivo));
              String lectura = entrada.readLine();
            //3. ahora recorremos lectura hasta fin de archivo
            while (lectura!= null){
                System.out.println("lectura :" +lectura);
                lectura= entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
           ex.printStackTrace(System.out);
        }catch (IOException ex){
             ex.printStackTrace(System.out);
        } 
    }
    
    
    public static void leerarchivoporpalabras(String nombre){
        File archivo = new File(nombre);
        
        try {
            Scanner entrada = new Scanner(archivo);
            int cont =0;
            //recorro el fichero hasta fin
            while(entrada.hasNext()){
                String palabra = entrada.next();
                System.out.println(palabra);
                cont = cont +1;
            }
            System.out.println("NUMERO DE PALABRAS DE MI FICHERO = "+cont);
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
}
