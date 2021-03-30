package vtb.geekbrains.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vtb.geekbrains.models.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, String> {
}