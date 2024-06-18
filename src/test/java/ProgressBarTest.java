import org.testng.annotations.Test;

public class ProgressBarTest extends BaseTest {
    @Test
    public void progressTest() {
        // Открываем веб-страницу с прогресс-баром
        browserHelper.open("https://demoqa.com/progress-bar");

        // Нажимаем кнопку "Start" для запуска прогресс-бара
        progressBarPage.progressBarStart.click();

        // Ждем, пока прогресс-бар достигнет 52%
        while (true) {
            // Получаем текущее значение прогресс-бара
            String value = progressBarPage.progressBar1.getAttribute("aria-valuenow");

            if (value != null) {
                // Преобразуем значение прогресс-бара в целое число
                int progressValue = Integer.parseInt(value);

                // Проверяем, достигло ли значение прогресс-бара 52 или больше
                if (progressValue == 52) {
                    // Нажимаем кнопку "Stop" для остановки прогресс-бара
                    progressBarPage.progressBarStart.click();
                    System.out.println(progressValue);
                    break;
                }
            }

            // Спим на короткое время, чтобы уменьшить нагрузку на процессор
            try {
                Thread.sleep(10); // Спим 10 миллисекунд для более частой проверки
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}