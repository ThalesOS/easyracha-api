package br.com.thales.easyracha.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor@NoArgsConstructor
@Table(name = "attendances" )
public class Attendance {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne @NotNull @JoinColumn(name = "player_id", nullable = false)
    private Player player;
    @ManyToOne @NotNull @JoinColumn(name = "match_id", nullable = false)
    private Match match;
    @NotNull @Column(nullable = false)
    private Boolean confirmed;
}
