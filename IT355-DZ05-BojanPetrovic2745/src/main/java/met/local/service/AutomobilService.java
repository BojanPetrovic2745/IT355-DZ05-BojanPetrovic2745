package met.local.service;

import java.util.List;
import met.local.domain.Automobil;
import met.local.domain.Klasa;

public interface AutomobilService {
    
    List<Automobil> query(String naziv);
    
    void make(Automobil automobil);
    
    List<Klasa> getAllKlasa();
    
    Klasa getKlasa(int klasaId);
    
}
