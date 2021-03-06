package basemod.patches.com.megacrit.cardcrawl.core.CardCrawlGame;

import basemod.BaseMod;
import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;

@SpirePatch(cls="com.megacrit.cardcrawl.core.CardCrawlGame", method="update")
public class PreUpdateHook {
    @SpireInsertPatch(rloc=18)
    public static void Insert(Object __obj_instance) {
        BaseMod.publishPreUpdate();
    }
}
