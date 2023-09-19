package midTermCompilation;

public class FineArt implements ArtCount{
	private String[] paintings;
	private String[] sculptures;
	public FineArt(String[] paints,String[] sulptures) {
		this.paintings = paints;
		this.sculptures = sulptures;
	}
	public String[] getPaintings() {
		return this.paintings;
	}
	public String[] getSculptures() {
		return this.sculptures;
	}
	@Override
	public int numArtPieces() {
		return this.paintings.length+this.sculptures.length;
	}
}
