# A3-Programacao
A3 de programacao
 esboço 1 do projeto de time de futebol
 Objetivo é armazenar os dados de jogadores de um time de futebol mostrando sua altura , nome, peso, poçisão no campo e lado que joga 
 
 
 
 import java.util.Scanner;
class Jogador {
    private String nome;
    private double altura;
    private double peso;
    private String posicao;
    private String lado;

    public Jogador(String nome, double altura, double peso, String posicao, String lado) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.lado = lado;
    }

    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getPosicao() {
        return posicao;
    }

    public String getLado() {
        return lado;
    }
    
//class 2; do registro do time

public class RegistroTime {
    public static void main(String[] args) {
        Jogador[] time = new Jogador[11];
        Scanner scanner = new Scanner(System.in);

        System.out.println("==Registro do Time ====")

        for (int i = 0; i < 11; i++) {
            System.out.println("Jogador #" + (i + 1));
            
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            
            System.out.print("Altura (em metros): ");
            double altura = scanner.nextDouble();
            
            System.out.print("Peso (em kg): ");
            double peso = scanner.nextDouble();
            
            scanner.nextLine(); // Limpar o buffer do scanner
            System.out.print("Posição no campo: ");
            String posicao = scanner.nextLine();
            
            System.out.print("Esquerda ou direita: ");
            String lado = scanner.nextLine();

            time[i] = new Jogador(nome, altura, peso, posicao, lado);
            System.out.println();
        }

        // Exibindo informações do time  imprimindo , sistema de repetição de todo o time 
        System.out.println("=== Informações do Time ===");
        for (int i = 0; i < 11; i++) {
            Jogador jogador = time[i];
            System.out.println("Jogador #" + (i + 1));
            System.out.println("Nome: " + jogador.getNome());
            System.out.println("Altura: " + jogador.getAltura() + " metros");
            System.out.println("Peso: " + jogador.getPeso() + " kg");
            System.out.println("Posição: " + jogador.getPosicao());
            System.out.println("Lado: " + jogador.getLado());
            System.out.println();
        }
    }
}
