
package modelo;



public class Carro {
    private String modelo;
    private String cor;
    private int ano;
    private String marca;
    private int chassi;
    private String proprietario;
    private int velocidadeMaxima;
    private int velocidadeAtual;
    private int nrDePorta;
    private boolean tetosolar;
    private int nrMarcha;
    private boolean cambioAuto;
    private float volumeCombustivel;
//Construtor
    public Carro(){
        
    }
    
    public Carro(String modelo, String cor, int ano, String marca, int chassi, String proprietario, int velocidadeMaxima, int velocidadeAtual, int nrDePorta, boolean tetosolar, int nrMarcha, boolean cambioAuto, float volumeCombustivel) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.marca = marca;
        this.chassi = chassi;
        this.proprietario = proprietario;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = velocidadeAtual;
        this.nrDePorta = nrDePorta;
        this.tetosolar = tetosolar;
        this.nrMarcha = 1;
        this.cambioAuto = cambioAuto;
        this.volumeCombustivel = volumeCombustivel;
    }
   //getters e setters

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getChassi() {
        return chassi;
    }

    public void setChassi(int chassi) {
        this.chassi = chassi;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getNrDePorta() {
        return nrDePorta;
    }

    public void setNrDePorta(int nrDePorta) {
        this.nrDePorta = nrDePorta;
    }

    public boolean isTetosolar() {
        return tetosolar;
    }

    public void setTetosolar(boolean tetosolar) {
        this.tetosolar = tetosolar;
    }

    public int getNrMarcha() {
        return nrMarcha;
    }

    public void setNrMarcha(int nrMarcha) {
        this.nrMarcha = nrMarcha;
    }

    public boolean isCambioAuto() {
        return cambioAuto;
    }

    public void setCambioAuto(boolean cambioAuto) {
        this.cambioAuto = cambioAuto;
    }

    public float getVolumeCombustivel() {
        return volumeCombustivel;
    }

    public void setVolumeCombustivel(float volumeCombustivel) {
        this.volumeCombustivel = volumeCombustivel;
    }
    //toString

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", cor=" + cor + ", ano=" + ano + ", marca=" + marca + ", chassi=" + chassi + ", proprietario=" + proprietario + ", velocidadeMaxima=" + velocidadeMaxima + ", velocidadeAtual=" + velocidadeAtual + ", nrDePorta=" + nrDePorta + ", tetosolar=" + tetosolar + ", nrMarcha=" + nrMarcha + ", cambioAuto=" + cambioAuto + ", volumeCombustivel=" + volumeCombustivel + '}';
    }
    //Metodos
    public float acelerar(){
        return this.velocidadeAtual=velocidadeAtual+1;
        
    }
    public void mostrarCoisa(){
        System.out.println("modelo:"+this.getModelo());
        System.out.println("Cor: "+this.getCor());
        System.out.println("Ano: "+this.getAno());
        System.out.println("marca: "+this.getMarca());
        System.out.println("númeração de Shassi: "+this.getChassi());
        System.out.println("Proprietario: "+this.getProprietario());
        System.out.println("Velocidade Maxima: "+this.getVelocidadeMaxima());
        System.out.println("Velocidade Atual: "+this.getVelocidadeAtual());
        System.out.println("Quantidade de Portas"+this.getNrDePorta());
        System.out.println("Possui teto solar?: "+this.isTetosolar());
        System.out.println("Quantidade das marchas: "+this.getNrMarcha());
        System.out.println("Possui Cambio automatico?:"+this.isCambioAuto());
        System.out.println("Quantidade de combustivel: "+this.getVolumeCombustivel());
        
    }
    public float freiar(){
        return this.velocidadeAtual=velocidadeAtual-velocidadeAtual;
    }
    public int trocaMarchar(){
        return this.nrMarcha=nrMarcha+1;
    }
    public int reduzirMarchar(){
        return this.nrMarcha=nrMarcha-1;
    }
    public void marchaRe(){
        if (velocidadeAtual > 0){
            System.out.println("Não será possivel");
}else{
            System.out.println("Marcha Ré ativada");
            nrMarcha=-1;
        }
    }
    
    
}
