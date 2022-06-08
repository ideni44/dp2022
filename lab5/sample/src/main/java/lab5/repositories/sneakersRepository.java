package lab5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import lab5.entity.Sneakers;


@RepositoryRestResource
@CrossOrigin(origins = "*")
public interface sneakersRepository extends JpaRepository<Sneakers, Long> {
}
