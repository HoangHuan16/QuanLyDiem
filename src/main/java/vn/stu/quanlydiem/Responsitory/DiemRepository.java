package vn.stu.quanlydiem.Responsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.stu.quanlydiem.Model.Diem;
@Repository
public interface DiemRepository extends JpaRepository<Diem, Integer> {

}