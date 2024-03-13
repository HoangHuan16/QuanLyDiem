package vn.stu.quanlydiem.API;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.stu.quanlydiem.Model.Hocvien;
import vn.stu.quanlydiem.Service.Hocvien.HocvienService;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class HocvienRestAPI {
    private HocvienService hocvienService;

    public HocvienRestAPI(HocvienService hocvienService) {
        this.hocvienService = hocvienService;
    }

    @GetMapping("/hocvien")
    public List<Hocvien> showHocVien(){
        return hocvienService.findAll();
    }
}
