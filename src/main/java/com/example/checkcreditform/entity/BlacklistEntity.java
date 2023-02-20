package com.example.checkcreditform.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "blacklist")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BlacklistEntity {

    @Id
    @SequenceGenerator(name = "blacklistSequence", sequenceName = "blacklist_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "blacklistSequence")
    @Column(name = "id")
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "second_name")
    private String secondName;
    @Column(name = "date_of_birth")
    private String dateOfBirth;
    @Column(name = "passport_serial")
    private String passportSerial;
    @Column(name = "passport_number")
    private String passportNumber;
}
