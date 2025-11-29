package com.jpa.livraria.service;


import com.jpa.livraria.model.Livro;
import com.jpa.livraria.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    private final LivroRepository repository;

    public LivroService(LivroRepository repository) {
        this.repository = repository;
    }

    public List<Livro> listarTodos() {
        return repository.findAll();
    }

    public Livro salvar(Livro livro) {
        return repository.save(livro);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public Livro buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    // Novo método de atualização
    public Livro atualizarLivroService(Long id, Livro livroAtualizado) {
        Livro livroExistente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Livro não encontrado"));

        livroExistente.setTitulo(livroAtualizado.getTitulo());
        livroExistente.setAutor(livroAtualizado.getAutor());
        livroExistente.setPreco(livroAtualizado.getPreco());
        livroExistente.setIsbn(livroAtualizado.getIsbn());

        return repository.save(livroExistente);
    }

    public void deletarEmLote(List<Long> ids) {
        repository.deleteAllById(ids);
    }

    public void deletarTodos() {
        repository.deleteAll();
    }


}
