package camilo.eduardo.citiesapi.estados.repositorio;

import camilo.eduardo.citiesapi.estados.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioEstado extends JpaRepository<Estado, Long> {
}
