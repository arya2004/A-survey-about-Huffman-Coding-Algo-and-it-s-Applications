package com.example.printer_activity;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class MorseCodes {

    public static final Map<Character, MorseCharacter> CODES;
    public static final long
            DOT = 200,
            DASH = DOT * 4,
            SEP = DOT / 2,
            CHAR = SEP * 4,
            WORD = SEP * 8,
            STOP = WORD + CHAR;


    static {
        Map<Character, MorseCharacter> map = new HashMap<>();

        

        map.put('ा', new MorseCharacter('ा', new long[] {DOT, DOT, DOT, DOT}));
        map.put('क', new MorseCharacter('क', new long[] {DOT, DOT, DASH, DOT}));
        map.put('े', new MorseCharacter('े', new long[] {DOT, DASH, DOT, DOT}));
        map.put('र', new MorseCharacter('र', new long[] {DASH, DOT, DOT, DOT}));
        map.put('ह', new MorseCharacter('ह', new long[] {DASH, DASH, DOT ,DOT}));
        map.put('स', new MorseCharacter('स', new long[] {DOT, DOT, DOT, DASH, DOT}));
        map.put('न', new MorseCharacter('न', new long[] {DOT, DOT, DASH, DASH, DOT}));
        map.put('ी', new MorseCharacter('ी', new long[] {DOT, DOT, DASH, DASH, DASH}));
        map.put('ं', new MorseCharacter('ं', new long[] {DOT, DASH, DOT, DASH, DOT}));
        map.put('म', new MorseCharacter('म', new long[] {DOT, DASH, DASH, DOT, DOT}));
        map.put('ि', new MorseCharacter('ि', new long[] {DOT, DASH, DASH, DOT, DASH}));
        map.put('्', new MorseCharacter('्', new long[] {DOT, DASH, DASH, DASH, DASH}));
        map.put('त', new MorseCharacter('त', new long[] {DASH, DOT, DOT, DASH, DOT}));
        map.put('प', new MorseCharacter('प', new long[] {DASH, DOT, DASH, DOT, DASH}));
        map.put('ल', new MorseCharacter('ल', new long[] {DASH, DOT, DASH, DASH, DASH}));
        map.put('ो', new MorseCharacter('ो', new long[] {DASH, DASH, DASH, DOT, DOT}));
        map.put('य', new MorseCharacter('य', new long[] {DASH, DASH, DASH, DOT, DASH}));
        map.put('ै', new MorseCharacter('ै', new long[] {DASH, DASH, DASH, DASH, DOT}));
        map.put('ब', new MorseCharacter('ब', new long[] {DOT, DOT, DOT, DASH, DASH, DOT}));
        map.put('द', new MorseCharacter('द', new long[] {DOT, DASH, DOT, DASH, DASH, DOT}));
        map.put('व', new MorseCharacter('व', new long[] {DOT, DASH,  DOT, DASH, DASH, DASH}));
        map.put('ु', new MorseCharacter('ु', new long[] {DASH, DOT, DOT, DASH, DASH, DOT}));
        map.put('ज', new MorseCharacter('ज', new long[] {DASH, DOT, DASH, DOT, DOT, DOT}));
        map.put('ए', new MorseCharacter('ए', new long[] {DASH, DOT, DASH, DOT, DOT, DASH}));
        map.put('ग', new MorseCharacter('ग', new long[] {DASH, DOT, DASH, DASH, DOT, DASH}));
        map.put('च', new MorseCharacter('च', new long[] {DASH, DASH, DOT, DASH, DOT, DASH}));
        map.put('थ', new MorseCharacter('थ', new long[] {DASH, DASH, DOT, DASH, DASH, DOT}));
        map.put('अ', new MorseCharacter('अ', new long[] {DASH, DASH, DASH, DASH, DASH, DOT}));
        map.put('औ', new MorseCharacter('औ', new long[] {DASH, DASH, DASH, DASH, DASH, DASH}));
        map.put('ू', new MorseCharacter('ू', new long[] {DOT, DOT, DOT, DASH, DASH, DASH, DASH}));
        map.put('उ', new MorseCharacter('उ', new long[] {DOT, DASH, DASH, DASH ,DOT, DOT, DOT}));
        map.put('श', new MorseCharacter('श', new long[] {DOT, DASH, DASH, DASH, DOT, DASH, DOT}));
        map.put('ड', new MorseCharacter('ड', new long[] {DOT, DASH, DASH, DASH, DOT, DASH, DASH}));
        map.put('ख', new MorseCharacter('ख', new long[] {DASH, DOT, DOT, DASH, DASH, DASH, DASH}));
        map.put('़', new MorseCharacter('़', new long[] {DASH, DOT, DASH, DASH, DOT, DOT, DASH}));
        map.put('भ', new MorseCharacter('भ', new long[] {DASH, DOT, DASH, DASH, DOT, DOT, DOT}));
        map.put('आ', new MorseCharacter('आ', new long[] {DASH, DASH, DOT, DASH, DOT, DOT, DOT}));
        map.put('ट', new MorseCharacter('ट', new long[] {DASH, DASH, DOT, DASH, DASH, DASH, DASH}));
        map.put('छ', new MorseCharacter('छ', new long[] {DOT, DOT, DOT, DASH, DASH, DASH, DOT, DASH}));
        map.put('ध', new MorseCharacter('ध', new long[] {DASH, DOT, DOT, DASH, DASH, DASH, DOT, DOT}));
        map.put('फ', new MorseCharacter('फ', new long[] {DASH, DOT, DOT, DASH, DASH, DASH, DOT, DASH}));
        map.put('इ', new MorseCharacter('इ', new long[] {DASH, DASH, DOT, DASH, DOT, DOT, DASH, DASH}));
        map.put('ँ', new MorseCharacter('ँ', new long[] {DASH, DASH, DOT, DASH, DASH, DASH, DOT, DOT}));
        map.put('ष', new MorseCharacter('ष', new long[] {DOT, DOT, DOT, DASH, DASH, DASH, DOT, DOT, DOT}));
        map.put('घ', new MorseCharacter('घ', new long[] {DOT, DASH, DASH, DASH, DOT, DOT, DASH, DOT, DASH}));
        map.put('ई', new MorseCharacter('ई', new long[] {DOT, DASH, DASH, DASH, DOT, DOT, DASH, DOT, DOT}));
        map.put('झ', new MorseCharacter('झ', new long[] {DOT, DASH, DASH, DASH, DOT, DOT, DASH, DASH, DASH}));
        map.put('ठ', new MorseCharacter('ठ', new long[] {DASH,DASH, DOT, DASH,DOT, DOT, DASH, DOT, DOT}));
        map.put('ौ', new MorseCharacter('ौ', new long[] {DASH,DASH, DOT, DASH,DOT, DOT, DASH, DOT, DASH}));
        map.put('ण', new MorseCharacter('ण', new long[] {DASH, DASH, DOT, DASH, DASH, DASH, DOT, DASH, DASH}));
        map.put('ॉ', new MorseCharacter('ॉ', new long[] {DOT, DASH, DASH, DASH, DOT, DOT, DASH, DASH, DOT, DOT}));
        map.put('ओ', new MorseCharacter('ओ', new long[] {DOT, DOT, DOT, DASH, DASH, DASH, DOT, DOT, DASH, DASH}));
        map.put('ृ', new MorseCharacter('ृ', new long[] {DOT, DOT, DOT, DASH, DASH, DASH, DOT, DOT, DASH, DOT}));
        map.put('ढ', new MorseCharacter('ढ', new long[] {DOT, DASH, DASH, DASH, DOT, DOT, DASH, DASH, DOT, DASH}));
        map.put('ऊ', new MorseCharacter('ऊ', new long[] {DASH, DASH, DOT, DASH, DASH, DASH, DOT, DASH, DOT, DOT, DOT}));
        map.put('ऐ', new MorseCharacter('ऐ', new long[] {DASH, DASH, DOT, DASH, DASH, DASH, DOT, DASH, DOT, DASH, DOT}));
        map.put('ऑ', new MorseCharacter('ऑ', new long[] {DASH, DASH, DOT, DASH, DASH, DASH, DOT, DASH, DOT, DASH, DASH}));
        map.put('ञ', new MorseCharacter('ञ', new long[] {DASH, DASH, DOT, DASH, DASH, DASH, DOT, DASH, DOT, DOT, DASH, DOT, DASH}));
        map.put('ः', new MorseCharacter('ः', new long[] {DASH, DASH, DOT, DASH, DASH, DASH, DOT, DASH, DOT, DOT, DASH, DOT, DOT}));
        map.put('ॅ', new MorseCharacter('ञ', new long[] {DASH, DASH, DOT, DASH, DASH, DASH, DOT, DASH, DOT, DOT, DASH, DASH, DOT}));
        map.put('ऋ', new MorseCharacter('ः', new long[] {DASH, DASH, DOT, DASH, DASH, DASH, DOT, DASH, DOT, DOT, DASH, DASH, DASH}));

        CODES = Collections.unmodifiableMap(map);
    }


    public static ArrayList<MorseCharacter> encode(CharSequence chs) {
        ArrayList<MorseCharacter> queue = new ArrayList<>();
        long preInterval = 0L;

        for (int i = 0; i < chs.length(); i++) {
            char ch = Character.toUpperCase(chs.charAt(i));

            try {
                if (MorseCodes.CODES.containsKey(ch)) {
                    queue.add(new MorseCharacter(MorseCodes.CODES.get(ch), preInterval));
                    preInterval = MorseCodes.CHAR;
                } else if (ch == '.') {
                    preInterval = MorseCodes.STOP;
                } else {
                    preInterval = MorseCodes.WORD;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return queue;
    }
}