package org.nd4j.imports;

import org.nd4j.autodiff.samediff.SameDiff;

import java.io.File;

public interface SameDiffProtoConverter {

    /**
     * Converts a proto file
     * to a samediff instance.
     * @param file
     * @return
     */
    SameDiff importProto(File file);

}
