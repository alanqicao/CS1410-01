package unitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TreasureChestTest {
	private TreasureChest treasure;
	private TreasureChest emptyChest;

	@BeforeEach
	void setUp() throws Exception {
		treasure = new TreasureChest(10);
		emptyChest = new TreasureChest(0);
	}

	@Test
	void treasureChest_PositiveNumber_AllCoinsStoredIntreasureChest() {
		TreasureChest treasure7= new TreasureChest(7);
		int expected =7;
		int actual = treasure7.getGold();
		assertEquals(expected,actual);
	}
	@Test
	void treasureChest_ZeroCoinsr_NoStoredIntreasureChest() {
		TreasureChest treasure0= new TreasureChest(0);
		int expected =0;
		int actual = treasure0.getGold();
		assertEquals(expected,actual);
	}
	@Test
	void treasureChest_NegetvieCoinsr_NoStoredIntreasureChest() {
		assertThrows(IllegalArgumentException.class,()-> {new TreasureChest(-2);});
	}


	@Test
	void testSetGoldPrice() {
		TreasureChest.setGoldPrice(BigDecimal.ZERO);
		assertEquals(BigDecimal.ZERO,TreasureChest.getGoldPrice());
		
	}
	
	

	@Test
	void testSetGoldPrice_SettingNegativeValue() {
		assertThrows(IllegalArgumentException.class,()-> {TreasureChest.setGoldPrice(new BigDecimal(-0.001));});;
		
	}
	

	@Test
	void testRemoveGold() {
		treasure.removeGold(2);
		assertEquals(8,treasure.getGold());
	}

	@Test
	void testRemoveGold_RemovingAllGold_EmptiestreasureChest() {
		treasure.removeGold(10);
		assertEquals(0,treasure.getGold());
	}
	
	
	@Test
	void testRemoveGold_RemovingZeroGold_ELeavesNumberOftreasureChestUnchanges() {
		treasure.removeGold(0);
		assertEquals(10,treasure.getGold());
	}
	
	@Test
	void testRemoveGold_RemovingMoreGoldThanAvailable_ThrowsIllegalArgument() {
		assertThrows(IllegalArgumentException.class,()-> {treasure.removeGold(11);});
	}
	
	@Test
	void testRemoveGold_RemovingNegetiveGoldThanAvailable_ThrowsIllegalArgument() {
		assertThrows(IllegalArgumentException.class,()-> {treasure.removeGold(-1);});
	}
	@Test
	void testRemoveGoldSimple() {
		
		assertEquals(8,treasure.removeGold(2));
	}
	
	
	
	
	

	
	@Test
	void testAddGold() {
	
		treasure.addGold(10);
		int expected = 15;
		int actual = treasure.getGold();
		assertEquals(expected,actual);
		
	}
	
	@Test
	void AddGold_addZeroCoin_LeavesNumberOfCoinsUnchanged() {
		
		treasure.addGold(0);
		int expected = 10;
		int actual = treasure.getGold();
		assertEquals(expected,actual);
		
	}
	
	@Test
	void AddGold_AddingNegiNumber_NoGoldAddIn() {
		assertThrows(IllegalArgumentException.class,()-> {treasure.addGold(-2);});
		
	}
	
	
	

	@Test
	void testValueInDollars_FilledTreasureChest() {
		//assertEquals(,treasure.valueInDollars());
	}
void testValueInDollars_EmptyTreasureChest() {
		assertEquals(BigDecimal.ZERO, emptyChest.valueInDollars());
	}



	@Test
	void ToString_PositiveNumberOfCoins_ReturnNumberCoinsInBrackets() {
		String expected = "[ 10 coins ]";//[10 coins]
		String actual = treasure.toString();
		assertEquals(expected,actual);
	}
	void ToString_NoCoins_Return0CoinsInBrackets() {
		String expected = "[ 0 coins ]";//[10 coins]
		String actual = emptyChest.toString();
		assertEquals(expected,actual);
	}

}
