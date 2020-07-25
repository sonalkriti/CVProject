package com.example.oAuth2Demo.repository;

import com.example.oAuth2Demo.model.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
//List<Player> findByTeamId(long teamId);
//    List<UserEntity> findByUserId(long userId);
}
