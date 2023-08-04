package com.cafeconpalito.DataJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author TerciodeMarte
 */

@Repository
public interface CocheRepository extends JpaRepository<Coche, Integer>{
    
}
