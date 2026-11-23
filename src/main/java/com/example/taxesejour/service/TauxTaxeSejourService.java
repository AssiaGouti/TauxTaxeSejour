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



    public TauxTaxeSejour findByReference(String reference) {
        return dao.findByReference(reference);
    }



    public int save(TauxTaxeSejour taux) {

        if (dao.findByReference(taux.getReference()) != null) {
            return -1;
        }

        dao.save(taux);

        return 1;
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

    public int delete(Long id) {

        TauxTaxeSejour taux = dao.findById(id).orElse(null);

        if (taux == null) {
            return -1;
        }

        dao.delete(taux);

        return 1;
    }
}