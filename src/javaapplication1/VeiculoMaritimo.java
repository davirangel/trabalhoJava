package javaapplication1;
public class VeiculoMaritimo {
    float preco;
    int numeroPassageiros, velocidadeMaxima;
    String marca, modelo, id;
    /* CONSTRUTORES */
    public VeiculoMaritimo(String marca, String modelo, String id) {
        this.marca = marca;
        this.modelo = modelo;
        this.id = id;
    }
    public VeiculoMaritimo(int numeroPassageiros, int velocidadeMaxima) {
        this.numeroPassageiros = numeroPassageiros;
        this.velocidadeMaxima  = velocidadeMaxima;
    }
    public VeiculoMaritimo(String marca, String modelo, int velocidadeMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public VeiculoMaritimo(String marca, String modelo, float preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }
    public VeiculoMaritimo(String modelo) {
        this.modelo = modelo;
    }
    public VeiculoMaritimo(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public VeiculoMaritimo(float preco) {
        this.preco = preco;
    }
    public VeiculoMaritimo() {
        
    }
    
    /* GETTERS E SETTERS */
    public float getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public void imprimir() {
        System.out.println("TESTE!");
    }   
}