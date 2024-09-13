public class Atividade01_ManipulacaoVariavel {
    public static void main(String[] args) {
        // Dados do Gustavo
        //id = idade
        // alt = altura
        // est =  estudante

        String nome = "Gustavo";
        int id = 17;
        double alt = 1.72;
        boolean est = true;

   // dados do pedro
        String nome2 = "pedro";
        int id2 = 19;
        double alt2 = 1.80;
        boolean est2 = true;

        //Operações
        //somaDasId = soma das duas idades
        //duplalt = altura duplicada
        int somaDasId = id + id2;
        double duplalt = alt * 2;

        //resultado
        System.out.println("Olá sou o " +nome);
        System.out.println("A soma da minha idade e a do Pedro é " + somaDasId);
        System.out.println("Minha altura multiplicada por dois é " +duplalt);
}
}