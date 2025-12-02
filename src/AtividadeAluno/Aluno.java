/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtividadeAluno;

/**
 *
 * @author demi
 */
public class Aluno {
    private String nome;
    private double notaMedia;

    public Aluno(String nome, double notaMedia) {
        this.nome = nome;
        this.notaMedia = notaMedia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    @Override
    public String toString() {
        return "["+nome+", "+notaMedia+"]";
    }
}
