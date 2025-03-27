package Desafio4;

public enum TipoHabilidade {

    TAIJUTSU("taijutsu"),
    NINJUTSU("ninjutsu"),
    GENJUTSU("Genjutsu"),
    KATON("katon"),
    RINNEGAN("Rinnegan");

    String type;
    TipoHabilidade(String type){
        this.type = type;
    }
}
