package lt.trains.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lt.trains.project.model.Wagons;

public interface WagonsRepository extends JpaRepository<Wagons, Long> {

}
