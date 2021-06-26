import java.util.Date;

public class Dosen {
    private int id;
    private String nidn;
    private String namaLengkap;
    private Date tanggalLahir;
    private Date tangalDiangkat;
    private String jabatanFungsional;
    private String pangkatGolongan;
    private int tahunSertifikasi;

    public void mengajar(){

    }

    public void melakukanPeneliitan(){

    }

    public void melakukanPengabdian(){

    }

    public void memberikanNilai(){

    }

    public Dosen() {
    }

    public Dosen(int id, String nidn, String namaLengkap, Date tanggalLahir, Date tangalDiangkat, String jabatanFungsional, String pangkatGolongan, int tahunSertifikasi) {
        this.id = id;
        this.nidn = nidn;
        this.namaLengkap = namaLengkap;
        this.tanggalLahir = tanggalLahir;
        this.tangalDiangkat = tangalDiangkat;
        this.jabatanFungsional = jabatanFungsional;
        this.pangkatGolongan = pangkatGolongan;
        this.tahunSertifikasi = tahunSertifikasi;
    }

    public Dosen(int id, String nidn, String namaLengkap) {
        this.id = id;
        this.nidn = nidn;
        this.namaLengkap = namaLengkap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public Date getTangalDiangkat() {
        return tangalDiangkat;
    }

    public void setTangalDiangkat(Date tangalDiangkat) {
        this.tangalDiangkat = tangalDiangkat;
    }

    public String getJabatanFungsional() {
        return jabatanFungsional;
    }

    public void setJabatanFungsional(String jabatanFungsional) {
        this.jabatanFungsional = jabatanFungsional;
    }

    public String getPangkatGolongan() {
        return pangkatGolongan;
    }

    public void setPangkatGolongan(String pangkatGolongan) {
        this.pangkatGolongan = pangkatGolongan;
    }

    public int getTahunSertifikasi() {
        return tahunSertifikasi;
    }

    public void setTahunSertifikasi(int tahunSertifikasi) {
        this.tahunSertifikasi = tahunSertifikasi;
    }
}
