package com.united.test.TestSpringBoot;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//@Repository
public interface DataRepo extends JpaRepository<ExchangeValue,Long>{

	ExchangeValue findByFromAndTo(String from, String to);

}
