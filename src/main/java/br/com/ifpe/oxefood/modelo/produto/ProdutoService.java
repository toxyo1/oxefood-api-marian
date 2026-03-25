package br.com.ifpe.oxefood.modelo.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class ProdutoService {

   @Autowired
   private ProdutoRepository repository;

   @Transactional
   public Produto salvar(Produto produto) {
       return repository.save(produto);
   }
}