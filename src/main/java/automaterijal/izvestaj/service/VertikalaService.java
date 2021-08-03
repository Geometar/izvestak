package automaterijal.izvestaj.service;

import automaterijal.izvestaj.domain.model.dto.VertikalaDto;
import automaterijal.izvestaj.domain.model.entity.Clanovi;
import automaterijal.izvestaj.domain.model.entity.Vertikala;
import automaterijal.izvestaj.repository.ClanoviRepository;
import automaterijal.izvestaj.repository.VertikalaRepository;
import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class VertikalaService {

    @NonNull
    ClanoviRepository clanoviRepository;
    @NonNull
    VertikalaRepository vertikalaRepository;

    /**
     * Vracanje svih vertikala koje su mapirane sa svojim clanovima (inicijalna stranica)
     *
     * @return vertikala as {@link List} of {@link VertikalaDto}
     */
    public List<VertikalaDto> findAll() {
        List<VertikalaDto> retVal = new ArrayList<>();
        List<Vertikala> vertikale = vertikalaRepository.findAll();
        List<Clanovi> clanovi = clanoviRepository.findAll();
        return vertikale.stream()
                .map(vertikala -> mapToVertikalaDto(vertikala, clanovi))
                .collect(Collectors.toList());
    }

    private VertikalaDto mapToVertikalaDto(Vertikala vertikala, List<Clanovi> clanovi) {
        List<Clanovi> clanoviTima = clanovi.stream()
                .filter(clan -> clan.getTim().equals(vertikala.getId()))
                .collect(Collectors.toList());

        VertikalaDto vertikalaDto = new VertikalaDto();
        vertikalaDto.setNaziv(vertikala.getNaziv());
        vertikalaDto.setClanovi(clanoviTima);
        return vertikalaDto;
    }


}
