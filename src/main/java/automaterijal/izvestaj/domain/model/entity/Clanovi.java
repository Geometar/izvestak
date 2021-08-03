package automaterijal.izvestaj.domain.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clanovi")
@Data
public class Clanovi {
    @Id
    Integer id;
    @Column
    String ime;
    @Column
    String prezime;
    @Column
    String tip;
    @Column
    String tim;
    @Column
    String telefon;
    @Column
    String email;
}
