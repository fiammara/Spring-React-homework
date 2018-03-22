package lt.trains.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lt.trains.project.model.Trains;



public interface TrainsRepository extends JpaRepository<Trains, Long>{

}
