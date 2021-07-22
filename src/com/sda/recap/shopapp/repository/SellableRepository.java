package com.sda.recap.shopapp.repository;

import com.sda.recap.shopapp.model.Sellable;

import java.util.Optional;

public interface SellableRepository<T extends Sellable>  {

   void add(T item);

   Optional<T> search(String id);

   void remove(String id);

   Optional<T> findByName(String name);

}
