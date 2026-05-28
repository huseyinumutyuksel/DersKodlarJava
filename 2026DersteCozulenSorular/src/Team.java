import java.util.ArrayList;
import java.util.List;

/**
 * Birden fazla Member nesnesini tutan ve bilgilerini yazdıran sınıf.
 *
 * KONULAR (OOP - Nesne Yönelimli Programlama):
 *  - List<Member> ve ArrayList ile dinamik liste tutma
 *  - Composition (bir sınıfın başka sınıf nesnelerini alan olarak tutması)
 *  - Constructor içinde liste başlatma
 *  - Generics kullanımı: List<Member>
 *
 * Member sınıfına bağımlıdır — bkz. Member.java
 */
public class Team {
    // Birden fazla üye tutabilmek için liste kullanıyoruz.
    // List<Member> → sadece Member nesnesi tutan dinamik liste
    private List<Member> members;

    public Team() {
        // Listeyi boş bir ArrayList olarak başlatıyoruz
        this.members = new ArrayList<>();
    }

    /** Takıma yeni üye ekleme metodu */
    public void addMember(Member member) {
        this.members.add(member);
    }

    public static void main(String[] args) {
        // Takım oluşturuluyor
        Team myTeam = new Team();

        // Üyeler oluşturuluyor (Member sınıfının constructor'ı çağrılıyor)
        Member member1 = new Member("Auriel",  "light",   10, 1);
        Member member2 = new Member("Tyrael",  "warrior", 12, 2);
        Member member3 = new Member("Diablo",  "demon",   99, 5);

        // Üyeler takıma ekleniyor
        myTeam.addMember(member1);
        myTeam.addMember(member2);
        myTeam.addMember(member3);

        // Tüm bilgileri yazdır
        myTeam.writeMembersInfos();
    }

    /**
     * Takımdaki tüm üyelerin bilgilerini ekrana yazdırır.
     * Liste boşsa uyarı verir.
     */
    void writeMembersInfos() {
        if (members.isEmpty()) {
            System.out.println("Takımda hiç üye yok.");
            return;
        }

        System.out.println("=== Takım Üyeleri ===");
        for (Member m : members) {
            System.out.println("--------------------");
            System.out.println("Name : " + m.getName());
            System.out.println("Type : " + m.getType());
            System.out.println("Level: " + m.getLevel());
            System.out.println("Rank : " + m.getRank());
        }
        System.out.println("--------------------");
    }
}
