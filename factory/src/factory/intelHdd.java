package factory;

public class intelHdd implements IHdd {

	@Override
	public String HddTur() {
		
		return "intel hdd";
	}

	@Override
	public void islem() {
		System.out.println("�ntel hdd birle�tirildi.");
		
	}

}
