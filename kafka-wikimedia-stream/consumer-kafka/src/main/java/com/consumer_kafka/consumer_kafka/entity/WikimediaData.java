package com.consumer_kafka.consumer_kafka.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="wikimedia-updates")
@Getter
@Setter
public class WikimediaData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Lob annotation specifies that the database should store the property as Large Object
    @Lob
    private String wikiEventData;

}
