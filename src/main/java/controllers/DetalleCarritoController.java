package controllers;


import entities.DetalleCarrito;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.DetalleCarritoServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/v1/detallesCarrito")

public class DetalleCarritoController extends BaseControllerImpl<DetalleCarrito, DetalleCarritoServiceImpl>{
}
