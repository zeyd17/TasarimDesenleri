
public class WifiVisitor implements IVisitor {

	@Override
	public void Visit(Tablet tablet) {
		if (tablet instanceof IPad) {
			System.out.println("Ipad wifi a��ld�");
		}else if (tablet instanceof GalaxyTab) {
			System.out.println("GalaxyTab da wifi yok");
		}else {
			System.out.println("wifi yok");
		}
		
	}

}
