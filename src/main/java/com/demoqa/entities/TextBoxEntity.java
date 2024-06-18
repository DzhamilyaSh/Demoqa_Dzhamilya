package com.demoqa.entities;

import lombok.*;
// создается этот класс для того, чтобы не размножать параметры и еоротко писать
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder // помогает создавать сложные обьекты, избегая создания множество конструкторов
public class TextBoxEntity {


    private String fullName;
    private String email;
    private String currentAddress;
    private String permanentAddress;

}