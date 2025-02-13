/**
 * 1. Создать интерфейс SpaceShip обладающий методом “гипер-прыжок”
 * <p>
 * 2. Создать классы: Interceptor, CargoVessel, MedicalShip, которые
 * должны обладать поведением(методом) “гипер-прыжок”
 * <p>
 * 3. Класс Interceptor должен обладать поведением(методом) “атаковать”
 * <p>
 * 4. Создать класс HyperRing
 * a. Обладает свойством типа SpaceShip
 * b. Обладает методом “зафиксировать судно”, который принимаем судно в виде
 * параметра и фиксирует судно за гипер-кольцом
 * c. Обладает методом “сделать гипер-прыжок”, который направляет судно,
 * зафиксированное за гипер-кольцом, в гипер-прыжок
 * <p>
 * 5. Создать массив кораблей и  соответствующий количеству кораблей массив
 * гипер-колец и отправить корабли в гипер-прыжок
 * <p>
 * 6.* Создать интерфейс HyperEngine обладающий поведением(метод) “сделать
 * гипер-прыжок” и “зафиксировать судно”
 * <p>
 * 7. *Класс HyperRing должен реализовать интерфейс HyperEngine и обладать
 * поведением\состоянием из задания №4
 * <p>
 * 8. ** Создать класс HyperCube реализующий интерфейс HyperEngine и  обладающий
 * и приватным поведением “зафиксировать груз”
 * <p>
 * a. Должен соответствовать заданию №4
 * b. Метод “зафиксировать груз” может принимать только судна типа CargoVessel
 * c. Перед выполнением метода “сделать гипер-прыжок”, должна производится операция
 * “фиксации груза”, если это грузовое судно. Необходимо использовать оператор
 * instanceof, например if (ship instanceof CargoVessel) { //code...
 * <p>
 * 9. ** Создать массив SpaceShip и массив HyperEngine и запустить корабли в
 * “гипер-прыжок” не прибегая к обращению к конкретным классам(реализациям),
 * вместо этого используя базовые классы (абстракцию)
 */

public interface HyperEngine {

    void fixTheSpaceShip();


    void doHyperJump();

}
