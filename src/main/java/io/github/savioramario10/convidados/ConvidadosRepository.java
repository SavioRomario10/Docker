package io.github.savioramario10.convidados;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;       

@Repository
public interface ConvidadosRepository extends JpaRepository <Convidado, Long> {
}