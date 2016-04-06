package th.co.dtac.mobile.rtr.repository;

import org.springframework.data.repository.CrudRepository;
import th.co.dtac.mobile.rtr.th.co.dtac.mobile.rtr.model.Product;

import java.util.List;

/**
 * Created by roofimon on 4/4/2016 AD.
 */
public interface ProductRepository extends CrudRepository<Product, Long> {
    List<Product> findByProductName(String productName);
}
