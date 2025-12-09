/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Este código lee el fichero que hay en fileName, en este caso fichero.dat, y al ejecutar 
   nos muestra su contenido y el número de caracteres contados.
 */
package Actividad_01_UD3_ED;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author raul
 * fecha: 09/12/2025. Refactorización de los nombres en inglés
 */
public class Actividad_01_UD3_ED 
{
    private static byte[] intermedio = new byte[1000];
    private static String NombreArchivo = "fichero.dat";
    private static FileInputStream inputStream = null;
    private static BufferedInputStream inputBuffer = null;

    public static void inicializateFiles() throws FileNotFoundException
    {
        inputStream = new FileInputStream(NombreArchivo);
        inputBuffer = new BufferedInputStream(inputStream);
    }
    
    public static int showFileText() throws IOException
    {
        int total = 0;
        int NLeidos = 0;
        while((NLeidos = inputStream.read(intermedio)) != -1) 
        {
            System.out.println(new String(intermedio));
            total += NLeidos;
        }
        
        return total;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {        
        try 
        {
            inicializateFiles();
            
            int total = showFileText();           

            System.out.println("\nLeídos " + total + " bytes");
        }
        catch(IOException ex) 
        {
            System.out.println("Error -> " + ex.toString());                
        }
        finally 
        {
            try 
            {
                if( inputBuffer != null && inputStream != null )
                {
                    inputStream.close();
                    inputBuffer.close();
                }                
            } 
            catch (IOException ex) 
            {
                System.out.println("Error al cerrar el fichero -> " + ex.toString());
            }
        }
    }
    
}
