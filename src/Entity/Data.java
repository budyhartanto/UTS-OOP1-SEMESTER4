package Entity;

/**
 *
 * @author HP
 */
public class Data {
    private String nim;
    private String semester;
    private String nama; 
    private String alamat;

    public Data() {
        nim = "";
        semester = "";
        nama = "";
        alamat = "";
    }

    public Data(String nim, String semester, String nama, String alamat) {
        this.nim = nim;
        this.semester = semester;
        this.nama = nama;
        this.alamat = alamat;
    }

    public void setNim(String noSurat) { 
        this.nim = noSurat; 
    }

    public void setSemester(String tanggalSurat) { 
        this.semester = tanggalSurat; 
    }

    public void setNama(String perihal) { 
        this.nama = perihal; 
    }

    public void setAlamat(String tujuan) { 
        this.alamat = tujuan; 
    }

    public String getNim() { 
        return nim; 
    }

    public String getSemester() { 
        return semester; 
    }

    public String getNama() { 
        return nama; 
    }
    
    public String getAlamat() { 
        return alamat; 
    }
    
}
