package de.awr.station;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station, Long> {

	int countByNameIgnoreCaseAndIdNot(String name, Long id);

}
