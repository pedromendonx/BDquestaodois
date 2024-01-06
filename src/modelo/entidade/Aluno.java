package modelo.entidade;



public class Aluno {
    private String nome;
    private String curso;
    private float nota1;
    private float nota2;
    private float nota3;
    private float nota4;
    private float media; 


    public Aluno() {
    }


    public Aluno(String nome, String curso, float nota1, float nota2, float nota3, float nota4) {
        this.nome = nome;
        this.curso = curso;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.media = (nota1 + nota2 + nota3 + nota4) / 4;


    }

    public String getSituacao (String situacao) {
        if (media >= 7) {
            situacao = "Aprovado";
        } else if (media <= 3) {
            situacao = "Reprovado";
        } else {
            situacao = "Recuperacao";
        }
        return situacao;
    }



    public float getMedia() {
        return this.media;
    }

    public void setMedia(float media) {
        this.media = media;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float getNota1() {
        return this.nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return this.nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return this.nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getNota4() {
        return this.nota4;
    }

    public void setNota4(float nota4) {
        this.nota4 = nota4;
    }

    @Override
    public String toString() {
       return "Nome: " + this.nome + "\n" +
              "Curso: " + this.curso + "\n" +
              "Notas: " + this.nota1 + ", " + this.nota2 + ", " + this.nota3 + ", " + this.nota4 + "\n" +
              "Situação: " +  getSituacao(curso) + "Media: " + media;
         
    }

}




