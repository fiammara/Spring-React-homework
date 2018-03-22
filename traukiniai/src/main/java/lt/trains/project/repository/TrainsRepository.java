package lt.trains.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lt.trains.project.model.Train;



public interface TrainsRepository extends JpaRepository<Train, Long>{

}
