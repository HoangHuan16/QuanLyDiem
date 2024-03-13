package vn.stu.quanlydiem.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "danhgia")
public class Danhgia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_danh_gia", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_khoa_hoc")
    private Khoahoc maKhoaHoc;

    @Size(max = 50)
    @NotNull
    @Column(name = "loai", nullable = false, length = 50)
    private String loai;

    @Column(name = "ngay")
    private LocalDate ngay;

    @OneToMany(mappedBy = "maDanhGia")
    private Set<Diem> diems = new LinkedHashSet<>();

}