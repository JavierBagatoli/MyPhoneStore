package services;

import entities.Parlante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.BaseRepository;
import repositories.ParlanteRepository;

@Service
public class ParlanteServiceImpl extends BaseServiceImpl<Parlante, Long> implements ParlanteService{

    @Autowired
    private ParlanteRepository parlanteRepository;

    public ParlanteServiceImpl(BaseRepository<Parlante, Long> baseRepository) {
        super(baseRepository);
    }
}
