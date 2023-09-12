package dev.vishal.tictactoe.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Player {
    @Id
    private String id;
    private  String name;
    private  int age;
}
