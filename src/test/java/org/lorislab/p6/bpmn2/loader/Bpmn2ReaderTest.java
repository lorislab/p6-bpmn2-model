package org.lorislab.p6.bpmn2.loader;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;
import org.lorislab.p6.bpmn2.reader.ModelReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Bpmn2ReaderTest {

    private static final Logger log = LoggerFactory.getLogger(Bpmn2ReaderTest.class);

    @Test
    public void readerTest() throws Exception {
        var start = System.nanoTime();
        var definitions = ModelReader.read(Files.readAllBytes(Paths.get("src/test/resources/bpmn2/100-start-end.bpmn")));
        var duration = (double) (System.nanoTime() - start) / 1_000_000_000;
        log.info("{} seconds", duration);

        start = System.nanoTime();
        definitions = ModelReader.read(Files.readAllBytes(Paths.get("src/test/resources/bpmn2/100-start-end.bpmn")));
        duration = (double) (System.nanoTime() - start) / 1_000_000_000;
        log.info("{} seconds", duration);

        if (definitions != null) {
            log.info("## ID {}", definitions.getId());
            if (definitions.getZeebe() != null) {
                log.info("## executionPlatformVersion {}", definitions.getZeebe().getExecutionPlatformVersion());
            }
        }
    }
}
