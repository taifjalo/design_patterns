# Weather Station Simulator – Observer Pattern

## Overview

In this assignment, we implemented a **Weather Station Simulator** using the **Observer Design Pattern**.  
The idea is that a weather station changes the temperature continuously, and all registered observers are notified immediately when the temperature changes.

---

## What We Learned

- How to apply the **Observer Design Pattern** in a real example
- How one object can notify multiple objects without knowing their concrete classes
- How to use an **interface** to unify different observers
- How to add and remove observers at runtime
- How to use **threads** to simulate continuous data updates
- How each observer can react differently to the same update

---

## System Components

### WeatherStation (Subject)

- Stores the current temperature
- Keeps a list of observers
- Notifies all observers when the temperature changes
- Runs in its own thread to simulate real-time weather changes

### WeatherObserver (Observer Interface)

- Declares the `update(int temperature)` method
- Ensures all observers react to temperature updates in a unified way

### PhoneDisplay & WindowDisplay (Concrete Observers)

- Implement the `WeatherObserver` interface
- Display temperature updates in different ways

### Main Class

- Creates the weather station
- Registers multiple observers
- Starts the weather station thread
- Removes one observer during runtime to demonstrate dynamic behavior

---

## Why Observer Pattern?

- Reduces coupling between classes
- Makes the system easy to extend
- Allows adding new displays without modifying existing code
- Supports real-time updates efficiently

---

## Result

The final system:

- Updates temperature automatically
- Notifies observers instantly
- Allows dynamic add/remove of observers
- Demonstrates a clean and practical use of the Observer pattern

**ملخص بسيط بأسلوب طالب** :

---

# Weather Station Simulator – Observer Pattern (Summary)

في هذا التمرين تعلمنا استخدام **Observer Design Pattern** من خلال بناء نظام محطة طقس بسيط.

الفكرة الرئيسية هي:
محطة الطقس تغيّر درجة الحرارة باستمرار، وكل الشاشات (Observers) المسجّلة عندها يتم إشعارها مباشرةً بأي تغيير.

---

## شنو تعلمنا؟

- شلون نخلي كلاس واحد (WeatherStation) يرسل تحديثات لأكثر من كلاس بدون ما يعرف تفاصيلهم
- شلون نستخدم **Interface** حتى نخلي كل المراقبين (Observers) يتعاملون بنفس الطريقة
- شلون نضيف ونحذف Observers أثناء تشغيل البرنامج
- شلون نستخدم **Thread** حتى تصير تغييرات الطقس تلقائياً بدون تدخل المستخدم
- شلون نخلي كل Observer يطبع رسالة مختلفة حسب دوره

---

## أدوار الكلاسات ببساطة

- **WeatherStation**
  هو المصدر (Subject):
  - يغيّر درجة الحرارة
  - يحتفظ بقائمة المراقبين
  - ينادي `update()` لكل مراقب لما تتغير الحرارة

- **WeatherObserver**
  Interface يحدد شنو يسوي أي مراقب لما توصله تحديثات

- **PhoneDisplay / WindowDisplay**
  مراقبين (Observers):
  - يستلمون درجة الحرارة
  - يطبعونها بطريقتهم الخاصة

- **Main**
  يشغّل البرنامج:
  - ينشئ محطة الطقس
  - يضيف المراقبين
  - يشغّل الـ thread
  - يحذف واحد من المراقبين ويبين أنه ما عاد يستلم تحديثات

---

## ليش استخدمنا Observer Pattern؟

- حتى نقلل الربط بين الكلاسات
- حتى نضيف شاشات جديدة بدون ما نغيّر كود محطة الطقس
- حتى يصير النظام مرن وسهل التوسعة

---

## النتيجة

سوّينا نظام:

- يحدّث درجة الحرارة تلقائياً
- يبلّغ كل المراقبين فوراً
- يسمح بإضافة وحذف المراقبين بسهولة
- يشتغل بشكل واقعي باستخدام Thread

---
