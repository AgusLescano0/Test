
package com.lescano.Portfolio.Security.Service;

import com.lescano.Portfolio.Security.Entity.Role;
import com.lescano.Portfolio.Security.Enums.RoleName;
import com.lescano.Portfolio.Security.Repository.iRoleRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RoleService {
    
    @Autowired
    iRoleRepository iroleRepository;
    
    public Optional<Role> getByRoleName(RoleName roleName){
        return iroleRepository.findByRoleName(roleName);
    }
    
    public void save(Role role){
        iroleRepository.save(role);
    }
}
