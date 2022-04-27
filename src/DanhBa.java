import java.io.Serializable;

public class DanhBa implements Serializable {
    int id;
    String ten,gioitinh,email,diachi;
int tuoi;
    public DanhBa() {
    }

    public DanhBa(int id, String ten, String gioitinh, String email, String diachi, int tuoi) {
        this.id = id;
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.email = email;
        this.diachi = diachi;
        this.tuoi = tuoi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "DanhBa{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                ", gioitinh='" + gioitinh + '\'' +
                ", email='" + email + '\'' +
                ", diachi='" + diachi + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }
}
