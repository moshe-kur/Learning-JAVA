package com.example.last2031.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<Person, Integer> {
}
