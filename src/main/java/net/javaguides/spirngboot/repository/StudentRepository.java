package net.javaguides.spirngboot.repository;

import net.javaguides.spirngboot.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
