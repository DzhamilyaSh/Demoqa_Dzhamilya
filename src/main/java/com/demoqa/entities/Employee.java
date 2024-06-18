package com.demoqa.entities;

import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@EqualsAndHashCode
public class Employee {

    private String firstname;
    private String lastname;
    private int age;
    private String email;
    private long salary;
    private String department;
}
