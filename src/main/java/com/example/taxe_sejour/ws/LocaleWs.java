package com.example.taxe_sejour.ws;


import com.example.taxe_sejour.entity.Locale;
import com.example.taxe_sejour.service.LocaleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/locale")
@CrossOrigin(origins = "*")

public class LocaleWs {

    private final LocaleService localeService;

    public LocaleWs(LocaleService localeService) {
        this.localeService = localeService;
    }

    @PostMapping("/")
    public int save(@RequestBody Locale locale) {
        return localeService.save(locale);
    }

    @GetMapping("/ref/{ref}")
    public Locale findByref(@PathVariable String ref) {
        return localeService.findByref(ref);
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return localeService.deleteByRef(ref);
    }

    @GetMapping("/")
    public List<Locale> findAll() {
        return localeService.findAll();
    }
}
