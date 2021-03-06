/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.micnice.logic.dao;

import java.util.List;
import zw.co.micnice.logic.domain.Beneficiary;
import zw.co.micnice.logic.domain.BeneficiaryContact;


public interface BeneficiaryContactDAO extends IGenericDAO<BeneficiaryContact>{
    public List<BeneficiaryContact> findByBeneficiary(Beneficiary beneficiary);
}
