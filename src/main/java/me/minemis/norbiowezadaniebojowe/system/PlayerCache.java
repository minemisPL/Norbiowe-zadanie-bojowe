package me.minemis.norbiowezadaniebojowe.system;

public class PlayerCache {

    private final String playerName;
    private long time = 0L;
    private long lastLogin;

    public PlayerCache(String playerName) {
        this.playerName = playerName;
    }

    public void setLastLogin(long lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getPlayerName() {
        return playerName;
    }

    public long getTime() {
        return time;
    }

    public long getLastLogin() {
        return lastLogin;
    }

}
