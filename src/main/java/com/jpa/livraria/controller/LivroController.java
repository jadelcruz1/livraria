package com.jpa.livraria.controller;


import com.jpa.livraria.model.Livro;
import com.jpa.livraria.repository.LivroRepository;
import com.jpa.livraria.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/livros")
@CrossOrigin(origins = "http://localhost:4200") // Permite conexão com Angular
public class LivroController {

    private final LivroService service;

    @Autowired
    private LivroRepository livroRepository;

    public LivroController(LivroService service) {
        this.service = service;
    }

    @GetMapping
    public List<Livro> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Livro buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    /*@PostMapping
    public Livro criar(@RequestBody Livro livro) {
        return service.salvar(livro);
    }*/

    @PostMapping
    public ResponseEntity<List<Livro>> adicionarLivros(@RequestBody List<Livro> livros) {
        List<Livro> salvos = livroRepository.saveAll(livros);
        return ResponseEntity.ok(salvos);
    }


    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }

    // deletar em lotes
    @DeleteMapping("/lote")
    public ResponseEntity<Void> deletarEmLote(@RequestBody List<Long> ids) {
        service.deletarEmLote(ids);
        return ResponseEntity.noContent().build();
    }

    // deletar todos de uma vez
    @DeleteMapping("/todos")
    public ResponseEntity<Void> deletarTodos() {
        service.deletarTodos();
        return ResponseEntity.noContent().build();
    }




    @PutMapping("/{id}")
    public ResponseEntity<Livro> atualizar(@PathVariable Long id, @RequestBody Livro livroAtualizado) {
        Livro atualizado = service.atualizarLivroService(id, livroAtualizado);
        return ResponseEntity.ok(atualizado);
    }

}
