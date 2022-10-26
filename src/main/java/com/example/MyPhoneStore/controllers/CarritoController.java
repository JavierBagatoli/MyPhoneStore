package com.example.MyPhoneStore.controllers;

import com.example.MyPhoneStore.entities.Carrito;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.MyPhoneStore.services.CarritoServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/v1/carritos")
public class CarritoController extends BaseControllerImpl<Carrito, CarritoServiceImpl>{
}
