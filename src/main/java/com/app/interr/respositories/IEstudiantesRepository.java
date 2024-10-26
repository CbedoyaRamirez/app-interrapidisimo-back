package com.app.interr.respositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.interr.models.Estudiante;
import com.app.interr.models.EstudianteCompartidoDTO;


@Repository
public interface IEstudiantesRepository extends JpaRepository<Estudiante, Integer> {
	
    @Query(value = "SELECT e2.nombre AS nombre, m.nombre AS materia " +
            "FROM estudiantes em1 " +
            "JOIN estudiantes em2 ON em1.materia_id = em2.materia_id " +
            "JOIN estudiantes e1 ON em1.id = e1.id " +
            "JOIN estudiantes e2 ON em2.id = e2.id " +
            "JOIN materias m ON em1.materia_id = m.id " +
            "WHERE e1.cedula = :cedula " +
            "AND e1.id <> e2.id " +
            "ORDER BY m.nombre, e2.nombre", nativeQuery = true)
    List<Object[]> findCompanerosByCedula(@Param("cedula") String cedula);
	
}