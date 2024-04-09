package springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.entity.WikimediaData;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {
}
