package gamelang;

import java.util.HashMap;
import java.util.Map;

public interface Env {
    void set(String name, Value value);
    Value lookup(String name);

    public static class RefEnv implements Env {
        private final Map<String, Value> values;
        private final RefEnv parent;

        public RefEnv() {
            this.values = new HashMap<>();
            this.parent = null;
        }

        public RefEnv(RefEnv parent) {
            this.values = new HashMap<>();
            this.parent = parent;
        }

        @Override
        public void set(String name, Value value) {
            values.put(name, value);
        }

        @Override
        public Value lookup(String name) {
            Value value = values.get(name);
            if (value != null) {
                return value;
            } else if (parent != null) {
                return parent.lookup(name);
            } else {
                throw new Value.Error("undefined variable: " + name);
            }
        }
    }
}