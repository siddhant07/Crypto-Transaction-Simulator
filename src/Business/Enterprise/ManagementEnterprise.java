/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author siri chowdhary
 */
public class ManagementEnterprise extends Enterprise{
    
     public ManagementEnterprise(String name) {
        super(name, EnterpriseType.Management);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
