//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Metodos.copiabyte("/home/dam26/Documentos","texto1.txt","texto2.txt");
    Metodos.copiaengade("/home/dam26/Documentos","texto1.txt","texto2.txt");
    Metodos.copiabyteImagen("/home/dam26/Documentos","imagen1.jpeg","imagen2.jpeg");
    Metodos.copiaengadeImage("/home/dam26/Documentos","imagen1.jpeg","imagen2.jpeg");
    Metodos.copiabyteBuffer("/home/dam26/Documentos","texto1.txt","texto2.txt");
    Metodos.copiaengadeBuffer("/home/dam26/Documentos","texto1.txt","texto2.txt");
    Metodos.grabarCadeaTresVeces("/home/dam26/Documentos","texto3.txt");
    Metodos.lerCadea("/home/dam26/Documentos/texto3.txt");
}
