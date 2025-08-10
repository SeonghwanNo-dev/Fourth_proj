package com.github.SeonghwanNo_dev.fourth_proj.Model.Service;


import com.github.SeonghwanNo_dev.fourth_proj.Model.Entity.MemberEntity;
import com.github.SeonghwanNo_dev.fourth_proj.Model.Entity.OrderEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void doLogic() {


    }
}