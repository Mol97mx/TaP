package filedemo;
import java.io.File;
/**
 *
 * @author mol97
 */
public class FileDemo {
    public void analizarArchivo(String ruta){
        File nombre=new File(ruta);
        if(nombre.exists()){
            if(nombre.isFile())
                System.out.println("Es un archivo");
            else if(nombre.isDirectory()){
                System.out.println("Es un directorio");
            }
            if(nombre.isAbsolute()){
                System.out.println("es ruta absoluta");
            }
            else{
                System.out.println("No es ruta absoluta");
            }
            System.out.println("la utlima moficiacion:"+nombre.lastModified());
            System.out.println("Tamaño del archivo"+nombre.length());
            System.out.println("Su ruta es:"+nombre.getPath());
            System.out.println("Su ruta absoluta es:"+nombre.getAbsolutePath());

            if(nombre.isDirectory()){
                //muestra el listado de directorios
                String directorio []=nombre.list();
                System.out.println("Contenido del directorio: \n");
                for(String nombreDirectorio:directorio){
                    System.out.println("El nombre del directorio "
                            + "es:"+nombreDirectorio);
                }
            }
        }
        else{
            System.out.println(ruta+" no existe");
        }
    }
    
    public static void main(String[] args) {
        FileDemo demo=new FileDemo();
        demo.analizarArchivo("C:\\Users\\mol97\\Videos\\Captures");
    }
    
}
