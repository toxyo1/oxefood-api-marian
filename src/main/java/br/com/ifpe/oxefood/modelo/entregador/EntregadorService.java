package br.com.ifpe.oxefood.modelo.entregador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class EntregadorService { // Ops, mude o nome para EntregadorService se for copiar!

   @Autowired
   private EntregadorRepository repository;

   @Transactional
   public Entregador salvar(Entregador entregador) {
       return repository.save(entregador);
   }
}