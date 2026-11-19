package com.example.taxe_sejour.dao;


import com.example.taxe_sejour.entity.Locale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocaleDao extends JpaRepository<Locale , Long> {

    Locale findByReference(String reference);

    void deleteByReference(String reference);

}
