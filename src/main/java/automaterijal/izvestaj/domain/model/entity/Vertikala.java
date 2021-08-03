package automaterijal.izvestaj.domain.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tim")
@Data
public class Vertikala {
    @Id
    String id;
    @Column
    String naziv;
    @Column
    String grupe;
}
