package br.univille.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.entity.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
    // Aqui você pode adicionar métodos personalizados, se necessário
    // Exemplo: List<Cliente> findByNome(String nome);

}
