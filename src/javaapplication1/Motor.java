package javaapplication1;
public class Motor {
    int potencia, RPMMaxima, RPM;
    String marca, modelo, tipoCombustivel;

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getRPMMaxima() {
        return RPMMaxima;
    }

    public void setRPMMaxima(int RPMMaxima) {
        this.RPMMaxima = RPMMaxima;
    }

    public int getRPM() {
        return RPM;
    }

    public void setRPM(int RPM) {
        this.RPM = RPM;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    
    public void imprimir() {
        System.out.println("RPM: " + getRPM());
        System.out.println("RPM MÁXIMA: " + getRPMMaxima());
        System.out.println("POTÊNCIA: " + getPotencia());
        System.out.println("MARCA: " + getMarca());
        System.out.println("MODELO: " + getModelo());
        System.out.println("TIPO DO COMBUSTIVEL: " + getTipoCombustivel());
    }
    public void cadastrar(int potencia, int RPMMaxima, int RPM, String marca, String modelo, String tipoCombustivel) {
        setPotencia(potencia);
        setRPMMaxima(RPMMaxima);
        setRPM(RPM);
        setMarca(marca);
        setModelo(modelo);
        setTipoCombustivel(tipoCombustivel);
    }
    
    public void warning() {
        System.out.println("O MOTOR JÁ ESTÁ EM POTÊNCIA MÁXIMA!");
    }
    
    public void acelerar() {
        if(RPM < RPMMaxima) {
            setRPM(getRPM() + 100);
        } else {
            warning();
        }
    }
    public void desacelrar() {
        if (RPM > 0) {
            setRPM(getRPM() - 100);
        } else if (getRPM() < 0) {
            setRPM(0);
        }
    }
}
