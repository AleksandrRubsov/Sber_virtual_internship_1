# Sber_virtual_internship_1
Решение этой задачи – комплексный процесс, который состоит из 4 этапов:

1. Загрузка справочников городов России
2. Реализация нескольких вариантов сортировки данных справочника
3. Поиск города с наибольшим количеством жителей
4. Поиск количества городов в разрезе регионов
//////////////////////////////////////////////////////////////////////
1. 
Необходимо реализовать класс Main, используя java.util.Scanner, прочесть информацию из текстового представления справочника и разложить данные в модель City с полями:

name – наименование города

region – регион

district – федеральный округ

population – количество жителей города

foundation – дата основания или первое упоминание

Полученный список объектов City нужно вывести в консоль.

2.
Далее нам нужно было реализовать несколько вариантов сортировки данных справочника:

Сортировка списка городов по наименованию в алфавитном порядке по убыванию без учета регистра;

Сортировка списка городов по федеральному округу и наименованию города внутри каждого федерального округа в алфавитном порядке по убыванию с учетом регистра;

Затем вывести полученный список объектов City в консоль. При реализации сортировки нужно обратить внимание на возможные варианты реализации: Comparator, lambda-выражения.

3.
Теперь нам нужно реализовать поиск города с наибольшим количеством жителей.

Тут все довольно просто: необходимо преобразовать список городов в массив. А затем путем перебора массива найти индекс элемента и значение с наибольшим количеством жителей города.

4.
Осталось только реализовать поиск количества городов в разрезе регионов. Необходимо определить количество городов в каждом регионе.
