
package com.example.taxe_sejour.ws.mapper;

import com.example.taxe_sejour.entity.Locale;
import com.example.taxe_sejour.ws.dto.LocaleDto;
import org.springframework.stereotype.Component;

@Component
public class LocaleMapper {

    public static LocaleDto toDto(Locale locale) {

        if (locale == null) return null;

        LocaleDto dto = new LocaleDto();

        dto.setId(locale.getId());
        dto.setReference(locale.getReference());
        dto.setLibelle(locale.getLibelle());
        dto.setRue(locale.getRue());
        dto.setComplementAdresse(
                locale.getComplementAdresse()
        );

        return dto;
    }

    public static Locale toEntity(LocaleDto dto) {

        if (dto == null) return null;

        Locale locale = new Locale();

        locale.setId(dto.getId());
        locale.setReference(dto.getReference());
        locale.setLibelle(dto.getLibelle());
        locale.setRue(dto.getRue());
        locale.setComplementAdresse(
                dto.getComplementAdresse()
        );

        return locale;
    }
}
