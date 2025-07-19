package br.com.leonardogtc.arquiteturaspring.montadora;

public class HondaHRV extends Carro {

    public HondaHRV(TipoMotor tipoMotor) {
        super(tipoMotor);
        setModelo("HR-V");
        setMontadora(Montadora.HONDA);
        setCor(new java.awt.Color(0xFF0000)); // Exemplo de cor vermelha
    }

    @Override
    public String toString() {
        return "HondaHRV{" +
                "modelo='" + getModelo() + '\'' +
                ", montadora=" + getMontadora() +
                ", tipoMotor=" + getTipoMotor() +
                ", cor=" + getCor() +
                '}';
    }
}
