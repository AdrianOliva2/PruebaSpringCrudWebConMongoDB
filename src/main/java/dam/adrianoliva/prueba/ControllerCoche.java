/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam.adrianoliva.prueba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Dam
 */
@RestController
@RequestMapping("/coche")
public class ControllerCoche {
    @Autowired
    CocheRepository cocheRepository;
    
    @PostMapping("/addCoche")
    public ResponseEntity<Coche> addCoche(@RequestBody Coche coche) {
        cocheRepository
    }
}
