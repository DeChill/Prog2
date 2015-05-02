package core;


public interface AccountManager {
	
	/*
	 * 
    Anlegen jeweils eines Mitspielers (mit Vorgabe des Namens)
    Kauf und Verkauf von Aktien
    (Dazu m�ssen Spielername, Aktienname und Anzahl spezifiziert werden),
    Abfragen des Werts eines Assets, und Abfrage des Gesamtwerts aller Assets eines Mitspielers (aktuelles Verm�gen im Spiel),
    Abfragen des Kurses einer Aktie,
    Abfragen aller verf�gbaren Aktien und ihres jeweiligen Kurses in textueller Form. 
	 * 
	 * 
	 */
	void addPlayer(String name);
	void buyShares(String playerName, String shareName, int amount);
	void sellShares(String playerName, String shareName, int amount);
	long getValue(Asset asset);
	long getPlayerValue(String name);
	long check(String playerName, String shareName);
	Player getPlayer(String name);
//	long getSharePrice(Share share);
	String getShares();
	Share [] getAllShares();
	
	
}
