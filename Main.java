package calculadora_notas;

public class Main {
    public static void main(String[] args) {
        System.out.println("bienvenido al calculador de notas");

        
        double nota1 = 7.5;
        double nota2 = 6.4;
        double nota3 = 4.9;
        System.out.println("Notas registradas: " + nota1 + ", " + nota2 + ", " + nota3);

        
        double suma = nota1 + nota2 + nota3;
        double media = suma / 3;
        
        System.out.println("La nota media es: " + media);
    }
}
