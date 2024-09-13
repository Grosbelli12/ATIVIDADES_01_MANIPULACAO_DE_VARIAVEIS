public class Atividade02_ManipulacaoVariavel {
    public static void main(String[] args) {
        // var
        //pdtcpd quantidade de produtos comprados
        String nome = "jair";
        int idade = 20;
        double salario = 1650.00;
        int mes = 10;
        int pdtcpd = 40;
        double gastos = 500;


        //Operações
        double salbruto = salario * 10;
        double salliquido = salbruto - 300.00;

        // valor gasto em produtos
        double medproduto = gastos / 40;

        System.out.println("Seu nome é " + nome + " e sua idade é " + idade + " como voçe tem que pagar impostos seu sálario anual liquido é " + salliquido + " caso for corintiano terei que alterar o codigo e diminuir 200$ de seu sálario");

        System.out.println("A média dos valores dos produtos que você não aguentou e acabou comprando foi de " +medproduto );
    }
}