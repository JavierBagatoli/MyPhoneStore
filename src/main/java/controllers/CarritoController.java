package controllers;

import entities.Carrito;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.CarritoServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/v1/carritos")
public class CarritoController extends BaseControllerImpl<Carrito, CarritoServiceImpl>{
}
