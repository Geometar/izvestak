package automaterijal.izvestaj.controller;

import automaterijal.izvestaj.domain.model.dto.VertikalaDto;
import automaterijal.izvestaj.service.VertikalaService;
import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/vertikala")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class VertikalaController {

    @NonNull
    final VertikalaService vertikalaService;

    @GetMapping
    public ResponseEntity<List<VertikalaDto>> findAll() {
        return ResponseEntity.ok(vertikalaService.findAll());
    }

}
