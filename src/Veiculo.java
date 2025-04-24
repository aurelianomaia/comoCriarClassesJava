public class Veiculo implements dadosVeiculo {
    private int ano;
    private String nome;
    private String placa;

    @Override
    public void getmetodo1() {

        nome = "janaina";
        placa = "hFH3290";
        ano = 2023;
        System.out.println("metodo 1 : " + "Nome: " + nome + "Placa: " + placa + " Ano: " + ano);

    }

    @Override
    public int getmetodo2() {
        System.out.println("metodo 2");
        return 2;
    }

    @Override
    public String getmetodo3(String parametro1, String parametro2, int parametro3) {

        System.out.println("metodo3: " + "Modelo: " + "parametro1" + " Placa: " + "parametro2 " + "Ano: " + parametro3);
        return parametro1;
    }

    public String getMarca() {
        String marca = "chevrolet";
        return marca;
    }

    public float getmetodo4(){       
        float myFloat = 3.1f;
        return myFloat;
    }

    public void mostrar(){
        System.out.println("Aqui nao retorna nada");
    }

}
