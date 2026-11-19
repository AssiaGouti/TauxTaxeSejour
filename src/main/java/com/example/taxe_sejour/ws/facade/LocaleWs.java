
package com.example.taxe_sejour.ws.facade;

import com.example.taxe_sejour.entity.Locale;
import com.example.taxe_sejour.service.facade.LocaleService;
import com.example.taxe_sejour.ws.dto.LocaleDto;
import com.example.taxe_sejour.ws.mapper.LocaleMapper;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/locale")
public class LocaleWs {

    @PostMapping
    public int save(@RequestBody LocaleDto dto) {
        Locale entity = mapper.toEntity(dto);
        return service.save(entity);
    }

    @GetMapping("ref/{ref}")
    public LocaleDto findByRef(@PathVariable String ref) {
        Locale locale = service.findByref(ref);
        return mapper.toDto(locale);
    }

    @DeleteMapping("ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return service.deleteByRef(ref);
    }

    @GetMapping()
    public List<Locale> findAll() {
        return service.findAll();
    }

    public LocaleWs(LocaleMapper mapper, LocaleService service) {
        this.mapper = mapper;
        this.service = service;
    }

    private final LocaleMapper mapper;
    private final LocaleService service;
}
