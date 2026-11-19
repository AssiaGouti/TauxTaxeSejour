package com.example.taxe_sejour.service.facade;

import com.example.taxe_sejour.entity.Locale;
import org.springframework.stereotype.Service;

import java.util.List;

public interface LocaleService {

    int save(Locale locale);

    Locale findByref(String reference);

    int deleteByRef(String reference);

    List<Locale> findAll();


}
