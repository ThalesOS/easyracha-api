package br.com.thales.easyracha.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
@Table(name = "matches")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull @Column(nullable = false)@Size(min = 3, max = 255)
    private String location;
    @NotNull @Column(nullable = false)
    private LocalDateTime dateTime;
    @NotNull @Column(nullable = false)
    private BigDecimal courtCost;
    @NotNull @Column(nullable = false)
    private Integer maxPlayers;
}
