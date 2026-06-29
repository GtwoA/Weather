package ru.gamzin.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gamzin.weather.model.User;

@Repository
public interface MainRepository extends JpaRepository<User, Long> {
}
