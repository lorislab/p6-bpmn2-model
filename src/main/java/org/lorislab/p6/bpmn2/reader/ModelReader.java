package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.DEFINITIONS_READER;

import java.util.function.Consumer;

import org.lorislab.p6.bpmn2.model.Definitions;

public class ModelReader {

    private static final String ELEMENT = "definitions";

    public static Definitions read(byte[] data) throws Exception {
        var reader = Factory.createReader(data);
        try {

            if (!DEFINITIONS_READER.findElement(reader, ELEMENT)) {
                return null;
            }

            var consumer = new Consumer<Definitions>() {

                private Definitions item = null;

                @Override
                public void accept(Definitions definitions) {
                    item = definitions;
                }
            };

            DEFINITIONS_READER.read(reader, ELEMENT, consumer);

            return consumer.item;

        } finally {
            reader.close();
        }
    }

}
