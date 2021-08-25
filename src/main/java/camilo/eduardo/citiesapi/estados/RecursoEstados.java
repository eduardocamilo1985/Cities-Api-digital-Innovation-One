package camilo.eduardo.citiesapi.estados;

import camilo.eduardo.citiesapi.estados.repositorio.RepositorioEstado;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estados")
public class RecursoEstados {

    private final RepositorioEstado repository;

    public RecursoEstados(final RepositorioEstado repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Estado> estados() {
        return repository.findAll();
    }
}
