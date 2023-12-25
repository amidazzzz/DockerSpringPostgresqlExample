package com.experto.springbootpostgresqldocker.repository;

import com.experto.springbootpostgresqldocker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
