import java.util.Scanner;

/**
 * İki kenar uzunluğu ve aralarındaki açı bilinen bir üçgenin alanını hesaplar.
 *
 * KONULAR:
 *  - double veri tipi (ondalıklı sayılar)
 *  - Math.sin() hazır metodu
 *  - Scanner ile double (ondalıklı) veri okuma
 *
 * FORMÜL:
 *  Alan = (kenar1 × kenar2 × sin(açı)) / 2
 *
 * ÖNEMLİ NOT:
 *  Math.sin() metodu açıyı radyan cinsinden bekler!
 *  Derece → Radyan dönüşümü: Math.toRadians(derece) kullanılabilir.
 *  Örneğin 30 derece → Math.toRadians(30) ≈ 0.5236 radyan
 */
public class SinusTeoremi {
    public st