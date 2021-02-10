package userRegistration.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import userRegistration.models.User;

@Repository
public interface UserRepository extends CrudRepository <User, Integer>{

    User findById(int id);

}
