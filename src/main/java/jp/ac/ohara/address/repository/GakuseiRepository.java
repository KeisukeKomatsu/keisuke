package jp.ac.ohara.address.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.ac.ohara.address.model.GakuseiHyou;
 
@Repository
public interface GakuseiRepository  extends JpaRepository<GakuseiHyou, Long>{
 
}
