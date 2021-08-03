package automaterijal.izvestaj.repository;

import automaterijal.izvestaj.domain.model.entity.Vertikala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VertikalaRepository extends JpaRepository<Vertikala, String> {
}
