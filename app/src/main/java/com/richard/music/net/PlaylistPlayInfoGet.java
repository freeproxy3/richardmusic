package com.richard.music.net;

import com.richard.music.json.MusicDetailInfo;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Richard on 2016/6/29.
 */
public class PlaylistPlayInfoGet {
    static ArrayList<MusicDetailInfo> arrayList;

    public PlaylistPlayInfoGet(ArrayList<MusicDetailInfo> arrayList) {
        this.arrayList = arrayList;
    }

    static ExecutorService pool = Executors.newFixedThreadPool(10);

    public static void get(MusicDetailInfoGet musicDetailInfoGet) {
        pool.execute(musicDetailInfoGet);
    }
}
