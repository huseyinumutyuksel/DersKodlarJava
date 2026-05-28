import java.util.Random;

/**
 * 0-49 arasından tekrarsız 6 rastgele sayı seçerek sayısal loto kuponu oluşturur.
 *
 * KONULAR:
 *  - Random sınıfı ile rastgele sayı üretme
 *  - Dizi içinde tekrar kontrolü (iç içe döngü)
 *  - while döngüsü ile koşullu ilerleme
 *  - break ifadesi ile döngüden çıkma
 *
 * ALGORİTMA:
 *  1. Dizi dolana kadar rastgele sayı üret
 *  2. Üretilen sayı dizide zaten var mı kontrol et (iç for döngüsü)
 *  3. Yoksa diziye ekle (i artar), varsa yeni sayı üret (i artmaz)
 *  4. Trick: for döngüsü normalde sonuna ulaşırsa j == 6 