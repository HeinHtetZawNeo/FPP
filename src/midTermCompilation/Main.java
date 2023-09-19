package midTermCompilation;

public class Main {

	static FineArt[] fineArtsArr;
	static WebArt[] webArtArr;
	
	public static void main(String[] args) {
		populateArrays();
		//ArtCreationData acd = new ArtCreationData();
		Main acd = new Main();
		
		ArtCount[] artObjects = acd.assembleCommonArt(fineArtsArr,webArtArr);
		
		System.out.println("Number of pieces of art : "+acd.computeNumberArtWorks(artObjects));
	}
	
	private static int computeNumberArtWorks(ArtCount[] ac) {
		int total = 0;
		for(ArtCount temp:ac) {
			total += temp.numArtPieces();
		}
		return total;
	}
	private static ArtCount[] assembleCommonArt(FineArt[] fa,WebArt[] wa) {
		ArtCount[] temp = new ArtCount[fa.length+wa.length];
		int index =0;
		for(int i=0;i<fa.length;i++,index++) {
			temp[index] = fa[i];
		}
		for(int i=0;i<wa.length;i++,index++) {
			temp[index] = wa[i];
		}
		return temp;
	}
	
	private static void populateArrays() {
		fineArtsArr = new FineArt[]{new FineArt(painting1, sculptures1),
				new FineArt(painting2, sculptures2)};
		webArtArr = new WebArt[]{new WebArt(animations1, animations2),
				new WebArt(animations3, new String[0])};
	}
	static String[] painting1 = new String[] {"Horizon", "Sunset", "Speeding"};
	static String[] painting2 = new String[] {"Horizon", "Sunset", "Speeding"};
	
	static String[] sculptures1 = new String[] {"Thinker", "TallMan", "Invincible"};
	static String[] sculptures2 = new String[] {"Wonder Boy"};
	
	static String[] animations1 = new String[] {"Sponge Bob","Batman","Goofy"};
	static String[] animations2 = new String[] {"Waking Up","Dusk","Car Race"};
	static String[] animations3 = new String[] {"Cereal","Skim Milk","Dog Bones"};

}
