package lk.w3Academy.asset.userManagement.dao;


import lk.w3Academy.asset.userManagement.entity.ConformationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConformationTokenDao extends JpaRepository<ConformationToken, Integer> {
    ConformationToken findByToken(String token);

    ConformationToken findByEmail(String email);
}
