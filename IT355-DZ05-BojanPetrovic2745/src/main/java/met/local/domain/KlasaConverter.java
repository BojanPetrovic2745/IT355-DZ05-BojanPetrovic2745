package met.local.domain;

import met.local.service.AutomobilService;
import org.springframework.core.convert.converter.Converter;

public class KlasaConverter implements Converter<String, Klasa> {

    private AutomobilService automobilService;

    public KlasaConverter(AutomobilService automobilService) {
        this.automobilService = automobilService;
    }

    @Override
    public Klasa convert(String source) {

        int klasaId = Integer.parseInt(source);

        Klasa klasa = automobilService.getKlasa(klasaId);

        return klasa;

    }

}
