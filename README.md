# ActivityFragmentLifeCycle

# Amaç

1. Git - GitHub becelerinin arttırılmasını sağlamak.
2. Fragment kullanımı öğrenmek.
3. Activity üzerine Fragment'ı ekleme yollarını araştırmak.
4. Activity Fragment Yaşam Döngüsünde (LifeCycle) eklenme sırasında neler değiştiğini kavramak.
5. Activity Fragment kullanım mantığının yerleşmesini sağlamak.

# İsterler

1. Projeyi "Fork" ediniz.
2. Master branch'inden yeni bir branch oluşturunuz.
3. Branch ismine kendi adınızı ve soyadınızı verin. Örn. ("GökhanÖztürk)
4. Bir Activity ve XML oluşturun. Activity ve XML oluştururken isimlendirme standartlarına dikkat ediniz.
5. Activity'nizin içerisine aşağıdaki methodları yazınız - sıralaması önemli değil:
  * onCreate()
  * onStart()
  * onRestoreInstanceState()
  * onResume()
  * onPause()
  * onSaveInstanceState()
  * onStop()
  * onDestroy()
  * onRestart()
  * onAttachFragment()
6. Yukarıdaki methodların içerisine Log.e methodunu kullanarak; ilk string'e kendinizin belirlediği bir String TAG,
ikinci String'e ise method isimlerini yazınız.
7. Üç adet Fragment ve bu Fragment'lara ait XML dosyalarını oluşturun. İsimlendirme standartlarına dikkat ediniz.
8. Fragment'ları aşağıdaki ekran görüntüsünde olduğu gibi yerleştiriniz.

![alt text](https://github.com/AndroidEduIO/ActivityFragmentLifeCycle/blob/master/app/src/main/res/drawable/Fragment.PNG)

9. Bu Fragment düzenini sağlarken A ve B Fragment'ını XML üzerinden C Fragment'ını ise Activity içerisinde, ID kullanarak, 
çalışma zamanında (run time) programmatically olarak ekleyiniz.
10. Eklediğiniz Fragment'ların içerisine aşağıdaki methodları yazınız - sıralaması önemli değil:
  * onCreate()
  * onCreateView()
  * onActivityCreated()
  * onStart()
  * onResume()
  * onPause()
  * onStop()
  * onDestroy()
  * onRestart()
 11. Yukarıdaki methodların içerisine Log.e methodunu kullanarak; ilk string'e kendinizin belirlediği bir String TAG,
ikinci String'e ise method isimlerini yazınız.
12. Log'ları yorumlayarak bir Fragment'ı XML içerisinde eklemek ile Activity içerisinde, ID kullanarak, çalışma zamanında (run time)
programmatically olarak eklemek arasında nasıl bir fark olduğunu araştırıp, projeniz içerisindeki README.md dosyasının içerisini 
silerek README.md içerisine bu bilgileri yazınız.
13. Hangi durumda Fragment, hangi durumda Activity kullanılması gerektiğini yine bu README.md dosyasına yazınız.
14. Hangi durumda Fragment'ı programmatically, hangi durumda XML içerisinde ekleyeceğimizi yorumlayıp yine README.md içerisine yazınız.
15. Programmatically yüklemek ile XML içerisinde eklemek arasında bir performans farkı olup olmadığını araştırıp README.md içerisine yazınız.
16. Yazdığınzı kodları Push'layınız. Ve bu adres üzerindeki ana projeye Pull Request (PR) atınız.

# En başarılı PR proje'ye "orjinal cevap" olarak kabul edilecektir.

12 - Bu uygulamadaki logları yorumladığımızda Xml e eklenen fragmentlar OnInflate metoduyla geldiğini görmekteyiz fakat activity e eklediğimiz
fragmentımız activity oncreate den sonra çalışan onattach fragment metoduyla birlikte gelmektedir ve bu metodla çalışmaya başlamaktadır.


13 - Bir pencereyi, sayfayı, ekranı birden fazla kez benzerini yada kendisi kullanacak isek fragment kullanılması tercih edilir, Örneğin
bir sohbet uygulamasında sohbet ekranlarını kullanırken fragmentlar kullanılır eğer activity kullanılırsak çizdiğimiz tüm ekran baştan çizdirilir
fragmentta sadece fragmenttaki değiştirdiklerimizi değiştirir arkada activiy değişmedinden çizilmiş öğeler bi daha baştan çizdirilmez.Eğer
uygulamamızda hiç önceden kullanmadığımız bir sayfa açacak isek ve o sayfanın benzerleride olmayacak ise tek biyerde kullanılacaksa
activity kullanamız gerekir. Örneğin bir sohbet uygulamasında ayarlar menüsü gibi.

14 - Bir Fragment'ı Activity layout'una XML dosyası üzerinden eklediğinizde bu Fragment'ı çalışma zamanında kaldıramazsınız. Eğer Fragment'ları
kullanıcı etkileşimi sırasında çıkarıp eklemeyi planlıyorsanız, Activity içinde ve Activity başladığında eklemelisiniz.

15- Performans farkları yoktur.