package javaapplication1;
public class Jetski extends VeiculoMaritimo {
    boolean reboque;
    String tipoCasco;
    
    /* CONSTRUTORES */
    public Jetski (String marca, String modelo, String id, int numeroPassageiros, int velocidadeMaxima, float preco){
        this.marca = marca;
        this.modelo = modelo;
        this.id = id;
        this.numeroPassageiros = numeroPassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.preco = preco;
    }
    public Jetski(String marca, String modelo, String id) {
        this.marca = marca;
        this.modelo = modelo;
        this.id = id;
    }
    public Jetski(String modelo, boolean reboque, float preco){
        this.modelo = modelo;
        this.reboque = reboque;
        this.preco = preco;
    }
    public Jetski(int numeroPassageiros, int velocidadeMaxima){
        this.numeroPassageiros = numeroPassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public Jetski(String tipoCasco, boolean reboque){
        this.tipoCasco = tipoCasco;
        this.reboque = reboque;
    }
    public Jetski(String tipoCasco){
        this.tipoCasco = tipoCasco;
    }
    public Jetski(boolean reboque) {
        this.reboque = reboque;
    }
    public Jetski(float preco) {
        this.preco = preco;
    }
    public Jetski(){
        
    }
    
    /* GETTER E SETTER */
    public boolean isReboque() {
        return reboque;
    }

    public void setReboque(boolean reboque) {
        this.reboque = reboque;
    }

    public String getTipoCasco() {
        return tipoCasco;
    }

    public void setTipoCasco(String tipoCasco) {
        this.tipoCasco = tipoCasco;
    }
    
    /* METODOS */
    public void imprimir() {
        super.imprimir();
        System.out.println("TIPO DO CASCO: " + getTipoCasco());
        System.out.println("REBOQUE: " + isReboque());
    }
    public void cadastrar(float preco, int numeroPassageiros, int velocidadeMaxima, String marca, String modelo, String id, String tipoCasco, boolean reboque) {
        setPreco(preco);
        setNumeroPassageiros(numeroPassageiros);
        setVelocidadeMaxima(velocidadeMaxima);
        setMarca(marca);
        setModelo(modelo);
        setId(id);
        setTipoCasco(tipoCasco);
        setReboque(reboque);
    }
    
    public float valorDesconto() {
        float desconto = (float) (getPreco() * 0.85);
        return desconto;
    }
}