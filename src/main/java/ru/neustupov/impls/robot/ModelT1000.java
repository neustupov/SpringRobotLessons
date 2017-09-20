package ru.neustupov.impls.robot;

import ru.neustupov.interfaces.Hand;
import ru.neustupov.interfaces.Head;
import ru.neustupov.interfaces.Leg;
import ru.neustupov.interfaces.Robot;

public class ModelT1000 implements Robot{

    private Hand hand;
    private Leg leg;
    private Head head;

    private String color;
    private int year;
    private boolean SoundEnabled;

    public ModelT1000() {
    }

    public ModelT1000(Hand hand, Leg leg, Head head) {
        super();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    public ModelT1000(String color, int year, boolean soundEnabled) {
        this.color = color;
        this.year = year;
        SoundEnabled = soundEnabled;
    }

    public ModelT1000(Hand hand, Leg leg, Head head, String color, int year, boolean soundEnabled) {
        this.hand = hand;
        this.leg = leg;
        this.head = head;
        this.color = color;
        this.year = year;
        SoundEnabled = soundEnabled;
    }

    public void fire() {
        head.calc();
        hand.catchSomething();
        leg.go();
        System.out.println("color: " + color);
        System.out.println("year: " + year);
        System.out.println("soundEnabled: " + isSoundEnabled());
    }

    public void dance() {
        System.out.println("T1000 is dancing!");
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnabled() {
        return SoundEnabled;
    }

    public void setSoundEnabled(boolean soundEnabled) {
        SoundEnabled = soundEnabled;
    }

}
