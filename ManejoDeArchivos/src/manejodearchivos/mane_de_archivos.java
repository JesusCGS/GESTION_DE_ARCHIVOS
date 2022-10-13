/*
 * NUESTRA CLASE MANEJO DE ARCHIVOS VA A VCONTENER LOS SIGUIENTES METODOS
 *- CREAR ARCHIVOS
 *- GUARDAR INFORMACION EN UN ARCHIVO
 *- ELIMINAR INFORMACIONDE ARCHIVO
 *- ELIMINAR UN ARCHIVO 
 */
package manejodearchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

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
    
}
