package camilo.eduardo.citiesapi.paises;

import camilo.eduardo.citiesapi.paises.Pais;
import camilo.eduardo.citiesapi.paises.repositorio.ReposotorioPais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/paises")
public class RecursoPaises {

    @Autowired
    private ReposotorioPais reposotorio;

     @GetMapping
    public Page<Pais> paises(Pageable pagina){
        return reposotorio.findAll(pagina);
    }

    @GetMapping("/{id}")
    public ResponseEntity getOne(@PathVariable Long id){
        Optional<Pais> optional = reposotorio.findById(id);
       if (optional.isPresent()){
           return ResponseEntity.ok().body(optional.get());
       } else{
           return ResponseEntity.notFound().build();
       }


     }
}
