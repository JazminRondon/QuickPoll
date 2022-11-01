package com.QuickPoll.favoriteseason.repository;

import com.QuickPoll.favoriteseason.Poll;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PollRepository extends CrudRepository<Poll, Long> {


}
