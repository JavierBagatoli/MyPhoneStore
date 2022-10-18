package services;

import entities.Auricular;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.AuricularRepository;
import repositories.BaseRepository;

@Service
public class AuricularServiceImpl extends BaseServiceImpl<Auricular, Long> implements AuricularService{

    @Autowired
    private AuricularRepository auricularRepository;

    public AuricularServiceImpl(BaseRepository<Auricular, Long> baseRepository) {
        super(baseRepository);
    }
}
