package com.example.taxesejour.ws;

import com.example.taxesejour.entity.TauxTaxeSejour;
import com.example.taxesejour.service.TauxTaxeSejourService;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/api/taux-taxe-sejour")
public class TauxTaxeSejourWs {

    private final TauxTaxeSejourService service;

    public TauxTaxeSejourWs(TauxTaxeSejourService service) {
        this.service = service;
    }



    @GetMapping("/reference/{reference}")
    public TauxTaxeSejour findByReference(
            @PathVariable String reference) {

        return service.findByReference(reference);
    }


    @PostMapping
    public int save(@RequestBody TauxTaxeSejour taux) {

        return service.save(taux);
    }


    @GetMapping
    public List<TauxTaxeSejour> findAll() {

        return service.findAll();
    }



    @GetMapping("/{id}")
    public ResponseEntity<TauxTaxeSejour> findById(
            @PathVariable Long id) {

        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }



    @PutMapping("/{id}")
    public ResponseEntity<TauxTaxeSejour> update(
            @PathVariable Long id,
            @RequestBody TauxTaxeSejour taux) {

        TauxTaxeSejour result = service.update(id, taux);

        if (result != null) {
            return ResponseEntity.ok(result);
        }

        return ResponseEntity.notFound().build();
    }



    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        int resultat = service.delete(id);

        if (resultat == -1) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.noContent().build();
    }
}