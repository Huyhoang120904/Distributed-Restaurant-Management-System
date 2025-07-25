/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import model.CustomerEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.swing.JOptionPane;
import util.IDGeneratorUtility;

/**
 *
 * @author hoang
 */
public class CustomerDAL implements BaseDAL<CustomerEntity, String> {

    private EntityManager em;

    public CustomerDAL(EntityManager em) {
        this.em = em;
    }

    private EntityTransaction getEntityTransaction() {
        return em.getTransaction();
    }

    private boolean executeTransaction(Runnable action) {
        EntityTransaction et = getEntityTransaction();

        try {
            et.begin();
            action.run();
            et.commit();
            return true;
        } catch (Exception e) {
            if (et.isActive()) {
                et.rollback();
            }
        }
        return false;
    }

    @Override
    public boolean insert(CustomerEntity t) {
        t.setCustomerId(IDGeneratorUtility.generateIDWithCreatedDate("Cust", "customers", "customer_id", "created_date", em, LocalDateTime.now()));
        return executeTransaction(() -> em.persist(t));
    }

    @Override
    public boolean update(CustomerEntity t) {
        return executeTransaction(() -> em.merge(t));
    }

    @Override
    public boolean deleteById(String id) {
        return false;
    }

    @Override
    public CustomerEntity findById(String id) {
        return em.find(CustomerEntity.class, id);
    }

    @Override
    public List<CustomerEntity> findAll() {
        return em.createQuery("from CustomerEntity c", CustomerEntity.class).getResultList();
    }

    public CustomerEntity findByPhone(String phoneNumber) {
        return em.createQuery("select c from CustomerEntity c " +
                "where c.phone = :phoneNumber", CustomerEntity.class)
                .setParameter("phoneNumber", phoneNumber)
                .getResultStream()
                .findFirst()
                .orElse(null);
    }

    public List<CustomerEntity> getCustomersByKeyword(String name, String phoneNumber, String email, LocalDateTime dOB, String address) {
        StringBuilder queryBuilder = new StringBuilder("SELECT c FROM CustomerEntity c WHERE 1=1 ");
        List<Object> parameters = new ArrayList<>();

        if (name != null && !name.isEmpty()) {
            queryBuilder.append("AND c.name LIKE :name ");
        }
        if (phoneNumber != null && !phoneNumber.isEmpty()) {
            queryBuilder.append("AND c.phone LIKE :phoneNumber ");
        }
        if (email != null && !email.isEmpty()) {
            queryBuilder.append("AND c.email LIKE :email ");
        }
        if (dOB != null) {
            queryBuilder.append("AND c.dateOfBirth = :dOB ");
        }
        if (address != null && !address.isEmpty()) {
            queryBuilder.append("AND c.address LIKE :address ");
        }

        Query query = em.createQuery(queryBuilder.toString(), CustomerEntity.class);

        if (name != null && !name.isEmpty()) {
            query.setParameter("name", "%" + name + "%");
        }
        if (phoneNumber != null && !phoneNumber.isEmpty()) {
            query.setParameter("phoneNumber", "%" + phoneNumber + "%");
        }
        if (email != null && !email.isEmpty()) {
            query.setParameter("email", "%" + email + "%");
        }
        if (dOB != null) {
            query.setParameter("dOB", dOB);
        }
        if (address != null && !address.isEmpty()) {
            query.setParameter("address", "%" + address + "%");
        }
        return query.getResultList();
    }
}
