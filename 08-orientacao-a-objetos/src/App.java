//escreva uma classe para representar uma lampada que está a venda em um supermercado
public class App {
    public static void main(String[] args) throws Exception {
        Lampada lampada = new Lampada();
        lampada.modelo = "LED";
        lampada.tensao = "110V";
        lampada.potencia = 9;
        lampada.cor = "Branca";
        lampada.tipoLuz = "Fria";
        lampada.garantiaMeses = 12;
        lampada.tipos = new String[]{"Abajur", "Pendente", "Plafon"};

        System.out.println("Modelo: " + lampada.modelo);
        System.out.println("Tensão: " + lampada.tensao);
        System.out.println("Potência: " + lampada.potencia + "W");
        System.out.println("Cor: " + lampada.cor);
        System.out.println("Tipo de Luz: " + lampada.tipoLuz);
        System.out.println("Garantia: " + lampada.garantiaMeses + " meses");
        
        System.out.print("Tipos: ");
        for (String tipo : lampada.tipos) {
            System.out.print(tipo + " ");
        }
    }
}
