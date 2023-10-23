package pv2;

import java.util.Arrays;

public class Kurs {
    private String jezik;
    private String nivo;
    private int brojPolaznika;
    private static String[] nivoi = { "osnovni", "srednji", "napredni" };

    public Kurs(String jezik, String nivo, int brojPolaznika) {
        this.setJezik(jezik);
        this.setNivo(nivo);
        this.setBrojPolaznika(brojPolaznika);
    }

    public String getJezik() {
        return this.jezik;
    }

    public void setJezik(String jezik) {
        this.jezik = jezik;
    }

    public String getNivo() {
        return this.nivo;
    }

    public void setNivo(String nivo) {
        this.nivo = Arrays.asList(Kurs.nivoi).contains(nivo) ? nivo : "osnovni";
    }

    public int getBrojPolaznika() {
        return this.brojPolaznika;
    }

    public void setBrojPolaznika(int brojPolaznika) {
        this.brojPolaznika = brojPolaznika >= 0 ? brojPolaznika : 0;
    }

    public static String[] getNivoi() {
        return Kurs.nivoi;
    }

    @Override
    public String toString() {
        return "{" +
                " jezik='" + getJezik() + "'" +
                ", nivo='" + getNivo() + "'" +
                ", brojPolaznika='" + getBrojPolaznika() + "'" +
                "}";
    }

}
