package com.example.Locale.ws;


import com.example.Locale.entity.Locale;
import com.example.Locale.service.LocaleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/locale")
@CrossOrigin(origins = "*")

public class LocaleWs {

    private final LocaleService localeService;

    public LocaleWs(LocaleService localeService) {
        this.localeService = localeService;
    }

    @PostMapping
    public int save(@RequestBody Locale locale) {
        return localeService.save(locale);
    }

    @GetMapping("/ref/{ref}")
    public Locale findByRef(@PathVariable String ref) {
        return localeService.findByRef(ref);
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return localeService.deleteByRef(ref);
    }

    @GetMapping
    public List<Locale> findAll() {
        return localeService.findAll();
    }
}
