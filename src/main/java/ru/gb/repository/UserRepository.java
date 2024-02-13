package ru.gb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.domain.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    public List<User> findAll();
    void deleteById(int id);

}
