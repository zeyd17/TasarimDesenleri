
public class uye implements IUye{

	String uyeAd;
	public uye(String uyeAd) {
		this.uyeAd =uyeAd;
		
	}
	
	public void Update(absUrun urun) {
		// TODO Auto-generated method stub
		if (urun.getFiyat() < urun.getOncekiFiyat()) {
			System.out.println("say  .  " +uyeAd +"  " +urun.getUrunAd() +" �r�n�n�n fiyat� "+urun.getFiyat()+" fiyat�  d��t�");
		}
		else {
			System.out.println("say  .  " +uyeAd +" "+urun.getUrunAd() +" �r�n�n�n fiyat� "+urun.getFiyat()+" fiyat�  g�ncellendi");
		}
		
	}

}
