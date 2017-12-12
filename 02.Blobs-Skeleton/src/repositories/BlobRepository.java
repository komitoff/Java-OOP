package repositories;

import interfaces.Blob;
import interfaces.Repository;

import java.util.LinkedHashMap;
import java.util.Map;

public class BlobRepository implements Repository<Blob> {

    private Map<String, Blob> blobs;

    public BlobRepository() {
        this.blobs = new LinkedHashMap<>();
    }

    @Override
    public Blob findOneByName(String name) {
        if (blobs.containsKey(name)) {
            return blobs.get(name);
        }
        return null;
    }

    @Override
    public void add(Blob blob) {
        this.blobs.put(blob.getName(), blob);
    }
}
