package com.hikmetkurs.java_oop_web.service;

import com.hikmetkurs.java_oop_web.model.Subtopic;
import com.hikmetkurs.java_oop_web.model.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    private List<Topic> topics;

    public TopicService() {
        this.topics = initializeTopics();
    }

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Optional<Topic> getTopicById(Long id) {
        return topics.stream()
                .filter(topic -> topic.getId().equals(id))
                .findFirst();
    }

    private List<Topic> initializeTopics() {
        List<Topic> topicList = new ArrayList<>();

        // JAVA TEMEL KONULARI
        Topic javaBasics = new Topic(1L, "Java Temelleri", "Java dilinin temel yapıtaşları ve sözdizimi", "fa-solid fa-code", "Başlangıç");
        javaBasics.addTag("Temel");
        javaBasics.addTag("Sözdizimi");

        Subtopic javaIntro = new Subtopic(101L, "Java'ya Giriş", "Java nedir ve neden kullanılır?");
        javaIntro.setContent("Java, Sun Microsystems tarafından 1995 yılında geliştirilmiş, platform bağımsız, nesne yönelimli bir programlama dilidir. 'Write Once, Run Anywhere' (Bir kere yaz, her yerde çalıştır) prensibiyle tanınır.");
        javaIntro.addExample("// Basit bir Java programı\npublic class HelloWorld {\n    public static void main(String[] args) {\n        System.out.println(\"Merhaba, Dünya!\");\n    }\n}");
        javaBasics.addSubtopic(javaIntro);

        Subtopic variables = new Subtopic(102L, "Değişkenler ve Veri Tipleri", "Java'da değişkenler ve temel veri tipleri");
        variables.setContent("Java'da değişkenler, veri depolamak için kullanılan konteynerlerdir. Java, iki ana veri tipi kategorisine sahiptir: İlkel (primitive) veri tipleri ve Referans (reference) veri tipleri.");
        variables.addExample("// İlkel veri tipleri\nint sayi = 10;\ndouble ondalikli = 5.5;\nboolean dogruMu = true;\nchar karakter = 'A';\n\n// Referans veri tipleri\nString metin = \"Merhaba Java\";\nint[] sayilar = {1, 2, 3, 4, 5};");
        javaBasics.addSubtopic(variables);

        Subtopic operators = new Subtopic(103L, "Operatörler", "Java'da aritmetik, karşılaştırma ve mantıksal operatörler");
        operators.setContent("Java'da operatörler, değişkenler ve değerler üzerinde işlem yapmak için kullanılır. Aritmetik, atama, karşılaştırma, mantıksal ve bit operatörleri bulunur.");
        operators.addExample("// Aritmetik operatörler\nint a = 10;\nint b = 5;\nint toplam = a + b;  // 15\nint fark = a - b;    // 5\nint carpim = a * b;  // 50\nint bolum = a / b;   // 2\n\n// Karşılaştırma operatörleri\nboolean esitMi = (a == b);  // false\nboolean buyukMu = (a > b);   // true\n\n// Mantıksal operatörler\nboolean sonuc = (a > 5) && (b < 10);  // true (VE)\nboolean sonuc2 = (a < 5) || (b > 3);  // true (VEYA)");
        javaBasics.addSubtopic(operators);

        Subtopic controlFlow = new Subtopic(104L, "Kontrol Yapıları", "If-else, switch ve döngüler");
        controlFlow.setContent("Kontrol yapıları, kod akışını yönlendirmek ve belirli koşullara göre farklı işlemler yapmak için kullanılır. Java'da if-else, switch-case, for, while ve do-while kontrol yapıları bulunur.");
        controlFlow.addExample("// If-Else yapısı\nint yas = 18;\nif (yas >= 18) {\n    System.out.println(\"Reşitsiniz.\");\n} else {\n    System.out.println(\"Reşit değilsiniz.\");\n}\n\n// Switch-Case yapısı\nint gun = 3;\nswitch (gun) {\n    case 1:\n        System.out.println(\"Pazartesi\");\n        break;\n    case 2:\n        System.out.println(\"Salı\");\n        break;\n    case 3:\n        System.out.println(\"Çarşamba\");\n        break;\n    default:\n        System.out.println(\"Geçersiz gün\");\n}\n\n// For döngüsü\nfor (int i = 0; i < 5; i++) {\n    System.out.println(\"Sayı: \" + i);\n}\n\n// While döngüsü\nint j = 0;\nwhile (j < 5) {\n    System.out.println(\"Sayı: \" + j);\n    j++;\n}");
        javaBasics.addSubtopic(controlFlow);

        Subtopic arrays = new Subtopic(105L, "Diziler", "Java'da tek ve çok boyutlu diziler");
        arrays.setContent("Diziler, aynı veri tipindeki değerlerin bir koleksiyonunu depolamak için kullanılır. Java'da diziler, sabit boyutludur ve değerler indeks numaralarıyla erişilebilir.");
        arrays.addExample("// Tek boyutlu dizi\nint[] sayilar = new int[5];\nsayilar[0] = 10;\nsayilar[1] = 20;\n\n// Dizi başlatma\nint[] sayilar2 = {10, 20, 30, 40, 50};\n\n// Dizi elemanlarına erişim\nfor (int i = 0; i < sayilar2.length; i++) {\n    System.out.println(sayilar2[i]);\n}\n\n// For-each döngüsü ile erişim\nfor (int sayi : sayilar2) {\n    System.out.println(sayi);\n}\n\n// Çok boyutlu dizi\nint[][] matris = {\n    {1, 2, 3},\n    {4, 5, 6},\n    {7, 8, 9}\n};");
        javaBasics.addSubtopic(arrays);

        Subtopic methods = new Subtopic(106L, "Metotlar", "Metot tanımlama ve kullanma");
        methods.setContent("Metotlar, belirli bir görevi yerine getirmek için tasarlanmış kod bloklarıdır. Java'da metotlar, sınıflar içinde tanımlanır ve parametreler alabilir, değer döndürebilir.");
        methods.addExample("// Basit bir metot\npublic static void selamla() {\n    System.out.println(\"Merhaba!\");\n}\n\n// Parametreli metot\npublic static void kisiSelamla(String isim) {\n    System.out.println(\"Merhaba, \" + isim + \"!\");\n}\n\n// Değer döndüren metot\npublic static int topla(int a, int b) {\n    return a + b;\n}\n\n// Metot aşırı yükleme (Overloading)\npublic static double topla(double a, double b) {\n    return a + b;\n}\n\n// Metot çağırma\npublic static void main(String[] args) {\n    selamla();\n    kisiSelamla(\"Ahmet\");\n    int sonuc = topla(5, 3);\n    System.out.println(\"Toplam: \" + sonuc);\n}");
        javaBasics.addSubtopic(methods);

        topicList.add(javaBasics);

        // NESNE YÖNELİMLİ PROGRAMLAMA
        Topic oop = new Topic(2L, "Nesne Yönelimli Programlama", "Java'da OOP kavramları ve uygulamaları", "fa-solid fa-cube", "Orta");
        oop.addTag("OOP");
        oop.addTag("Sınıflar");
        oop.addTag("Nesneler");

        Subtopic classesObjects = new Subtopic(201L, "Sınıflar ve Nesneler", "Sınıf tanımlama ve nesne oluşturma");
        classesObjects.setContent("Nesne Yönelimli Programlama'nın temel yapı taşları sınıflar ve nesnelerdir. Sınıflar, nesnelerin şablonlarıdır ve değişkenler ile metotlar içerir. Nesneler ise sınıfların örnekleridir.");
        classesObjects.addExample("// Sınıf tanımlama\npublic class Araba {\n    // Özellikler (fields)\n    String marka;\n    String model;\n    int yil;\n    \n    // Kurucu metot (constructor)\n    public Araba(String marka, String model, int yil) {\n        this.marka = marka;\n        this.model = model;\n        this.yil = yil;\n    }\n    \n    // Metot\n    public void bilgileriGoster() {\n        System.out.println(\"Marka: \" + marka);\n        System.out.println(\"Model: \" + model);\n        System.out.println(\"Yıl: \" + yil);\n    }\n}\n\n// Nesne oluşturma ve kullanma\npublic class Main {\n    public static void main(String[] args) {\n        Araba araba1 = new Araba(\"Toyota\", \"Corolla\", 2020);\n        araba1.bilgileriGoster();\n    }\n}");
        oop.addSubtopic(classesObjects);

        Subtopic encapsulation = new Subtopic(202L, "Kapsülleme", "Veri gizleme ve erişim kontrolü");
        encapsulation.setContent("Kapsülleme, sınıf içindeki veri ve metotların dış erişime karşı korunmasıdır. Genellikle private, protected ve public erişim belirleyicileri ve getter/setter metotları kullanılarak uygulanır.");
        encapsulation.addExample("public class Ogrenci {\n    // Private alanlar\n    private int numara;\n    private String ad;\n    private String soyad;\n    \n    // Getter ve Setter metotları\n    public int getNumara() {\n        return numara;\n    }\n    \n    public void setNumara(int numara) {\n        if (numara > 0) {\n            this.numara = numara;\n        } else {\n            System.out.println(\"Geçersiz numara\");\n        }\n    }\n    \n    public String getAd() {\n        return ad;\n    }\n    \n    public void setAd(String ad) {\n        this.ad = ad;\n    }\n    \n    public String getSoyad() {\n        return soyad;\n    }\n    \n    public void setSoyad(String soyad) {\n        this.soyad = soyad;\n    }\n    \n    // Tam adı döndüren metot\n    public String getTamAd() {\n        return ad + \" \" + soyad;\n    }\n}\n\n// Kullanım\nOgrenci ogr = new Ogrenci();\nogr.setNumara(1001);\nogr.setAd(\"Ayşe\");\nogr.setSoyad(\"Yılmaz\");\nSystem.out.println(ogr.getTamAd());");
        oop.addSubtopic(encapsulation);

        Subtopic inheritance = new Subtopic(203L, "Kalıtım", "Sınıflar arası miras alma");
        inheritance.setContent("Kalıtım, bir sınıfın başka bir sınıfın özelliklerini ve davranışlarını miras almasıdır. Java'da extends anahtar kelimesi ile kalıtım uygulanır. Kalıtım, kod tekrarını azaltır ve hiyerarşik ilişkiler kurmayı sağlar.");
        inheritance.addExample("// Üst sınıf (parent class)\npublic class Calisan {\n    protected String ad;\n    protected String soyad;\n    protected double maas;\n    \n    public Calisan(String ad, String soyad, double maas) {\n        this.ad = ad;\n        this.soyad = soyad;\n        this.maas = maas;\n    }\n    \n    public void bilgileriGoster() {\n        System.out.println(\"Ad: \" + ad);\n        System.out.println(\"Soyad: \" + soyad);\n        System.out.println(\"Maaş: \" + maas);\n    }\n}\n\n// Alt sınıf (child class)\npublic class Yonetici extends Calisan {\n    private String departman;\n    \n    public Yonetici(String ad, String soyad, double maas, String departman) {\n        super(ad, soyad, maas); // Üst sınıfın constructor'ını çağırır\n        this.departman = departman;\n    }\n    \n    // Metot override etme\n    @Override\n    public void bilgileriGoster() {\n        super.bilgileriGoster(); // Üst sınıfın metodunu çağırır\n        System.out.println(\"Departman: \" + departman);\n    }\n    \n    // Yeni metot\n    public void departmanDegistir(String yeniDepartman) {\n        this.departman = yeniDepartman;\n        System.out.println(\"Departman değiştirildi: \" + departman);\n    }\n}");
        oop.addSubtopic(inheritance);

        Subtopic polymorphism = new Subtopic(204L, "Çok Biçimlilik", "Aynı arayüz, farklı uygulamalar");
        polymorphism.setContent("Çok biçimlilik, aynı isimli metotların farklı sınıflarda farklı davranışlar sergilemesidir. Java'da iki tür çok biçimlilik vardır: Derleme zamanı (metot aşırı yükleme) ve çalışma zamanı (metot override etme).");
        polymorphism.addExample("// Üst sınıf\npublic class Sekil {\n    public double alanHesapla() {\n        return 0;\n    }\n}\n\n// Alt sınıf 1\npublic class Dikdortgen extends Sekil {\n    private double uzunluk;\n    private double genislik;\n    \n    public Dikdortgen(double uzunluk, double genislik) {\n        this.uzunluk = uzunluk;\n        this.genislik = genislik;\n    }\n    \n    @Override\n    public double alanHesapla() {\n        return uzunluk * genislik;\n    }\n}\n\n// Alt sınıf 2\npublic class Daire extends Sekil {\n    private double yaricap;\n    \n    public Daire(double yaricap) {\n        this.yaricap = yaricap;\n    }\n    \n    @Override\n    public double alanHesapla() {\n        return Math.PI * yaricap * yaricap;\n    }\n}\n\n// Polimorfizm kullanımı\npublic class Main {\n    public static void main(String[] args) {\n        Sekil sekil1 = new Dikdortgen(5, 4);\n        Sekil sekil2 = new Daire(3);\n        \n        System.out.println(\"Dikdörtgen alanı: \" + sekil1.alanHesapla());\n        System.out.println(\"Daire alanı: \" + sekil2.alanHesapla());\n    }\n}");
        oop.addSubtopic(polymorphism);

        Subtopic abstraction = new Subtopic(205L, "Soyutlama", "Soyut sınıflar ve arayüzler");
        abstraction.setContent("Soyutlama, karmaşık sistemleri daha basit arayüzler sağlayarak yönetmektir. Java'da soyut sınıflar (abstract classes) ve arayüzler (interfaces) ile uygulanır. Soyut sınıflar, hem soyut hem de somut metotlar içerebilirken, arayüzler sadece metot imzalarını (Java 8 sonrası default ve static metotlar da) içerir.");
        abstraction.addExample("// Soyut sınıf\npublic abstract class Hayvan {\n    protected String isim;\n    \n    public Hayvan(String isim) {\n        this.isim = isim;\n    }\n    \n    // Soyut metot (Alt sınıflar tarafından uygulanmalı)\n    public abstract void sesCikar();\n    \n    // Somut metot\n    public void yemekYe() {\n        System.out.println(isim + \" yemek yiyor.\");\n    }\n}\n\n// Alt sınıf\npublic class Kedi extends Hayvan {\n    public Kedi(String isim) {\n        super(isim);\n    }\n    \n    @Override\n    public void sesCikar() {\n        System.out.println(isim + \" miyavlıyor.\");\n    }\n}\n\n// Arayüz\npublic interface Yurutulebilir {\n    void calistir();\n    void durdur();\n    \n    // Java 8+ default metot\n    default void beklet() {\n        System.out.println(\"İşlem bekletiliyor...\");\n    }\n}\n\n// Arayüz uygulaması\npublic class Uygulama implements Yurutulebilir {\n    private String ad;\n    \n    public Uygulama(String ad) {\n        this.ad = ad;\n    }\n    \n    @Override\n    public void calistir() {\n        System.out.println(ad + \" çalıştırılıyor...\");\n    }\n    \n    @Override\n    public void durdur() {\n        System.out.println(ad + \" durduruluyor...\");\n    }\n}");
        oop.addSubtopic(abstraction);

        topicList.add(oop);

        // İLERİ JAVA KONULARI
        Topic advancedJava = new Topic(3L, "İleri Java Konuları", "Collections, Exception Handling, Generics", "fa-solid fa-graduation-cap", "İleri");
        advancedJava.addTag("İleri");
        advancedJava.addTag("Collections");
        advancedJava.addTag("Exceptions");

        Subtopic collections = new Subtopic(301L, "Koleksiyonlar", "Java Collections Framework");
        collections.setContent("Java Collections Framework, verileri depolamak ve işlemek için standart sınıflar ve arayüzler sağlar. Koleksiyonlar, dizilere göre daha esnek ve işlevseldir.");
        collections.addExample("// ArrayList kullanımı\nimport java.util.ArrayList;\nimport java.util.List;\n\npublic class CollectionsOrnek {\n    public static void main(String[] args) {\n        // ArrayList oluşturma\n        List<String> isimler = new ArrayList<>();\n        \n        // Eleman ekleme\n        isimler.add(\"Ali\");\n        isimler.add(\"Veli\");\n        isimler.add(\"Ayşe\");\n        \n        // Listeyi yazdırma\n        System.out.println(isimler); // [Ali, Veli, Ayşe]\n        \n        // Belirli bir elemana erişme\n        System.out.println(isimler.get(1)); // Veli\n        \n        // Liste boyutu\n        System.out.println(\"Boyut: \" + isimler.size()); // Boyut: 3\n        \n        // Eleman silme\n        isimler.remove(\"Veli\");\n        System.out.println(isimler); // [Ali, Ayşe]\n        \n        // For-each ile dolaşma\n        for (String isim : isimler) {\n            System.out.println(isim);\n        }\n        \n        // Lambda ile dolaşma (Java 8+)\n        isimler.forEach(isim -> System.out.println(isim));\n    }\n}\n\n// HashMap kullanımı\nimport java.util.HashMap;\nimport java.util.Map;\n\npublic class HashMapOrnek {\n    public static void main(String[] args) {\n        // HashMap oluşturma\n        Map<String, Integer> yaslar = new HashMap<>();\n        \n        // Eleman ekleme\n        yaslar.put(\"Ali\", 25);\n        yaslar.put(\"Veli\", 30);\n        yaslar.put(\"Ayşe\", 28);\n        \n        // Map'i yazdırma\n        System.out.println(yaslar); // {Ali=25, Veli=30, Ayşe=28}\n        \n        // Belirli bir anahtarın değerini alma\n        System.out.println(\"Ali'nin yaşı: \" + yaslar.get(\"Ali\")); // Ali'nin yaşı: 25\n        \n        // Anahtarları listeleme\n        for (String anahtar : yaslar.keySet()) {\n            System.out.println(anahtar);\n        }\n        \n        // Değerleri listeleme\n        for (Integer deger : yaslar.values()) {\n            System.out.println(deger);\n        }\n        \n        // Anahtarları ve değerleri birlikte listeleme\n        for (Map.Entry<String, Integer> giris : yaslar.entrySet()) {\n            System.out.println(giris.getKey() + \": \" + giris.getValue());\n        }\n    }\n}");
        advancedJava.addSubtopic(collections);

        Subtopic exceptionHandling = new Subtopic(302L, "Hata Yönetimi", "Exception handling in Java");
        exceptionHandling.setContent("Java'da hata yönetimi, try-catch-finally blokları ve throw/throws ifadeleri ile yapılır. Bu mekanizma, çalışma zamanında oluşabilecek hataları kontrol etmeyi ve programın çökmesini önlemeyi sağlar.");
        exceptionHandling.addExample("// Temel try-catch bloğu\npublic class ExceptionOrnek {\n    public static void main(String[] args) {\n        try {\n            int[] sayilar = {1, 2, 3};\n            System.out.println(sayilar[3]); // ArrayIndexOutOfBoundsException oluşacak\n        } catch (ArrayIndexOutOfBoundsException e) {\n            System.out.println(\"Dizi sınırları dışına çıkıldı: \" + e.getMessage());\n        } catch (Exception e) {\n            System.out.println(\"Bir hata oluştu: \" + e.getMessage());\n        } finally {\n            System.out.println(\"Bu blok her durumda çalışır.\");\n        }\n        \n        // try-with-resources (Java 7+)\n        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {\n            System.out.print(\"Bir sayı girin: \");\n            int sayi = scanner.nextInt();\n            System.out.println(\"Girilen sayı: \" + sayi);\n        } catch (Exception e) {\n            System.out.println(\"Hata: \" + e.getMessage());\n        }\n    }\n    \n    // throws ifadesi ile metot bildirimi\n    public static void dosyaOku(String dosyaAdi) throws java.io.IOException {\n        java.io.FileReader dosya = new java.io.FileReader(dosyaAdi);\n        // ... dosya işlemleri\n        dosya.close();\n    }\n    \n    // throw ile istisna fırlatma\n    public static void yasDenetle(int yas) {\n        if (yas < 0) {\n            throw new IllegalArgumentException(\"Yaş negatif olamaz!\");\n        }\n        System.out.println(\"Yaş: \" + yas);\n    }\n    \n    // Özel istisna sınıfı\n    public static class GeçersizKullanıcıAdıException extends Exception {\n        public GeçersizKullanıcıAdıException(String mesaj) {\n            super(mesaj);\n        }\n    }\n}");
        advancedJava.addSubtopic(exceptionHandling);

        Subtopic generics = new Subtopic(303L, "Generics", "Tip güvenli koleksiyonlar ve sınıflar");
        generics.setContent("Generics, Java'da tip güvenli kod yazmanızı sağlayan bir özelliktir. Sınıfların ve metotların, çalışma zamanında belirlenecek bir tip parametresiyle tanımlanmasına olanak verir.");
        generics.addExample("// Generic sınıf\npublic class Kutu<T> {\n    private T icerik;\n    \n    public void ekle(T icerik) {\n        this.icerik = icerik;\n    }\n    \n    public T al() {\n        return icerik;\n    }\n}\n\n// Generic metot\npublic class GenericMetotlar {\n    public static <T> void yazdir(T[] dizi) {\n        for (T eleman : dizi) {\n            System.out.println(eleman);\n        }\n    }\n    \n    public static <T extends Comparable<T>> T maksimum(T x, T y, T z) {\n        T maks = x;\n        \n        if (y.compareTo(maks) > 0) {\n            maks = y;\n        }\n        \n        if (z.compareTo(maks) > 0) {\n            maks = z;\n        }\n        \n        return maks;\n    }\n}\n\n// Joker türleri (Wildcards)\npublic class JokerTurleri {\n    // Unbounded Wildcard\n    public static void listeYazdir(List<?> liste) {\n        for (Object o : liste) {\n            System.out.println(o);\n        }\n    }\n    \n    // Upper Bounded Wildcard\n    public static double toplam(List<? extends Number> liste) {\n        double toplam = 0.0;\n        for (Number n : liste) {\n            toplam += n.doubleValue();\n        }\n        return toplam;\n    }\n    \n    // Lower Bounded Wildcard\n    public static void tamSayiEkle(List<? super Integer> liste, int n) {\n        liste.add(n);\n    }\n}");
        advancedJava.addSubtopic(generics);

        Subtopic streams = new Subtopic(304L, "Java Streams API", "Fonksiyonel programlama yaklaşımı");
        streams.setContent("Java 8 ile gelen Streams API, koleksiyonlar üzerinde fonksiyonel programlama tarzında işlemler yapmanızı sağlar. Streams, verileri filtreleme, dönüştürme, gruplama gibi işlemleri daha okunaklı ve etkili hale getirir.");
        streams.addExample("import java.util.Arrays;\nimport java.util.List;\nimport java.util.stream.Collectors;\n\npublic class StreamOrnek {\n    public static void main(String[] args) {\n        List<String> isimler = Arrays.asList(\"Ali\", \"Mehmet\", \"Ayşe\", \"Fatma\", \"Ahmet\");\n        \n        // İsimleri filtrele (A ile başlayanlar)\n        List<String> aIleBaslayanlar = isimler.stream()\n                .filter(isim -> isim.startsWith(\"A\"))\n                .collect(Collectors.toList());\n                \n        System.out.println(aIleBaslayanlar); // [Ali, Ayşe, Ahmet]\n        \n        // İsimleri büyük harfe çevirme\n        List<String> buyukHarfler = isimler.stream()\n                .map(String::toUpperCase)\n                .collect(Collectors.toList());\n                \n        System.out.println(buyukHarfler); // [ALİ, MEHMET, AYŞE, FATMA, AHMET]\n        \n        // İsimleri alfabetik sıraya koyma\n        List<String> sıraliIsimler = isimler.stream()\n                .sorted()\n                .collect(Collectors.toList());\n                \n        System.out.println(sıraliIsimler); // [Ahmet, Ali, Ayşe, Fatma, Mehmet]\n        \n        // Her bir ismin uzunluğunu hesaplama\n        List<Integer> isimUzunluklari = isimler.stream()\n                .map(String::length)\n                .collect(Collectors.toList());\n                \n        System.out.println(isimUzunluklari); // [3, 6, 4, 5, 5]\n        \n        // Tüm isimleri tek bir String'e birleştirme\n        String birlesik = isimler.stream()\n                .collect(Collectors.joining(\", \"));\n                \n        System.out.println(birlesik); // Ali, Mehmet, Ayşe, Fatma, Ahmet\n        \n        // Paralel stream kullanımı\n        isimler.parallelStream()\n                .filter(isim -> isim.length() > 4)\n                .forEach(System.out::println);\n    }\n}");
        advancedJava.addSubtopic(streams);

        Subtopic multithreading = new Subtopic(305L, "Multithreading", "Çoklu iş parçacığı programlama");
        multithreading.setContent("Java, çoklu işlem parçacığı (multithreading) programlamayı destekler. Thread sınıfını kullanarak veya Runnable arayüzünü uygulayarak paralel işlemler gerçekleştirebilirsiniz.");
        multithreading.addExample("// Thread sınıfından türetme\npublic class BenimThread extends Thread {\n    @Override\n    public void run() {\n        for (int i = 1; i <= 5; i++) {\n            System.out.println(\"BenimThread çalışıyor: \" + i);\n            try {\n                Thread.sleep(1000); // 1 saniye bekle\n            } catch (InterruptedException e) {\n                System.out.println(\"Thread kesildi: \" + e.getMessage());\n            }\n        }\n    }\n}\n\n// Runnable arayüzünü uygulama\npublic class BenimRunnable implements Runnable {\n    @Override\n    public void run() {\n        for (int i = 1; i <= 5; i++) {\n            System.out.println(\"BenimRunnable çalışıyor: \" + i);\n            try {\n                Thread.sleep(1000); // 1 saniye bekle\n            } catch (InterruptedException e) {\n                System.out.println(\"Thread kesildi: \" + e.getMessage());\n            }\n        }\n    }\n}\n\n// Thread kullanımı\npublic class ThreadDemo {\n    public static void main(String[] args) {\n        // Thread sınıfı ile\n        BenimThread thread1 = new BenimThread();\n        thread1.start();\n        \n        // Runnable arayüzü ile\n        BenimRunnable runnable = new BenimRunnable();\n        Thread thread2 = new Thread(runnable);\n        thread2.start();\n        \n        // Anonim sınıf ile\n        Thread thread3 = new Thread(new Runnable() {\n            @Override\n            public void run() {\n                for (int i = 1; i <= 5; i++) {\n                    System.out.println(\"Anonim Thread çalışıyor: \" + i);\n                    try {\n                        Thread.sleep(1000);\n                    } catch (InterruptedException e) {\n                        System.out.println(\"Thread kesildi: \" + e.getMessage());\n                    }\n                }\n            }\n        });\n        thread3.start();\n        \n        // Lambda ile (Java 8+)\n        Thread thread4 = new Thread(() -> {\n            for (int i = 1; i <= 5; i++) {\n                System.out.println(\"Lambda Thread çalışıyor: \" + i);\n                try {\n                    Thread.sleep(1000);\n                } catch (InterruptedException e) {\n                    System.out.println(\"Thread kesildi: \" + e.getMessage());\n                }\n            }\n        });\n        thread4.start();\n    }\n}");
        advancedJava.addSubtopic(multithreading);

        topicList.add(advancedJava);

        return topicList;
    }
}