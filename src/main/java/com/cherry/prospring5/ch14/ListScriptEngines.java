package com.cherry.prospring5.ch14;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import java.util.function.Consumer;

public class ListScriptEngines {
    private static Logger logger =
            LoggerFactory.getLogger(ListScriptEngines.class);

    public static void main(String... args) {
        ScriptEngineManager mgr = new ScriptEngineManager();
        mgr.getEngineFactories().forEach(factory -> {
            String engineName = factory.getEngineName();
            String languageName = factory.getLanguageName();
            String version = factory.getLanguageVersion();
            logger.info("Engine name: " + engineName + " Language: " + languageName + " Version: " + version);
        });
    }
}
