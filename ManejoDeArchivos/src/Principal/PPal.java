/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import manejodearchivos.mane_de_archivos;

/**
 *
 * @author Alumno Mañana
 */
public class PPal {
    public static void main(String[] args) {
        
        String nombreArchivo = "prueba.txt";
        mane_de_archivos.CREARARCHIVO(nombreArchivo);
        mane_de_archivos.escribirarchivo(nombreArchivo, "es la hora de programar");//esto soobrescribe el archivo
        mane_de_archivos.egregararchivo("prueba.txt", "destiny 2");
        mane_de_archivos.egregararchivo("prueba.txt", "A luis le gustan los furros");
        mane_de_archivos.leerarchivo("prueba.txt");
        
        mane_de_archivos.leerarchivoporpalabras("prueba.txt");
        
        
        
        
        
        
        
        
        /*/jesus PASO 1
            String nombreArchivo2 = "pruebajesus1.txt";
            String contenido2 = "hola me llamo jesu";
            mane_de_archivos.CREARARCHIVO(nombreArchivo2);
            mane_de_archivos.escribirarchivo(nombreArchivo2, contenido2);
            
        */
    }
}
