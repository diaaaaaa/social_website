package at.refugeescode.social_website.persistence.repository;

import at.refugeescode.social_website.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {


}
