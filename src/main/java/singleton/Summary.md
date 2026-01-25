# Assignment: Logger System (Singleton Pattern)

## What We Learned

In this assignment, we learned how to use the **Singleton Design Pattern** to create a shared Logger system in Java.

The main idea was to make sure that **only one Logger instance exists** in the whole application, so all parts of the program write log messages to the same file.

### Key Concepts Learned

- How to implement the **Singleton pattern** using:
  - `private` constructor
  - `static` instance
  - `getInstance()` method
- Why Singleton is useful for shared resources like log files
- How to safely handle **file writing** in Java using `BufferedWriter`
- How to:
  - Write log messages line by line
  - Change the log file name during runtime
  - Close and reopen files correctly
- Basic **thread safety** using `synchronized` methods

### How the Logger Works

- The `Logger` class is a Singleton, so only one object is created.
- When the Logger is created, it opens a default log file.
- The `write()` method writes messages to the file without reopening it each time.
- The `setFileName()` method closes the current file and opens a new one.
- The `close()` method safely closes the file when the program finishes.

### Why Singleton Is Important Here

Without Singleton:

- Multiple Logger objects could be created
- Multiple log files might be opened
- File conflicts and errors could happen

With Singleton:

- One shared Logger
- One controlled log file
- Clean and safe logging system

## Conclusion

This assignment helped us understand how the Singleton pattern works in real-world scenarios, especially when dealing with shared resources like files. It also improved our understanding of file I/O and object lifecycle management in Java.

# Assignment: Logger System (Singleton Pattern)

## شنو اللي تعلمناه؟

بهذا التاسك تعلمنا شلون نستخدم **Design Pattern اسمه Singleton** حتى نسوي Logger واحد مشترك بكل البرنامج.

الفكرة الرئيسية هي:
**ما يصير أكثر من Logger واحد يكتب على الملف**، لأن الملف مورد مشترك، وإذا تعددوا اللوجرز تصير مشاكل.

---

## أهم الأفكار اللي تعلمناها

- شلون نطبق **Singleton Pattern**:
  - نخلي الـ constructor `private`
  - نسوي متغير `static` من نفس الكلاس
  - نستخدم `getInstance()` حتى نجيب نفس النسخة كل مرة
- ليش Singleton مهم ويا الملفات والـ logging
- شلون نكتب على ملف باستخدام `BufferedWriter`
- شلون:
  - نكتب كل log بسطر جديد
  - نغير اسم ملف اللوق أثناء تشغيل البرنامج
  - نسكر الملف ونفتحه من جديد بدون أخطاء
- شوية عن **thread safety** باستخدام `synchronized`

---

## شلون يشتغل الـ Logger؟

- كلاس `Logger` هو Singleton يعني نسخة وحدة بس
- أول ما ينسوي الـ Logger يفتح ملف log افتراضي
- `write()` يكتب الرسالة مباشرة بدون ما يفتح الملف كل مرة
- `setFileName()`:
  - يسكر الملف القديم
  - يفتح ملف جديد بالاسم الجديد
- `close()` يسكر الملف بأمان قبل ما يخلص البرنامج

---

## ليش Singleton مهم بهالحالة؟

بدون Singleton:

- ممكن أكثر من Logger ينسوي
- أكثر من ملف log
- تصير مشاكل بالكتابة على الملف

ويّا Singleton:

- Logger واحد
- ملف واحد
- نظام logging مرتب وآمن

---

## الخلاصة

هذا التاسك علّمنا شلون Singleton ينستخدم بحالات حقيقية مثل الـ Logger، وتعلمنا شوية عن التعامل ويا الملفات وإدارة الموارد بطريقة صحيحة بلغة Java.
