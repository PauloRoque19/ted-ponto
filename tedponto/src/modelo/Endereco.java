

package modelo;



public class Endereco {
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String complemento;
    
    //construtor
    public Endereco(){
        
    }
    
    public Endereco(String rua,String bairro,String cidade,String estado,String cep,String complemento){
        this.rua=rua;
        this.bairro=bairro;
        this.cidade=cidade;
        this.estado=estado;
        this.cep=cep;
        this.complemento=complemento;
    }
    
    //Encapsular
    public String getRua(){
        return rua;
    }
    public void setRua(String rua){
    this.rua=rua;
    }
    public String getBairro(){
        return bairro;
    }
    public void setBairro(String bairro){
        this.bairro=bairro;
        
    }
    public String getCidade(){
        return cidade;
    }
    public void setCidade(String cidade){
        this.cidade=cidade;
        
    }
    public String getEstado(){
        return estado;
    }
    public void setEstado(String estado){
        this.estado=estado;
    }
    public String getCep(){
        return cep;
    }
    public void setCep(String cep){
        this.cep=cep;
    }
    public String getComplemento(){
        return complemento;
    }
    public void setComplemento(String complemento){
        this.complemento=complemento;
    }
    //ToString

    @Override
    public String toString() {
        return "Endereco{" + "rua=" + rua + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep + ", complemento=" + complemento + '}';
    }
    
    
    public void mostrarEndereco(){
        System.out.println("Rua: "+this.getRua());
        System.out.println("Bairro: "+this.getBairro());
        System.out.println("Cidade: "+this.getCidade());
        System.out.println("Estado: "+this.getEstado());
        System.out.println("Cep: "+this.getCep());
        System.out.println("Complemento: "+this.getComplemento());
        
    }
}
