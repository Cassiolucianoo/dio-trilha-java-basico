public class Banco {

    void apresentarDados(Cliente cliente, Conta conta) {
        System.out.println("Olá " + cliente.nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.agencia + ", conta " + conta.numero + " e seu saldo " + conta.saldo + " já está disponível para saque.");
    }
    
}
