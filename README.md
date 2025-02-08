# shift-java-2025
Тестовое задание для прохождение на курс шифт от ЦФТ

Задача утилиты записать разные типы данных в разные файлы. Целые числа в один
выходной файл, вещественные в другой, строки в третий. По умолчанию файлы с
результатами располагаются в текущей папке с именами integers.txt, floats.txt, strings.txt

По умолчанию файлы перезаписываются

Файлы с результатами создаются по мере необходимости. Если какого-то типа данных нет, то файл для него не будет создан
___

## Необходимые требования для сборки утилиты

- **Версия Java: 23**

- **Версия Maven: 4**

## Запуск утилиты
При запуске утилиты следует указать следующие аргументы:

- -a - аргумент указывает нужно ли дополнять уже отсортированные файлы
- -p - аргумент указывает на то, что к названиям выходных файлов добавить префикс, который указывается после аргумента
- -о - аргумент указывает, что выходные файлы будут сохраняться по другому пути. Путь до директории указывается после аргумента
- -s - аргумент указывает нужно ли выводить краткую статистику по сортировке
- -f - аргумент указывает нужно ли выводить полную статистику по сортировке

**Аргумент -f полностью заменяет аргумент -s**

### Пример запуска утилиты

```bash
java -jar util.jar -s -a -p sample- in1.txt in2.txt
```
Названия выходных файлов:

- sample-integers.txt
- sample-floats.txt
- sample-strings.txt