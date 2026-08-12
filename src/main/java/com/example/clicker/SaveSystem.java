package com.example.clicker;

import java.io.*;

public class SaveSystem {

    // Путь "user.dir" автоматически находит папку, КУДА установлен ваш кликер
    private static final String FILE_NAME = System.getProperty("user.dir") + File.separator + "game_data.clicker";

    // Сохранение всех переменных в файл
    public static void saveData() {
        File file = new File(FILE_NAME);

        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(file))) {

            out.writeInt(Application.clickCount);
            out.writeInt(Application.multiplication);
            out.writeInt(Application.currentMultiplication);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Загрузка всех переменных за ОДИН раз
    public static void loadData() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            // Если файла ещё нет (первый запуск), ставим дефолты
            Application.clickCount = 0;
            Application.multiplication = 1;
            Application.currentMultiplication = 1;
            return;
        }

        try (DataInputStream in = new DataInputStream(new FileInputStream(file))) {

            // Считываем строго по порядку
            Application.clickCount = in.readInt();
            Application.multiplication = in.readInt();
            Application.currentMultiplication = in.readInt();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}