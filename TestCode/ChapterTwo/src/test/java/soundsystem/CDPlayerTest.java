package test.java.soundsystem;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=main.java.soundsystem.CDplayerConfig.class)
public class CDPlayerTest {
    @Rule
    public final SystemOutRule systemOutRule=new SystemOutRule();
//    @Rule
//    public final StandardOutputStreamLog log = new StandardOutputStreamLog();
    @Autowired
    private main.java.soundsystem.MediaPlayer player;
    @Autowired
    private main.java.soundsystem.CompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
       cd.play();
    }
    @Test
    public void play()
    {
        player.play();
        Assert.hasText("LemonPlaying Sgt. Pepper's Lonely Hearts Club Band"+"by The Beatles\n",systemOutRule.getLog());
       // Assert.hasText(null,systemOutRule.getLog());
    }
}
