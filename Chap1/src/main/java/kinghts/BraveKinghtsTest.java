package main.java.kinghts;
import static org.mockito.Mockito.*;
import org.junit.Test;
public class BraveKinghtsTest {

    @Test
    public void knightShouldEmbarkOnQuest(){
        Quest mockQuest = mock(Quest.class);
        BraveKinghts kinghts = new BraveKinghts(mockQuest);
        kinghts.embarkOnQuest();
        verify(mockQuest,times(1)).embark();
    }


}
