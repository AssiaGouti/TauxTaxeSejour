package com.example.taxe_sejour.service.impl;

import com.example.taxe_sejour.dao.LocaleDao;
import com.example.taxe_sejour.entity.Locale;
import com.example.taxe_sejour.service.facade.LocaleService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class LocaleServiceImpl implements LocaleService {

    private LocaleDao dao;

    public LocaleServiceImpl(LocaleDao dao) {
        this.dao = dao;
    }

    public int save(Locale locale) {

        if (findByref(locale.getReference()) != null) {
            return -1;
        } else {
            dao.save(locale);
            return 1;
        }
    }

    public Locale findByref(String reference) {
        return dao.findByReference(reference);
    }

    @Transactional
    public int deleteByRef(String reference) {

        Locale locale = findByref(reference);

        if (locale == null) {
            return -1;
        } else {
            dao.delete(locale);
            return 1;
        }
    }

    public List<Locale> findAll() {
        return dao.findAll();
    }

}
