package com.example.taxesejour.service;

import com.example.taxesejour.dao.TauxTaxeSejourDao;
import com.example.taxesejour.entity.TauxTaxeSejour;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TauxTaxeSejourService {

    private final TauxTaxeSejourDao dao;

    public TauxTaxeSejourService(TauxTaxeSejourDao dao) {
        this.dao = dao;
    }


    public TauxTaxeSejour save(TauxTaxeSejour taux) {

        return dao.save(taux);
    }


    public List<TauxTaxeSejour> findAll() {
        return dao.findAll();
    }


    public Optional<TauxTaxeSejour> findById(Long id) {
        return dao.findById(id);
    }


    public TauxTaxeSejour update(Long id, TauxTaxeSejour nouveau) {

        TauxTaxeSejour ancien = dao.findById(id).orElse(null);

        if (ancien != null) {
            ancien.setReference(nouveau.getReference());
            ancien.setLibelle(nouveau.getLibelle());
            ancien.setCategorieTerrain(nouveau.getCategorieTerrain());

            return dao.save(ancien);
        }

        return null;
    }


    public void delete(Long id) {
        dao.deleteById(id);
    }
}