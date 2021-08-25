package Codificadores;

public class Codifica20280527 implements Codifica {
 
    @Override
    public String codifica(String str) {
        String firstHalf = str.substring(0, str.length()/2);
        String secondHalf = str.substring(str.length()/2);
        String codificada = new StringBuilder(firstHalf).reverse().toString() + new StringBuilder(secondHalf).reverse().toString();

        return codificada;
    }

    @Override
    public String decodifica(String str) {
        String firstHalf = str.substring(0, str.length()/2);
        String secondHalf = str.substring(str.length()/2);
        String codificada = new StringBuilder(firstHalf).reverse().toString() + new StringBuilder(secondHalf).reverse().toString();

        return codificada;
    }

    @Override
    public String getMatriculaAutor() {
        return "20280527";
    }

    @Override
    public String getNomeAutor() {
        return "Gabriela Zorzo";
    }

}