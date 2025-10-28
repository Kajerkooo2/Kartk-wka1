package com.example.sprawdzian1mb;

public class Zdjecia {
    private int obrazekResId;
    private String opis;
    private boolean opisUsuniety = false;

    public Zdjecia(int obrazekResId, String opis) {
        this.obrazekResId = obrazekResId;
        this.opis = opis;
    }

    public int getObrazekResId() {
        return obrazekResId;
    }

    public String getOpis(){
        return opis;
    }

    public boolean isOpisUsuniety() {
        return opisUsuniety;
    }

    public void setOpisUsuniety(boolean opisUsuniety) {
        this.opisUsuniety = opisUsuniety;
    }
}