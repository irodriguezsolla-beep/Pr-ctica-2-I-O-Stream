import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;

public class Metodos {
    public static void copiabyte(String ruta, String fileName, String destFileName){

        File fichero = new File(ruta,fileName);

        if (fichero.exists()){
            File ficheroDestino = new File(ruta, destFileName);
            try{
                FileInputStream entrada = new FileInputStream(fichero);
                FileOutputStream salida = new FileOutputStream(ficheroDestino);

                int byteLeido;
                while ((byteLeido = entrada.read()) != -1) {
                    salida.write(byteLeido);
                }

                entrada.close();
                salida.close();
                System.out.println("Ficheiro copiado correctamente en: " + destFileName);

            }catch (IOException e){
                System.out.println("Erro ao copiar o ficheiro: " + e.getMessage());
            }
        }else{
            System.out.println("O ficheiro " + fileName + " non existe na ruta: " + ruta);
        }

    }
    //3
    public static void copiaengade(String ruta, String fileName, String destFileName){

        File fichero = new File(ruta,fileName);

        if (fichero.exists()){
            File ficheroDestino = new File(ruta, destFileName);
            try{
                FileInputStream entrada = new FileInputStream(fichero);
                FileOutputStream salida = new FileOutputStream(ficheroDestino,true);

                int byteLeido;
                while ((byteLeido = entrada.read()) != -1) {
                    salida.write(byteLeido);
                }

                entrada.close();
                salida.close();
                System.out.println("Ficheiro copiado correctamente en: " + destFileName);

            }catch (IOException e){
                System.out.println("Erro ao copiar o ficheiro: " + e.getMessage());
            }
        }else{
            System.out.println("O ficheiro " + fileName + " non existe na ruta: " + ruta);
        }

    }

}
