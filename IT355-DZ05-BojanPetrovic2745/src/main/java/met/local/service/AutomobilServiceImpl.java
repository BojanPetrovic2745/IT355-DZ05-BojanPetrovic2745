package met.local.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import met.local.domain.Automobil;
import met.local.domain.Klasa;
import org.springframework.stereotype.Service;

@Service
public class AutomobilServiceImpl implements AutomobilService {

    public static final Klasa VISOKA = new Klasa(1, "Visoka");
    public static final Klasa SREDNJA = new Klasa(2, "Srednja");

    private final List<Automobil> automobili = new ArrayList<>();

    public AutomobilServiceImpl() {

        automobili.add(new Automobil("Maybach", "57", 2002, VISOKA));

        automobili.add(new Automobil("BMW", "3 Series", 1975, SREDNJA));
    }

    @Override
    public List<Automobil> query(String naziv) {
        return this.automobili.stream().filter(automobil
                -> Objects.equals(automobil.getNaziv(),
                        naziv)).collect(Collectors.toList());
    }

    @Override
    public void make(Automobil automobil) {
        long cnt = automobili.stream()
                .filter(made -> Objects.equals(made.getNaziv(),
                automobil.getNaziv()))
                .filter(made -> Objects.equals(made.getNazivModela(),
                automobil.getNazivModela()))
                .filter(made -> Objects.equals(made.getGodiste(),
                automobil.getGodiste()))
                .filter(made -> Objects.equals(made.getKlasa(),
                automobil.getKlasa())).count();

    }

    @Override
    public List<Klasa> getAllKlasa() {
        return Arrays.asList(new Klasa[]{VISOKA, SREDNJA});
    }

    @Override
    public Klasa getKlasa(int klasaId) {
        switch (klasaId) {
            case 1:
                return VISOKA;
            case 2:
                return SREDNJA;
            default:
                return null;
        }

    }

}
