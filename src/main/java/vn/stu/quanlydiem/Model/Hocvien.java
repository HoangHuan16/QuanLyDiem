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
@Table(name = "hocvien")
public class Hocvien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_hoc_vien", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @Column(name = "ten", nullable = false)
    private String ten;

    @Size(max = 255)
    @NotNull
    @Column(name = "email", nullable = false)
    private String email;

    @Size(max = 20)
    @NotNull
    @Column(name = "so_dien_thoai", nullable = false, length = 20)
    private String soDienThoai;

    @Lob
    @Column(name = "dia_chi")
    private String diaChi;


    @OneToMany(mappedBy = "maHocVien")
    private Set<Diem> diems = new LinkedHashSet<>();

}