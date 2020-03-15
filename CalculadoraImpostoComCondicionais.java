public class CalculadoraImpostoComCondicionais {
    public static void main(String[] args) {
        int salario = 300850;
        double resultado = 0;
        String porcentagem = "";
        if (salario > 4500) {
            resultado = salario * 0.3;
            porcentagem = "30%";
        } else {
            resultado = salario * 0.15;
            porcentagem = "15%";
        }
        System.out.println("O resultado em porcentagem de "+porcentagem+" eh = "+resultado);
    }
}