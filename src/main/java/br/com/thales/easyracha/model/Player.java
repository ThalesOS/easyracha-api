package br.com.thales.easyracha.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@Table(name = "players")
public class Player {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull @Column(nullable = false)@Size(min = 3, max = 100)
    private String name;
    @NotNull @Column(nullable = false)
    private String phone;
    @NotNull @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private PlayerType playerType;
}
