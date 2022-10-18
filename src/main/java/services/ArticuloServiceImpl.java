package services;

import entities.Articulo;
import entities.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import repositories.ArticuloRepository;
import repositories.BaseRepository;

import java.util.List;

@Service
public class ArticuloServiceImpl extends BaseServiceImpl<Articulo, Long> implements ArticuloService{

    @Autowired
    private ArticuloRepository articuloRepository;

    public ArticuloServiceImpl(BaseRepository<Articulo, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Articulo> search(String filtro) throws Exception {
        try {

            List<Articulo> articulos = articuloRepository.search(filtro);

            return articulos;

        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Articulo> search(String filtro, Pageable pageable) throws Exception {
        try {

            Page<Articulo> articulos = articuloRepository.search(filtro, pageable);

            return articulos;

        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}

