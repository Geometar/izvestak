package automaterijal.izvestaj.domain.model.dto;

import automaterijal.izvestaj.domain.model.entity.Clanovi;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class VertikalaDto {
    String naziv;
    List<Clanovi> clanovi;
}
