package com.QuickPoll.favoriteseason.repository;




import com.QuickPoll.favoriteseason.Options;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface OptionRepository extends CrudRepository<Options, Long> {


}
