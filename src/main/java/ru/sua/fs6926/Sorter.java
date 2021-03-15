package ru.sua.fs6926;

import java.io.Closeable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingDeque;

public interface Sorter extends Closeable {
    void doSort(List<BlockingDeque<String>> deques);
}
