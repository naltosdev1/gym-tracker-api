package org.naltos.gymtrackerapi.Repository;

import org.naltos.gymtrackerapi.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> { }
