package lk.w3Academy.asset.subject.dao;


import lk.w3Academy.asset.subject.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectDao extends JpaRepository<Subject, Long > {


   }
