package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
Функциональности маловато!
*/
/*
Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
Пустая строка - конец ввода данных.
Числа могут повторяться.
Строки всегда уникальны.
Введенные данные не должны потеряться!
Затем программа выводит содержание HashMap на экран.
Каждую пару с новой строки.

Пример ввода:
1
Мама
2
Рама
1
Мыла

Пример вывода:
1 Мыла
2 Рама
1 Мама

Требования:
Программа должна считывать данные с клавиатуры.
Программа должна выводить текст на экран.
В методе main объяви переменную коллекции HashMap и сразу проинициализируй ee.
Программа должна помещать в HashMap пары считанные с клавиатуры.
Программа должна выводить на экран содержимое HashMap согласно условию. Ключ и значение разделены пробелом. Каждое значение с новой строки.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> map = new HashMap<>();

        String key = null;
        Integer value = null;

        while (true) {

            try {
                value = Integer.parseInt(reader.readLine());
                key = reader.readLine();
                map.put(key, value);
            } catch (NumberFormatException e) {
                break;
            }

        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }
}
