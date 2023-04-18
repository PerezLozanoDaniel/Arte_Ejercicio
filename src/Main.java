// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import javax.jws.Oneway;
import java.util.ArrayList;

abstract class elementoArte {
    private int anoRealizacion;
    private String autor;
    public elementoArte(int anoRealizacion, String autor) {
        setAnoRealizacion(anoRealizacion);
        setAutor(autor);
    }
    public elementoArte(int anoRealizacion) {
        setAnoRealizacion(anoRealizacion);
    }
    public elementoArte(String autor) {
        setAutor(autor);
    }
    public elementoArte() {
    }
    public void setAnoRealizacion(int anoRealizacion) {
        if (anoRealizacion >2023){
            this.anoRealizacion=2023;
        }
        else this.anoRealizacion=anoRealizacion;
    }
    public void setAutor(String autor) {
        if (autor==""){
            this.autor="Anónimo";
        }
        else{
            this.autor=autor;
        }
    }
    @Override
    public String toString() {
        return "elementoArte: " +
                "anoRealizacion:" + anoRealizacion +
                ", autor:" + autor + ", ";
    }
}

class cuadro extends elementoArte {
    private String tipoPintura;
    public cuadro(int anoRealizacion, String autor, String tipoPintura) {
        super(anoRealizacion, autor);
        setTipoPintura(tipoPintura);
    }
    public cuadro(int anoRealizacion, String tipoPintura) {
        super(anoRealizacion);
        setTipoPintura(tipoPintura);
    }
    public cuadro(String autor, String tipoPintura) {
        super(autor);
        setTipoPintura(tipoPintura);
    }
    public cuadro(String tipoPintura) {
        setTipoPintura(tipoPintura);
    }
    public void setTipoPintura(String tipoPintura) {
        this.tipoPintura = tipoPintura;
    }
    @Override
    public String toString() {
        return super.toString()+
                "tipoPintura:'" + tipoPintura + '\'';
    }
}
class temaMusical extends elementoArte {
    private String tipoMusica;
    public temaMusical(int anoRealizacion, String autor, String tipoMusica) {
        super(anoRealizacion, autor);
        setTipoMusica(tipoMusica);
    }
    public temaMusical(int anoRealizacion, String tipoMusica) {
        super(anoRealizacion);
        setTipoMusica(tipoMusica);
    }
    public temaMusical(String autor, String tipoMusica) {
        super(autor);
        setTipoMusica(tipoMusica);
    }
    public temaMusical(String tipoMusica) {
        setTipoMusica(tipoMusica);
    }
    public void setTipoMusica(String tipoMusica) {
        this.tipoMusica = tipoMusica;
    }
    @Override
    public String toString() {
        return super.toString()+
                "tipoMusica:'" + tipoMusica + '\'';
    }
}
class sitioWeb {
    private ArrayList<elementoArte> coleccion = new ArrayList<elementoArte>(1000);
    public int size(){
        return coleccion.size();
    }
    public void addColeccion(elementoArte elementoArte){
        coleccion.add(elementoArte);
            }

    @Override
    public String toString() {
        String cadena;
        cadena= "sitioWeb " +
                "coleccion:\n";
                for (elementoArte item :coleccion){
                    cadena += item.toString()+"\n";
                }
        return cadena;
    }
}

public class Main {
    public static void main(String[] args) {

        sitioWeb miSitioWeb = new sitioWeb();

        elementoArte lasLanzas =new cuadro(1578,"Velazquez","óleo");
        elementoArte losGirasoles=new cuadro(1876,"Van Gogh","abstracto");
        elementoArte latasSopaCampbell=new cuadro(1962,"Warhol","pop");
        elementoArte losFusilamientos=new cuadro(1814,"Goya","óleo");
        elementoArte theTrooper=new temaMusical(1983,"Iron Maiden","metal");

        miSitioWeb.addColeccion(lasLanzas);
        miSitioWeb.addColeccion(losGirasoles);
        miSitioWeb.addColeccion(latasSopaCampbell);
        miSitioWeb.addColeccion(losFusilamientos);
        miSitioWeb.addColeccion(theTrooper);

        System.out.println(miSitioWeb);
       // NO SE PUEDE INSTANCIAR UNA CLASE ABSTRACTA new elementoArte(1595,"Pepe");
        }
}
