package unitTesting;
import java.math.BigDecimal; 

public class TreasureChest {
	private  int gold;
	private static BigDecimal  goldPrice ;
	private static  final BigDecimal GOLD_PER_COIN = new BigDecimal(0.9675);
	/**
	 * @param gold
	 */
	public TreasureChest(int goldCoins) {
		if(goldCoins<0) {
			throw new IllegalArgumentException("The number of gold coins in the treasure chest can't be negative.");
		}else {
		this.gold = goldCoins;
		}
	}
	/**
	 * @return the gold
	 */
	public int getGold() {
		return gold;
	}
	/**
	 * @return the goldPrice
	 */
	public static BigDecimal getGoldPrice() {
		return goldPrice;
	}

	/**
	 * @param goldPrice the goldPrice to set
	 */
	public static void setGoldPrice(BigDecimal goldPrice) {
		if(goldPrice.compareTo(BigDecimal.ZERO)<0)
			throw new IllegalArgumentException("can't be negative.");
		TreasureChest.goldPrice = goldPrice;
	}
	
	public int removeGold(int numberOfCoins) {
		if(numberOfCoins<0||numberOfCoins>this.gold) {
			throw new IllegalArgumentException("THis number of gold coins removed"+"from the treasure chest can't be greather than "
					+ "the number "
					+ "of gold coins available.it can't be negative either");
		}this.gold-=numberOfCoins;
		return this.gold;
		
	}
	
	public void addGold(int numberOfCoins) {
		if(numberOfCoins<0) {
			throw new IllegalArgumentException("The number of gold coins in the treasure chest can't be negative.");

			
		}else {
			this.gold+=numberOfCoins;
			
		}
		
	}
	
	public BigDecimal valueInDollars() {
		
		return new BigDecimal(gold).multiply(GOLD_PER_COIN).multiply(goldPrice);
		
	}
	
	@Override
	public String toString() {
		return  "[ "+ gold + "coins ]";
	}
	
	
}
