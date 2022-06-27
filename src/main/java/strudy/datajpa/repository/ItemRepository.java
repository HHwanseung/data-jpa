package strudy.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import strudy.datajpa.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
