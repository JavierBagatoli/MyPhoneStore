package controllers;

import entities.Celular;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.CelularServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/v1/calulares")

public class CelularController extends BaseControllerImpl<Celular, CelularServiceImpl>{
}
