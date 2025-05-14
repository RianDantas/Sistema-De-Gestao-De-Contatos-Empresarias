class Contrato implements ContratoPrototype{
    private String nomeEmpresa;
    private String nomeContratado;
    private String data;
    private String pretencaoSalarial;
    private Contrato instance;

    public Contrato(){

    }

    public Contrato(Builder build){
        this.nomeEmpresa = build.nomeEmpresa;
        this.nomeContratado = build.nomeContratado;
        this.data = build.data;
        this.pretencaoSalarial = build.pretencaoSalarial;
    }

    public Contrato getInstance(){
        if(this.instance == null){
            instance = new Contrato();
        }
        return instance;
    }

    public String getNomeEmpresa(){
        return this.nomeEmpresa;
    }
    public String getNomeContratado(){
        return this.nomeContratado;
    }
    public String getData(){
        return this.data;
    }
    public String getPretencaoSalarial(){
        return this.pretencaoSalarial;
    }

    @override
    public ContratoPrototype clone(){
        return new Contrato(Builder build);
    }

    @override
    public void exibirInfo(){
        System.out.println("Empresa: " + "Contratado: " + "Data: " + data + "Pretenção Salarial: " + pretencaoSalarial)
    }



    public class Builder{
        private String nomeEmpresa;
        private String nomeContratado;
        private String data;
        private String pretencaoSalarial;
        private Contrato instance;

        Builder(String nomeEmpresa, String nomeContratado, String data){
            this.nomeEmpresa = nomeEmpresa;
            this.nomeContratado = nomeContratado;
            this.data = data;
        }

        public void setPretencaoSalarial(String pretencaoSalarial){
            this.pretencaoSalarial = pretencaoSalarial;
        }

        public Contrato build(){
            return new Contrato(this);
        }
    }
}