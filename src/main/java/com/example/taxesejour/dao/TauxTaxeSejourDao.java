package com.example.taxesejour.dao;

import com.example.taxesejour.entity.TauxTaxeSejour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TauxTaxeSejourDao
        extends JpaRepository<TauxTaxeSejour, Long> {

    TauxTaxeSejour findByReference(String reference);
}