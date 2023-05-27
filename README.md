# Втора лабораториска вежба по предметот  Софтверско инженерсво
## Марио Стојмановски, бр. на индекс 215079
### Група на код:
### Control Flow Graph
![cfg](https://github.com/MarioStojmanovski10/SI_2023_lab2_215079/assets/108304165/dad98bce-bc6b-45d1-8599-b1db23fcf413)
### Цикломатска комплексност
Цикломатската комплексност на овој код е 11, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=10, па цикломатската комплексност изнесува 11.
### Тест случаи според критериумот Every statement
Тест сл.1: лозинката на корисникот содржи корисничко име или е долга помалку од 8 знаци.Ќе врати неточно(False)<br>
Тест сл.2: лозинката на корисникот е null, и тука ќе биде фрлен исклучок.
Тест сл.3: Корисникот, лозинката и е-mailot не се null, корисничкото име не е null и тука излез добиваме НЕТОЧНО(false).
Тест сл.4: Корисникот, лозинката и е-mailot не се null, корисничкото име е null,e-mail-от е единствен и тука би требало да добиеме НЕТОЧНО односно FALSE.
Тест сл.5: Корисникот е null и тука ќе бидне фрлен исклучок.
Тест сл.6: E-mail е null и тука ќе бидне фрлен исклучок.
Тест сл.7: Корисникот, лозинката и e-mail-от не се null, корисничкото име е null, е-mail-от не е единствен.Во овој тест пример ќе имаме излез точно (TRUE)
### Тест случаи според критериумот Every path
На сликата подолу ќе можете да ги видите сите тест случаеви.Точно кај аргументите има значење дека тој аргумент е null.Па така од направените тест примери заклучивме
дека од 8 тест случаи,7 ќе бидат точни .
![tocno](https://github.com/MarioStojmanovski10/SI_2023_lab2_215079/assets/108304165/a3889f6d-9a7d-467d-86a8-31f4ced839f7)
