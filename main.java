class main{
    public static void main(String[] args){
        Contrato c = new Contrato.Builder("CrossMotos", "Eduardo Voador", "07/17/2017")
            .setPretencaoSalarial("3.000");

        c.exibirInfo();

    }
}