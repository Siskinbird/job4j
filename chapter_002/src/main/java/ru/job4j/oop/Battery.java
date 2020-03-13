package ru.job4j.oop;
/**
 * Battery task.
 * @author  Chizhov Dmitry dima@chig@gmail.com
 * @since 12.03.2020
 */

public class Battery {
    private int load;
    /**
     * Метод определяет заряд батареи
     * @param charge
     */
    public Battery(int charge) {
        this.load = charge;
    }
    /**
     * Метод описывает перекачку заряда первой батареи в заряд второй
     * @param another
     */
    public void exchange(Battery another) {
        this.load = this.load + another.load;
        another.load = 0;
    }
    //public void pour(Jar another) {
    //        this.value = this.value + another.value;
    //        another.value = 0;
    /**
     * Мэйн
     */
    public static void main(String[] args) {
        Battery first = new Battery(100);
        Battery second = new Battery(42);
        System.out.println("first : " + first.load + " %" + ". second : " + second.load + " %");
        first.exchange(second);
        System.out.println("first : " + first.load + " %" + ". second : " + second.load + " %");
        System.out.println("И снова с " + first.load + " % заряда побеждает партия Единая Россия");
    } // ХА! Шутка) Чего не смеётесь? Не смешно? ЭТО РОССИЯ!
}
