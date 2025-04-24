public class Veiculo implements dadosVeiculo{
    private int ano;
    private String nome;
    private String placa;

    @Override
    public void metodo1() {
       
        nome = "janaina";
        placa = "hFH3290";
        ano = 2023;
        System.out.println("metodo 1 : " + "Nome: " + nome + "Placa: "+ placa + " Ano: "+ano);

    }

    @Override
    public int metodo2() {
      
        System.out.println("metodo 2");
        return 2;
    }


    @Override
    public String metodo3(String parametro1,String parametro2, int parametro3) {
        
        System.out.println("metodo3: " + "Modelo: " + parametro1 + " Placa: " + parametro2 + "Ano: " + parametro3);
        return parametro1;
    }


   
}

