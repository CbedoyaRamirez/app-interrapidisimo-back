package com.app.interr.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.interr.models.Materia;


@Repository
public interface IMateriasRepository extends JpaRepository<Materia, Integer> {
}