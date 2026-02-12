package org.lorislab.p6.bpmn2.utils;

import org.lorislab.p6.bpmn2.model.Definitions;
import org.lorislab.p6.bpmn2.reader.ModelReader;

public class DefinitionsUtil {

    public static Definitions loadDefinitions(byte[] data) {
        try {
            return ModelReader.read(data);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
