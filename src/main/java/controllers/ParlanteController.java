package controllers;

import entities.Parlante;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.ParlanteServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/v1/parlantes")

public class ParlanteController extends BaseControllerImpl<Parlante, ParlanteServiceImpl> {
}
