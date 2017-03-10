package com.autentica.mvc.services.timeServices;

/**
 * Created by mkl on 3/9/2017.
 */

public enum Time {

    Time1("00:00"),
    Time2("00:30"),
    Time3("01:00"),
    Time4("01:30"),
    Time5("02:00"),
    Time6("02:30"),
    Time7("03:00"),
    Time8("03:30"),
    Time9("04:00"),
    Time10("04:30"),
    Time11("05:00"),
    Time12("05:30"),
    Time13("06:00"),
    Time14("06:30"),
    Time15("07:00"),
    Time16("07:30"),
    Time17("08:00"),
    Time18("08:30"),
    Time19("09:00"),
    Time20("09:30"),
    Time21("10:00"),
    Time22("10:30"),
    Time23("11:00"),
    Time24("11:30"),
    Time25("12:00"),
    Time26("12:30"),
    Time27("13:00"),
    Time28("13:30"),
    Time29("14:00"),
    Time30("14:30"),
    Time31("15:00"),
    Time32("15:30"),
    Time33("16:00"),
    Time34("16:30"),
    Time35("17:00"),
    Time36("17:30"),
    Time37("18:00"),
    Time38("18:30"),
    Time39("19:00"),
    Time40("19:30"),
    Time41("20:00"),
    Time42("20:30"),
    Time43("21:00"),
    Time44("21:30"),
    Time45("22:00"),
    Time46("22:30"),
    Time47("23:00"),
    Time48("23:30");

    private final String time;

    Time(String s) {
        time = s;
    }

    public boolean equalsTime(String t) {
        return time.equals(t);
    }

    public String toString() {
        return this.time;
    }
}
