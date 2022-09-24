package calculoimc;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Amanda", "2", 20);
        Pessoa p3 = new Pessoa("Daniel","3", 16, 50.53, 1.75);

        if (p3.CalcularImc() == -1){
            if (p3.ehMaiorIdade()){
                System.out.println(p3.getNome()+", maior de idade.");
                System.out.println("Possui "+p3.getAltura()+" Metros e "+p3.getPeso()+"kg");
                System.out.println(p3.getNome()+" está abaixo do peso!");
            }
            else {
                System.out.println(p3.getNome()+", menor de idade.");
                System.out.println("Possui "+p3.getAltura()+" Metros e "+p3.getPeso()+"kg");
                System.out.println(p3.getNome()+" está abaixo do peso!");
            }
        }

        else if (p3.CalcularImc() == 0) {
            if (p3.ehMaiorIdade()) {
                System.out.println(p3.getNome() + ", maior de idade.");
                System.out.println("Possui " + p3.getAltura() + " Metros e " + p3.getPeso() + "kg");
                System.out.println(p3.getNome() + " está em um peso saudável!");
            } else {
                System.out.println(p3.getNome() + ", menor de idade.");
                System.out.println("Possui " + p3.getAltura() + " Metros e " + p3.getPeso() + "kg");
                System.out.println(p3.getNome() + " está em um peso saudável!");
            }
        }

        else if (p3.CalcularImc() == 1){
            if (p3.ehMaiorIdade()) {
                System.out.println(p3.getNome() + ", maior de idade.");
                System.out.println("Possui " + p3.getAltura() + " Metros e " + p3.getPeso() + "kg");
                System.out.println(p3.getNome() + " está acima do peso!");
            } else {
                System.out.println(p3.getNome() + ", menor de idade.");
                System.out.println("Possui " + p3.getAltura() + " Metros e " + p3.getPeso() + "kg");
                System.out.println(p3.getNome() + " está acima do peso!");
            }
        }

    }
}
