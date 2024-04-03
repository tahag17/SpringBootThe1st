package com.jetbrains.taha.Gphoto.Clone.Repositories;

import com.jetbrains.taha.Gphoto.Clone.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends CrudRepository<Dog, Integer> {
}
