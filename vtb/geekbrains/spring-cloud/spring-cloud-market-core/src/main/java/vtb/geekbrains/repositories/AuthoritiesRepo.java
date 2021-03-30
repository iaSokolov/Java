package vtb.geekbrains.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vtb.geekbrains.models.Authority;

@Repository
public interface AuthoritiesRepo extends JpaRepository<Authority, Authority.Id> {
}