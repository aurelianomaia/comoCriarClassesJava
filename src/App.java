public class App {
    public static void main(String[] args) throws Exception {

        String valorRetorno;

        Veiculo meuVeiculo = new Veiculo();

        meuVeiculo.metodo1();
        meuVeiculo.metodo2();

        valorRetorno = meuVeiculo.metodo3("Uno", "hfh7210", 2025);
        System.out.println("Valor de retorno e : " + valorRetorno);

    }
}
