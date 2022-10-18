package services;

import entities.DetalleCarrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.BaseRepository;
import repositories.DetalleCarritoRepository;

@Service
public class DetalleCarritoServiceImpl extends BaseServiceImpl<DetalleCarrito, Long> implements DetalleCarritoService{

    @Autowired
    private DetalleCarritoRepository detalleCarritoRepository;

    public DetalleCarritoServiceImpl(BaseRepository<DetalleCarrito, Long> baseRepository) {
        super(baseRepository);
    }
}
