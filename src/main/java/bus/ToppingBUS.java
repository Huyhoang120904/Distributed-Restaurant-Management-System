/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bus;

import dal.ItemDAL;
import dal.ItemToppingDAL;
import dal.ToppingDAL;
import dto.ToppingDTO;
import model.ItemEntity;
import model.ItemToppingEntity;
import model.ToppingEntity;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ItemToppingId;

/**
 *
 * @author Trần Ngọc Huyền
 */
public class ToppingBUS implements BaseBUS<ToppingEntity, String> {

    private ToppingDAL toppingDAL;
    private ItemToppingDAL itemToppingDAL;
    private ItemDAL itemDAL;

    public ToppingBUS(EntityManager entityManager) {
        this.toppingDAL = new ToppingDAL(entityManager);
        this.itemToppingDAL = new ItemToppingDAL(entityManager);
        this.itemDAL = new ItemDAL(entityManager);
    }

    @Override
    public boolean insertEntity(ToppingEntity topping) {
        return toppingDAL.insert(topping);
    }

    @Override
    public boolean updateEntity(ToppingEntity topping) {
        return toppingDAL.update(topping);
    }

    @Override
    public boolean deleteEntity(String id) {
        return toppingDAL.deleteById(id);
    }

    @Override
    public ToppingEntity getEntityById(String id) {
        return toppingDAL.findById(id);
    }

    @Override
    public List<ToppingEntity> getAllEntities() {
        return toppingDAL.findAll();
    }

    public boolean addTopping(ToppingDTO toppingDTO) {
        ToppingEntity toppingEntity = new ToppingEntity();
        try {
            toppingEntity.setName(toppingDTO.getName());
        
        toppingEntity.setDescription(toppingDTO.getDesc());
        toppingEntity.setCostPrice(toppingDTO.getCostPrice());
        toppingEntity.setActive(toppingDTO.isActive());
        toppingEntity.setStockQuantity(toppingDTO.getStockQty());
        toppingEntity.setItemToppings(new HashSet<>());
        toppingEntity.setCreatedDate(LocalDateTime.now());
        toppingEntity.setModifiedDate(LocalDateTime.now());
        } catch (Exception ex) {
            Logger.getLogger(ToppingBUS.class.getName()).log(Level.SEVERE, null, ex);
        }

        toppingDAL.insert(toppingEntity);

        Set<ItemToppingEntity> list = new HashSet<>();
        for (String itemId : toppingDTO.getListItemIds()) {
            ItemEntity item = itemDAL.findById(itemId);

            ItemToppingEntity itemTopping = new ItemToppingEntity(item, toppingEntity);
            list.add(itemTopping);
            itemToppingDAL.insert(itemTopping);
        }
        toppingEntity.setItemToppings(list);
        toppingDAL.update(toppingEntity);
        return true;
    }

    public void updateTopping(ToppingDTO toppingDTO, String id) {
        try {
            ToppingEntity toppingEntity = toppingDAL.findById(id);
            
            toppingEntity.setName(toppingDTO.getName());
            toppingEntity.setDescription(toppingDTO.getDesc());
            toppingEntity.setCostPrice(toppingDTO.getCostPrice());
            toppingEntity.setActive(toppingDTO.isActive());
            toppingEntity.setStockQuantity(toppingDTO.getStockQty());
            toppingEntity.setModifiedDate(LocalDateTime.now());
            Set<ItemToppingEntity> list =  toppingEntity.getItemToppings();
            
            for ( ItemToppingEntity itemToppingEntity : list ){
                itemToppingDAL.deleteById(new ItemToppingId(itemToppingEntity.getItem().getItemId(), itemToppingEntity.getTopping().getToppingId()));
            }
            
            for (String itemId : toppingDTO.getListItemIds()) {
                ItemEntity item = itemDAL.findById(itemId);
                
                ItemToppingEntity itemTopping = new ItemToppingEntity(item, toppingEntity);
                list.add(itemTopping);
                itemToppingDAL.insert(itemTopping);
            }
            
            toppingDAL.update(toppingEntity);
        } catch (Exception ex) {
            Logger.getLogger(ToppingBUS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<ToppingEntity> findTopping(ToppingDTO toppingDTO) {
        return toppingDAL.findByCriteria(toppingDTO);
    }
}
