package lv.javaguru.demo.HomeWork.Tv;

import java.util.Objects;

public class Tv {
    private String manufacturer;

    private boolean powerOn;
    private int channel;
    private int volume;


    public Tv(String manufacturer, int volume, int channel) {
        this.manufacturer = manufacturer;
        this.powerOn = false;
        this.volume = volume;
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public int getChannel() {
        return channel;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setChannel(int choosechannel) {
        channel = choosechannel;
    }

    public void increaseChannel() {
        channel = channel + 1;
    }

    public void decreaseChannel() {
        channel = channel - 1;
    }

    public void power() {
        powerOn = !powerOn;
    }

    public void increaseVolume() {
        volume = volume + 1;
    }

    public void decreaseVolume() {
        volume = volume - 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tv tv = (Tv) o;
        return powerOn == tv.powerOn &&
                channel == tv.channel &&
                volume == tv.volume &&
                Objects.equals(manufacturer, tv.manufacturer);
    }

    @Override
    public String toString() {
        return "Tv{" +
                "manufacturer='" + manufacturer + '\'' +
                ", channel=" + channel +
                ", volume=" + volume +
                '}';
    }
}
//Свойства
//
//        Текущий канал
//        Текущая громкость
//        Производитель
//        Включен ли телевизор
//Методы
//
//        * Переключить на следующий канал (увеличить текущий канал на 1 ед.)
//        * Переключить на предыдущий канал (уменьшить текущий канал на 1 ед.)
//        * Увеличить звук (увеличить громкость на 1 ед.)
//        * Уменьшик звук (уменьшить громкость на 1 ед.)
//        * Включить телевизор
//        * Выключить телевизор
//        Переключать каналы и менять громкость можно только у включенного телевизора.
//
//        Для каждого из полей написать вспомогательные методы getter (напр. int getCurrentChannel()).
//
//        Необходимо переопределить методы equals() и toString().