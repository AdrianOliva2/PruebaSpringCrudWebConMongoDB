/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dam.adrianoliva.prueba;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Dam
 */
@Repository
public interface CocheRepository extends MongoRepository<Coche, String> {
    Coche findCocheByMatricula();
}
