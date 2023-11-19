package com.drew.metadata.mov.atoms;

import com.drew.lang.SequentialReader;
import com.drew.metadata.mov.QuickTimeDirectory;

import java.io.IOException;

public class ModelAtom extends FullAtom {
    String model;

    public ModelAtom(SequentialReader reader, Atom atom) throws IOException {
        super(reader, atom);
        model = reader.getString(4);
    }

    public void addMetadata(QuickTimeDirectory directory) {
        if (model != null) {
            directory.setString(QuickTimeDirectory.TAG_MODEL, model);
        }
    }
}
