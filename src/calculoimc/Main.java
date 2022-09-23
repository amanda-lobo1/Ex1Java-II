package calculoimc;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Amanda", "2", 20);
        Pessoa p3 = new Pessoa("Daniel","3", 16, 50.5, 1.80);

        if (p3.CalcularImc() == -1){
            if (p3.ehMaiorIdade()){
                System.out.println(p3.getNome()+", maior de idade.");
                System.out.println("Está abaixo do peso!");
            }
            else {
                System.out.println(p3.getNome()+", menor de idade.");
                System.out.println("Está abaixo do peso!");
            }
        }

        else if (p3.CalcularImc() == 0) {
            if (p3.ehMaiorIdade()){
                System.out.println(p3.getNome()+", maior de idade.");
                System.out.println("Você está com um peso saudável!");
            }
            else {
                System.out.println(p3.getNome()+", menor de idade.");
                System.out.println("Você está com um peso saudável!");
            }
        }

        else if (p3.CalcularImc() == 1){
            if (p3.ehMaiorIdade()){
                System.out.println(p3.getNome()+", maior de idade.");
                System.out.println("Você está acima do peso! ");
            }
            else {
                System.out.println(p3.getNome() + ", menor de idade.");
                System.out.println("Você está acima do peso! ");
            }
        }

    }
}
