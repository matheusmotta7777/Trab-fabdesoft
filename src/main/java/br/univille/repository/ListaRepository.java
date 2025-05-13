package br.univille.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.univille.entity.Lista;

public interface ListaRepository extends JpaRepository<Lista, Long> {
}
