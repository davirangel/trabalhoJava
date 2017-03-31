
package javaapplication1;

public class Iate extends VeiculoMaritimo {
    
    int numeroTripulantes, numeroCabines;
    boolean piscina;
    
    /* CONSTRUTORES FALTAM 4 */
    
    public Iate() {    
    }
    
    public Iate(int numeroTripulantes) {
        this.numeroTripulantes = numeroTripulantes;  
    } 
    
    public Iate(int numeroTripulantes, int numeroCabines) {
        this.numeroTripulantes = numeroTripulantes; 
        this.numeroCabines = numeroCabines;  
    } 
    
    public Iate(boolean piscina) {
        this.piscina = piscina;
    } 
    
    public Iate(boolean piscina, int numeroCabines) {
        this.piscina = piscina;
        this.numeroCabines = numeroCabines;    
    } 
    
    public Iate(boolean piscina, int numeroCabines, int numeroTripulantes) {
        this.piscina = piscina;
        this.numeroCabines = numeroCabines;
        this.numeroTripulantes = numeroTripulantes; 
    } 
    
    public Iate(String marca, boolean piscina, int numeroCabines, int numeroTripulantes) {
        this.marca = marca;
        this.piscina = piscina;
        this.numeroCabines = numeroCabines;
        this.numeroTripulantes = numeroTripulantes; 
    } 
    
    public Iate(String marca, boolean piscina, int numeroCabines, int numeroTripulantes, float preco) {
        this.marca = marca;
        this.piscina = piscina;
        this.numeroCabines = numeroCabines;
        this.numeroTripulantes = numeroTripulantes; 
        this.preco = preco;
    } 
    
    public Iate(String marca, boolean piscina, int numeroCabines, int numeroTripulantes, float preco, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.piscina = piscina;
        this.numeroCabines = numeroCabines;
        this.numeroTripulantes = numeroTripulantes; 
        this.preco = preco;
    } 
    
    public Iate(String marca, boolean piscina, int numeroCabines, int numeroTripulantes, float preco, String modelo, String identificacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.identificacao = identificacao; 
        this.piscina = piscina;
        this.numeroCabines = numeroCabines;
        this.numeroTripulantes = numeroTripulantes; 
        this.preco = preco;
    } 
    
    
    
    /* GETTERS E SETTERS */
    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }

    public void setNumeroTripulantes(int numeroTripulantes) {
        this.numeroTripulantes = numeroTripulantes;
    }
    
    public int getNumeroCabines() {
        return numeroCabines;
    }
    
    public void setNumeroCabines(int numeroCabines) {
        this.numeroCabines = numeroCabines;
    }
    
    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }
    
    /* METODOS */
    @Override
    public void imprimir() {
        System.out.println("NumeroTripulantes: " + getNumeroTripulantes());
        System.out.println("NumeroCabines" + getNumeroCabines());
        System.out.println("Piscina: " + isPiscina());
    }
    
    public void cadastrar(int preco, int numeroPassgeiros, int velocidadeMaxima, String marca, String modelo, String identificacao, int numeroTripulantes, int numeroCabines, boolean piscina) {
        setPreco(preco);
        setNumeroPassageiros(numeroPassageiros);
        setVelocidadeMaxima(velocidadeMaxima);
        setMarca(marca);
        setModelo(modelo);
        setIdentificacao(identificacao);
        setNumeroTripulantes(numeroTripulantes);
        setNumeroCabines(numeroCabines);
        setPiscina(piscina);
    }
    
    public float valorDesconto() {
        float desconto  = (float) (getPreco() * 0.92);
        return desconto;
    }
    
    /* OLHAR DEPOIS NAO ENTENDI */
    public void PessoasPorCabine(){
        
    }
}

