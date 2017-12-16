package com.sb.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sb.entity.User;

@Repository
public interface UserRepositoty extends JpaRepository<User,Integer>{

    @Query("select t from User t where t.name = :name")
    User findByUserName(@Param("name") String name);
}
