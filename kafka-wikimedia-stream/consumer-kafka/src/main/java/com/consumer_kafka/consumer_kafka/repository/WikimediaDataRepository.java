package com.consumer_kafka.consumer_kafka.repository;

import com.consumer_kafka.consumer_kafka.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData,Long> {
}
