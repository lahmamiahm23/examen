package com.example.examen.Repo;

import com.example.examen.entities.Carrosserie;
import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarrosserieRepo extends JpaRepository<Carrosserie, Integer> {
    public List<Carrosserie> findByNum(int num);
}
