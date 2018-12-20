package com.project02.Repository;

import com.project02.Entity.EntityGoods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryGoods extends JpaRepository<EntityGoods,Long> {

}
