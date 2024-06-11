package org.bonustask;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Animal {
    String name;
    LocalDate birthday;
}
