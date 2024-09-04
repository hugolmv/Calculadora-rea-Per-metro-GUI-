package Questao4;

public class Retangulo {

    private int altura;
    private int comprimento;

    public Retangulo() {
        this.altura = 0;
        this.comprimento = 0;
    }
    public Retangulo(int altura, int comprimento) {
        setAltura(altura);
        setComprimento(comprimento);
    }

    void setAltura(int altura) {
        if (altura == 0 || altura < 0) {
            throw new IllegalArgumentException("Valor incorreto para altura: " + altura);
        }
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public void setComprimento(int comprimento) {
        if (comprimento == 0 || comprimento < 0) {
            throw new IllegalArgumentException("Valor incorreto para comprimento: " + comprimento);
        }
        this.comprimento = comprimento;
    }

    public int getComprimento() {
        return comprimento;
    }

    public int calcularPerimetro() {
        return 2 * (altura + comprimento);
    }

    public int calcularArea(){
        return altura * comprimento;
    }

}
