
package com.example.Locale.service;

import com.example.Locale.dao.LocaleDao;
import com.example.Locale.entity.Locale;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocaleService {

    private final LocaleDao localeDao;

    public LocaleService(LocaleDao localeDao) {
        this.localeDao = localeDao;
    }

    public int save(Locale locale) {
        if (localeDao.findByReference(locale.getReference()) != null) {
            return -1;
        }
        localeDao.save(locale);
        return 1;
    }

    public Locale findByRef(String reference) {
        return localeDao.findByReference(reference);
    }

    public int deleteByRef(String reference) {
        Locale locale = localeDao.findByReference(reference);
        if (locale == null) {
            return -1;
        }
        localeDao.delete(locale);
        return 1;
    }

    public List<Locale> findAll() {
        return localeDao.findAll();
    }
}
