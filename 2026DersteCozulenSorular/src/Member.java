/**
 * Bir takım üyesini temsil eden POJO (Plain Old Java Object) sınıfı.
 *
 * KONULAR (Nesne Yönelimli Programlama temelleri):
 *  - private alanlar (encapsulation - kapsülleme)
 *  - Constructor (yapıcı metot)
 *  - Getter / Setter metotları
 *  - "this" anahtar kelimesi (bu nesnenin alanına erişim)
 *
 * Kullanım örneği için bkz. Team.java
 */
public class Member {
    // private → bu alanlara dışarıdan doğrudan erişilemez,
    // sadece getter/setter üzerinden erişilir (kapsülleme prensibi)
    private String name;
    private String type;
    private int level;
    private int rank;

    /**
     * Tüm alanları ilk değerleriyle dolduran constructor.
     */
    public Member(String name, String type, int level, int rank) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.rank = rank;
    }

    // ----- GETTER metotları (alanı OKUmak için) -----
    public String getName()  { return name; }
    public String getType()  { return type; }
    public int    getLevel() { return level; }
    public int    getRank()  { return rank; }

    // ----- SETTER metotları (alanı DEĞİŞTİRmek için) -----
    public void setName(String name)   { this.name = name; }
    public void setType(String type)   { this.type = type; }
    public void setLevel(int level)    { this.level = level; }
    public void setRank(int rank)      { this.rank = rank; }
}
