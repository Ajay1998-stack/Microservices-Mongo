package com.stackRoute.MongoDB.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.Entity;
//import javax.persistence.Id;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Track {
    @Id
    int id;
    String trackName;
    String comments;
}
