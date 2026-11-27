package com.example.Locale.dao;


import com.example.Locale.entity.Locale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocaleDao extends JpaRepository<Locale , Long> {

    Locale findByReference(String reference);

    void deleteByReference(String reference);

}
