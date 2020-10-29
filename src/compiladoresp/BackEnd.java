package compiladoresp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BackEnd {
        FileInputStream entrada;
    FileOutputStream salida;

    public String AbrirArchivo(File archivo){
        String documento= "";
        try{
            entrada = new FileInputStream(archivo);
            int x;
            while((x=entrada.read()) !=-1){
                char caracter=(char)x;
                documento+=caracter;
            }
        }catch(Exception e) {      
        }
        return documento;
    }
    
    public String GuardarArchivo(File archivo, String documento){
        String mensaje = null;
        try{
            salida = new FileOutputStream(archivo);
            byte[] bytxt = documento.getBytes();
            salida.write(bytxt);
            mensaje="Archivo Guardar";
        }catch(Exception e){
        }
        return mensaje;
    }
 
}
