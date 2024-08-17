package com.example.demo.Repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import com.example.demo.Model.Pessoa;

@Repository
public interface DeficienciaRepository extends JpaRepository<Pessoa, Long>{

}