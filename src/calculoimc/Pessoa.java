package calculoimc;

public class Pessoa {
    private String nome, id;
    private int idade;
    private double peso, altura;

    public Pessoa () { }

    public Pessoa (String nome, String id, int idade){
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public Pessoa (String nome, String id, int idade, double peso, double altura) {
        this.nome = nome;
        this.id = id;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public int CalcularImc() {
        double imc = this.peso / (Math.pow(this.altura, 2));

        if (imc < 20) {
            return -1;
        }
        else if (imc > 25) {
            return 1;
        }
        else{
            return 0;
        }
    }

    public boolean ehMaiorIdade(){
        if(idade >= 18){
            return true;
        }
        else return false;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
