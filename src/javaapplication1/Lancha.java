package javaapplication1;
public class Lancha extends VeiculoMaritimo {
    String tipoCasco;
    boolean banheiro;
    
    /* CONSTRUTORES */
    public Lancha (String marca, String modelo, String id, int numeroPassageiros, int velocidadeMaxima, float preco){
        this.marca = marca;
        this.modelo = modelo;
        this.id = id;
        this.numeroPassageiros = numeroPassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.preco = preco;
    }
    public Lancha(String marca, String modelo, String id) {
        this.marca = marca;
        this.modelo = modelo;
        this.id = id;
    }
    public Lancha(String modelo, boolean banheiro, float preco){
        this.modelo = modelo;
        this.banheiro = banheiro;
        this.preco = preco;
    }
    public Lancha(int numeroPassageiros, int velocidadeMaxima){
        this.numeroPassageiros = numeroPassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public Lancha(String tipoCasco, boolean banheiro){
        this.tipoCasco = tipoCasco;
        this.banheiro = banheiro;
    }
    public Lancha(String tipoCasco){
        this.tipoCasco = tipoCasco;
    }
    public Lancha(boolean banheiro) {
        this.banheiro = banheiro;
    }
    public Lancha(float preco) {
        this.preco = preco;
    }
    public Lancha() {
        
    }
    
    
    /* GETTERS E SETTERS */
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
    
    /* METODOS */
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
    
    public float valorDesconto() {
        float desconto  = (float) (getPreco() * 0.9);
        return desconto;
    }
}
