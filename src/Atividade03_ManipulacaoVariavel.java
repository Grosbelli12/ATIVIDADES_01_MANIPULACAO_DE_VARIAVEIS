public class Atividade03_ManipulacaoVariavel {
    public static void main(String[] args) {
        //var
       String produto = "camisas do santos";
       double preco = 150.00;
       int quantidade = 1;
       double imposto = (double) 60/ 100;
       double lucro = (double) 25 / 100;

       //val = valor
        // valTtcImposto valor total com imposto
        double valtotal = preco + quantidade;
        double valorPorcentagem = preco * imposto;
        double valorFinal = preco + valorPorcentagem;

        double  lucroDeVenda = lucro * valorFinal;
        double lucroDeVendaFinal = valorFinal + lucroDeVenda;
        System.out.println("Estou vendendo " + quantidade +  " camisas as camisas mais bonitas da região as " + produto +
                " o valor total delas sem o imposto é " + preco + " Mas como elas são importadas elas têm imoposto de " + (imposto * 100)+
                " % e seu valor com o imposto fica " +  valorFinal+ " como eu preciso ganhar dinheiro têm vou ter que adicionar mais " + (lucro * 100) + " % portanto o valor final ficara " +lucroDeVendaFinal );
    }
}