public class App {
    public static void main(String[] args) throws Exception {

        String valorRetorno;
        String valorRetorno2;
        float valorRetorno3;

        Veiculo meuVeiculo = new Veiculo();

        meuVeiculo.getmetodo1();
        meuVeiculo.getmetodo2();

        valorRetorno = meuVeiculo.getmetodo3("Uno", "hfh7210", 2025);
        System.out.println("Valor de retorno e : " + valorRetorno);

        valorRetorno2 = meuVeiculo.getMarca();
        System.out.println("Marca: " + valorRetorno2);

        valorRetorno3 = meuVeiculo.getmetodo4();
        System.out.println(valorRetorno3);

        meuVeiculo.mostrar();

    }
}
