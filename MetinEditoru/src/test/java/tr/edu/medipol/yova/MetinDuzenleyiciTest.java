package tr.edu.medipol.yova;

import org.junit.Test;

import static org.junit.Assert.*;

public class MetinDuzenleyiciTest {

	@Test
	public void bosluklariTemizle_boslukVarsaOnlariTemizlemeli() {
		// GIVEN - ON KOSULLAR
		String orjinal = "     Y    A Z I L I M ";

		// WHEN - BU AKSIYON GERCEKLESTIGINDE
		String sonuc = MetinDuzenleyici.bosluklariTemizle(orjinal);
		
		// THEN - BUNLAR OLMALI
		assertEquals("Beklenmedik sonuc", "YAZILIM", sonuc);
	}
	
	@Test
	public void bosluklariTemizle_boslukYoksaAyniSonucuVermeli() {
		// GIVEN - ON KOSULLAR
		String orjinal = "DENEME";

		// WHEN - BU AKSIYON GERCEKLESTIGINDE
		String sonuc = MetinDuzenleyici.bosluklariTemizle(orjinal);
		
		// THEN - BUNLAR OLMALI
		assertEquals("Beklenmedik sonuc", orjinal, sonuc);
	}
	
	@Test
	public void bosluklariTemizle_bosMetinVarsaBosSonucDonmeli() {
		// GIVEN - ON KOSULLAR
		String orjinal = "                 ";

		// WHEN - BU AKSIYON GERCEKLESTIGINDE
		String sonuc = MetinDuzenleyici.bosluklariTemizle(orjinal);
		
		// THEN - BUNLAR OLMALI
		assertEquals("Beklenmedik sonuc", "", sonuc);
	}
	
	@Test
	public void kisaltVeBuyukHarfeCevir_test1() {
		String orjinal = "YAZILIM ORTAM VE ARACLARI";
		String sonuc = MetinDuzenleyici.kisaltVeBuyukHarfeCevir(orjinal);
		assertEquals("YAZILIM OR. ARACLARI", sonuc);
	}
	
	// "MetinDuzenleyici" sinifina yeni bir yardimci metod ekle
	// ve bu metod icin en az 3 birim test yaz
	// NOT: Dersteki sekilde maven projesi olmali ve githubda paylasilmali
}
