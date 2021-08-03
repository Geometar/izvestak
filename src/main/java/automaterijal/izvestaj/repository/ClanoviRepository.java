package automaterijal.izvestaj.repository;

import automaterijal.izvestaj.domain.model.entity.Clanovi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClanoviRepository extends JpaRepository<Clanovi, Integer> {}
