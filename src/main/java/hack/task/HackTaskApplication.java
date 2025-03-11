package hack.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Основной класс приложения для запуска Spring Boot.
 * Инициализирует контекст приложения и настраивает автоматическую конфигурацию.
 */
@SpringBootApplication
public class HackTaskApplication {

    private static final Logger logger = LoggerFactory.getLogger(HackTaskApplication.class);

    /**
     * Точка входа в приложение.
     *
     * @param args Аргументы командной строки.
     */
    public static void main(String[] args) {
        logger.info("Запуск приложения HackTaskApplication...");
        SpringApplication.run(HackTaskApplication.class, args);
        logger.info("Приложение HackTaskApplication успешно запущено.");
    }
}