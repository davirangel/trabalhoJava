package javaapplication1;
public class Lancha extends VeiculoMaritimo {
    String tipoCasco;
    boolean banheiro;
    
    public Lancha() {
        
    }
    
    public String getTipoCasco() {
        return tipoCasco;
    }

    public void setTipoCasco(String tipoCasco) {
        this.tipoCasco = tipoCasco;
    }

    public boolean isBanheiro() {
        return banheiro;
    }

    public void setBanheiro(boolean banheiro) {
        this.banheiro = banheiro;
    }
    
    public void imprimir() {
        System.out.println("TIPO DO CASCO: " + getTipoCasco());
        System.out.println("BANHEIRO: " + isBanheiro());
    }
    
    public void cadastrar(int preco, int numeroPassgeiros, int velocidadeMaxima, String marca, String modelo, String id) {
        setPreco(preco);
        setNumeroPassageiros(numeroPassageiros);
        setVelocidadeMaxima(velocidadeMaxima);
        setMarca(marca);
        setModelo(modelo);
        setId(id);
    }
}
