package midTermCompilation;

public class WebArt implements ArtCount{
	private String[] animations;
	private String[] advertisements;
	public WebArt(String[] animations,String[] advertisements) {
		this.animations = animations;
		this.advertisements = advertisements;
	}
	public String[] getAnimations() {
		return this.animations;
	}
	public String[] getAdvertisement() {
		return this.advertisements;
	}
	@Override
	public int numArtPieces() {
		return this.animations.length+this.advertisements.length;
	}
}
