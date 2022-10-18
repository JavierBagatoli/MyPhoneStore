package services;

import entities.Celular;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.BaseRepository;
import repositories.CelularRepository;

@Service
public class CelularServiceImpl extends BaseServiceImpl<Celular, Long> implements CelularService{

    @Autowired
    private CelularRepository celularRepository;

    public CelularServiceImpl(BaseRepository<Celular, Long> baseRepository) {
        super(baseRepository);
    }
}
