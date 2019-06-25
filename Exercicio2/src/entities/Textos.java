package entities;

public class Textos {
    private String texto;

    public String qtdEspaços(){
        String[] vec = texto.split(" ");
        String stSingular = " espaço em branco";
        String stPlural = " espaços em branco";
        int space= vec.length-1;
        if(space==1){
            return space+stSingular;
        }
        else{
            return space+stPlural;
        }
    }

    public String vogais(){
        String stSingular =" vogal";
        String stPlural =" vogais";
        int vogais = 0;
        for (int i = 0; i < texto.length(); i++) {
            texto = texto.toLowerCase();
            if (texto.charAt(i)=='a'||texto.charAt(i)=='e'||texto.charAt(i)=='i'||texto.charAt(i)=='o'||texto.charAt(i)=='u'){
                vogais +=1;
            }
        }
        if (vogais==1){
            return vogais+stSingular;
        }
        else {
            return vogais+stPlural;
        }
    }

    public Textos(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return texto.length()+" caracteres, "+qtdEspaços()+", "+vogais();
    }
}