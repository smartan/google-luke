package org.getopt.luke;

import org.apache.lucene.index.IndexDeletionPolicy;

import java.io.IOException;
import java.util.List;

public class KeepAllIndexDeletionPolicy implements IndexDeletionPolicy {

    public void onCommit(List commits) throws IOException {
        // do nothing - keep all points
    }

    public void onInit(List commits) throws IOException {
        // do nothing - keep all points
    }

}
