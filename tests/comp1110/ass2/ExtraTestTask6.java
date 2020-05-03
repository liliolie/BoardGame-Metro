package comp1110.ass2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ExtraTestTask6 {
    @Test
    public void testdddd() {
        List<String> validdddd = Arrays.asList("dddd00", "dddd77", "dddd07", "dddd70", "dddd03");
        List<String> invaliddddd = Arrays.asList("dddd55", "dddd66", "dddd33", "dddd44");
        for(int i=0; i<validdddd.size(); i++)
            assertTrue(Metro.isPlacementSequenceValid(validdddd.get(i)));
        for (int i=0; i<invaliddddd.size(); i++)
            assertFalse(Metro.isPlacementSequenceValid(invaliddddd.get(i)));
    }

    @Test
    public void testRareCase(){
        List<String> validPlacement = Arrays.asList("aaaa00aaaa07dddd01","cbcb07dddd27" , "aaaa70dddd75");
        List<String> invalidPlacement = Arrays.asList("aaaa01dddd02", "accd03dddd71", "aaaa20dddd27","bbbb70dddd27");
        for(int i=0; i<validPlacement.size(); i++)
            assertTrue(Metro.isPlacementSequenceValid(validPlacement.get(i)));
        for (int i=0; i<invalidPlacement.size(); i++)
            assertFalse(Metro.isPlacementSequenceValid(invalidPlacement.get(i)));
    }

    @Test
    public void testLongString(){
        List<String> validLongString = Arrays.asList("cbaa40badb17adbb72cdac30baac71bbbb57cddb06cdac60cbcb05adad74badb37dacc56acba66aacb27bbad73cbaa02dbba36dada46cccc15aaaa01bcdd04dbcd35dbcd63aaaa11bcbc45baac03acba10cbaa53cccc61cbcb14aacb47baac50bcbc54aaaa77dddd31accd51dddd62acba55bbad13ccda41aaaa20bcbc76dacc23ccda12aacb24adad16cbaa25aacb70adbb64bcdd22cbcb07dada42acba21bbbb52ddbc32baac75cddb65dbba67accd26ddbc00",
        "cdac05cbaa70aaaa20cbaa73adad74cddb06dbba67badb15acba17accd27aacb14dbba75aacb57baac30cddb26dacc31ccda65ddbc16cbaa40dddd25bbad21bbad72cbcb01dddd63bbbb55dacc53aaaa36cbaa07bcdd54acba62dada22cbcb56bcbc12adbb02cdac04aacb50dada35baac11badb41baac03acba52bbbb60cccc61aacb46dbcd23cccc45acba24baac00dbcd76aaaa51cbcb47ccda13adad66adbb42aaaa32bcbc71ddbc64bcdd37");
        List<String> invalidLongString = Arrays.asList(
                "dada60acba10aacb75baac40badb67accd76dacc73acba17bcbc50dacc61cbcb70dada57cbaa41acba01dddd51dbba11cbaa47bbbb63bbad42ccda04badb52cbaa20bcbc37aacb62bcdd64bcdd32aacb07cddb03cdac16acba56aaaa31aaaa12bbad66accd15aaaa13ddbc23cbcb55adad06ccda14bbbb27aaaa05baac74cccc36cccc65baac45dbcd22ddbc53adbb30dddd54aacb71cdac25cddb02cbcb72dbcd46cbaa00adbb24",
                "ddbc76bbad57ddbc71baac73dacc63baac10bcbc47adad01acba37aacb72dbba74baac17acba00bbbb30cddb11cdac36bbad61aacb40dbcd31ccda35cccc04cbcb66cddb32dddd14adbb64aaaa51cccc46bcdd15dbba50bcdd06badb21baac65cbcb67dbcd16cbcb13aaaa45adad54accd22badb23cdac20bcbc75acba12dacc62adbb52aaaa07dada55cbaa25aacb02dddd41aacb53bcbc24cbaa27acba42dada70");

        for(int i=0; i<validLongString.size(); i++)
            assertTrue(Metro.isPlacementSequenceValid(validLongString.get(i)));
        for (int i=0; i<invalidLongString.size(); i++)
            assertFalse(Metro.isPlacementSequenceValid(invalidLongString.get(i)));

    }
}
