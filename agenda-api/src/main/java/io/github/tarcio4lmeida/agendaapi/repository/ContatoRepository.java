package io.github.tarcio4lmeida.agendaapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import io.github.tarcio4lmeida.agendaapi.entity.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}