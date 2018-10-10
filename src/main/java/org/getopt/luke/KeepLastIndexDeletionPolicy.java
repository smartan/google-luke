package org.getopt.luke;

import org.apache.lucene.index.IndexCommit;
import org.apache.lucene.index.IndexDeletionPolicy;

import java.util.List;

public class KeepLastIndexDeletionPolicy implements IndexDeletionPolicy {

    /**
     * Deletes all commits except the most recent one.
     */
    public void onInit(List commits) {
        //System.out.println("onInit -> onCommit");
        // Note that commits.size() should normally be 1:
        onCommit(commits);
    }

    /**
     * Deletes all commits except the most recent one.
     */
    public void onCommit(List commits) {
        //System.out.println("onCommit: " + commits);
        // Note that commits.size() should normally be 2 (if not
        // called by onInit above):
        int size = commits.size();
        for (int i = 0; i < size - 1; i++) {
            ((IndexCommit) commits.get(i)).delete();
        }
    }
}
