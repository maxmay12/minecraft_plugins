import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.Location;

abstract class Viereckig {
	protected int hoehe;
	protected int breite;
	protected Material material;
	
	public Viereckig(int hoehe, int breite, Material material) {
		this.hoehe = hoehe;
		this.breite = breite;
		this.material = material;
	}
	
	abstract void bauen(Player spieler, Location position);
	
}
