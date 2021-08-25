package camilo.eduardo.citiesapi.cidades.Recurso;
import camilo.eduardo.citiesapi.cidades.Cidade;

import camilo.eduardo.citiesapi.cidades.Repositorio.RepositorioCidade;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cidades")
public class RecursoCidades {

    private final RepositorioCidade repository;

    public RecursoCidades(final RepositorioCidade repository) {
        this.repository = repository;
    }

    // 2nd - Pageable
    @GetMapping
    public Page<Cidade> cidades(final Pageable page) {
        return repository.findAll(page);
    }
}