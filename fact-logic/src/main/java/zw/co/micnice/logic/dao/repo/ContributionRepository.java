/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.micnice.logic.dao.repo;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import zw.co.micnice.logic.domain.BeneficiaryAddress;
import zw.co.micnice.logic.domain.Contribution;


public interface ContributionRepository extends CrudRepository<Contribution, Long> {
    public List<Contribution> findAll();
    
}
