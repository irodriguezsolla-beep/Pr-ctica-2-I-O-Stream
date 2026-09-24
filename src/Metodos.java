import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Metodos {
    public static void copiabyte(String ruta, String fileName, String destFileName){

        File fichero = new File(ruta,fileName);

        if (fichero.exists()){
            File ficheroDestino = new File(ruta, destFileName);
            try( FileInputStream entrada = new FileInputStream(fichero);
                 FileOutputStream salida = new FileOutputStream(ficheroDestino)){

                int byteLeido;
                while ((byteLeido = entrada.read()) != -1) {
                    salida.write(byteLeido);
                }

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
            try( FileInputStream entrada = new FileInputStream(fichero);
                 FileOutputStream salida = new FileOutputStream(ficheroDestino,true)){

                int byteLeido;
                while ((byteLeido = entrada.read()) != -1) {
                    salida.write(byteLeido);
                }

                System.out.println("Ficheiro añadido correctamente en: " + destFileName);

            }catch (IOException e){
                System.out.println("Erro ao copiar o ficheiro: " + e.getMessage());
            }
        }else{
            System.out.println("O ficheiro " + fileName + " non existe na ruta: " + ruta);
        }

    }

    //part2
    //1
    public static void copiabyteImagen(String ruta, String fileName, String destFileName){

        File fichero = new File(ruta,fileName);

        if (fichero.exists()){
            File ficheroDestino = new File(ruta, destFileName);
            try( FileInputStream entrada = new FileInputStream(fichero);
                 FileOutputStream salida = new FileOutputStream(ficheroDestino)){

                int byteLeido;
                while ((byteLeido = entrada.read()) != -1) {
                    salida.write(byteLeido);
                }

                System.out.println("Ficheiro copiado correctamente en: " + destFileName);

            }catch (IOException e){
                System.out.println("Erro ao copiar o ficheiro: " + e.getMessage());
            }
        }else{
            System.out.println("O ficheiro " + fileName + " non existe na ruta: " + ruta);
        }

    }
    public static void copiaengadeImage(String ruta, String fileName, String destFileName){

        File fichero = new File(ruta,fileName);

        if (fichero.exists()){
            File ficheroDestino = new File(ruta, destFileName);
            try( FileInputStream entrada = new FileInputStream(fichero);
                 FileOutputStream salida = new FileOutputStream(ficheroDestino,true);
                 ){

                int byteLeido;
                while ((byteLeido = entrada.read()) != -1) {
                    salida.write(byteLeido);
                }

                System.out.println("Ficheiro añadido correctamente en: " + destFileName);

            }catch (IOException e){
                System.out.println("Erro ao copiar o ficheiro: " + e.getMessage());
            }
        }else{
            System.out.println("O ficheiro " + fileName + " non existe na ruta: " + ruta);
        }

    }
    //buffer

    public static void copiabyteBuffer(String ruta, String fileName, String destFileName){

        File fichero = new File(ruta, fileName);

        if (fichero.exists()){
            File ficheroDestino = new File(ruta, destFileName);

            try (BufferedInputStream entrada = new BufferedInputStream(new FileInputStream(fichero));
                 BufferedOutputStream salida = new BufferedOutputStream(new FileOutputStream(ficheroDestino))) {

                int byteLeido;
                while ((byteLeido = entrada.read()) != -1) {
                    salida.write(byteLeido);
                }

                System.out.println("Ficheiro copiado correctamente en: " + destFileName);

            } catch (IOException e){
                System.out.println("Erro ao copiar o ficheiro: " + e.getMessage());
            }
        } else {
            System.out.println("O ficheiro " + fileName + " non existe na ruta: " + ruta);
        }
    }

    public static void copiaengadeBuffer(String ruta, String fileName, String destFileName){

        File fichero = new File(ruta, fileName);

        if (fichero.exists()){
            File ficheroDestino = new File(ruta, destFileName);

            // Se mantiene el parámetro 'true' en FileOutputStream para no sobrescribir,
            // y se envuelven ambos flujos con sus respectivos buffers.
            try (BufferedInputStream entrada = new BufferedInputStream(new FileInputStream(fichero));
                 BufferedOutputStream salida = new BufferedOutputStream(new FileOutputStream(ficheroDestino, true))) {

                int byteLeido;
                while ((byteLeido = entrada.read()) != -1) {
                    salida.write(byteLeido);
                }

                System.out.println("Ficheiro añadido correctamente en: " + destFileName);

            } catch (IOException e){
                System.out.println("Erro ao copiar o ficheiro: " + e.getMessage());
            }
        } else {
            System.out.println("O ficheiro " + fileName + " non existe na ruta: " + ruta);
        }
    }
    //parte3
    private static final String cadea = "o tempo está xélido";
    public static void grabarCadeaTresVeces( String ruta, String fileName) {

        File fichero = new File(ruta, fileName);
        if (fichero.exists()){
            try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fichero))) {

                for (int i = 0; i < 3; i++) {
                    System.out.println("escribindo a cadea: " + cadea);
                    dos.writeUTF(ruta);
                    System.out.println("tamano do ficheiro: " + dos.size() + " bytes");
                }

                System.out.println("tamano final do ficheiro: " + dos.size() + " bytes");

            } catch (IOException Error) {
                System.out.println("Erro ao escribir no ficheiro: " + Error.getMessage());
            }
        } else{
            System.out.println("O ficheiro " + fileName + " non existe na ruta: " + ruta);
        }
    }
    public static void lerCadea(String nomeFicheiro) {
        File ficheiro = new File(nomeFicheiro);

        if (!ficheiro.exists()) {
            System.out.println("O ficheiro " + nomeFicheiro + " non existe.");
            return;
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(ficheiro))) {

            while (dis.available() > 0) {
                System.out.println("quedan: " + dis.available() + " bytes por ler");
                String textoLeido = dis.readUTF();
                System.out.println("cadea: " + textoLeido);
            }

            System.out.println("Xa non queda nada por ler");

        } catch (IOException Error) {
            System.out.println("Erro ao ler do ficheiro: " + Error.getMessage());
        }
    }



}
