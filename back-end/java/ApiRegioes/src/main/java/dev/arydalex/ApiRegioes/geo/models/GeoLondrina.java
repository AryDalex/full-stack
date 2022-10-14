package dev.arydalex.ApiRegioes.geo.models;

public class GeoLondrina {

    private Number id;
    private String cidade;
    private String estado;
    private String uf;
    private String descritionSmall;

    public GeoLondrina() {
    }

    @Override
    public String toString() {
        return "GeoLondrina{" +
                "id=" + id +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", uf='" + uf + '\'' +
                ", descritionSmall='" + descritionSmall + '\'' +
                '}';
    }
}
