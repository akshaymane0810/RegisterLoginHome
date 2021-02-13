package amproject.repository;

import org.springframework.data.repository.CrudRepository;

import amproject.GetUser;

public interface UserRepository extends CrudRepository<GetUser, Integer> {

	GetUser findByName(String username);

}
