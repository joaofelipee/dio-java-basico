public class ContaTerminal {
    int numero;
    int agencia;
    String nomeCliente;
    double saldo;

    public ContaTerminal(int numero, int agencia, String nome, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nome;
        this.saldo = saldo;

        mensagemBoasVindas();
    }

    private void mensagemBoasVindas() {
        String mensagem = "Olá "+ this.nomeCliente+", obrigado por criar uma conta em nosso banco.\n";
        mensagem = mensagem.concat("Sua agência é "+this.agencia+", conta "+ this.numero +" e seu saldo R$"+this.saldo+" já está disponível para saque.");

        System.out.println(mensagem);
    }
}
