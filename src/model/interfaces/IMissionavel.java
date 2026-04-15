package model.interfaces;
import model.entities.Mission;
import java.util.List;

public interface IMissionavel {
    void adicionarMissao(Mission missao);
    void editarMissao(int indice, Mission novaMissao);
    List<Mission> getHistoricoMissoes();
    boolean possuiMissoes();
}
