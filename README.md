# ☕ Algoritma ve Programlama — Java Dersleri

Bu repo, **Algoritma ve Programlama** dersinin hem geçen yıl (2024-2025) hem de bu yıl (2025-2026) işlenen konularını ve ders sırasında yazılan örnek kodları içermektedir. Final sınavına hazırlanan öğrenciler için rehber niteliğinde hazırlanmıştır.

---

## 📁 Klasör Yapısı

```
JavaDersleri/
│
├── JavaDersteCozulenSorular/       ← Ders boyunca canlı yazılan tüm örnek kodlar
│   └── src/
│       ├── IkiSayiTopla.java       → Metot kullanımı ve Random sınıfı
│       ├── AsalSayi.java           → Döngü ile asal sayı testi
│       ├── FaktorielHesaplama.java → Metot ile faktöriyel
│       ├── PermutasyonHesabi.java  → Faktöriyel metodu kullanarak P(n,r)
│       ├── BasamakToplami.java     → While + mod operatörü
│       ├── SayiTersten.java        → While + mod ile basamak işlemi
│       ├── ForlaToplama.java       → For döngüsü — adım değeri
│       ├── TahminOyunu.java        → While döngüsü + Random + break
│       ├── SayisalLoto.java        → Tekrarsız rastgele dizi (iç içe döngü)
│       ├── DenklemKokleri.java     → if-else if-else + Math.sqrt()
│       ├── Kmtomil.java            → Basit dönüşüm hesabı
│       ├── Pisagor.java            → Math.sqrt() ile hipotenüs
│       ├── UcgenAlan.java          → Temel alan formülü
│       ├── SinusTeoremi.java       → Math.sin() ile üçgen alanı
│       ├── TabanUstAlma.java       → For döngüsü vs Math.pow()
│       ├── GeometrikOrtalama.java  → While + Math.pow() ile ortalama
│       ├── HarmonikOrtalama.java   → do-while döngüsü
│       ├── DiziElemanEkleme.java   → Diziye klavyeden değer ekleme
│       ├── DiziElemanToplama.java  → Dizi toplama — for döngüsü
│       ├── DiziKatsatsayiCarpim.java → Dizi elemanlarını k ile çarpma
│       ├── DiziTersten.java        → Geçici dizi ile ters çevirme
│       └── DizideArama.java        → Arrays.sort() + binary search fikri
│
├── VizeSorulari/                   ← Vize sınavında sorulmuş/çözülmüş sorular
│   └── src/
│       ├── VizeSoru2.java          → Pozitif/negatif/sıfır kontrolü (if-else)
│       ├── VizeSoru4.java          → Metot tanımlama ve çağırma
│       ├── VizeSoru6.java          → Dizi tanımlama yöntemleri
│       ├── VizeSoru7.java          → Kullanıcıdan dizi doldurma + ortalama
│       ├── VizeSoru8.java          → For döngüsü ile kare hesabı
│       ├── VizeSoru9.java          → Dizide en küçük eleman bulma
│       └── VizeSoru10.java         → İndirim hesabı (if-else if zinciri)
│
├── FinalSorulari/                  ← Final sınavı soruları
│   └── src/
│       └── Soru1.java              → Metot + rastgele dizi oluşturma
│
├── RastgeleOgrenciSecimi/          ← Derste kullanılan öğrenci seçim uygulaması
│   └── src/
│       └── OgrenciSecimi.java      → Dosya okuma/yazma + ArrayList + Random
│
├── 2025-2026 Bahar Algoritma ve Programlama/
│   ├── *.pdf                       ← Hoca tarafından hazırlanan ders slaytları
│   └── Kitap/                      ← Referans kitaplar (GitHub'a yüklenmez)
│
└── README.md                       ← Bu dosya
```

---

## 🗺️ Konu Haritası — Final İçin Ne Bilmem Gerekiyor?

### 1️⃣ Temel Java Yapısı

Bir Java programının iskeleti her zaman şu şekildedir:

```java
public class SinifAdi {
    public static void main(String[] args) {
        // Kodun başladığı yer burası
    }
}
```

- **Dosya adı** ile **sınıf adı** aynı olmalıdır (`SinifAdi.java`)
- `main` metodu programın giriş noktasıdır — burası çalışır
- Her ifade noktalı virgül (`;`) ile biter

---

### 2️⃣ Veri Tipleri & Değişkenler

| Tip       | Açıklama                     | Örnek                     |
|-----------|------------------------------|---------------------------|
| `int`     | Tam sayı                     | `int sayi = 5;`           |
| `double`  | Ondalıklı sayı               | `double pi = 3.14;`       |
| `boolean` | Doğru/Yanlış                 | `boolean bulundu = false;`|
| `String`  | Metin                        | `String ad = "Ahmet";`    |
| `char`    | Tek karakter                 | `char harf = 'A';`        |

---

### 3️⃣ Klavyeden Veri Okuma (Scanner)

```java
import java.util.Scanner;  // Scanner sınıfını programa ekle

Scanner scanner = new Scanner(System.in);  // Scanner nesnesi oluştur

int    sayi   = scanner.nextInt();     // Tam sayı oku
double oran   = scanner.nextDouble();  // Ondalıklı sayı oku
String metin  = scanner.next();        // Boşluğa kadar metin oku

scanner.close();  // Kaynakları serbest bırak
```

📂 Örnek dosyalar: `IkiSayiTopla.java`, `AsalSayi.java`, `Kmtomil.java`

---

### 4️⃣ Koşul İfadeleri (if - else if - else)

```java
if (sayi > 0) {
    System.out.println("Pozitif");
} else if (sayi < 0) {
    System.out.println("Negatif");
} else {
    System.out.println("Sıfır");
}
```

Birden fazla koşul kontrolü için `else if` zinciri kullanılır.

📂 Örnek dosyalar: `VizeSoru2.java`, `DenklemKokleri.java`, `VizeSoru10.java`

---

### 5️⃣ Döngüler

#### for Döngüsü — kaç kez döneceğini biliyorsan
```java
// for (başlangıç ; koşul ; artış)
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
// i++  →  i = i + 1
// i += 2  →  i = i + 2  (adım değeriyle)
```

#### while Döngüsü — koşul sağlandığı sürece dön
```java
while (sayi != 0) {
    System.out.print(sayi % 10);  // son basamağı al
    sayi /= 10;                   // son basamağı at
}
```

#### do-while Döngüsü — en az bir kez çalış
```java
do {
    sayi = scanner.nextDouble();
    // ... işlem yap
} while (sayi != 0);  // 0 girilene kadar devam et
```

📂 Örnek dosyalar: `ForlaToplama.java`, `SayiTersten.java`, `HarmonikOrtalama.java`, `TahminOyunu.java`

---

### 6️⃣ Metotlar (Fonksiyonlar)

Metotlar tekrar kullanılabilir kod blokları oluşturmak için kullanılır.

```java
// Metot tanımı
public static int faktorielHesapla(int sayi) {   // int → geri dönüş tipi
    int sonuc = 1;
    for (int i = sayi; i > 1; i--) {
        sonuc *= i;
    }
    return sonuc;  // sonucu çağırana gönder
}

// Metot çağrısı
int sonuc = faktorielHesapla(5);   // → 120
```

**Geri dönüş değeri olmayan metot:**
```java
public static void mesajYazdir(String mesaj) {
    System.out.println(mesaj);
    // return yok!
}
```

📂 Örnek dosyalar: `FaktorielHesaplama.java`, `PermutasyonHesabi.java`, `VizeSoru4.java`, `FinalSorulari/Soru1.java`

---

### 7️⃣ Diziler (Arrays)

```java
// Tanımlama yöntemleri:
int[] dizi = new int[5];            // 5 elemanlı boş dizi (varsayılan: 0)
int[] dizi = {10, 20, 30, 40, 50}; // Değerlerle birlikte tanımla

// Elemanlara erişim (indeks 0'dan başlar!)
dizi[0] = 10;          // ilk eleman
dizi[dizi.length - 1]; // son eleman

// Dizi üzerinde döngü
for (int i = 0; i < dizi.length; i++) {
    System.out.println(dizi[i]);
}
```

| İşlem                  | Nasıl yapılır                                    |
|------------------------|--------------------------------------------------|
| Toplam bulma           | `toplam += dizi[i]` (her elemana ekleme)         |
| En küçük eleman        | İlkini küçük kabul et, geri kalanla karşılaştır  |
| Ters çevirme           | Geçici dizi + `dizi[n-1-i]` formülü              |
| Sıralama               | `Arrays.sort(dizi)` (import java.util.Arrays)    |
| Ortalama               | `(double) toplam / dizi.length`                  |

📂 Örnek dosyalar: `DiziElemanEkleme.java`, `DiziElemanToplama.java`, `DiziTersten.java`, `DizideArama.java`, `VizeSoru7.java`, `VizeSoru9.java`

---

### 8️⃣ Matematiksel İşlemler (Math sınıfı)

```java
Math.sqrt(sayı)        // Karekök   → Math.sqrt(9) = 3.0
Math.pow(taban, üs)    // Üs alma   → Math.pow(2, 10) = 1024.0
Math.sin(açı)          // Sinüs     → açı radyan cinsinden!
Math.abs(sayı)         // Mutlak değer
Math.max(a, b)         // İkisinden büyük olanı
Math.min(a, b)         // İkisinden küçük olanı

// Derece → Radyan dönüşümü:
double radyan = Math.toRadians(90);  // = Math.PI / 2
```

📂 Örnek dosyalar: `Pisagor.java`, `TabanUstAlma.java`, `SinusTeoremi.java`, `GeometrikOrtalama.java`

---

### 9️⃣ Rastgele Sayı Üretme (Random)

```java
import java.util.Random;

Random random = new Random();

random.nextInt(50)       // 0 ile 49 arasında (50 dahil DEĞİL)
random.nextInt(1, 101)   // 1 ile 100 arasında (101 dahil DEĞİL) — Java 17+
random.nextDouble()      // 0.0 ile 1.0 arasında ondalıklı
```

📂 Örnek dosyalar: `SayisalLoto.java`, `TahminOyunu.java`, `FinalSorulari/Soru1.java`

---

### 🔟 Önemli Operatörler Özeti

| Operatör | Anlamı                      | Örnek              |
|----------|-----------------------------|--------------------|
| `%`      | Mod (kalan)                 | `10 % 3 = 1`       |
| `/`      | Bölme (int/int = int!)      | `10 / 3 = 3`       |
| `(double)` | Tip dönüşümü (cast)       | `(double)10/3 = 3.33` |
| `+=`     | Kısaltılmış toplama         | `x += 5` → `x = x+5` |
| `*=`     | Kısaltılmış çarpma          | `x *= 2` → `x = x*2` |
| `++`     | 1 artır                     | `i++` → `i = i+1`  |
| `--`     | 1 azalt                     | `i--` → `i = i-1`  |

---

## 📚 Ders Kaynakları

Aşağıdaki kaynaklar `2025-2026 Bahar Algoritma ve Programlama/` klasöründe bulunmaktadır:

| Dosya                                  | İçerik                                      |
|----------------------------------------|---------------------------------------------|
| `Java_Foundations.pdf`                 | Java temel kavramları                       |
| `Java_Kod_Anatomisi.pdf`               | Java kod yapısı ve söz dizimi               |
| `Java_Digital_Construction.pdf`        | Java ile yapısal programlama                |
| `Java_Architecture_Standards_2026.pdf` | Java mimari standartları                    |
| `Algoritma_Kil_Tabletten_Yapay_Zekaya.pdf` | Algoritma tarihi ve evrimi              |
| `Algorithm_Evolution_to_Autonomy.pdf`  | Algoritmadan özerk sistemlere               |
| `Algorithms_Not_Just_Prompts.pdf`      | Algoritmik düşünce                          |
| `Strategic_Technology_Landscape_2026.pdf` | Teknoloji trendleri                      |

> **Not:** Referans kitaplar (Core Java, Thinking in Java vb.) telif hakkı nedeniyle GitHub'a yüklenmemektedir. Fiziksel kopyalar veya kütüphane erişimiyle ulaşabilirsiniz.

---

## 💡 Final Sınavına Hazırlanırken Öneriler

1. **Her örnek kodu kendiniz yazın** — sadece okumak yetmez, yazarak öğrenilir
2. **Hata mesajlarını okuyun** — IntelliJ size neyin yanlış olduğunu söyler
3. **Adım adım takip edin** — kodu debugger ile adım adım çalıştırın
4. **Vize sorularına bakın** — final soruları genellikle benzer konuları kapsar
5. **Metot yazmayı pratik yapın** — `FinalSorulari/Soru1.java` iyi bir örnek

### Sık Yapılan Hatalar ⚠️

```java
// ❌ Yanlış: int/int bölmesi ondalıklı sonuç vermez
double ort = toplam / sayi;       // toplam ve sayi int ise sonuç int olur!

// ✓ Doğru: En az birini double'a çevir
double ort = (double) toplam / sayi;

// ❌ Yanlış: Dizi indeksi 1'den başlamaz
dizi[1] = ilkEleman;  // 0. indeksi atladın!

// ✓ Doğru:
dizi[0] = ilkEleman;

// ❌ Yanlış: String karşılaştırmasında == kullanma
if (ad == "Ahmet") { ... }   // referans karşılaştırır!

// ✓ Doğru:
if (ad.equals("Ahmet")) { ... }
```

---

## 🛠️ Geliştirme Ortamı

- **IDE:** IntelliJ IDEA
- **Java Sürümü:** JDK 23 (bkz. `qodana.yaml`)
- **Kod Analizi:** Qodana (JetBrains)

---

*Son güncelleme: Mayıs 2026 — 2025-2026 Bahar Dönemi*
