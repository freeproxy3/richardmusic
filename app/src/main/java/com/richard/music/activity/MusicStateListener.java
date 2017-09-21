package com.richard.music.activity;

/**
 * Created by Richard on 2016/12/23.
 */
public interface MusicStateListener {

    /**
     * 更新歌曲状态信息
     */
     void updateTrackInfo();

     void updateTime();

     void changeTheme();

     void reloadAdapter();
}
