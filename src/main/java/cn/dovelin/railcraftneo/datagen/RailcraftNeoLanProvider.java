package cn.dovelin.railcraftneo.datagen;

import cn.dovelin.railcraftneo.RailcraftNeo;
import cn.dovelin.railcraftneo.Translations;
import cn.dovelin.railcraftneo.world.blocks.RailcraftNeoBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

import java.util.HashMap;

import static cn.dovelin.railcraftneo.world.blocks.RailcraftNeoBlocks.BLOCK_MAP;

public class RailcraftNeoLanProvider{


    public static class TranslationForEnglish extends LanguageProvider{
        public TranslationForEnglish(PackOutput output ,String locale) {
            super(output, RailcraftNeo.MODID, locale);
        }
        @Override
        protected void addTranslations() {
            Words lang = Words.ENGLISH;
            for (String key : BLOCK_MAP.keySet()) {
                this.add(BLOCK_MAP.get(key).get(), lang.get(key));
            }
        }
    }
    public static class TranslationForChinese extends LanguageProvider{
        public TranslationForChinese(PackOutput output ) {
            super(output, RailcraftNeo.MODID,"zh_cn");
        }
        @Override
        protected void addTranslations() {
            Words lang = Words.CHINESE;
            for (String key : BLOCK_MAP.keySet()) {
                this.add(BLOCK_MAP.get(key).get(), lang.get(key));
            }
        }
    }

    enum Words{
        ENGLISH("en_us"){
            private static HashMap<String,String> LANG_HASHMAP ;
            public static void put(String name, String description) {
                LANG_HASHMAP.put(name,description);
            }
            @Override
            public  String get(String name){
                return LANG_HASHMAP.get(name);
            }
            {
                this.put("zinc_ore","zinc ore");
                this.put("zinc_block","zinc block");
                this.put("deepslate_zinc_ore","deepslate zinc ore");
                this.put("zinc_ingot", "zinc ingot");
            }
        },
        CHINESE("zh_cn"){
            public static void put(String name, String description) {
                LANG_HASHMAP.put(name,description);
            }

            private static HashMap<String,String> LANG_HASHMAP;
            @Override
            public String get(String name){
                return LANG_HASHMAP.get(name);
            }
            {
                this.put("zinc_ore", "锌矿石");
                this.put("zinc_block", "锌块");
                this.put("deepslate_zinc_ore", "深板岩锌矿石");
                this.put("zinc_ingot", "锌锭");
            }
        };

        Words(String langTags){
            this.langTags=langTags;
        }
        private final  String langTags;
        public String get(String name){
            return null;
        };
    }

}