# Movie App

Bu, http://www.omdbapi.com/ adresinden filmleri çekerek listelemek ve filmlerin detay sayfalarını görüntülemek için geliştirilen bir uygulamadır. Uygulama, Jetpack Compose ile modern bir UI geliştirme yaklaşımı kullanır ve MVVM mimarisi ile yapılandırılmıştır. Verilerin çekilmesi için Retrofit kullanılır ve Dagger Hilt ile bağımlılık enjeksiyonu sağlanır. Ayrıca uygulamada Use Case ve Repository katmanları da bulunmaktadır.

## Kullanılan Teknolojiler

- Jetpack Compose: Android'in yeni nesil UI toolkit'i olan Jetpack Compose, uygulamanın arayüzünü oluşturmak için kullanılır.
- MVVM (Model-View-ViewModel): Uygulama mimarisi olarak MVVM kullanılır. Bu mimaride veri kaynağı (Model), kullanıcı arayüzü (View) ve iş mantığı (ViewModel) ayrı ayrı ele alınır.
- Retrofit: HTTP istekleri yapmak ve verileri almak için kullanılan bir kütüphane.
- Dagger Hilt: Bağımlılık enjeksiyonu için kullanılan bir kütüphane. Uygulamanın farklı katmanları arasında bağımlılıkların yönetimini kolaylaştırır.
- Use Case: İş mantığı için kullanılan katman. Uygulama içindeki farklı işlemler ve senaryolar burada yönetilir.
- Repository: Verilerin alınması ve işlenmesi için kullanılan katman. API ile iletişimi ve yerel veritabanı işlemlerini burada gerçekleştirir.
- Flow: Asenkron veri akışını temsil eden bir arayüzdür. Coroutine'lerle birlikte çalışarak verileri adım adım göndermek ve işlemek için kullanılır.

## Kurulum

1. Bu depoyu yerel makinenize klonlayın.
2. Android Studio'yu açın ve projeyi içe aktarın.
3. Uygulamanın çalışması için gerekli bağımlılıkları indirin ve Gradle Sync'i çalıştırın.

## Kullanım

1. Uygulamayı çalıştırın.
2. Ana ekranda filmleri listeleyin.
3. Bir filmi seçerek filmin detay sayfasını görüntüleyin.
4. Farklı arama kriterlerini kullanarak filmleri filtreleyin.

## Örnek Kullanım Kodu

Uygulama içinde Retrofit ile API istekleri yapılır ve veriler işlenerek kullanıcı arayüzüne aktarılır. Örnek kullanım kodu aşağıdaki gibi olabilir:

```kotlin
// Retrofit servisini oluşturun
val retrofit = Retrofit.Builder()
    .baseUrl("http://www.omdbapi.com/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val service = retrofit.create(ApiService::class.java)

// Filmleri çekmek için bir istek yapın
val response = service.getMovies()

fun getMovies() {
        viewModelScope.launch {
            try {
                // ApiService ile istek yapın ve response alın
                val response = apiService.getMovies()

                // İstek başarılı ise verileri alın
                if (response.isSuccessful) {
                    val movies = response.body()?.movies
                    // Verileri kullanıcı arayüzüne aktarın
                    // ...
                } else {
                    // Hata durumunda işlemleri ele alın
                    // ...
                }
            } catch (t: Throwable) {
                // Hata durumunda işlemleri ele alın
                // ...
            }
        }
    }
}
```
## Katkıda Bulunma
Eğer bu projeye katkıda bulunmak isterseniz, lütfen CONTRIBUTING.md dosyasını inceleyin ve pull request göndermeden önce geliştirme adımlarını takip edin.

## Teşekkürler
Bu uygulama, http://www.omdbapi.com/ adresi sayesinde sağlanan veriler ve kullanılan teknolojiler ile oluşturulmuştur.
