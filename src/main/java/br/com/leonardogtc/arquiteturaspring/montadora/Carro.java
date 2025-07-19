package br.com.leonardogtc.arquiteturaspring.montadora;

import java.awt.*;

public class Carro {
    private String modelo;
    private Montadora montadora;
    private TipoMotor tipoMotor;
    private Color cor;

    public Carro(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }

    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }
}
