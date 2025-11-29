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
}
