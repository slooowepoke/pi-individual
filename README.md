# pi-individual

Программные требования для запуска сервиса:
- Apache Tomcat
- Gradle версии не ниже 4.10
- JDK версия 8

### Пример работы программы ###

Пример 1
```sh
  Request: http://localhost:80/?year="тысяча девятьсот девяностый"
  Response: {"errorCode": 400, "dataMessage": "Неверный формат даты"}
  Comment: Обработка некорректного ввода данных. Год должен быть задан числом от 0 до 9999.
```
Пример 2
```sh
Request: http://localhost:80/?year=1700
Response: {"errorCode": 200, "dataMessage": "13/09/1700"}
Comment: 1700 год - невисокосный.
```

Пример 3
```sh
Request: http://localhost:80/?year=1600
Response: {"errorCode": 200, "dataMessage": "12/09/1600"}
Comment: 1600 год - високосный.
```

Пример 4
```sh
Request 1: http://localhost:80/?year=0004
Response 1: {"errorCode": 200, "dataMessage": "12/09/0004"}
Request 2: http://localhost:80/?year=4
Response 2: {"errorCode": 200, "dataMessage": "12/09/0004"}
Comment: Корректная обработка ведущих нулей.
```
