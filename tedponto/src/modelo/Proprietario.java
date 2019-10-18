    
package modelo;


public class Proprietario {
    //atributos
    private String nome;
    private String CPF;
    private String rg;
    private String datadenascimento;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private int cep;
    private String complemento;
    //construtor
    public Proprietario(){
        
    }
        
    
    public Proprietario(String nome,String CPF,String rg){
        this.nome=nome;
        this.CPF=CPF;
        this.rg=rg;
    
}

    public Proprietario(String datadenascimento,String rua, String bairro, String cidade, String estado, int cep, String complemento) {
        this.datadenascimento = datadenascimento;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.complemento = complemento;
    }
    
    //Gets e sets
        public String getNome(){
            return nome;
        }
        public void setNome(String nome){
            this.nome=nome;
        }
        public String getCPF(){
            return CPF;
        }
        public void setCPF(String CPF){
            this.CPF=CPF;
        }
        public String getRg(){
            return rg;
        }
        public void setRg(String rg){
            this.rg=rg;
        }

        public String getDatadenascimento() {
            return datadenascimento;
        }

        public void setDatadenascimento(String datadenascimento) {
            this.datadenascimento = datadenascimento;
        }

        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public String getBairro() {
            return bairro;
        }

        public void setBairro(String bairro) {
            this.bairro = bairro;
        }

        public String getCidade() {
            return cidade;
        }

        public void setCidade(String cidade) {
            this.cidade = cidade;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public int getCep() {
            return cep;
        }

        public void setCep(int cep) {
            this.cep = cep;
        }

        public String getComplemento() {
            return complemento;
        }

        public void setComplemento(String complemento) {
            this.complemento = complemento;
        }
        //toString
    public String toString() {
        return "Proprietario{" + "nome=" + this.nome + ", CPF=" + CPF + ", rg=" + rg + ", datadenascimento=" + datadenascimento + ", rua=" + rua + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep + ", complemento=" + complemento +  '}';
   }
   //Metodos 
    public void mostrarProprietario(){
        
        System.out.println("Nome: "+ this.getNome());
        System.out.println("CPF: "+this.getCPF());
        System.out.println("RG: "+this.getRg());
       
        }
}
    
  
    

