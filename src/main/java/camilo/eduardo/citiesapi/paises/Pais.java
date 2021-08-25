package camilo.eduardo.citiesapi.paises;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Pais")
@Table(name="pais")
public class Pais {

    @Id
    private Long id;

    private String nome;

    private String nome_pt;

    private String sigla;

    private Integer bacen;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getNome_pt() {
        return nome_pt;
    }

    public String getSigla() {
        return sigla;
    }

    public Integer getBacen() {
        return bacen;
    }
}
