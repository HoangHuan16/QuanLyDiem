package vn.stu.quanlydiem.Model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "diem")
public class Diem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_diem", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_hoc_vien")
    private Hocvien maHocVien;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_danh_gia")
    private Danhgia maDanhGia;

    @Column(name = "diem")
    private Float diem;

}