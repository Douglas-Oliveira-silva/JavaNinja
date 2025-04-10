package Nivel_Intermediario.Enum;

public enum RankDeMissoes {


    S(10, "Expert"),
    A(8, "Dificil"),
    B(5, "Media"),
    C(2,"Facil"),
    D (1,"Baixo");

    private String descricao;
    private int dificuldade;

    RankDeMissoes(int dificuldade, String descricao) {
        this.dificuldade = dificuldade;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
}
