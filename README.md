# KotlinOopilerlemeExample


Yapılan projede insan, kuş ve gemi butonları olacaktır.
Hangi butona tıklanırsa onunla ilgili bilgiler ve nasıl ilerleme yaptıgı ekranda yazacaktır.
Bu yapılan işlemleri Oop(Object Oriented Programming) Prensipleri ile yapılacaktır.


Öncelikle xml kısmında ekran tasarımımızı ve butonlarımızı belirliyoruz.
LinearLayout görünümünden vertical yapıp ekrana konulan butonların ve textViewlerin alt alta hizalıyoruz.
MainAktivity Classımızda tıklanınca ne olmasını istediğimiz fonksiyonları yazıyoruz.
Human, Bird ve Ship Classlarımızı oluşturuyoruz.
Sınıfların kendine ait özelliklerini sınıfların içinde ayrıca belirliyoruz.
Human sınıfında belirlenen kendine ait occupation özelligindeki oluşturuyoruz.
occupation özelliğini get() ve set() methotları ile yapılan işlemde bir string verinin sadece istenilen kısımlarını ekrana yazdırmayı yapıyoruz.
Human ve Bird sınıfları ortak olarak canlı olduğu için bir Bio(canlı) abstract Classı oluşturuyoruz.
Bio sınıfı içerisinde Human ve Bird sınıflarının ortak özelliklerini belirliyoruz.
Daha sonra Human ve Bird sınıfı inheritance(kalıtım) alıp ortak özelliklerini aynı degişken üzerinden oluşturuyoruz.
Daha sonra sınıflarda constructor ile özelliklerini parametrelerle oluşturuyoruz. 
Belirlenen bu Classların ortak işlevi olan IGoesable(ilerleme) İnterface sınıfını oluşturuyoruz.
Bu IGoesable sınıfında fonksiyonumuzu oluşturuyoruz.
İstenilen sınıflarda aynı isimdeki fonksiyona ovveride yapıp yapılacak işlemleri yazıyoruz.
Her sınıfın kendine ait ilermesini fonksiyonda Toast mesajı ile ekrana yazdırma işlemini yapıyoruz.


VE daha sonra MainAktivity sınıfımızda oluşturulan sınıflardan objelerimizi oluşturuyoruz.
Belirlenen parametreleri isteyecektir ve burada özelliklerimizi tanımlıyoruz.


Son olarak MainActivity sınıfında belirledigimiz fonksiyonların içerisinde oluşturulan özellikleri ve fonksiyonları çağırıp ekrana yazırma işlemimizi tamamlıyoruz.


Saygılar

Hasan Bektaş
