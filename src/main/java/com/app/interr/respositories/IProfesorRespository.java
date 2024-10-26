package com.app.interr.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.interr.models.Profesor;


@Repository
public interface IProfesorRespository extends JpaRepository<Profesor, Integer> {
}