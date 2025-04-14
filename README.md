# Sensor Position App 📱🧭

Bu Android uygulaması, cihazın ivmeölçer (accelerometer) sensörünü kullanarak fiziksel konumunu analiz eder.  
Kullanıcıya cihazın ekranı yukarıda mı, dikey mi, sağa mı sola mı eğik gibi bilgileri **gerçek zamanlı olarak** gösterir.

---

## 🚀 Özellikler

- 📐 X, Y, Z ekseninde ivme verilerini gösterir
- 🔄 Cihazın pozisyonunu tespit eder:
  - Ekran yukarıda / aşağıda
  - Dikey / yatay konum
  - Sağ / sol eğim
- ⚙️ Gerçek zamanlı sensör takibi

---

## 📸 Ekran Görüntüsü

> Örnek ekran görüntüsü buraya eklenebilir:
> `Pozisyon: Dikey Konum (üst taraf aşağıda)`  
> `X: -0.4 Y: -9.8 Z: 1.2`

---

## 📂 Proje Yapısı

```plaintext
CihazDurumu/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/cihazdurumu/MainActivity.kt
│   │   │   └── res/layout/activity_main.xml
├── build.gradle.kts
├── settings.gradle.kts




🛠️ Kullanılan Teknolojiler
	•	Kotlin
	•	Android SDK
	•	SensorManager API
	•	Android Studio


🧪 Nasıl Çalıştırılır?
	1.	Bu projeyi GitHub’dan klonla: git clone https://github.com/mehmettonl/sensor-position-app.git
  2.	Android Studio ile aç.
	3.	Cihazda ya da emülatörde çalıştır (sensör desteği olan cihaz önerilir).


📜 Lisans

Bu proje MIT Lisansı ile lisanslanmıştır.


✨ Yazar
	•	Mehmet Onal – GitHub: @mehmettonl



-----------ENLISH----------



# Sensor Position App 📱🧭

This Android application uses the device's accelerometer sensor to detect its physical orientation.  
It displays real-time motion data and interprets the device's position such as whether it's lying flat, upright, or tilted.

---

## 🚀 Features

- 📐 Real-time X, Y, Z axis accelerometer data
- 🔄 Detects device orientation:
  - Face up / face down
  - Vertical / horizontal
  - Tilted left / right
- ⚙️ Uses native SensorManager API

---

## 📸 Example Output

> Sample screen content:
> `Position: Vertical (top side down)`  
> `X: -0.4 Y: -9.8 Z: 1.2`

---

## 📂 Project Structure

```plaintext
SensorPositionApp/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/cihazdurumu/MainActivity.kt
│   │   │   └── res/layout/activity_main.xml
├── build.gradle.kts
├── settings.gradle.kts



🛠️ Technologies Used
	•	Kotlin
	•	Android SDK
	•	SensorManager API
	•	Android Studio



🧪 How to Run
	1.	Clone this repository: git clone https://github.com/mehmettonl/sensor-position-app.git
