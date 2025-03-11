# Проект: Оптимизация проектов (Sber Hack)

## Описание проекта

Этот проект представляет собой REST API для оптимизации проектов. Основная цель — минимизировать продолжительность
проекта и ресурсные затраты, учитывая задачи, ресурсы и ограничения. Проект разработан на Java с использованием Spring
Boot, Lombok, Swagger и Maven.

---

## Основные функции

1. **Оптимизация проекта**:
    - Назначение задач на ресурсы с учетом их доступности.
    - Минимизация общей продолжительности проекта.
    - Учет зависимостей между задачами.

2. **REST API**:
    - Эндпоинт для оптимизации проекта.
    - Документация API через Swagger UI.

3. **Логирование**:
    - Логирование всех важных событий и ошибок.

4. **Обработка ошибок**:
    - Глобальный обработчик исключений для возврата корректных HTTP-ошибок.

---

## Технологии

- **Язык программирования**: Java 17
- **Фреймворк**: Spring Boot
- **Библиотеки**:
    - Lombok (для автоматической генерации геттеров, сеттеров и т.д.)
    - Swagger (для документации API)
    - SLF4J + Logback (для логирования)
- **Сборка**: Maven

---

## Установка и запуск

### Требования

- Установленная Java 17 или выше.
- Установленный Maven.

### Шаги для запуска

1. **Клонируйте репозиторий**:
   ```bash
   git clone https://github.com/ваш-репозиторий/sber-hack.git
   cd sber-hack
   ``` 

Соберите проект:

 ```bash
Copy
mvn clean install
 ```

3. **Запустите приложение**:

 ```bash
Copy
mvn spring-boot:run
 ```

4. **Откройте Swagger UI**:

- Перейдите по адресу:  ```http://localhost:8080/swagger-ui.html ```.
- Здесь вы найдете документацию API и сможете тестировать эндпоинты.

## Использование API

### Эндпоинты

1. **Оптимизация проекта**:

- Метод:  ```POST ```

- URL:  ```/api/projects/optimize ```

- Тело запроса (JSON):

 ```json
{
  "requestId": "d6c4b902-c884-4f3f-82f0-88714c68862c",
  "project": {
    "id": "7476064025108086785",
    "projectId": "7476063426289008641",
    "name": "исходный",
    "isReadOnly": false,
    "calendar": "general",
    "planType": "DRAFT",
    "lastModifyDate": "2025-02-27T15:22:12.517",
    "startDate": "2024-02-05",
    "endDate": "2025-02-27"
  },
  "tasks": {
    "rows": [
      {
        "children": [
          {
            "parentId": "7476064025108086786",
            "children": [
              {
                "parentId": "7476064025108086787",
                "name": "Аналитика",
                "role": "Аналитик",
                "startDate": "2024-02-07T15:22:07",
                "endDate": "2024-02-14T15:22:07",
                "effort": 5.0,
                "effortUnit": "d",
                "duration": 5.0,
                "durationUnit": "d",
                "percentDone": 0.0,
                "schedulingMode": "FixedUnits",
                "constraintType": "startnoearlierthan",
                "constraintDate": "2024-02-07T15:22:07",
                "manuallyScheduled": false,
                "effortDriven": false,
                "parentIndex": 0,
                "expanded": true,
                "rollup": false,
                "inactive": false,
                "rootTask": false,
                "taskKind": {
                  "entityId": "7392625257454436357",
                  "rootEntityId": "ai_plan_recalc_mvp"
                },
                "isTransferred": false,
                "priority": 1,
                "assignmentsUnitsSum": 100.0,
                "guid": "e23a6336-e1e0-4552-9545-173e3ca57cd7",
                "id": "7476064025108086788"
              }
            ]
          }
        ]
      }
    ]
  },
  "resources": {
    "rows": [
      {
        "name": "Аналитик №1 (2000руб/час)",
        "projectRole": "Аналитик",
        "reservationType": "UNIVERSAL",
        "reservationPercent": 100,
        "reservationStatus": "NEW",
        "projectRoleId": "ANALYST",
        "reservePartially": false,
        "id": "7476063767410049036"
      }
    ]
  }
}
 ```

- Ответ (JSON):

 ```json
{
  "requestId": "d6c4b902-c884-4f3f-82f0-88714c68862c",
  "project": {
    "id": "7476064025108086785",
    "projectId": "7476063426289008641",
    "name": "исходный",
    "isReadOnly": false,
    "calendar": "general",
    "planType": "DRAFT",
    "lastModifyDate": "2025-02-27T15:22:12.517",
    "startDate": "2024-02-05",
    "endDate": "2025-02-27"
  },
  "tasks": {
    "rows": [
      {
        "children": [
          {
            "parentId": "7476064025108086786",
            "children": [
              {
                "parentId": "7476064025108086787",
                "name": "Аналитика",
                "role": "Аналитик",
                "startDate": "2024-02-07T15:22:07",
                "endDate": "2024-02-14T15:22:07",
                "effort": 5.0,
                "effortUnit": "d",
                "duration": 5.0,
                "durationUnit": "d",
                "percentDone": 0.0,
                "schedulingMode": "FixedUnits",
                "constraintType": "startnoearlierthan",
                "constraintDate": "2024-02-07T15:22:07",
                "manuallyScheduled": false,
                "effortDriven": false,
                "parentIndex": 0,
                "expanded": true,
                "rollup": false,
                "inactive": false,
                "rootTask": false,
                "taskKind": {
                  "entityId": "7392625257454436357",
                  "rootEntityId": "ai_plan_recalc_mvp"
                },
                "isTransferred": false,
                "priority": 1,
                "assignmentsUnitsSum": 100.0,
                "guid": "e23a6336-e1e0-4552-9545-173e3ca57cd7",
                "id": "7476064025108086788"
              }
            ]
          }
        ]
      }
    ]
  },
  "assignments": {
    "rows": [
      {
        "event": "7476064025108086788",
        "resource": "7476063767410049036",
        "units": 100,
        "startDate": "2024-02-07T15:22:07",
        "endDate": "2024-02-14T15:22:07",
        "currentEffort": 144000000,
        "guid": "d6f73a0f-4d88-45cf-9d14-e0878bd0f466",
        "id": "7476064025108086799"
      }
    ]
  }
}
 ```

---

## Структура проекта

 ```
src/main/java/hack/task/
├── controller/                # Контроллеры REST API
├── service/                   # Сервисный слой
├── model/                     # Модели данных
├── optimizer/                 # Логика оптимизации
├── exception/                 # Глобальный обработчик исключений
├── config/                    # Конфигурации (Swagger, логгирование)
└── HackTaskApplication.java   # Основной класс приложения
 ```

---

## Зависимости

- **Spring Boot**: Для создания REST API.

- **Lombok**: Для автоматической генерации кода.

- **Swagger**: Для документации API.

- **SLF4J + Logback**: Для логирования.

---

## Автор

Имя: Алина

GitHub: https://github.com/linskay/

