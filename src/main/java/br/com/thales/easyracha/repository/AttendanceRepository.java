package br.com.thales.easyracha.repository;

import br.com.thales.easyracha.model.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepository extends JpaRepository<Attendance,Long> {
}
