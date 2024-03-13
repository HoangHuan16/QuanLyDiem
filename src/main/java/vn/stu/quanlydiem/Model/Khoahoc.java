package vn.stu.quanlydiem.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.LinkedHashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "khoahoc")
public class Khoahoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_khoa_hoc", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @Column(name = "tieu_de", nullable = false)
    private String tieuDe;

    @Size(max = 50)
    @NotNull
    @Column(name = "muc_do", nullable = false, length = 50)
    private String mucDo;

    @Lob
    @Column(name = "mo_ta")
    private String moTa;


    @OneToMany(mappedBy = "maKhoaHoc")
    private Set<Danhgia> danhgias = new LinkedHashSet<>();

}