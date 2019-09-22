package cerulean.hw1.Database;
import cerulean.hw1.Api.Models.Account.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends MongoRepository<Account, String> {
    Account findByUsername(String username);
}