package org.lorislab.p6.bpmn2.external;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.lorislab.p6.bpmn2.reader.ModelReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class ExternalTest {

    private static final Logger log = LoggerFactory.getLogger(ExternalTest.class);

    private static final String DIR = "./src/test/resources/test/external";

    private static Stream<File> files() throws IOException {
        return Files.walk(Paths.get(DIR))
                .filter(file -> !Files.isDirectory(file))
                .map(Path::toFile)
                .filter(file -> file.getName().endsWith("bpmn"));
    }

    @ParameterizedTest
    @MethodSource("files")
    void parseBpmnTest(File file) throws Exception {

        log.info("#BEGIN file: {}", file);
        Exception e = null;
        try {
            ModelReader.read(Files.readAllBytes(file.toPath()));
        } catch (Exception ex) {
            log.error("ERROR: {}", ex.getMessage());
            e = ex;
        } finally {
            log.info("#END file: {} {}", file, e != null ? "FAILED" : "OK");
        }
        assertThat(e).as("File %s", file).isNull();
    }
}
