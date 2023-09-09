package com.example.printer_activity;

public class MorseCharacter {
    public Character ch;
    public String series;
    public long[] intervals;
    public long duration = 0L;

    public MorseCharacter(Character code, long[] intv, long initial) {
        ch = code;
        series = "";
        intervals = new long[(intv.length * 2)];

        int n = 1;
        intervals[0] = initial;

        for (int i = 0; i < intv.length; i++) {
            long l = intv[i];
            series += l == MorseCodes.DOT ? "." : (l == MorseCodes.DASH ? "-" : "");

            if (i > 0) {
                intervals[n++] = MorseCodes.SEP;
                duration += MorseCodes.SEP;
            }

            intervals[n++] = intv[i];
            duration += intv[i];
        }
    }

    public MorseCharacter(Character code, long[] intv) {
        this(code, intv, 0L);
    }

    public MorseCharacter(MorseCharacter ch, long initial) {
        this.ch = ch.ch;
        series = ch.series;
        intervals = ch.intervals;
        intervals[0] = initial;

        for (long interval : intervals) {
            duration += interval;
        }
    }
}
