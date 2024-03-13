package vn.stu.quanlydiem.Service.Hocvien;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import vn.stu.quanlydiem.Model.Hocvien;

import java.util.List;
import java.util.Optional;

public interface HocvienService {

    List<Hocvien> findAll();

    List<Hocvien> findAllById(Iterable<Integer> integers);

    <S extends Hocvien> S save(S entity);

    Optional<Hocvien> findById(Integer integer);

    void deleteById(Integer integer);

    List<Hocvien> findAll(Sort sort);

    Page<Hocvien> findAll(Pageable pageable);
}
