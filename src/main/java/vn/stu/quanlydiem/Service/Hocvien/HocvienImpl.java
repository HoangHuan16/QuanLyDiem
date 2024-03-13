package vn.stu.quanlydiem.Service.Hocvien;


import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import vn.stu.quanlydiem.Model.Hocvien;
import vn.stu.quanlydiem.Responsitory.HocvienRepository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class HocvienImpl implements HocvienService{
    private HocvienRepository hocvienRepository;

    @Override
    public List<Hocvien> findAll() {
        return hocvienRepository.findAll();
    }

    @Override
    public List<Hocvien> findAllById(Iterable<Integer> integers) {
        return hocvienRepository.findAllById(integers);
    }

    @Override
    public <S extends Hocvien> S save(S entity) {
        return hocvienRepository.save(entity);
    }

    @Override
    public Optional<Hocvien> findById(Integer integer) {
        return hocvienRepository.findById(integer);
    }

    @Override
    public void deleteById(Integer integer) {
        hocvienRepository.deleteById(integer);
    }

    @Override
    public List<Hocvien> findAll(Sort sort) {
        return hocvienRepository.findAll(sort);
    }

    @Override
    public Page<Hocvien> findAll(Pageable pageable) {
        return hocvienRepository.findAll(pageable);
    }
}
